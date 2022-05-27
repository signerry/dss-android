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
package eu.europa.esig.dss.pades.signature.visible.suite;

import eu.europa.esig.dss.alert.ExceptionOnStatusAlert;
import eu.europa.esig.dss.alert.LogOnStatusAlert;
import eu.europa.esig.dss.alert.StatusAlert;
import eu.europa.esig.dss.alert.exception.AlertException;
import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.diagnostic.SignatureWrapper;
import eu.europa.esig.dss.diagnostic.jaxb.XmlPDFRevision;
import eu.europa.esig.dss.diagnostic.jaxb.XmlSignatureScope;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.enumerations.SignatureScopeType;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.model.MimeType;
import eu.europa.esig.dss.pades.PAdESSignatureParameters;
import eu.europa.esig.dss.pades.PAdESTimestampParameters;
import eu.europa.esig.dss.pades.SignatureFieldParameters;
import eu.europa.esig.dss.pades.SignatureImageParameters;
import eu.europa.esig.dss.pades.signature.PAdESService;
import eu.europa.esig.dss.pades.signature.suite.AbstractPAdESTestSignature;
import eu.europa.esig.dss.pdf.AbstractPDFSignatureService;
import eu.europa.esig.dss.pdf.IPdfObjFactory;
import eu.europa.esig.dss.pdf.PDFSignatureService;
import eu.europa.esig.dss.pdf.ServiceLoaderPdfObjFactory;
import eu.europa.esig.dss.signature.DocumentSignatureService;
import eu.europa.esig.dss.validation.SignedDocumentValidator;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PAdESVisibleWithOverlappingFieldsTest extends AbstractPAdESTestSignature {

	private PAdESService service;
	private PAdESSignatureParameters signatureParameters;
	private DSSDocument documentToSign;

	@BeforeEach
	public void init() throws Exception {
		documentToSign = new InMemoryDocument(getClass().getResourceAsStream("/sample.pdf"));

		signatureParameters = new PAdESSignatureParameters();
		signatureParameters.setSigningCertificate(getSigningCert());
		signatureParameters.setCertificateChain(getCertificateChain());
		signatureParameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_B);

		SignatureImageParameters signatureImageParameters = new SignatureImageParameters();
		signatureImageParameters.setImage(new InMemoryDocument(getClass().getResourceAsStream("/small-red.jpg"), "small-red.jpg", MimeType.JPEG));
		
		SignatureFieldParameters fieldParameters = new SignatureFieldParameters();
		fieldParameters.setOriginX(25);
		fieldParameters.setOriginY(25);
		signatureImageParameters.setFieldParameters(fieldParameters);
		
		signatureParameters.setImageParameters(signatureImageParameters);

		service = new PAdESService(getOfflineCertificateVerifier());
	}
	
	@Override
	protected DSSDocument sign() {
		MockLogAlertPdfObjectFactory pdfObjectFactory = new PAdESVisibleWithOverlappingFieldsTest.MockLogAlertPdfObjectFactory();
		pdfObjectFactory.setAlertOnSignatureFieldOverlap(new ExceptionOnStatusAlert());
		service.setPdfObjFactory(pdfObjectFactory);

		DSSDocument signed = super.sign();
		
		SignatureFieldParameters fieldParameters = signatureParameters.getImageParameters().getFieldParameters();
		fieldParameters.setOriginX(50);
		fieldParameters.setOriginY(50);
		
		documentToSign = signed;

		Exception exception = assertThrows(AlertException.class, () -> super.sign());
		assertEquals("The new signature field position overlaps with an existing annotation!", exception.getMessage());

		pdfObjectFactory.setAlertOnSignatureFieldOverlap(new LogOnStatusAlert());
		
		return super.sign();
	}
	
	@Override
	protected void onDocumentSigned(byte[] byteArray) {
		// skip
	}
	
	@Override
	protected void checkNumberOfSignatures(DiagnosticData diagnosticData) {
		assertEquals(2, diagnosticData.getSignatures().size());
	}
	
	@Override
	protected void checkSignatureScopes(DiagnosticData diagnosticData) {
		boolean partialFound = false;
		boolean fullFound = false;
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			List<XmlSignatureScope> signatureScopes = signatureWrapper.getSignatureScopes();
			assertEquals(1, signatureScopes.size());
			XmlSignatureScope xmlSignatureScope = signatureScopes.get(0);
			if (SignatureScopeType.PARTIAL.equals(xmlSignatureScope.getScope())) {
				partialFound = true;
			} else if (SignatureScopeType.FULL.equals(xmlSignatureScope.getScope())) {
				fullFound = true;
			}
		}
		assertTrue(partialFound);
		assertTrue(fullFound);
	}
	
	@Override
	protected void checkPdfRevision(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			XmlPDFRevision pdfRevision = signatureWrapper.getPDFRevision();
			assertNotNull(pdfRevision);
			
			assertTrue(signatureWrapper.arePdfModificationsDetected());
			List<BigInteger> overlapConcernedPages = signatureWrapper.getPdfAnnotationsOverlapConcernedPages();
			assertEquals(1, overlapConcernedPages.size());
			assertEquals(1, overlapConcernedPages.get(0).intValue());
		}
	}
	
	@Override
	protected void verifyOriginalDocuments(SignedDocumentValidator validator, DiagnosticData diagnosticData) {
		for (String signatureId : diagnosticData.getSignatureIdList()) {
			assertEquals(1, validator.getOriginalDocuments(signatureId).size());
		}
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
		return GOOD_USER;
	}
	
	private static class MockLogAlertPdfObjectFactory implements IPdfObjFactory {
		
		private static final IPdfObjFactory pdfObjectFactory = new ServiceLoaderPdfObjFactory();

		private static AbstractPDFSignatureService service;

		static {
			service = (AbstractPDFSignatureService) pdfObjectFactory.newPAdESSignatureService();
		}

		public void setAlertOnSignatureFieldOverlap(StatusAlert alertOnSignatureFieldOutsidePageDimensions) {
			service.setAlertOnSignatureFieldOverlap(alertOnSignatureFieldOutsidePageDimensions);
		}
		
		@Override
		public PDFSignatureService newPAdESSignatureService() {
			return service;
		}

		@Override
		public PDFSignatureService newContentTimestampService() {
			return service;
		}

		@Override
		public PDFSignatureService newSignatureTimestampService() {
			return service;
		}

		@Override
		public PDFSignatureService newArchiveTimestampService() {
			return service;
		}
		
	}

}
