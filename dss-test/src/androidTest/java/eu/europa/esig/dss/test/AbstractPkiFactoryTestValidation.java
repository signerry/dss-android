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
package eu.europa.esig.dss.test;

import eu.europa.esig.dss.detailedreport.DetailedReport;
import eu.europa.esig.dss.detailedreport.DetailedReportFacade;
import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.detailedreport.jaxb.XmlSignature;
import eu.europa.esig.dss.detailedreport.jaxb.XmlSubXCV;
import eu.europa.esig.dss.detailedreport.jaxb.XmlXCV;
import eu.europa.esig.dss.diagnostic.CertificateRefWrapper;
import eu.europa.esig.dss.diagnostic.CertificateWrapper;
import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.diagnostic.DiagnosticDataFacade;
import eu.europa.esig.dss.diagnostic.FoundCertificatesProxy;
import eu.europa.esig.dss.diagnostic.FoundRevocationsProxy;
import eu.europa.esig.dss.diagnostic.OrphanCertificateTokenWrapper;
import eu.europa.esig.dss.diagnostic.OrphanCertificateWrapper;
import eu.europa.esig.dss.diagnostic.OrphanRevocationWrapper;
import eu.europa.esig.dss.diagnostic.OrphanTokenWrapper;
import eu.europa.esig.dss.diagnostic.RelatedCertificateWrapper;
import eu.europa.esig.dss.diagnostic.RelatedRevocationWrapper;
import eu.europa.esig.dss.diagnostic.RevocationWrapper;
import eu.europa.esig.dss.diagnostic.SignatureWrapper;
import eu.europa.esig.dss.diagnostic.TimestampWrapper;
import eu.europa.esig.dss.diagnostic.TokenProxy;
import eu.europa.esig.dss.diagnostic.jaxb.XmlCertificate;
import eu.europa.esig.dss.diagnostic.jaxb.XmlCertificateRevocation;
import eu.europa.esig.dss.diagnostic.jaxb.XmlDiagnosticData;
import eu.europa.esig.dss.diagnostic.jaxb.XmlDigestAlgoAndValue;
import eu.europa.esig.dss.diagnostic.jaxb.XmlDigestMatcher;
import eu.europa.esig.dss.diagnostic.jaxb.XmlRevocation;
import eu.europa.esig.dss.diagnostic.jaxb.XmlSignatureDigestReference;
import eu.europa.esig.dss.diagnostic.jaxb.XmlSignatureScope;
import eu.europa.esig.dss.diagnostic.jaxb.XmlSignerData;
import eu.europa.esig.dss.diagnostic.jaxb.XmlTimestamp;
import eu.europa.esig.dss.enumerations.CertificateOrigin;
import eu.europa.esig.dss.enumerations.CertificateRefOrigin;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.enumerations.DigestMatcherType;
import eu.europa.esig.dss.enumerations.Indication;
import eu.europa.esig.dss.enumerations.RevocationOrigin;
import eu.europa.esig.dss.enumerations.RevocationRefOrigin;
import eu.europa.esig.dss.enumerations.RevocationType;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.enumerations.SignaturePolicyType;
import eu.europa.esig.dss.enumerations.SignatureScopeType;
import eu.europa.esig.dss.enumerations.TimestampType;
import eu.europa.esig.dss.enumerations.TokenExtractionStrategy;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.DSSException;
import eu.europa.esig.dss.model.DigestDocument;
import eu.europa.esig.dss.model.SerializableSignatureParameters;
import eu.europa.esig.dss.model.SerializableTimestampParameters;
import eu.europa.esig.dss.model.x509.revocation.crl.CRL;
import eu.europa.esig.dss.model.x509.revocation.ocsp.OCSP;
import eu.europa.esig.dss.policy.ValidationPolicy;
import eu.europa.esig.dss.policy.ValidationPolicyFacade;
import eu.europa.esig.dss.simplereport.SimpleReport;
import eu.europa.esig.dss.simplereport.SimpleReportFacade;
import eu.europa.esig.dss.spi.DSSUtils;
import eu.europa.esig.dss.spi.x509.revocation.OfflineRevocationSource;
import eu.europa.esig.dss.spi.x509.revocation.RevocationCertificateSource;
import eu.europa.esig.dss.spi.x509.revocation.RevocationToken;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.validation.AdvancedSignature;
import eu.europa.esig.dss.validation.SignatureCertificateSource;
import eu.europa.esig.dss.validation.SignaturePolicy;
import eu.europa.esig.dss.validation.SignaturePolicyProvider;
import eu.europa.esig.dss.validation.SignedDocumentValidator;
import eu.europa.esig.dss.validation.executor.ValidationLevel;
import eu.europa.esig.dss.validation.executor.signature.DefaultSignatureProcessExecutor;
import eu.europa.esig.dss.validation.policy.SignaturePolicyValidator;
import eu.europa.esig.dss.validation.reports.Reports;
import eu.europa.esig.dss.validation.timestamp.TimestampToken;
import eu.europa.esig.validationreport.enums.ObjectType;
import eu.europa.esig.validationreport.jaxb.AttributeBaseType;
import eu.europa.esig.validationreport.jaxb.CertificateChainType;
import eu.europa.esig.validationreport.jaxb.CryptoInformationType;
import eu.europa.esig.validationreport.jaxb.POEType;
import eu.europa.esig.validationreport.jaxb.SACertIDListType;
import eu.europa.esig.validationreport.jaxb.SACertIDType;
import eu.europa.esig.validationreport.jaxb.SACommitmentTypeIndicationType;
import eu.europa.esig.validationreport.jaxb.SAContactInfoType;
import eu.europa.esig.validationreport.jaxb.SACounterSignatureType;
import eu.europa.esig.validationreport.jaxb.SADSSType;
import eu.europa.esig.validationreport.jaxb.SADataObjectFormatType;
import eu.europa.esig.validationreport.jaxb.SAFilterType;
import eu.europa.esig.validationreport.jaxb.SAMessageDigestType;
import eu.europa.esig.validationreport.jaxb.SANameType;
import eu.europa.esig.validationreport.jaxb.SAOneSignerRoleType;
import eu.europa.esig.validationreport.jaxb.SAReasonType;
import eu.europa.esig.validationreport.jaxb.SARevIDListType;
import eu.europa.esig.validationreport.jaxb.SASigPolicyIdentifierType;
import eu.europa.esig.validationreport.jaxb.SASignatureProductionPlaceType;
import eu.europa.esig.validationreport.jaxb.SASignerRoleType;
import eu.europa.esig.validationreport.jaxb.SASigningTimeType;
import eu.europa.esig.validationreport.jaxb.SASubFilterType;
import eu.europa.esig.validationreport.jaxb.SATimestampType;
import eu.europa.esig.validationreport.jaxb.SAVRIType;
import eu.europa.esig.validationreport.jaxb.SignatureAttributesType;
import eu.europa.esig.validationreport.jaxb.SignatureIdentifierType;
import eu.europa.esig.validationreport.jaxb.SignatureValidationReportType;
import eu.europa.esig.validationreport.jaxb.SignerInformationType;
import eu.europa.esig.validationreport.jaxb.SignersDocumentType;
import eu.europa.esig.validationreport.jaxb.VOReferenceType;
import eu.europa.esig.validationreport.jaxb.ValidationObjectListType;
import eu.europa.esig.validationreport.jaxb.ValidationObjectRepresentationType;
import eu.europa.esig.validationreport.jaxb.ValidationObjectType;
import eu.europa.esig.validationreport.jaxb.ValidationReportDataType;
import eu.europa.esig.validationreport.jaxb.ValidationReportType;
import eu.europa.esig.validationreport.jaxb.ValidationStatusType;
import eu.europa.esig.validationreport.jaxb.ValidationTimeInfoType;
import eu.europa.esig.xades.jaxb.xades132.DigestAlgAndValueType;
import eu.europa.esig.xmldsig.jaxb.DigestMethodType;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.FopFactoryBuilder;
import org.apache.fop.apps.MimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Result;
import javax.xml.transform.sax.SAXResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public abstract class AbstractPkiFactoryTestValidation<SP extends SerializableSignatureParameters, 
				TP extends SerializableTimestampParameters> extends PKIFactoryAccess {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractPkiFactoryTestValidation.class);

	private static FopFactory fopFactory;

	static {
		FopFactoryBuilder builder = new FopFactoryBuilder(new File(".").toURI());
		builder.setAccessibility(true);

		fopFactory = builder.build();
	}
	
	protected Reports verify(DSSDocument signedDocument) {

		LOG.info("=================== VALIDATION =================");

		SignedDocumentValidator validator = getValidator(signedDocument);
		checkValidationContext(validator);

		List<AdvancedSignature> signatures = validator.getSignatures();
		checkAdvancedSignatures(signatures);
		checkDetachedTimestamps(validator.getDetachedTimestamps());
		checkSignaturePolicy(signatures);

		Reports reports = validator.validateDocument();
		// reports.setValidateXml(true);
		// reports.print();

		DiagnosticData diagnosticData = reports.getDiagnosticData();
		verifySourcesAndDiagnosticData(signatures, diagnosticData);

		verifyDiagnosticData(diagnosticData);

		verifyDiagnosticDataJaxb(reports.getDiagnosticDataJaxb());

		runDifferentValidationLevels(reports.getDiagnosticDataJaxb());

		SimpleReport simpleReport = reports.getSimpleReport();
		verifySimpleReport(simpleReport);

		DetailedReport detailedReport = reports.getDetailedReport();
		verifyDetailedReport(detailedReport);

		ValidationReportType etsiValidationReportJaxb = reports.getEtsiValidationReportJaxb();
		verifyETSIValidationReport(etsiValidationReportJaxb);
		
		verifyReportsData(reports);

		verifyOriginalDocuments(validator, diagnosticData);

		UnmarshallingTester.unmarshallXmlReports(reports);

		generateHtmlPdfReports(reports);
		
		return reports;
	}

	protected void runDifferentValidationLevels(XmlDiagnosticData diagnosticDataJaxb) {

		ValidationPolicy defaultValidationPolicy = null;
		try {
			defaultValidationPolicy = ValidationPolicyFacade.newFacade().getDefaultValidationPolicy();
		} catch (Exception e) {
			fail("Unable to load the default validation policy", e);
		}

		for (ValidationLevel validationLevel : ValidationLevel.values()) {
			DefaultSignatureProcessExecutor executor = new DefaultSignatureProcessExecutor();
			executor.setDiagnosticData(diagnosticDataJaxb);
			executor.setValidationPolicy(defaultValidationPolicy);
			executor.setValidationLevel(validationLevel);
			executor.setEnableEtsiValidationReport(true);
			Reports reports = executor.execute();
			assertNotNull(reports);
			assertNotNull(reports.getDetailedReportJaxb());
			assertNotNull(reports.getSimpleReportJaxb());
			assertNotNull(reports.getEtsiValidationReportJaxb());

			assertNotNull(reports.getDetailedReport());
			assertNotNull(reports.getSimpleReport());
		}

	}

	protected void checkValidationContext(SignedDocumentValidator validator) {
		// not implemented by default
	}

	protected SignedDocumentValidator getValidator(final DSSDocument signedDocument) {
		SignedDocumentValidator validator = SignedDocumentValidator.fromDocument(signedDocument);
		validator.setCertificateVerifier(getOfflineCertificateVerifier());
		validator.setTokenExtractionStrategy(getTokenExtractionStrategy());
		validator.setSignaturePolicyProvider(getSignaturePolicyProvider());
		validator.setDetachedContents(getDetachedContents());
		return validator;
	}

	protected TokenExtractionStrategy getTokenExtractionStrategy() {
		return TokenExtractionStrategy.NONE;
	}

	protected SignaturePolicyProvider getSignaturePolicyProvider() {
		return new SignaturePolicyProvider();
	}

	protected List<DSSDocument> getDetachedContents() {
		return null;
	}

	protected void checkAdvancedSignatures(List<AdvancedSignature> signatures) {
		assertTrue(Utils.isCollectionNotEmpty(signatures));
	}

	protected void checkDetachedTimestamps(List<TimestampToken> detachedTimestamps) {
		// not implemented by default
	}

	protected void checkSignaturePolicy(List<AdvancedSignature> signatures) {
		if (Utils.isCollectionNotEmpty(signatures)) {
			for (AdvancedSignature signature : signatures) {
				SignaturePolicy signaturePolicy = signature.getSignaturePolicy();
				if (signaturePolicy != null) {
					List<SignaturePolicyValidator> validators = new ArrayList<>();
					
					ServiceLoader<SignaturePolicyValidator> loader = ServiceLoader.load(SignaturePolicyValidator.class);
					Iterator<SignaturePolicyValidator> validatorOptions = loader.iterator();
					if (validatorOptions.hasNext()) {
						for (SignaturePolicyValidator signaturePolicyValidator : loader) {
							if (signaturePolicyValidator.canValidate(signature.getSignaturePolicy())) {
								validators.add(signaturePolicyValidator);
							}
						}
					}
					if (validators.size() != 1) {
						throw new DSSException(validators.size() + " signature policy validators found!");
					}
				}
			}
		}
	}
	
	protected void verifySourcesAndDiagnosticData(List<AdvancedSignature> advancedSignatures, DiagnosticData diagnosticData) {
		for (AdvancedSignature advancedSignature : advancedSignatures) {
			SignatureWrapper signatureWrapper = diagnosticData.getSignatureById(advancedSignature.getId());

			if (advancedSignature.getSigningCertificateToken() != null && advancedSignature.getSignatureCryptographicVerification().isSignatureIntact()) {
				assertNotNull(signatureWrapper.getSigningCertificate());
				assertEquals(advancedSignature.getSigningCertificateToken().getDSSIdAsString(), signatureWrapper.getSigningCertificate().getId());
			}

			SignatureCertificateSource certificateSource = advancedSignature.getCertificateSource();
			FoundCertificatesProxy foundCertificates = signatureWrapper.foundCertificates();

			verifyCertificateSourceData(certificateSource, foundCertificates);

			OfflineRevocationSource<CRL> crlSource = advancedSignature.getCRLSource();
			OfflineRevocationSource<OCSP> ocspSource = advancedSignature.getOCSPSource();
			FoundRevocationsProxy foundRevocations = signatureWrapper.foundRevocations();

			verifyRevocationSourceData(crlSource, foundRevocations, RevocationType.CRL);
			verifyRevocationSourceData(ocspSource, foundRevocations, RevocationType.OCSP);

			List<TimestampToken> timestamps = advancedSignature.getAllTimestamps();
			for (TimestampToken timestampToken : timestamps) {
				TimestampWrapper timestampWrapper = diagnosticData.getTimestampById(timestampToken.getDSSIdAsString());

				certificateSource = timestampToken.getCertificateSource();
				foundCertificates = timestampWrapper.foundCertificates();

				verifyCertificateSourceData(certificateSource, foundCertificates);

				crlSource = timestampToken.getCRLSource();
				ocspSource = timestampToken.getOCSPSource();
				foundRevocations = timestampWrapper.foundRevocations();

				verifyRevocationSourceData(crlSource, foundRevocations, RevocationType.CRL);
				verifyRevocationSourceData(ocspSource, foundRevocations, RevocationType.OCSP);
			}

			Set<RevocationToken<OCSP>> allRevocationTokens = ocspSource.getAllRevocationTokens();
			for (RevocationToken<OCSP> revocationToken : allRevocationTokens) {
				RevocationCertificateSource revocationCertificateSource = revocationToken.getCertificateSource();
				if (revocationCertificateSource != null) {
					RevocationWrapper revocationWrapper = diagnosticData.getRevocationById(revocationToken.getDSSIdAsString());
					foundCertificates = revocationWrapper.foundCertificates();

					assertEquals(revocationCertificateSource.getCertificates().size(), 
							foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.BASIC_OCSP_RESP).size() +
									foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.BASIC_OCSP_RESP).size());
					assertEquals(revocationCertificateSource.getAllCertificateRefs().size(), foundCertificates.getRelatedCertificateRefs().size());
				}
			}
		}
		
		checkOrphanTokens(diagnosticData);
	}

	protected void verifyCertificateSourceData(SignatureCertificateSource certificateSource, FoundCertificatesProxy foundCertificates) {
		// Tokens
		assertEquals(certificateSource.getKeyInfoCertificates().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.KEY_INFO).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.KEY_INFO).size());
		assertEquals(certificateSource.getCertificateValues().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.CERTIFICATE_VALUES).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.CERTIFICATE_VALUES).size());
		assertEquals(certificateSource.getTimeStampValidationDataCertValues().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.TIMESTAMP_VALIDATION_DATA).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.TIMESTAMP_VALIDATION_DATA).size());
		assertEquals(certificateSource.getAttrAuthoritiesCertValues().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.ATTR_AUTHORITIES_CERT_VALUES).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.ATTR_AUTHORITIES_CERT_VALUES).size());
		assertEquals(certificateSource.getSignedDataCertificates().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.SIGNED_DATA).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.SIGNED_DATA).size());
		assertEquals(certificateSource.getDSSDictionaryCertValues().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.DSS_DICTIONARY).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.DSS_DICTIONARY).size());
		assertEquals(certificateSource.getVRIDictionaryCertValues().size(),
				foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.VRI_DICTIONARY).size() +
						foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.VRI_DICTIONARY).size());
		assertEquals(0, foundCertificates.getRelatedCertificatesByOrigin(CertificateOrigin.BASIC_OCSP_RESP).size() +
				foundCertificates.getOrphanCertificatesByOrigin(CertificateOrigin.BASIC_OCSP_RESP).size());

		// Refs
		assertEquals(certificateSource.getSigningCertificateRefs().size(),
				foundCertificates.getRelatedCertificatesByRefOrigin(CertificateRefOrigin.SIGNING_CERTIFICATE).size() +
						foundCertificates.getOrphanCertificatesByRefOrigin(CertificateRefOrigin.SIGNING_CERTIFICATE).size());
		assertEquals(certificateSource.getAttributeCertificateRefs().size(),
				foundCertificates.getRelatedCertificatesByRefOrigin(CertificateRefOrigin.ATTRIBUTE_CERTIFICATE_REFS).size() +
						foundCertificates.getOrphanCertificatesByRefOrigin(CertificateRefOrigin.ATTRIBUTE_CERTIFICATE_REFS).size());
		assertEquals(certificateSource.getCompleteCertificateRefs().size(),
				foundCertificates.getRelatedCertificatesByRefOrigin(CertificateRefOrigin.COMPLETE_CERTIFICATE_REFS).size() +
						foundCertificates.getOrphanCertificatesByRefOrigin(CertificateRefOrigin.COMPLETE_CERTIFICATE_REFS).size());
	}

	protected void verifyRevocationSourceData(OfflineRevocationSource<?> revocationSource, FoundRevocationsProxy foundRevocations,
											RevocationType revocationType) {
		assertEquals(revocationSource.getCMSSignedDataRevocationBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.CMS_SIGNED_DATA).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.CMS_SIGNED_DATA).size());
		assertEquals(revocationSource.getRevocationValuesBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.REVOCATION_VALUES).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.REVOCATION_VALUES).size());
		assertEquals(revocationSource.getAttributeRevocationValuesBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.ATTRIBUTE_REVOCATION_VALUES).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.ATTRIBUTE_REVOCATION_VALUES).size());
		assertEquals(revocationSource.getTimestampValidationDataBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.TIMESTAMP_VALIDATION_DATA).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.TIMESTAMP_VALIDATION_DATA).size());
		assertEquals(revocationSource.getDSSDictionaryBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.DSS_DICTIONARY).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.DSS_DICTIONARY).size());
		assertEquals(revocationSource.getVRIDictionaryBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.VRI_DICTIONARY).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.VRI_DICTIONARY).size());
		assertEquals(revocationSource.getADBERevocationValuesBinaries().size(),
				foundRevocations.getRelatedRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.ADBE_REVOCATION_INFO_ARCHIVAL).size() +
				foundRevocations.getOrphanRevocationsByTypeAndOrigin(revocationType, RevocationOrigin.ADBE_REVOCATION_INFO_ARCHIVAL).size());

		// Refs
		assertEquals(revocationSource.getCompleteRevocationRefs().size(),
				foundRevocations.getRelatedRevocationsByTypeAndRefOrigin(revocationType, RevocationRefOrigin.COMPLETE_REVOCATION_REFS).size() +
						foundRevocations.getOrphanRevocationsByTypeAndRefOrigin(revocationType, RevocationRefOrigin.COMPLETE_REVOCATION_REFS).size());
		assertEquals(revocationSource.getAttributeRevocationRefs().size(), foundRevocations.
				getRelatedRevocationsByTypeAndRefOrigin(revocationType, RevocationRefOrigin.ATTRIBUTE_REVOCATION_REFS).size() +
				foundRevocations.getOrphanRevocationsByTypeAndRefOrigin(revocationType, RevocationRefOrigin.ATTRIBUTE_REVOCATION_REFS).size());
	}

	protected void verifyDiagnosticData(DiagnosticData diagnosticData) {
		checkBLevelValid(diagnosticData);
		checkNumberOfSignatures(diagnosticData);
		checkDigestAlgorithm(diagnosticData);
		checkEncryptionAlgorithm(diagnosticData);
		checkMaskGenerationFunction(diagnosticData);
		checkSigningCertificateValue(diagnosticData);
		checkIssuerSigningCertificateValue(diagnosticData);
		checkCertificateChain(diagnosticData);
		checkSignatureLevel(diagnosticData);
		checkSigningDate(diagnosticData);
		checkCertificates(diagnosticData);
		checkRevocationData(diagnosticData);
		checkTimestamps(diagnosticData);
		checkSignatureScopes(diagnosticData);
		checkMessageDigestAlgorithm(diagnosticData);
		checkMimeType(diagnosticData);
		checkCommitmentTypeIndications(diagnosticData);
		checkClaimedRoles(diagnosticData);
		checkSignedAssertions(diagnosticData);
		checkSignatureProductionPlace(diagnosticData);
		checkSignatureIdentifier(diagnosticData);
		checkSignaturePolicyIdentifier(diagnosticData);
		checkSignaturePolicyStore(diagnosticData);
		checkSignatureDigestReference(diagnosticData);
		checkDTBSR(diagnosticData);
		checkSignatureInformationStore(diagnosticData);
		checkPdfRevision(diagnosticData);
		checkStructureValidation(diagnosticData);
		checkTokens(diagnosticData);
		checkCounterSignatures(diagnosticData);
		checkTrustedServices(diagnosticData);
		checkContainerInfo(diagnosticData);

		checkNoDuplicateSignatures(diagnosticData);
		checkNoDuplicateCompleteCertificates(diagnosticData);
		checkNoDuplicateCompleteRevocationData(diagnosticData);
	}

	protected void checkBLevelValid(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			List<XmlDigestMatcher> digestMatchers = signatureWrapper.getDigestMatchers();
			assertTrue(Utils.isCollectionNotEmpty(digestMatchers));
			for (XmlDigestMatcher digestMatcher : digestMatchers) {
				if (!DigestMatcherType.MANIFEST_ENTRY.equals(digestMatcher.getType())) {
					assertTrue(digestMatcher.isDataFound());
					assertTrue(digestMatcher.isDataIntact());
					assertFalse(digestMatcher.isDuplicated());
				}
			}
	
			assertTrue(signatureWrapper.isSignatureIntact());
			assertTrue(signatureWrapper.isSignatureValid());
			assertTrue(diagnosticData.isBLevelTechnicallyValid(signatureWrapper.getId()));
		}
	}

	protected void checkNumberOfSignatures(DiagnosticData diagnosticData) {
		assertTrue(Utils.isCollectionNotEmpty(diagnosticData.getSignatures()));
		assertTrue(Utils.isCollectionNotEmpty(diagnosticData.getSignatureIdList()));
	}

	protected void checkDigestAlgorithm(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertNotNull(signatureWrapper.getDigestAlgorithm());
		}
	}

	protected void checkEncryptionAlgorithm(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertNotNull(signatureWrapper.getEncryptionAlgorithm());
		}
	}
	
	protected void checkMaskGenerationFunction(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkSigningCertificateValue(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertTrue(signatureWrapper.isSigningCertificateIdentified());
			assertTrue(signatureWrapper.isSigningCertificateReferencePresent());
			assertTrue(signatureWrapper.isSigningCertificateReferenceUnique());
			
			CertificateRefWrapper signingCertificateReference = signatureWrapper.getSigningCertificateReference();
			assertNotNull(signingCertificateReference);
			assertTrue(signingCertificateReference.isDigestValuePresent());
			assertTrue(signingCertificateReference.isDigestValueMatch());
			if (signingCertificateReference.isIssuerSerialPresent()) {
				assertTrue(signingCertificateReference.isIssuerSerialMatch());
			}
			
			CertificateWrapper signingCertificate = signatureWrapper.getSigningCertificate();
			assertNotNull(signingCertificate);
			String signingCertificateId = signingCertificate.getId();
			String certificateDN = diagnosticData.getCertificateDN(signingCertificateId);
			String certificateSerialNumber = diagnosticData.getCertificateSerialNumber(signingCertificateId);
			assertEquals(signingCertificate.getCertificateDN(), certificateDN);
			assertEquals(signingCertificate.getSerialNumber(), certificateSerialNumber);
			
			assertTrue(Utils.isCollectionEmpty(signatureWrapper.foundCertificates()
					.getOrphanCertificatesByRefOrigin(CertificateRefOrigin.SIGNING_CERTIFICATE)));
		}
	}

	protected void checkIssuerSigningCertificateValue(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			CertificateWrapper signingCertificate = signatureWrapper.getSigningCertificate();
			if (signingCertificate != null) {
				String signingCertificateId = signingCertificate.getId();
				String issuerDN = diagnosticData.getCertificateIssuerDN(signingCertificateId);
				assertEquals(signingCertificate.getCertificateIssuerDN(), issuerDN);
			}
		}
	}

	protected void checkSignatureLevel(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			SignatureLevel signatureFormat = signatureWrapper.getSignatureFormat();
			assertNotNull(signatureWrapper.getSignatureFormat());
			assertEquals(isBaselineT(signatureFormat), diagnosticData.isThereTLevel(signatureWrapper.getId()));
			assertEquals(isBaselineT(signatureFormat), diagnosticData.isTLevelTechnicallyValid(signatureWrapper.getId()));
			assertEquals(isBaselineLTA(signatureFormat), diagnosticData.isThereALevel(signatureWrapper.getId()));
			assertEquals(isBaselineLTA(signatureFormat), diagnosticData.isALevelTechnicallyValid(signatureWrapper.getId()));
		}
	}
	
	protected boolean isBaselineT(SignatureLevel signatureLevel) {
		switch (signatureLevel) {
			case XAdES_BASELINE_T:
			case XAdES_T:
			case XAdES_C:
			case XAdES_X:
			case CAdES_BASELINE_T:
			case CAdES_T:
			case CAdES_C:
			case CAdES_X:
			case JAdES_BASELINE_T:
			case PAdES_BASELINE_T:
				return true;
			default:
				return isBaselineLT(signatureLevel);
		}
	}
	
	protected boolean isBaselineLT(SignatureLevel signatureLevel) {
		switch (signatureLevel) {
			case XAdES_BASELINE_LT:
			case XAdES_LT:
			case XAdES_XL:
			case CAdES_BASELINE_LT:
			case CAdES_LT:
			case CAdES_XL:
			case JAdES_BASELINE_LT:
			case PAdES_BASELINE_LT:
				return true;
			default:
				return isBaselineLTA(signatureLevel);
		}
	}
	
	protected boolean isBaselineLTA(SignatureLevel signatureLevel) {
		switch (signatureLevel) {
			case XAdES_BASELINE_LTA:
			case XAdES_A:
			case CAdES_BASELINE_LTA:
			case CAdES_A:
			case JAdES_BASELINE_LTA:
			case PAdES_BASELINE_LTA:
				return true;
			default:
				return false;
		}
	}

	protected void checkCertificateChain(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			if (signatureWrapper.getSigningCertificate() != null) {
				assertTrue(Utils.isCollectionNotEmpty(signatureWrapper.getCertificateChain()));
			}
			checkCertificateChainComplete(signatureWrapper);
		}
		for (CertificateWrapper certificateWrapper : diagnosticData.getUsedCertificates()) {
			checkCertificateChainComplete(certificateWrapper);
		}
		for (RevocationWrapper revocationWrapper : diagnosticData.getAllRevocationData()) {
			checkCertificateChainComplete(revocationWrapper);
		}
		for (TimestampWrapper timestampWrapper : diagnosticData.getTimestampList()) {
			checkCertificateChainComplete(timestampWrapper);
		}
	}

	private void checkCertificateChainComplete(TokenProxy tokenProxy) {
		List<CertificateWrapper> certificateChain = tokenProxy.getCertificateChain();
		CertificateWrapper signingCertificate = tokenProxy.getSigningCertificate();
		if (signingCertificate == null) {
			assertFalse(Utils.isCollectionNotEmpty(certificateChain));
		} else {
			assertTrue(Utils.isCollectionNotEmpty(certificateChain));
			assertEquals(signingCertificate.getId(), certificateChain.get(0).getId());

			List<CertificateWrapper> signingCertificateChain = signingCertificate.getCertificateChain();
			if (Utils.isCollectionNotEmpty(signingCertificateChain)) {
				if (signingCertificate.getId().equals(signingCertificateChain.get(0).getId())) {
					assertEquals(1, signingCertificateChain.size());

				} else if (certificateChain.size() == signingCertificateChain.size() + 1) {
					for (int ii = 0; ii < signingCertificateChain.size(); ii++) {
						assertTrue(certificateChain.get(ii + 1).getId().equals(signingCertificateChain.get(ii).getId()) ||
								certificateChain.get(ii + 1).getEntityKey().equals(signingCertificateChain.get(ii).getEntityKey()));
					}

				} else {
					int length = certificateChain.size() < signingCertificateChain.size() + 1 ? certificateChain.size() - 1 : signingCertificateChain.size();
					for (int ii = 0; ii < length; ii++) {
						assertTrue(certificateChain.get(ii + 1).getId().equals(signingCertificateChain.get(ii).getId()) ||
								certificateChain.get(ii + 1).getEntityKey().equals(signingCertificateChain.get(ii).getEntityKey()));
					}
				}
			}
		}
	}

	protected void checkSigningDate(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertNotNull(signatureWrapper.getClaimedSigningTime());
		}
	}

	protected void checkCertificates(DiagnosticData diagnosticData) {
		for (CertificateWrapper certificateWrapper : diagnosticData.getUsedCertificates()) {
			assertNotNull(certificateWrapper);
			assertNotNull(certificateWrapper.getId());
			assertNotNull(certificateWrapper.getCertificateDN());
			assertNotNull(certificateWrapper.getCertificateIssuerDN());
			assertNotNull(certificateWrapper.getNotAfter());
			assertNotNull(certificateWrapper.getNotBefore());
			assertTrue(Utils.isCollectionNotEmpty(certificateWrapper.getSources()));
			assertNotNull(certificateWrapper.getEntityKey());
		}
	}
	
	protected void checkRevocationData(DiagnosticData diagnosticData) {
		for (RevocationWrapper revocationWrapper : diagnosticData.getAllRevocationData()) {
			assertNotNull(revocationWrapper.getId());
			assertNotNull(revocationWrapper.getRevocationType());
			assertNotNull(revocationWrapper.getOrigin());
			assertNotNull(revocationWrapper.getProductionDate());
			assertNotNull(revocationWrapper.foundCertificates());
			assertNotNull(revocationWrapper.foundCertificates().getRelatedCertificates());
			assertNotNull(revocationWrapper.foundCertificates().getOrphanCertificates());
			
			if (revocationWrapper.getSigningCertificate() != null) {
				assertTrue(Utils.isCollectionNotEmpty(revocationWrapper.getCertificateChain()));
				
				if (RevocationType.OCSP.equals(revocationWrapper.getRevocationType())) {
					assertTrue(Utils.isCollectionNotEmpty(revocationWrapper.foundCertificates().getRelatedCertificates()));
					assertTrue(Utils.isCollectionNotEmpty(revocationWrapper.foundCertificates().getRelatedCertificateRefs()));
					
					assertTrue(revocationWrapper.isSigningCertificateReferencePresent());
					assertTrue(revocationWrapper.isSigningCertificateReferenceUnique());
					assertNotNull(revocationWrapper.getSigningCertificateReference());
					
					boolean signingCertFound = false;
					for (RelatedCertificateWrapper certificateWrapper : revocationWrapper.foundCertificates().getRelatedCertificates()) {
						for (CertificateRefWrapper refWrapper : certificateWrapper.getReferences()) {
							if (CertificateRefOrigin.SIGNING_CERTIFICATE.equals(refWrapper.getOrigin())) {
								signingCertFound = true;
							}
							assertTrue(refWrapper.getSki() != null || refWrapper.getIssuerName() != null);
							assertNull(refWrapper.getDigestAlgoAndValue());
							assertNull(refWrapper.getIssuerSerial());
							assertEquals(certificateWrapper.getId(), revocationWrapper.getSigningCertificate().getId());
						}
					}
					assertTrue(signingCertFound);
				}
			}
		}
	}

	protected void checkTimestamps(DiagnosticData diagnosticData) {
		List<SignatureWrapper> allSignatures = diagnosticData.getSignatures();
		for (SignatureWrapper signatureWrapper : allSignatures) {
			List<String> timestampIdList = diagnosticData.getTimestampIdList(signatureWrapper.getId());
	
			boolean foundSignatureTimeStamp = false;
			boolean foundArchiveTimeStamp = false;
			boolean foundDocTimeStamp = false;
	
			if ((timestampIdList != null) && (timestampIdList.size() > 0)) {
				for (String timestampId : timestampIdList) {
					TimestampType timestampType = diagnosticData.getTimestampType(timestampId);
					switch (timestampType) {
						case SIGNATURE_TIMESTAMP:
							foundSignatureTimeStamp = true;
							break;
						case ARCHIVE_TIMESTAMP:
							foundArchiveTimeStamp = true;
							break;
						case DOCUMENT_TIMESTAMP:
							foundDocTimeStamp = true;
							break;
						default:
							break;
						}
				}
			}
	
			if (isBaselineT(signatureWrapper.getSignatureFormat())) {
				assertTrue(foundSignatureTimeStamp || foundDocTimeStamp);
			}
	
			if (isBaselineLTA(signatureWrapper.getSignatureFormat())) {
				assertTrue(foundArchiveTimeStamp || foundDocTimeStamp);
			}
	
			Set<TimestampWrapper> allTimestamps = diagnosticData.getTimestampSet();
			for (TimestampWrapper timestampWrapper : allTimestamps) {
				assertNotNull(timestampWrapper.getProductionTime());
				assertTrue(timestampWrapper.isMessageImprintDataFound());
				assertTrue(timestampWrapper.isMessageImprintDataIntact());
				assertTrue(timestampWrapper.isSignatureIntact());
				assertTrue(timestampWrapper.isSignatureValid());
	
				List<XmlDigestMatcher> digestMatchers = timestampWrapper.getDigestMatchers();
				for (XmlDigestMatcher xmlDigestMatcher : digestMatchers) {
					assertTrue(xmlDigestMatcher.isDataFound());
					assertTrue(xmlDigestMatcher.isDataIntact());
				}
				if (TimestampType.ARCHIVE_TIMESTAMP.equals(timestampWrapper.getType())) {
					assertNotNull(timestampWrapper.getArchiveTimestampType());
				}
				
				assertTrue(timestampWrapper.isSigningCertificateIdentified());
				assertTrue(timestampWrapper.isSigningCertificateReferencePresent());
				assertTrue(timestampWrapper.isSigningCertificateReferenceUnique());

				if (timestampWrapper.isTSAGeneralNamePresent()) {
					assertTrue(timestampWrapper.isTSAGeneralNameMatch());
					assertTrue(timestampWrapper.isTSAGeneralNameOrderMatch());
				}

				CertificateRefWrapper signingCertificateReference = timestampWrapper.getSigningCertificateReference();
				assertNotNull(signingCertificateReference);
				assertTrue(signingCertificateReference.isDigestValuePresent());
				assertTrue(signingCertificateReference.isDigestValueMatch());
				if (signingCertificateReference.isIssuerSerialPresent()) {
					assertTrue(signingCertificateReference.isIssuerSerialMatch());
				}
				
				CertificateWrapper signingCertificate = timestampWrapper.getSigningCertificate();
				assertNotNull(signingCertificate);
				String signingCertificateId = signingCertificate.getId();
				String certificateDN = diagnosticData.getCertificateDN(signingCertificateId);
				String certificateSerialNumber = diagnosticData.getCertificateSerialNumber(signingCertificateId);
				assertEquals(signingCertificate.getCertificateDN(), certificateDN);
				assertEquals(signingCertificate.getSerialNumber(), certificateSerialNumber);
				
				assertTrue(Utils.isCollectionEmpty(timestampWrapper.foundCertificates()
						.getOrphanCertificatesByRefOrigin(CertificateRefOrigin.SIGNING_CERTIFICATE)));

				List<SignatureWrapper> timestampedSignatures = timestampWrapper.getTimestampedSignatures();
				if (timestampedSignatures.stream().map(SignatureWrapper::getId)
						.collect(Collectors.toList()).contains(signatureWrapper.getId())) {
					checkTimestampedProperties(allTimestamps, timestampWrapper, allSignatures, signatureWrapper);
				}

				assertTrue(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampedObjects()));

				if (timestampWrapper.getType().isContentTimestamp() || timestampWrapper.getType().isArchivalTimestamp() ||
						timestampWrapper.getType().isDocumentTimestamp()) {
					assertTrue(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampScopes()));
				} else {
					assertFalse(Utils.isCollectionNotEmpty(timestampWrapper.getTimestampScopes()));
				}
			}
		}
	}

	protected void checkTimestampedProperties(Collection<TimestampWrapper> allTimestamps, TimestampWrapper timestampWrapper,
											  Collection<SignatureWrapper> allSignatures, SignatureWrapper signatureWrapper) {
		boolean timestampedTimestamp = false;
		for (TimestampWrapper timestamp : allTimestamps) {
			List<String> timestampedTstIds = timestamp.getTimestampedTimestamps().stream().map(TimestampWrapper::getId)
					.collect(Collectors.toList());
			if (timestampedTstIds.contains(timestampWrapper.getId())) {
				timestampedTimestamp = true;
				break;
			}
		}

		List<String> certIds = timestampWrapper.getTimestampedCertificates().stream()
				.map(CertificateWrapper::getId).collect(Collectors.toList());
		if (timestampWrapper.getType().isArchivalTimestamp()) {
			for (CertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getRelatedCertificatesByOrigin(CertificateOrigin.KEY_INFO)) {
				assertTrue(certIds.contains(certificate.getId()));
			}
			if (!timestampedTimestamp && Utils.collectionSize(allSignatures) < 2) {
				for (CertificateWrapper certificate : signatureWrapper.foundCertificates()
						.getRelatedCertificatesByOrigin(CertificateOrigin.SIGNED_DATA)) {
					assertTrue(certIds.contains(certificate.getId()));
				}
			}
			for (CertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getRelatedCertificatesByOrigin(CertificateOrigin.CERTIFICATE_VALUES)) {
				assertTrue(certIds.contains(certificate.getId()));
			}
			for (CertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getRelatedCertificatesByOrigin(CertificateOrigin.ATTR_AUTHORITIES_CERT_VALUES)) {
				assertTrue(certIds.contains(certificate.getId()));
			}
		}

		List<String> orphanCertIds = timestampWrapper.getTimestampedOrphanCertificates().stream()
				.map(OrphanTokenWrapper::getId).collect(Collectors.toList());
		if (timestampWrapper.getType().isArchivalTimestamp()) {
			for (OrphanCertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getOrphanCertificatesByOrigin(CertificateOrigin.KEY_INFO)) {
				assertTrue(orphanCertIds.contains(certificate.getId()));
			}
			if (!timestampedTimestamp && Utils.collectionSize(allSignatures) < 2) {
				for (OrphanCertificateWrapper certificate : signatureWrapper.foundCertificates()
						.getOrphanCertificatesByOrigin(CertificateOrigin.SIGNED_DATA)) {
					assertTrue(orphanCertIds.contains(certificate.getId()));
				}
			}
			for (OrphanCertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getOrphanCertificatesByOrigin(CertificateOrigin.CERTIFICATE_VALUES)) {
				assertTrue(orphanCertIds.contains(certificate.getId()));
			}
			for (OrphanCertificateWrapper certificate : signatureWrapper.foundCertificates()
					.getOrphanCertificatesByOrigin(CertificateOrigin.ATTR_AUTHORITIES_CERT_VALUES)) {
				assertTrue(orphanCertIds.contains(certificate.getId()));
			}
		}

		List<RevocationWrapper> timestampedRevocations = timestampWrapper.getTimestampedRevocations();
		for (RevocationWrapper revocationWrapper : timestampedRevocations) {
			List<RelatedCertificateWrapper> relatedCertificates = revocationWrapper.foundCertificates().getRelatedCertificates();
			for (CertificateWrapper certificateWrapper : relatedCertificates) {
				assertTrue(certIds.contains(certificateWrapper.getId()), String.format("%s is not covered", certificateWrapper.getId()));
			}
			List<OrphanCertificateWrapper> orphanCertificates = revocationWrapper.foundCertificates().getOrphanCertificates();
			for (OrphanCertificateWrapper orphanCertificateWrapper : orphanCertificates) {
				assertTrue(orphanCertIds.contains(orphanCertificateWrapper.getId()), String.format("%s is not covered", orphanCertificateWrapper.getId()));
			}
		}

		List<String> revocIds = timestampedRevocations.stream().map(RevocationWrapper::getId).collect(Collectors.toList());
		if (timestampWrapper.getType().coversSignature()) {
			for (RevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getRelatedRevocationsByOrigin(RevocationOrigin.ADBE_REVOCATION_INFO_ARCHIVAL)) {
				assertTrue(revocIds.contains(revocation.getId()));
			}
		}
		if (timestampWrapper.getType().isArchivalTimestamp()) {
			if (!timestampedTimestamp && Utils.collectionSize(allSignatures) < 2) {
				for (RevocationWrapper revocation : signatureWrapper.foundRevocations()
						.getRelatedRevocationsByOrigin(RevocationOrigin.CMS_SIGNED_DATA)) {
					assertTrue(revocIds.contains(revocation.getId()));
				}
			}
			for (RevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getRelatedRevocationsByOrigin(RevocationOrigin.REVOCATION_VALUES)) {
				assertTrue(revocIds.contains(revocation.getId()));
			}
			for (RevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getRelatedRevocationsByOrigin(RevocationOrigin.ATTRIBUTE_REVOCATION_VALUES)) {
				assertTrue(revocIds.contains(revocation.getId()));
			}
		}

		List<String> orphanRevocIds = timestampWrapper.getTimestampedOrphanRevocations().stream()
				.map(OrphanTokenWrapper::getId).collect(Collectors.toList());
		if (timestampWrapper.getType().coversSignature()) {
			for (OrphanRevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getOrphanRevocationsByOrigin(RevocationOrigin.ADBE_REVOCATION_INFO_ARCHIVAL)) {
				assertTrue(orphanRevocIds.contains(revocation.getId()));
			}
		}
		if (timestampWrapper.getType().isArchivalTimestamp()) {
			if (!timestampedTimestamp && Utils.collectionSize(allSignatures) < 2) {
				for (OrphanRevocationWrapper revocation : signatureWrapper.foundRevocations()
						.getOrphanRevocationsByOrigin(RevocationOrigin.CMS_SIGNED_DATA)) {
					assertTrue(orphanRevocIds.contains(revocation.getId()));
				}
			}
			for (OrphanRevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getOrphanRevocationsByOrigin(RevocationOrigin.REVOCATION_VALUES)) {
				assertTrue(orphanRevocIds.contains(revocation.getId()));
			}
			for (OrphanRevocationWrapper revocation : signatureWrapper.foundRevocations()
					.getOrphanRevocationsByOrigin(RevocationOrigin.ATTRIBUTE_REVOCATION_VALUES)) {
				assertTrue(orphanRevocIds.contains(revocation.getId()));
			}
		}
	}
	
	protected void checkSignatureScopes(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			boolean hasCounterSignatureScope = false;
			
			assertTrue(Utils.isCollectionNotEmpty(signatureWrapper.getSignatureScopes()));
			for (XmlSignatureScope signatureScope : signatureWrapper.getSignatureScopes()) {
				assertNotNull(signatureScope.getScope());
				assertNotNull(signatureScope.getSignerData());
				assertNotNull(signatureScope.getSignerData().getDigestAlgoAndValue());
				assertNotNull(signatureScope.getSignerData().getDigestAlgoAndValue().getDigestMethod());
				assertNotNull(signatureScope.getSignerData().getDigestAlgoAndValue().getDigestValue());
				
				if (SignatureScopeType.COUNTER_SIGNATURE.equals(signatureScope.getScope())) {
					assertEquals(signatureWrapper.getParent().getId(), signatureScope.getName());
					hasCounterSignatureScope = true;
				}
			}
			
			assertEquals(signatureWrapper.isCounterSignature(), hasCounterSignatureScope);
		}
	}

	protected void checkMessageDigestAlgorithm(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			List<XmlDigestMatcher> digestMatchers = signatureWrapper.getDigestMatchers();
			assertTrue(Utils.isCollectionNotEmpty(digestMatchers));
			for (XmlDigestMatcher xmlDigestMatcher : digestMatchers) {
				if (!DigestMatcherType.COUNTER_SIGNED_SIGNATURE_VALUE.equals(xmlDigestMatcher.getType()) &&
						xmlDigestMatcher.isDataIntact()) {
					assertNotNull(xmlDigestMatcher.getDigestMethod());
					assertNotNull(xmlDigestMatcher.getDigestValue());
				}
			}
		}
	}

	protected void checkMimeType(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkCommitmentTypeIndications(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkClaimedRoles(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkSignedAssertions(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkSignatureProductionPlace(DiagnosticData diagnosticData) {
		// not implemented by default
	}
	
	protected void checkSignatureIdentifier(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertNotNull(signatureWrapper.getSignatureValue());
			assertNotNull(signatureWrapper.getDAIdentifier());
		}
	}

	protected void checkSignaturePolicyIdentifier(DiagnosticData diagnosticData) {
		// not implemented by default
	}
	
	protected void checkSignaturePolicyStore(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			String policyStoreId = signatureWrapper.getPolicyStoreId();
			if (Utils.isStringNotEmpty(policyStoreId)) {
				XmlDigestAlgoAndValue digestAlgoAndValue = signatureWrapper.getPolicyStoreDigestAlgoAndValue();
				assertNotNull(digestAlgoAndValue);
				assertNotNull(digestAlgoAndValue.getDigestMethod());
				assertTrue(Utils.isArrayNotEmpty(digestAlgoAndValue.getDigestValue()));
			}
		}
	}

	protected void checkSignatureDigestReference(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			XmlSignatureDigestReference signatureDigestReference = signatureWrapper.getSignatureDigestReference();
			assertNotNull(signatureDigestReference);
			assertNotNull(signatureDigestReference.getDigestMethod());
			assertTrue(Utils.isArrayNotEmpty(signatureDigestReference.getDigestValue()));
		}
	}
	
	protected void checkDTBSR(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			if (signatureWrapper.getDigestAlgorithm() != null) {
				XmlDigestAlgoAndValue dataToBeSignedRepresentation = signatureWrapper.getDataToBeSignedRepresentation();
				assertNotNull(dataToBeSignedRepresentation);
				assertNotNull(dataToBeSignedRepresentation.getDigestMethod());
				assertTrue(Utils.isArrayNotEmpty(dataToBeSignedRepresentation.getDigestValue()));
			}
		}
	}

	protected void checkSignatureInformationStore(DiagnosticData diagnosticData) {
		// not implemented by default
	}
	
	protected void checkPdfRevision(DiagnosticData diagnosticData) {
		// not implemented by default
	}
	
	protected void checkStructureValidation(DiagnosticData diagnosticData) {
		for (SignatureWrapper signature : diagnosticData.getSignatures()) {
			assertTrue(signature.isStructuralValidationValid());
			if (Utils.isCollectionNotEmpty(signature.getStructuralValidationMessages())) {
				fail("Structural validation failure: " + signature.getStructuralValidationMessages().toString());
			}
		}
	}
	
	protected void checkTokens(DiagnosticData diagnosticData) {
		for (CertificateWrapper cert : diagnosticData.getUsedCertificates()) {
			CertificateWrapper certificateWrapper = diagnosticData.getUsedCertificateById(cert.getId());
			assertNotNull(certificateWrapper);
			assertTrue(certificateWrapper.getBinaries() != null || certificateWrapper.getDigestAlgoAndValue() != null);
		}
		for (TimestampWrapper tst : diagnosticData.getTimestampSet()) {
			TimestampWrapper timestampWrapper = diagnosticData.getTimestampById(tst.getId());
			assertNotNull(timestampWrapper);
			assertTrue(timestampWrapper.getBinaries() != null || timestampWrapper.getDigestAlgoAndValue() != null);
		}
		for (RevocationWrapper revocation : diagnosticData.getAllRevocationData()) {
			assertNotNull(revocation);
			assertTrue(revocation.getBinaries() != null || revocation.getDigestAlgoAndValue() != null);
		}
	}
	
	protected void checkOrphanTokens(DiagnosticData diagnosticData) {
		// orphan data must not be added into the signature
		assertTrue(Utils.isCollectionEmpty(diagnosticData.getAllOrphanCertificateObjects()));
		assertTrue(Utils.isCollectionEmpty(diagnosticData.getAllOrphanCertificateReferences()));
		assertTrue(Utils.isCollectionEmpty(diagnosticData.getAllOrphanRevocationObjects()));
		assertTrue(Utils.isCollectionEmpty(diagnosticData.getAllOrphanRevocationReferences()));
	}
	
	protected void checkCounterSignatures(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkNoDuplicateSignatures(DiagnosticData diagnosticData) {
		for (SignatureWrapper signatureWrapper : diagnosticData.getSignatures()) {
			assertFalse(signatureWrapper.isSignatureDuplicated());
		}
	}

	protected void checkNoDuplicateCompleteCertificates(DiagnosticData diagnosticData) {
		Set<SignatureWrapper> allSignatures = diagnosticData.getAllSignatures();
		for (SignatureWrapper signatureWrapper : allSignatures) {
			checkNoDuplicateCompleteCertificates(signatureWrapper.foundCertificates());
		}
		
		List<TimestampWrapper> timestampList = diagnosticData.getTimestampList();
		for (TimestampWrapper timestampWrapper : timestampList) {
			checkNoDuplicateCompleteCertificates(timestampWrapper.foundCertificates());
		}
	}

	protected void checkTrustedServices(DiagnosticData diagnosticData) {
		// not implemented by default
	}

	protected void checkContainerInfo(DiagnosticData diagnosticData) {
		assertNull(diagnosticData.getContainerInfo());
		assertNull(diagnosticData.getContainerType());
		assertNull(diagnosticData.getZipComment());
		assertNull(diagnosticData.getMimetypeFileContent());
	}
	
	protected void checkNoDuplicateCompleteCertificates(FoundCertificatesProxy foundCertificates) {
		List<RelatedCertificateWrapper> relatedCertificates = foundCertificates.getRelatedCertificates();
		Set<String> certIds = relatedCertificates.stream().map(CertificateWrapper::getId).collect(Collectors.toSet());
		assertEquals(certIds.size(), relatedCertificates.size());
		for (RelatedCertificateWrapper foundCert : relatedCertificates) {
			assertEquals(foundCert.getOrigins().size(), new HashSet<>(foundCert.getOrigins()).size());
		}
		
		List<OrphanCertificateWrapper> orphanCertificates = foundCertificates.getOrphanCertificates();
		certIds = orphanCertificates.stream().map(OrphanCertificateWrapper::getId).collect(Collectors.toSet());
		assertEquals(certIds.size(), orphanCertificates.size());
		for (OrphanCertificateWrapper foundCert : orphanCertificates) {
			assertEquals(foundCert.getOrigins().size(), new HashSet<>(foundCert.getOrigins()).size());
		}
	}

	protected void checkNoDuplicateCompleteRevocationData(DiagnosticData diagnosticData) {
		Set<SignatureWrapper> allSignatures = diagnosticData.getAllSignatures();
		for (SignatureWrapper signatureWrapper : allSignatures) {
			checkNoDuplicateCompleteRevocationData(signatureWrapper.foundRevocations());
		}
		
		List<TimestampWrapper> timestampList = diagnosticData.getTimestampList();
		for (TimestampWrapper timestampWrapper : timestampList) {
			checkNoDuplicateCompleteRevocationData(timestampWrapper.foundRevocations());
		}
	}
	
	protected void checkNoDuplicateCompleteRevocationData(FoundRevocationsProxy foundRevocations) {
		List<RelatedRevocationWrapper> relatedRevocations = foundRevocations.getRelatedRevocationData();
		Set<String> revocationIds = relatedRevocations.stream().map(RevocationWrapper::getId).collect(Collectors.toSet());
		assertEquals(revocationIds.size(), relatedRevocations.size());
		for (RelatedRevocationWrapper foundRevocation : relatedRevocations) {
			assertEquals(foundRevocation.getOrigins().size(), new HashSet<>(foundRevocation.getOrigins()).size());
		}
		List<OrphanRevocationWrapper> orphanRevocations = foundRevocations.getOrphanRevocationData();
		revocationIds = orphanRevocations.stream().map(OrphanRevocationWrapper::getId).collect(Collectors.toSet());
		assertEquals(revocationIds.size(), orphanRevocations.size());
		for (OrphanRevocationWrapper foundRevocation : orphanRevocations) {
			assertEquals(foundRevocation.getOrigins().size(), new HashSet<>(foundRevocation.getOrigins()).size());
		}
	}
	
	protected void verifyDiagnosticDataJaxb(XmlDiagnosticData diagnosticDataJaxb) {

		List<XmlCertificate> usedCertificates = diagnosticDataJaxb.getUsedCertificates();
		for (XmlCertificate xmlCertificate : usedCertificates) {
			assertTrue(xmlCertificate.getBase64Encoded() != null || xmlCertificate.getDigestAlgoAndValue() != null);
			
			if (!xmlCertificate.isTrusted() && !xmlCertificate.isIdPkixOcspNoCheck() && !xmlCertificate.isSelfSigned()) {
				List<XmlCertificateRevocation> revocations = xmlCertificate.getRevocations();
				for (XmlCertificateRevocation xmlCertificateRevocation : revocations) {
					List<XmlRevocation> xmlRevocations = diagnosticDataJaxb.getUsedRevocations();
					for (XmlRevocation revocation : xmlRevocations) {
						if (xmlCertificateRevocation.getRevocation().getId().equals(revocation.getId())) {
							assertTrue(revocation.getBase64Encoded() != null || revocation.getDigestAlgoAndValue() != null);
						}
					}
				}
			}

			if (xmlCertificate.isSelfSigned()) {
				assertNull(xmlCertificate.getSigningCertificate());
				assertTrue(xmlCertificate.getCertificateChain().isEmpty());
			}
		}

		List<XmlTimestamp> timestamps = diagnosticDataJaxb.getUsedTimestamps();
		for (XmlTimestamp xmlTimestamp : timestamps) {
			assertTrue(xmlTimestamp.getBase64Encoded() != null || xmlTimestamp.getDigestAlgoAndValue() != null);
		}
	}

	protected void verifySimpleReport(SimpleReport simpleReport) {
		assertNotNull(simpleReport);

		List<String> signatureIdList = simpleReport.getSignatureIdList();
		for (String sigId : signatureIdList) {
			Indication indication = simpleReport.getIndication(sigId);
			assertNotNull(indication);
			if (indication != Indication.TOTAL_PASSED) {
				assertNotNull(simpleReport.getSubIndication(sigId));
			}
			assertNotNull(simpleReport.getSignatureQualification(sigId));
		}
		assertNotNull(simpleReport.getValidationTime());
	}

	protected void verifyDetailedReport(DetailedReport detailedReport) {
		assertNotNull(detailedReport);

		int nbBBBs = detailedReport.getBasicBuildingBlocksNumber();
		for (int i = 0; i < nbBBBs; i++) {
			String id = detailedReport.getBasicBuildingBlocksSignatureId(i);
			assertNotNull(id);
			assertNotNull(detailedReport.getBasicBuildingBlocksIndication(id));
		}

		List<String> signatureIds = detailedReport.getSignatureIds();
		for (String sigId : signatureIds) {
			Indication basicIndication = detailedReport.getBasicValidationIndication(sigId);
			assertNotNull(basicIndication);
			if (!Indication.PASSED.equals(basicIndication)) {
				assertNotNull(detailedReport.getBasicValidationSubIndication(sigId));
			}
			
			XmlSignature xmlSignature = detailedReport.getXmlSignatureById(sigId);
			assertNotNull(xmlSignature);
			List<eu.europa.esig.dss.detailedreport.jaxb.XmlTimestamp> xmlTimestamps = xmlSignature.getTimestamps();
			if (Utils.isCollectionNotEmpty(xmlTimestamps)) {
				for (eu.europa.esig.dss.detailedreport.jaxb.XmlTimestamp xmlTimestamp : xmlTimestamps) {
					Indication timestampIndication = detailedReport.getTimestampValidationIndication(xmlTimestamp.getId());
					assertNotNull(timestampIndication);
					if (!Indication.PASSED.equals(timestampIndication)) {
						assertNotNull(detailedReport.getTimestampValidationSubIndication(xmlTimestamp.getId()));
					}
				}
			}
			
			Indication ltvIndication = detailedReport.getLongTermValidationIndication(sigId);
			assertNotNull(ltvIndication);
			if (!Indication.PASSED.equals(ltvIndication)) {
				assertNotNull(detailedReport.getLongTermValidationSubIndication(sigId));
			}
			
			Indication archiveDataIndication = detailedReport.getArchiveDataValidationIndication(sigId);
			assertNotNull(archiveDataIndication);
			if (!Indication.PASSED.equals(archiveDataIndication)) {
				assertNotNull(detailedReport.getArchiveDataValidationSubIndication(sigId));
			}

		}
	}

	protected void verifyETSIValidationReport(ValidationReportType etsiValidationReportJaxb) {

		// Validation report is not signed
		assertNull(etsiValidationReportJaxb.getSignature());
		// Validation report is not generated by a TSP
		assertNull(etsiValidationReportJaxb.getSignatureValidator());

		List<SignatureValidationReportType> reports = etsiValidationReportJaxb.getSignatureValidationReport();
		for (SignatureValidationReportType signatureValidationReport : reports) {
			assertNotNull(signatureValidationReport);

			ValidationStatusType signatureValidationStatus = signatureValidationReport.getSignatureValidationStatus();
			validateValidationStatus(signatureValidationStatus);

			if (!Indication.NO_SIGNATURE_FOUND.equals(signatureValidationStatus.getMainIndication())) {
			
				SignatureIdentifierType signatureIdentifier = signatureValidationReport.getSignatureIdentifier();
				validateETSISignatureIdentifier(signatureIdentifier);
	
				SignerInformationType signerInformation = signatureValidationReport.getSignerInformation();
				validateSignerInformation(signerInformation);
	
				ValidationTimeInfoType validationTimeInfo = signatureValidationReport.getValidationTimeInfo();
				validateTimeInfo(validationTimeInfo);
	
				List<ValidationReportDataType> associatedValidationReportData = signatureValidationStatus.getAssociatedValidationReportData();
				validateAssociatedValidationReportData(validationTimeInfo, associatedValidationReportData);
				
				SignatureAttributesType signatureAttributes = signatureValidationReport.getSignatureAttributes();
				validateETSISignatureAttributes(signatureAttributes);

				SignersDocumentType signersDocument = signatureValidationReport.getSignersDocument();
				validateETSISignersDocument(signersDocument);
				
			}
		}
		
		ValidationObjectListType signatureValidationObjects = etsiValidationReportJaxb.getSignatureValidationObjects();
		validateETSISignatureValidationObjects(signatureValidationObjects);
	}

	protected void validateETSISignatureIdentifier(SignatureIdentifierType signatureIdentifier) {
		assertNotNull(signatureIdentifier);
		assertNotNull(signatureIdentifier.getId());
		assertNotNull(signatureIdentifier.getDigestAlgAndValue());
		DigestMethodType digestMethod = signatureIdentifier.getDigestAlgAndValue().getDigestMethod();
		assertNotNull(digestMethod);
		assertNotNull(digestMethod.getAlgorithm());
		assertNotNull(DigestAlgorithm.forXML(digestMethod.getAlgorithm()));
		assertNotNull(signatureIdentifier.getDigestAlgAndValue().getDigestValue());
		assertNotNull(signatureIdentifier.getSignatureValue());
	}
	
	protected void validateSignerInformation(SignerInformationType signerInformation) {
		assertNotNull(signerInformation);
		assertNotNull(signerInformation.getSignerCertificate());
		assertTrue(Utils.isStringNotEmpty(signerInformation.getSigner()));
	}
	
	protected void validateTimeInfo(ValidationTimeInfoType validationTimeInfo) {
		assertNotNull(validationTimeInfo);
		assertNotNull(validationTimeInfo.getValidationTime());
		POEType bestSignatureTime = validationTimeInfo.getBestSignatureTime();
		assertNotNull(bestSignatureTime);
		assertNotNull(bestSignatureTime.getPOETime());
		assertNotNull(bestSignatureTime.getTypeOfProof());
	}
	
	protected void validateValidationStatus(ValidationStatusType signatureValidationStatus) {
		assertNotNull(signatureValidationStatus);
		assertNotNull(signatureValidationStatus.getMainIndication());
		assertNotEquals(Indication.NO_SIGNATURE_FOUND, signatureValidationStatus.getMainIndication());
	}
	
	protected void validateAssociatedValidationReportData(ValidationTimeInfoType validationTimeInfo, 
			List<ValidationReportDataType> associatedValidationReportData) {
		if (Utils.isCollectionNotEmpty(associatedValidationReportData)) {
			for (ValidationReportDataType validationReportDataType : associatedValidationReportData) {
				CryptoInformationType cryptoInformation = validationReportDataType.getCryptoInformation();
				if (cryptoInformation != null && !cryptoInformation.isSecureAlgorithm()) {
					Date expired = cryptoInformation.getNotAfter();
					if (expired != null) {
						assertTrue(expired.before(validationTimeInfo.getValidationTime()));
					}
				}
				CertificateChainType certificateChain = validationReportDataType.getCertificateChain();
				if (certificateChain != null) {
					assertNotNull(certificateChain.getSigningCertificate());
					assertEquals(1, certificateChain.getSigningCertificate().getVOReference().size());
				}
			}
		}
	}

	@SuppressWarnings("rawtypes")
	protected void validateETSISignatureAttributes(SignatureAttributesType signatureAttributes) {
		if (signatureAttributes != null) {
			List<Object> signatureAttributeObjects = signatureAttributes.getSigningTimeOrSigningCertificateOrDataObjectFormat();
			assertTrue(Utils.isCollectionNotEmpty(signatureAttributeObjects));

			for (Object signatureAttributeObj : signatureAttributeObjects) {
				if (signatureAttributeObj instanceof JAXBElement) {
					JAXBElement jaxbElement = (JAXBElement) signatureAttributeObj;
					Object value = jaxbElement.getValue();

					if (value instanceof SASigningTimeType) {
						SASigningTimeType signingTime = (SASigningTimeType) value;
						assertNotNull(signingTime.getTime());
					} else if (value instanceof SACertIDListType) {
						SACertIDListType certIdList = (SACertIDListType) value;
						validateETSIACertIDListType(certIdList);
					} else if (value instanceof SACommitmentTypeIndicationType) {
						SACommitmentTypeIndicationType commitmentTypeIndicationType = (SACommitmentTypeIndicationType) value;
						validateETSICommitmentTypeIndicationType(commitmentTypeIndicationType);
					} else if (value instanceof SADataObjectFormatType) {
						SADataObjectFormatType dataObjectFormatType = (SADataObjectFormatType) value;
						validateETSIDataObjectFormatType(dataObjectFormatType);
					} else if (value instanceof SATimestampType) {
						SATimestampType timestamp = (SATimestampType) value;
						assertNotNull(timestamp.getAttributeObject());
						assertNotNull(timestamp.getTimeStampValue());
					} else if (value instanceof SASigPolicyIdentifierType) {
						SASigPolicyIdentifierType saSigPolicyIdentifier = (SASigPolicyIdentifierType) value;
						validateETSISASigPolicyIdentifierType(saSigPolicyIdentifier);
					} else if (value instanceof SASignatureProductionPlaceType) {
						SASignatureProductionPlaceType saSignatureProductionPlace = (SASignatureProductionPlaceType) value;
						validateETSISASignatureProductionPlaceType(saSignatureProductionPlace);
					} else if (value instanceof SASignerRoleType) {
						SASignerRoleType saSignerRoleType = (SASignerRoleType) value;
						validateETSISASignerRoleType(saSignerRoleType);
					} else if (value instanceof SACounterSignatureType) {
						SACounterSignatureType saCounterSignature = (SACounterSignatureType) value;
						validateETSISACounterSignatureType(saCounterSignature);
					} else if (value instanceof SAMessageDigestType) {
						SAMessageDigestType md = (SAMessageDigestType) value;
						validateETSIMessageDigest(md);
					} else if (value instanceof SAReasonType) {
						SAReasonType reasonType = (SAReasonType) value;
						validateETSISAReasonType(reasonType);
					} else if (value instanceof SAFilterType) {
						SAFilterType filterType = (SAFilterType) value;
						validateETSIFilter(filterType);
					} else if (value instanceof SASubFilterType) {
						SASubFilterType subFilterType = (SASubFilterType) value;
						validateETSISubFilter(subFilterType);
					} else if (value instanceof SANameType) {
						SANameType nameType = (SANameType) value;
						validateETSISAName(nameType);
					} else if (value instanceof SAContactInfoType) {
						SAContactInfoType contactTypeInfo = (SAContactInfoType) value;
						validateETSIContactInfo(contactTypeInfo);
					} else if (value instanceof SADSSType) {
						SADSSType dss = (SADSSType) value;
						validateETSIDSSType(dss);
					} else if (value instanceof SAVRIType) {
						SAVRIType vri = (SAVRIType) value;
						validateETSIVRIType(vri);
					} else if (value instanceof SARevIDListType) {
						SARevIDListType revIdList = (SARevIDListType) value;
						validateETSIRevIDListType(revIdList);
					} else if ("CertificateValues".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof AttributeBaseType);
						validateETSICertificateValues((AttributeBaseType) value);
					} else if ("RevocationValues".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof AttributeBaseType);
						validateETSIRevocationValues((AttributeBaseType) value);
					} else if ("AttrAuthoritiesCertValues".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof AttributeBaseType);
						validateETSIAttrAuthoritiesCertValues((AttributeBaseType) value);
					} else if ("AttributeRevocationValues".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof AttributeBaseType);
						validateETSIAttributeRevocationValues((AttributeBaseType) value);
					} else if ("TimeStampValidationData".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof AttributeBaseType);
						validateETSITimeStampValidationData((AttributeBaseType) value);
					} else if ("ByteRange".equals(jaxbElement.getName().getLocalPart())) {
						assertTrue(value instanceof List<?>);
						validateETSIByteArray((List<?>) value);
					} else {
						fail(String.format("Not tested! Name : %s, class : %s",
								jaxbElement.getName().getLocalPart(), value.getClass()));
					}

				} else {
					fail("Only JAXBElements are accepted!");
				}
			}
		}
	}

	protected void validateETSIMessageDigest(SAMessageDigestType md) {
		assertNotNull(md.getDigest());
	}

	protected void validateETSIFilter(SAFilterType filterType) {
		assertNull(filterType);
	}

	protected void validateETSISubFilter(SASubFilterType subFilterType) {
		assertNull(subFilterType);
	}

	protected void validateETSIContactInfo(SAContactInfoType contactTypeInfo) {
		assertNull(contactTypeInfo);
	}

	protected void validateETSISAReasonType(SAReasonType reasonType) {
		assertNull(reasonType);
	}

	protected void validateETSISAName(SANameType nameType) {
		assertNull(nameType);
	}

	protected void validateETSIDSSType(SADSSType dss) {
		assertNull(dss);
	}

	protected void validateETSIVRIType(SAVRIType vri) {
		assertNull(vri);
	}

	protected void validateETSIACertIDListType(SACertIDListType certIdList) {
		assertNotNull(certIdList);
		List<SACertIDType> certIds = certIdList.getCertID();
		List<VOReferenceType> attributeObject = certIdList.getAttributeObject();
		assertTrue(Utils.isCollectionNotEmpty(certIds) || Utils.isCollectionNotEmpty(attributeObject));
		for (SACertIDType saCertIDType : certIds) {
			assertNotNull(saCertIDType.getDigestMethod());
			assertNotNull(saCertIDType.getDigestValue());
		}
	}

	protected void validateETSICommitmentTypeIndicationType(SACommitmentTypeIndicationType commitmentTypeIndication) {
		assertNotNull(commitmentTypeIndication.getCommitmentTypeIdentifier());
	}

	protected void validateETSIDataObjectFormatType(SADataObjectFormatType dataObjectFormat) {
		assertTrue((dataObjectFormat.getContentType() != null) || (dataObjectFormat.getMimeType() != null));
	}

	protected void validateETSIRevIDListType(SARevIDListType revIdList) {
		assertNotNull(revIdList);
		List<Serializable> crlIdOrOCSPId = revIdList.getCRLIDOrOCSPID();
		List<VOReferenceType> attributeObject = revIdList.getAttributeObject();
		assertTrue(Utils.isCollectionNotEmpty(crlIdOrOCSPId) || Utils.isCollectionNotEmpty(attributeObject));
	}

	protected void validateETSISASigPolicyIdentifierType(SASigPolicyIdentifierType saSigPolicyIdentifier) {
		assertNotNull(saSigPolicyIdentifier);
	}
	
	protected void validateETSISASignatureProductionPlaceType(SASignatureProductionPlaceType saSignatureProductionPlace) {
		assertNotNull(saSignatureProductionPlace);
		assertTrue(Utils.isCollectionNotEmpty(saSignatureProductionPlace.getAddressString()));
	}

	protected void validateETSISASignerRoleType(SASignerRoleType signerRole) {
		List<SAOneSignerRoleType> roleDetails = signerRole.getRoleDetails();
		assertTrue(Utils.isCollectionNotEmpty(roleDetails));
		for (SAOneSignerRoleType oneSignerRole : roleDetails) {
			assertNotNull(oneSignerRole.getRole());
			assertNotNull(oneSignerRole.getEndorsementType());
		}
	}
	
	protected void validateETSISACounterSignatureType(SACounterSignatureType saCounterSignature) {
		assertNotNull(saCounterSignature);
		assertNotNull(saCounterSignature.getCounterSignature());
	}

	protected void validateETSICertificateValues(AttributeBaseType attributeBase) {
		validateETSIAttributeBaseType(attributeBase);
	}

	protected void validateETSIRevocationValues(AttributeBaseType attributeBase) {
		validateETSIAttributeBaseType(attributeBase);
	}

	protected void validateETSIAttrAuthoritiesCertValues(AttributeBaseType attributeBase) {
		validateETSIAttributeBaseType(attributeBase);
	}

	protected void validateETSIAttributeRevocationValues(AttributeBaseType attributeBase) {
		validateETSIAttributeBaseType(attributeBase);
	}

	protected void validateETSITimeStampValidationData(AttributeBaseType attributeBase) {
		validateETSIAttributeBaseType(attributeBase);
	}

	protected void validateETSIAttributeBaseType(AttributeBaseType attributeBase) {
		assertFalse(attributeBase.isSigned() != null && attributeBase.isSigned());
		List<VOReferenceType> attributeObject = attributeBase.getAttributeObject();
		assertEquals(1, attributeObject.size());
		assertTrue(Utils.isCollectionNotEmpty(attributeObject.iterator().next().getVOReference()));
	}

	protected void validateETSIByteArray(List<?> byteArray) {
		assertEquals(4, byteArray.size());
		for (Object obj : byteArray) {
			assertTrue(obj instanceof BigInteger);
		}
		assertEquals(0, ((BigInteger)byteArray.get(0)).intValue());
		assertTrue(((BigInteger)byteArray.get(0)).compareTo((BigInteger)byteArray.get(1)) < 0);
		assertTrue(((BigInteger)byteArray.get(1)).compareTo((BigInteger)byteArray.get(2)) < 0);
	}
	
	protected void validateETSISignatureValidationObjects(ValidationObjectListType signatureValidationObjects) {
		if (signatureValidationObjects != null) {
			for (ValidationObjectType validationObject : signatureValidationObjects.getValidationObject()) {
				assertNotNull(validationObject.getId());
				assertNotNull(validationObject.getObjectType());
				assertNotNull(validationObject.getValidationObjectRepresentation());
				assertTrue(validationObject.getValidationObjectRepresentation().getDigestAlgAndValue() != null || 
						validationObject.getValidationObjectRepresentation().getBase64() != null);
				switch (validationObject.getObjectType()) {
					case TIMESTAMP:
						assertNotNull(validationObject.getPOEProvisioning());
						assertNotNull(validationObject.getValidationReport());
						break;
					default:
						assertNotNull(validationObject.getPOE());
						assertNotNull(validationObject.getPOE().getTypeOfProof());
						assertNotNull(validationObject.getPOE().getPOETime());
						break;
				}
			}
		}
	}

	protected void validateETSISignersDocument(SignersDocumentType signersDocument) {
		assertNotNull(signersDocument);
		boolean signerDocumentFound = false;
		for (JAXBElement<?> jaxbElement : signersDocument.getContent()) {
			Object value = jaxbElement.getValue();
			if (value instanceof DigestAlgAndValueType) {
				DigestAlgAndValueType digestAlgAndValueType = (DigestAlgAndValueType) value;
				assertNotNull(digestAlgAndValueType.getDigestMethod());
				assertNotNull(digestAlgAndValueType.getDigestValue());
				signerDocumentFound = true;
			} else if (value instanceof VOReferenceType) {
				VOReferenceType voReferenceType = (VOReferenceType) value;
				List<Object> voReferences = voReferenceType.getVOReference();
				assertNotNull(voReferences);
				signerDocumentFound = true;
				for (Object object : voReferences) {
					assertTrue(object instanceof ValidationObjectType);
				}
			}
		}
		assertTrue(signerDocumentFound);
	}

	protected void verifyReportsData(Reports reports) {
		checkSignatureReports(reports);
		checkReportsTokens(reports);
		checkReportsSignatureIdentifier(reports);
		checkReportsSignaturePolicyIdentifier(reports);
		checkBBBs(reports);
	}

	protected void checkSignatureReports(Reports reports) {
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		
		ValidationReportType etsiValidationReportJaxb = reports.getEtsiValidationReportJaxb();
		if (Utils.isCollectionEmpty(diagnosticData.getSignatures())) {
			// one empty report with NO_SIGNATURES_FOUND indication
			assertEquals(1, etsiValidationReportJaxb.getSignatureValidationReport().size());
		} else {
			assertEquals(diagnosticData.getSignatures().size(), etsiValidationReportJaxb.getSignatureValidationReport().size());
		
			for (SignatureValidationReportType signatureValidationReport : etsiValidationReportJaxb.getSignatureValidationReport()) {
				assertNotNull(signatureValidationReport.getSignatureIdentifier());
				SignatureWrapper signature = diagnosticData.getSignatureById(signatureValidationReport.getSignatureIdentifier().getId());
				assertNotNull(signature);
				
				SignersDocumentType signersDocument = signatureValidationReport.getSignersDocument();
				List<XmlSignatureScope> signatureScopes = signature.getSignatureScopes();
				if (signatureScopes != null && signatureScopes.size() > 0) {
					assertNotNull(signersDocument);

					List<ValidationObjectType> validationObjects = getValidationObjects(signersDocument);
					assertEquals(signatureScopes.size(), validationObjects.size());
					for (XmlSignatureScope xmlSignatureScope : signatureScopes) {
						XmlSignerData signerData = xmlSignatureScope.getSignerData();
						assertNotNull(signerData);
						XmlDigestAlgoAndValue xmlDigestAlgoAndValue = signerData.getDigestAlgoAndValue();
						assertNotNull(xmlDigestAlgoAndValue);

						boolean correspondingValidationObjectFound = false;
						for (ValidationObjectType validationObject : validationObjects) {
							if (signerData.getId().equals(validationObject.getId())) {
								ValidationObjectRepresentationType validationObjectRepresentation = validationObject.getValidationObjectRepresentation();
								assertNotNull(validationObjectRepresentation);
								DigestAlgAndValueType digestAlgAndValue = validationObjectRepresentation.getDigestAlgAndValue();
								assertNotNull(digestAlgAndValue);
								assertEquals(xmlDigestAlgoAndValue.getDigestMethod(), DigestAlgorithm.forXML(digestAlgAndValue.getDigestMethod().getAlgorithm()));
								assertArrayEquals(xmlDigestAlgoAndValue.getDigestValue(), digestAlgAndValue.getDigestValue());
								correspondingValidationObjectFound = true;
								break;
							}
						}
						assertTrue(correspondingValidationObjectFound);
					}
				} else {
					assertNull(signersDocument);
				}

				ValidationStatusType signatureValidationStatus = signatureValidationReport.getSignatureValidationStatus();
				assertNotNull(signatureValidationStatus);

				List<ValidationReportDataType> associatedValidationReportData = signatureValidationStatus.getAssociatedValidationReportData();
				assertNotNull(associatedValidationReportData);

				if (signature.getSigningCertificate() != null) {
					for (ValidationReportDataType validationReportDataType : associatedValidationReportData) {
						CertificateChainType certificateChain = validationReportDataType.getCertificateChain();
						assertNotNull(certificateChain);
						assertNotNull(certificateChain.getSigningCertificate());
						assertEquals(1, certificateChain.getSigningCertificate().getVOReference().size());

						Object signingCertificate = certificateChain.getSigningCertificate().getVOReference().get(0);
						assertTrue(signingCertificate instanceof ValidationObjectType);
						ValidationObjectType validationObjectType = (ValidationObjectType) signingCertificate;
						assertEquals(ObjectType.CERTIFICATE, validationObjectType.getObjectType());
						assertEquals(signature.getSigningCertificate().getId(), validationObjectType.getId());
					}
				}
			}
		}
	}

	protected DigestAlgAndValueType getDigestAlgoAndValue(SignersDocumentType signersDocument) {
		for (JAXBElement<?> jaxbElement : signersDocument.getContent()) {
			Object value = jaxbElement.getValue();
			if (value instanceof DigestAlgAndValueType) {
				DigestAlgAndValueType digestAlgAndValueType = (DigestAlgAndValueType) value;
				assertNotNull(digestAlgAndValueType.getDigestMethod());
				assertNotNull(digestAlgAndValueType.getDigestValue());
				return digestAlgAndValueType;
			}
		}
		return null;
	}

	protected List<ValidationObjectType> getValidationObjects(SignersDocumentType signersDocument) {
		List<ValidationObjectType> validationObjects = new ArrayList<>();
		for (JAXBElement<?> jaxbElement : signersDocument.getContent()) {
			Object value = jaxbElement.getValue();
			if (value instanceof VOReferenceType) {
				VOReferenceType voReferenceType = (VOReferenceType) value;
				List<Object> voReferences = voReferenceType.getVOReference();
				assertNotNull(voReferences);
				for (Object object : voReferences) {
					assertTrue(object instanceof ValidationObjectType);
					ValidationObjectType validationObjectType = (ValidationObjectType) object;
					validationObjects.add(validationObjectType);
				}
			}
		}
		return validationObjects;
	}
	
	protected void checkReportsTokens(Reports reports) {
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		
		ValidationReportType etsiValidationReportJaxb = reports.getEtsiValidationReportJaxb();
		
		ValidationObjectListType signatureValidationObjects = etsiValidationReportJaxb.getSignatureValidationObjects();
		if (signatureValidationObjects != null) {
			List<ValidationObjectType> validationObjects = signatureValidationObjects.getValidationObject();
			
			int certificateCounter = 0;
			int crlCounter = 0;
			int ocspCounter = 0;
			int timestampCounter = 0;
			int signedDataCounter = 0;
			int otherCounter = 0;
			for (ValidationObjectType validationObject : validationObjects) {
				switch (validationObject.getObjectType()) {
					case CERTIFICATE:
						++certificateCounter;
						break;
					case CRL:
						++crlCounter;
						break;
					case OCSP_RESPONSE:
						++ocspCounter;
						break;
					case TIMESTAMP:
						++timestampCounter;
						break;
					case SIGNED_DATA:
						++signedDataCounter;
						break;
					default:
						++otherCounter;
				}
			}

			long ddCerts = diagnosticData.getUsedCertificates().size() +
					diagnosticData.getAllOrphanCertificateObjects().size();
			assertEquals(ddCerts, certificateCounter);
			long ddCrls = diagnosticData.getAllRevocationData().stream()
					.filter(r -> RevocationType.CRL.equals(r.getRevocationType())).count();
			ddCrls += diagnosticData.getAllOrphanRevocationObjects().stream()
					.filter(r -> RevocationType.CRL.equals(r.getRevocationType())).count();
			assertEquals(ddCrls, crlCounter);
			long ddOcsps = diagnosticData.getAllRevocationData().stream()
					.filter(r -> RevocationType.OCSP.equals(r.getRevocationType())).count();
			ddOcsps += diagnosticData.getAllOrphanRevocationObjects().stream()
					.filter(r -> RevocationType.OCSP.equals(r.getRevocationType())).count();
			assertEquals(ddOcsps, ocspCounter);
			assertEquals(diagnosticData.getTimestampList().size(), timestampCounter);
			assertEquals(diagnosticData.getAllSignerDocuments().size(), signedDataCounter);
			assertEquals(0, otherCounter);
			
		} else {
			assertEquals(0, diagnosticData.getSignatures().size());
			assertEquals(0, diagnosticData.getUsedCertificates().size());
			assertEquals(0, diagnosticData.getAllRevocationData().size());
			assertEquals(0, diagnosticData.getTimestampList().size());
			assertEquals(0, diagnosticData.getAllSignerDocuments().size());
			checkOrphanTokens(diagnosticData);
		}
		
	}
	
	protected void checkReportsSignatureIdentifier(Reports reports) {
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		ValidationReportType etsiValidationReport = reports.getEtsiValidationReportJaxb();
		
		if (Utils.isCollectionNotEmpty(diagnosticData.getSignatures())) {
			for (SignatureValidationReportType signatureValidationReport : etsiValidationReport.getSignatureValidationReport()) {
				SignatureWrapper signature = diagnosticData.getSignatureById(signatureValidationReport.getSignatureIdentifier().getId());
				
				SignatureIdentifierType signatureIdentifier = signatureValidationReport.getSignatureIdentifier();
				assertNotNull(signatureIdentifier);
				
				assertNotNull(signatureIdentifier.getSignatureValue());
				assertArrayEquals(signature.getSignatureValue(), signatureIdentifier.getSignatureValue().getValue());
				assertNotNull(signatureIdentifier.getDAIdentifier());
				assertEquals(signature.getDAIdentifier(), signatureIdentifier.getDAIdentifier());
			}
		}
	}
	
	protected void checkReportsSignaturePolicyIdentifier(Reports reports) {
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		ValidationReportType etsiValidationReport = reports.getEtsiValidationReportJaxb();
		if (Utils.isCollectionNotEmpty(diagnosticData.getSignatures())) {
			for (SignatureValidationReportType signatureValidationReport : etsiValidationReport.getSignatureValidationReport()) {
				SignatureWrapper signature = diagnosticData.getSignatureById(signatureValidationReport.getSignatureIdentifier().getId());
				if (Utils.isStringNotEmpty(signature.getPolicyId()) && // implicit policies are ignored
						!SignaturePolicyType.IMPLICIT_POLICY.name().equals(signature.getPolicyId())) {
					List<Object> signingTimeOrSigningCertificateOrDataObjectFormat = signatureValidationReport
							.getSignatureAttributes().getSigningTimeOrSigningCertificateOrDataObjectFormat();
					assertNotNull(signingTimeOrSigningCertificateOrDataObjectFormat);
					boolean signaturePolicyIdPresent = false;
					for (Object object : signingTimeOrSigningCertificateOrDataObjectFormat) {
						JAXBElement<?> jaxbElement = (JAXBElement<?>) object;
						if (jaxbElement.getValue() instanceof SASigPolicyIdentifierType) {
							SASigPolicyIdentifierType sigPolicyIdentifier = (SASigPolicyIdentifierType) jaxbElement.getValue();
							assertNotNull(sigPolicyIdentifier);
							assertEquals(signature.getPolicyId(), sigPolicyIdentifier.getSigPolicyId());
							signaturePolicyIdPresent = true;
						}
					}
					assertTrue(signaturePolicyIdPresent);
				}
				
			}
		}
	}
	
	protected void checkBBBs(Reports reports) {
		DetailedReport detailedReport = reports.getDetailedReport();
		for (String signatureId : detailedReport.getSignatureIds()) {
			checkBBB(reports, detailedReport.getBasicBuildingBlockById(signatureId));
		}
		for (String timestampId : detailedReport.getTimestampIds()) {
			checkBBB(reports, detailedReport.getBasicBuildingBlockById(timestampId));
		}
		for (String revocationId : detailedReport.getRevocationIds()) {
			checkBBB(reports, detailedReport.getBasicBuildingBlockById(revocationId));
		}
	}
	
	protected void checkBBB(Reports reports, XmlBasicBuildingBlocks bbb) {
		checkEquivalentCertificates(reports, bbb);
	}
	
	protected void checkEquivalentCertificates(Reports reports, XmlBasicBuildingBlocks bbb) {
		DiagnosticData diagnosticData = reports.getDiagnosticData();
		XmlXCV xcv = bbb.getXCV();
		if (xcv != null) {
			for (XmlSubXCV subXCV : xcv.getSubXCV()) {
				String certId = subXCV.getId();
				CertificateWrapper certificateWrapper = diagnosticData.getUsedCertificateById(certId);
				assertNotNull(certificateWrapper);
				boolean equivalentCertsFound = false;
				if (Utils.isCollectionNotEmpty(subXCV.getCrossCertificates())) {
					equivalentCertsFound = true;
					for (String crossCertId : subXCV.getCrossCertificates()) {
						assertNotEquals(certId, crossCertId);
						CertificateWrapper usedCertificate = diagnosticData.getUsedCertificateById(crossCertId);
						OrphanCertificateTokenWrapper orphanCertificate = diagnosticData.getOrphanCertificateById(crossCertId);
						assertTrue(usedCertificate != null || orphanCertificate != null);
						if (usedCertificate != null) {
							assertEquals(certificateWrapper.getEntityKey(), usedCertificate.getEntityKey());
						}
						if (orphanCertificate != null) {
							assertEquals(certificateWrapper.getEntityKey(), orphanCertificate.getEntityKey());
						}
					}
				}
				if (Utils.isCollectionNotEmpty(subXCV.getEquivalentCertificates())) {
					equivalentCertsFound = true;
					for (String equivalentCertId : subXCV.getEquivalentCertificates()) {
						assertNotEquals(certId, equivalentCertId);
						CertificateWrapper usedCertificate = diagnosticData.getUsedCertificateById(equivalentCertId);
						OrphanCertificateTokenWrapper orphanCertificate = diagnosticData.getOrphanCertificateById(equivalentCertId);
						assertTrue(usedCertificate != null || orphanCertificate != null);
						if (usedCertificate != null) {
							assertEquals(certificateWrapper.getEntityKey(), usedCertificate.getEntityKey());
						}
						if (orphanCertificate != null) {
							assertEquals(certificateWrapper.getEntityKey(), orphanCertificate.getEntityKey());
						}
					}
				}
				if (!equivalentCertsFound) {
					assertTrue(Utils.isCollectionEmpty(diagnosticData.getEquivalentCertificates(certificateWrapper)));
					assertTrue(Utils.isCollectionEmpty(diagnosticData.getOrphanEquivalentCertificates(certificateWrapper)));
				}
			}
		}
	}
	
	protected void verifyOriginalDocuments(SignedDocumentValidator validator, DiagnosticData diagnosticData) {
		List<String> signatureIdList = diagnosticData.getSignatureIdList();
		for (String signatureId : signatureIdList) {
			SignatureWrapper signatureWrapper = diagnosticData.getSignatureById(signatureId);
			if (diagnosticData.isBLevelTechnicallyValid(signatureId) && !signatureWrapper.isCounterSignature()) {
				List<DSSDocument> retrievedOriginalDocuments = validator.getOriginalDocuments(signatureId);
				assertTrue(Utils.isCollectionNotEmpty(retrievedOriginalDocuments));
				for (DSSDocument document : retrievedOriginalDocuments) {
					assertNotNull(document);
					if (!(document instanceof DigestDocument)) {
						assertTrue(Utils.isArrayNotEmpty(DSSUtils.toByteArray(document)));
					}
				}
			}
		}
	}
	
	protected void generateHtmlPdfReports(Reports reports) {
		if (!isGenerateHtmlPdfReports()) {
			return;
		}

		SimpleReportFacade simpleReportFacade = SimpleReportFacade.newFacade();

		String marshalledSimpleReport;
		try {
			marshalledSimpleReport = simpleReportFacade.marshall(reports.getSimpleReportJaxb(), true);
			assertNotNull(marshalledSimpleReport);
		} catch (Exception e) {
			String message = "Unable to marshall the simple report";
			LOG.error(message, e);
			fail(message);
		}

		/* Bootstrap 4 Simple Report */
		try {
			assertNotNull(simpleReportFacade.generateHtmlReport(reports.getSimpleReportJaxb()));
		} catch (Exception e) {
			String message = "Unable to generate the html simple report from the jaxb source";
			LOG.error(message, e);
			fail(message);
		}

		/* PDF Simple Report */
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, baos);
			Result result = new SAXResult(fop.getDefaultHandler());
			simpleReportFacade.generatePdfReport(reports.getSimpleReportJaxb(), result);
			assertTrue(Utils.isArrayNotEmpty(baos.toByteArray()));
		} catch (Exception e) {
			String message = "Unable to generate the pdf simple report from the jaxb source";
			LOG.error(message, e);
			fail(message);
		}

		DetailedReportFacade detailedReportFacade = DetailedReportFacade.newFacade();

		String marshalledDetailedReport;
		try {
			marshalledDetailedReport = detailedReportFacade.marshall(reports.getDetailedReportJaxb(), true);
			assertNotNull(marshalledDetailedReport);
		} catch (Exception e) {
			String message = "Unable to marshall the detailed report";
			LOG.error(message, e);
			fail(message);
		}

		/* Bootstrap 4 Detailed Report */
		try {
			assertNotNull(detailedReportFacade.generateHtmlReport(reports.getDetailedReportJaxb()));
		} catch (Exception e) {
			String message = "Unable to generate the html detailed report from the jaxb source";
			LOG.error(message, e);
			fail(message);
		}

		/* PDF Detailed Report */
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, baos);
			Result result = new SAXResult(fop.getDefaultHandler());
			detailedReportFacade.generatePdfReport(reports.getDetailedReportJaxb(), result);
			assertTrue(Utils.isArrayNotEmpty(baos.toByteArray()));
		} catch (Exception e) {
			String message = "Unable to generate the pdf detailed report from the jaxb source";
			LOG.error(message, e);
			fail(message);
		}

		/* Diagnostic Data SVG */
		DiagnosticDataFacade diagnosticDataFacade = DiagnosticDataFacade.newFacade();

		String marshalledDiagnosticData;
		try {
			marshalledDiagnosticData = diagnosticDataFacade.marshall(reports.getDiagnosticDataJaxb(), true);
			assertNotNull(marshalledDiagnosticData);
		} catch (Exception e) {
			String message = "Unable to marshall the diagnostic data";
			LOG.error(message, e);
			fail(message);
		}

		try {
			assertNotNull(diagnosticDataFacade.generateSVG(reports.getDiagnosticDataJaxb()));
		} catch (Exception e) {
			String message = "Unable to generate the SVG for diagnostic data from the jaxb source";
			LOG.error(message, e);
			fail(message);
		}

	}

	protected boolean isGenerateHtmlPdfReports() {
		return false;
	}

}
