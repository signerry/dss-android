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
package eu.europa.esig.dss.pades.extension.suite;

import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.diagnostic.SignatureWrapper;
import eu.europa.esig.dss.diagnostic.TimestampWrapper;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.model.x509.revocation.ocsp.OCSP;
import eu.europa.esig.dss.pades.PAdESSignatureParameters;
import eu.europa.esig.dss.pades.signature.PAdESService;
import eu.europa.esig.dss.pades.validation.suite.AbstractPAdESTestValidation;
import eu.europa.esig.dss.spi.DSSUtils;
import eu.europa.esig.dss.spi.x509.CertificateSource;
import eu.europa.esig.dss.spi.x509.CommonTrustedCertificateSource;
import eu.europa.esig.dss.spi.x509.revocation.RevocationSource;
import eu.europa.esig.dss.spi.x509.revocation.ocsp.ExternalResourcesOCSPSource;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.validation.CertificateVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.signerry.dss.test.TestUtils;

public class DSS2821ExtensionToLTLevelTest extends AbstractPAdESTestValidation {

    @Override
    protected DSSDocument getSignedDocument() {
        DSSDocument dssDocument = new InMemoryDocument(TestUtils.getResourceAsStream("validation/DSS-2821.pdf"));

        CertificateVerifier certificateVerifier = getOfflineCertificateVerifier();
        certificateVerifier.setTrustedCertSources(getTrustedCertificateSource());
        certificateVerifier.setOcspSource(getOCSPSource());

        PAdESService service = new PAdESService(certificateVerifier);
        service.setTspSource(getSelfSignedTsa());

        PAdESSignatureParameters parameters = new PAdESSignatureParameters();
        parameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_LT);
        return service.extendDocument(dssDocument, parameters);
    }

    @Override
    protected CertificateSource getTrustedCertificateSource() {
        CommonTrustedCertificateSource certificateSource = (CommonTrustedCertificateSource) super.getTrustedCertificateSource();
        certificateSource.addCertificate(DSSUtils.loadCertificateFromBase64EncodedString("MIIFOTCCBCGgAwIBAgIMVRYVFQAAAABRzhYOMA0GCSqGSIb3DQEBCwUAMIG0MRQwEgYDVQQKEwtFbnRydXN0Lm5ldDFAMD4GA1UECxQ3d3d3LmVudHJ1c3QubmV0L0NQU18yMDQ4IGluY29ycC4gYnkgcmVmLiAobGltaXRzIGxpYWIuKTElMCMGA1UECxMcKGMpIDE5OTkgRW50cnVzdC5uZXQgTGltaXRlZDEzMDEGA1UEAxMqRW50cnVzdC5uZXQgQ2VydGlmaWNhdGlvbiBBdXRob3JpdHkgKDIwNDgpMB4XDTE2MDIyNTE4MDgxNloXDTI5MDYyNTE4MzgxNlowgbcxCzAJBgNVBAYTAlVTMRYwFAYDVQQKEw1FbnRydXN0LCBJbmMuMSgwJgYDVQQLEx9TZWUgd3d3LmVudHJ1c3QubmV0L2xlZ2FsLXRlcm1zMTkwNwYDVQQLEzAoYykgMjAxNSBFbnRydXN0LCBJbmMuIC0gZm9yIGF1dGhvcml6ZWQgdXNlIG9ubHkxKzApBgNVBAMTIkVudHJ1c3QgQ2xhc3MgMyBDbGllbnQgQ0EgLSBTSEEyNTYwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDGnEvBT0qd2X3TO1eRq83pdhUtwCAvLDGGxQk9sB+RhJhDlS7UnqraVeLgYOi7B+/Lg+0uXxny0CjtOmQ/y64wYCHmZqtYTmJndk5SjNx7mEQODi2QULUh+42xza8hByWXz7oPGEcZTnHLabj6I20aBhE1wVa6n2Ih8bDxAY9ez/EiosFCDvXNMugrJ/SSbwsVXvz6aVKwjn6ky3W5RYS1kwMLcitAs25DQqETGRhkRNSmIAlFsDpkD1b95IUojrjUOCPHLuKw+5r7GjiBkzLnLR+ujjcXzvzCFD993yTsseygqo4jBIEce68pztTn1OFm6W5k6eEFsiqRmHBY2PILAgMBAAGjggFEMIIBQDAOBgNVHQ8BAf8EBAMCAQYwNAYDVR0lBC0wKwYIKwYBBQUHAwIGCCsGAQUFBwMEBgorBgEEAYI3CgMMBglghkgBhvprKAswOwYDVR0gBDQwMjAwBgRVHSAAMCgwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuZW50cnVzdC5uZXQvcnBhMBIGA1UdEwEB/wQIMAYBAf8CAQAwMwYIKwYBBQUHAQEEJzAlMCMGCCsGAQUFBzABhhdodHRwOi8vb2NzcC5lbnRydXN0Lm5ldDAyBgNVHR8EKzApMCegJaAjhiFodHRwOi8vY3JsLmVudHJ1c3QubmV0LzIwNDhjYS5jcmwwHQYDVR0OBBYEFAafb06iKU4PDK4Xv7aYRu+tuDtyMB8GA1UdIwQYMBaAFFXkgdERgL7YibkIozH5oSQJFrlwMA0GCSqGSIb3DQEBCwUAA4IBAQB8eBvEzfG7ciGMiBdPtSqio/2dh+DXHDyC2Z6Vkzd305spuLwA0olAKJKZgKFM804XffTDY4zCTvY3sX9gMvHUk1utlt2Kt8KPDfFLrfxL21sNyj79WG99p7vrzVlsO+8AFZU2AdTLPLVjz9/Tmqr5RRKyq4IPZg0uaAM4+m6VIOceWnYEI2A9S+XpEHWqF9vbCevuF0iLnZalaqPdTBkfYkAuD/T6AOZabkbolo2bjssLzYsHOZExFCFu37kJZTw/JaDlC7o6A0r0QaZojaXqYM0jSfppwIWH58keRNVFyBIApO0GmIpBSieh8hZlo1X6K0yukH+M53cikOr4IS/F<"));
        certificateSource.addCertificate(DSSUtils.loadCertificateFromBase64EncodedString("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"));
        return certificateSource;
    }

    private RevocationSource<OCSP> getOCSPSource() {
        DSSDocument signCertOcsp = new InMemoryDocument(Utils.fromBase64("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"));
        DSSDocument tstCertOcsp = new InMemoryDocument(Utils.fromBase64("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"));
        return new ExternalResourcesOCSPSource(signCertOcsp, tstCertOcsp);
    }

    @Override
    protected void checkSignatureLevel(DiagnosticData diagnosticData) {
        assertEquals(SignatureLevel.PAdES_BASELINE_LT, diagnosticData.getSignatureFormat(diagnosticData.getFirstSignatureId()));
    }

    @Override
    protected void checkPdfRevision(DiagnosticData diagnosticData) {
        SignatureWrapper signature = diagnosticData.getSignatureById(diagnosticData.getFirstSignatureId());
        assertTrue(signature.arePdfObjectModificationsDetected());
        assertTrue(Utils.isCollectionNotEmpty(signature.getPdfExtensionChanges()));
        // skip signature.getPdfSignatureOrFormFillChanges() as PdfBox/OpenPdf have different processing
        assertFalse(Utils.isCollectionNotEmpty(signature.getPdfAnnotationChanges()));
        assertFalse(Utils.isCollectionNotEmpty(signature.getPdfUndefinedChanges()));

        TimestampWrapper detachedTst = diagnosticData.getTimestampList().get(0);
        assertFalse(Utils.isCollectionNotEmpty(detachedTst.getTimestampedSignatures()));

        assertTrue(detachedTst.arePdfObjectModificationsDetected());
        assertTrue(Utils.isCollectionNotEmpty(detachedTst.getPdfExtensionChanges()));
        assertTrue(Utils.isCollectionNotEmpty(detachedTst.getPdfSignatureOrFormFillChanges()));
        assertTrue(Utils.isCollectionNotEmpty(detachedTst.getPdfAnnotationChanges()));
        assertTrue(Utils.isCollectionNotEmpty(detachedTst.getPdfUndefinedChanges()));

        TimestampWrapper docTst = diagnosticData.getTimestampList().get(1);
        assertTrue(Utils.isCollectionNotEmpty(docTst.getTimestampedSignatures()));

        assertTrue(docTst.arePdfObjectModificationsDetected());
        assertTrue(Utils.isCollectionNotEmpty(docTst.getPdfExtensionChanges()));
        assertFalse(Utils.isCollectionNotEmpty(docTst.getPdfSignatureOrFormFillChanges()));
        assertFalse(Utils.isCollectionNotEmpty(docTst.getPdfAnnotationChanges()));
        assertFalse(Utils.isCollectionNotEmpty(docTst.getPdfUndefinedChanges()));
    }

}
