/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.pades.signature.suite;

import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.diagnostic.SignatureWrapper;
import eu.europa.esig.dss.diagnostic.TimestampWrapper;
import eu.europa.esig.dss.enumerations.MimeTypeEnum;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.exception.IllegalInputException;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.pades.PAdESSignatureParameters;
import eu.europa.esig.dss.pades.PAdESTimestampParameters;
import eu.europa.esig.dss.pades.signature.PAdESService;
import eu.europa.esig.dss.pades.timestamp.PAdESTimestampService;
import eu.europa.esig.dss.pades.validation.PDFDocumentValidator;
import eu.europa.esig.dss.pades.validation.PdfValidationDataContainer;
import eu.europa.esig.dss.pdf.PDFSignatureService;
import eu.europa.esig.dss.pdf.ServiceLoaderPdfObjFactory;
import eu.europa.esig.dss.signature.DocumentSignatureService;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.validation.AdvancedSignature;
import eu.europa.esig.dss.validation.SignedDocumentValidator;
import org.junit.jupiter.api.BeforeEach;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.signerry.dss.test.TestUtils;

public class PAdESLevelLTAWithSingleSelfSignedDocTstTest extends AbstractPAdESTestSignature {

    private DocumentSignatureService<PAdESSignatureParameters, PAdESTimestampParameters> service;
    private PAdESSignatureParameters signatureParameters;
    private DSSDocument documentToSign;

    @BeforeEach
    public void init() throws Exception {
        documentToSign = new InMemoryDocument(TestUtils.getResourceAsStream("doc.pdf"));

        signatureParameters = new PAdESSignatureParameters();
        signatureParameters.setSigningCertificate(getSigningCert());
        signatureParameters.setCertificateChain(getCertificateChain());
        signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_B);

        service = new PAdESService(getOfflineCertificateVerifier());
    }

    @Override
    protected DSSDocument sign() {
        DSSDocument signedDocument = super.sign();

        PDFSignatureService pdfSignatureService = new ServiceLoaderPdfObjFactory().newPAdESSignatureService();

        PDFDocumentValidator pdfDocumentValidator = new PDFDocumentValidator(signedDocument);
        pdfDocumentValidator.setCertificateVerifier(getCompleteCertificateVerifier());
        PdfValidationDataContainer validationData = pdfDocumentValidator.getValidationData(pdfDocumentValidator.getSignatures(), Collections.emptyList());

        signedDocument = pdfSignatureService.addDssDictionary(signedDocument, validationData);
        signedDocument = new PAdESTimestampService(getSelfSignedTsa()).timestampDocument(signedDocument, new PAdESTimestampParameters());

        signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_LTA);

        signedDocument.setName("signed.pdf");
        signedDocument.setMimeType(MimeTypeEnum.PDF);
        return signedDocument;
    }

    @Override
    protected void onDocumentSigned(byte[] byteArray) {
        super.onDocumentSigned(byteArray);

        DSSDocument signedDocument = new InMemoryDocument(byteArray);

        PAdESSignatureParameters signatureParameters = new PAdESSignatureParameters();
        signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_T);

        service.setTspSource(getGoodTsa());

        Exception exception = assertThrows(IllegalInputException.class, () ->
                service.extendDocument(signedDocument, signatureParameters));
        assertEquals("Cannot extend signature to 'PAdES-BASELINE-T'. " +
                "The signature is already extended with LTA level.", exception.getMessage());

        signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_LT);

        exception = assertThrows(IllegalInputException.class, () ->
                service.extendDocument(signedDocument, signatureParameters));
        assertEquals("Cannot extend signature to 'PAdES-BASELINE-LT'. " +
                "The signature is already extended with LTA level.", exception.getMessage());

        signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_LTA);

        DSSDocument extendedDocument = service.extendDocument(signedDocument, signatureParameters);
        SignedDocumentValidator validator = getValidator(extendedDocument);
        List<AdvancedSignature> signatures = validator.getSignatures();
        assertEquals(1, signatures.size());
        assertEquals(SignatureLevel.PAdES_BASELINE_LTA, signatures.get(0).getDataFoundUpToLevel());
    }

    @Override
    protected void checkTimestamps(DiagnosticData diagnosticData) {
        super.checkTimestamps(diagnosticData);

        List<TimestampWrapper> timestampList = diagnosticData.getTimestampList();
        assertEquals(1, timestampList.size());

        TimestampWrapper timestampWrapper = timestampList.get(0);
        assertEquals(1, timestampWrapper.getTimestampedSignatures().size());
        assertTrue(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampedCertificates()));
        assertTrue(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampedRevocations()));
        assertFalse(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampedTimestamps()));

        SignatureWrapper signatureWrapper = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
        assertEquals(1, signatureWrapper.getDocumentTimestamps().size());
        assertEquals(1, signatureWrapper.getTLevelTimestamps().size());
        assertEquals(1, signatureWrapper.getALevelTimestamps().size());
    }

    @Override
    protected DocumentSignatureService<PAdESSignatureParameters, PAdESTimestampParameters> getService() {
        return service;
    }

    @Override
    protected PAdESSignatureParameters getSignatureParameters() {
        return signatureParameters;
    }

    @Override
    protected DSSDocument getDocumentToSign() {
        return documentToSign;
    }

    @Override
    protected String getSigningAlias() {
        return RSA_SHA3_USER;
    }

}