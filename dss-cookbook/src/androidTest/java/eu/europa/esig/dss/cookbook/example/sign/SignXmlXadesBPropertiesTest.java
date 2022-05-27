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
package eu.europa.esig.dss.cookbook.example.sign;

import eu.europa.esig.dss.DomUtils;
import eu.europa.esig.dss.cookbook.example.CookbookTools;
import eu.europa.esig.dss.enumerations.CommitmentType;
import eu.europa.esig.dss.enumerations.CommitmentTypeEnum;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.enumerations.SignaturePackaging;
import eu.europa.esig.dss.model.BLevelParameters;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.SignatureValue;
import eu.europa.esig.dss.model.SignerLocation;
import eu.europa.esig.dss.model.ToBeSigned;
import eu.europa.esig.dss.token.DSSPrivateKeyEntry;
import eu.europa.esig.dss.token.SignatureTokenConnection;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import eu.europa.esig.dss.validation.timestamp.TimestampToken;
import eu.europa.esig.dss.xades.XAdESSignatureParameters;
import eu.europa.esig.dss.xades.signature.XAdESService;
import eu.europa.esig.xades.XAdES319132Utils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * How to add signed properties to the signature.
 */
public class SignXmlXadesBPropertiesTest extends CookbookTools {

	@Test
	public void testWithProperties() throws Exception {

		prepareXmlDoc();

		try (SignatureTokenConnection signingToken = getPkcs12Token()) {

			DSSPrivateKeyEntry privateKey = signingToken.getKeys().get(0);

			// tag::demo[]

			XAdESSignatureParameters parameters = new XAdESSignatureParameters();

			// Basic signature configuration
			parameters.setSignaturePackaging(SignaturePackaging.ENVELOPING);
			parameters.setSignatureLevel(SignatureLevel.XAdES_BASELINE_B);
			parameters.setDigestAlgorithm(DigestAlgorithm.SHA512);
			parameters.setSigningCertificate(privateKey.getCertificate());
			parameters.setCertificateChain(privateKey.getCertificateChain());

			// Configuration of several signed attributes like ...
			BLevelParameters bLevelParameters = parameters.bLevel();

			// Contains claimed roles assumed by the signer when creating the signature
			bLevelParameters.setClaimedSignerRoles(Arrays.asList("Manager"));

			// signer location
			SignerLocation signerLocation = new SignerLocation();
			signerLocation.setCountry("BE");
			signerLocation.setStateOrProvince("Luxembourg");
			signerLocation.setPostalCode("1234");
			signerLocation.setLocality("SimCity");
			// Contains the indication of the purported place where the signer claims to have produced the signature
			bLevelParameters.setSignerLocation(signerLocation);

			// Identifies the commitment undertaken by the signer in signing (a) signed data object(s)
			// in the context of the selected signature policy
			List<CommitmentType> commitmentTypeIndications = new ArrayList<>();
			commitmentTypeIndications.add(CommitmentTypeEnum.ProofOfOrigin);
			commitmentTypeIndications.add(CommitmentTypeEnum.ProofOfApproval);
			// NOTE: CommitmentType supports also IDQualifier and documentationReferences.
			// To use it, you need to have a custom implementation of the interface.
			bLevelParameters.setCommitmentTypeIndications(commitmentTypeIndications);

			CommonCertificateVerifier verifier = new CommonCertificateVerifier();
			XAdESService service = new XAdESService(verifier);
			service.setTspSource(getOnlineTSPSource());

			// Allows setting of content-timestamp (part of the signed attributes)
			TimestampToken contentTimestamp = service.getContentTimestamp(toSignDocument, parameters);
			parameters.setContentTimestamps(Arrays.asList(contentTimestamp));

			// Signature process with its 3 stateless steps
			ToBeSigned dataToSign = service.getDataToSign(toSignDocument, parameters);
			SignatureValue signatureValue = signingToken.sign(dataToSign, parameters.getDigestAlgorithm(), privateKey);
			DSSDocument signedDocument = service.signDocument(toSignDocument, parameters, signatureValue);

			// end::demo[]

			// tag::requirements[]

			// This parameter defines whether a signature creation/extension with an expired certificate shall be allowed
			// Default : false (signature creation with an expired certificate is not allowed)
			parameters.setSignWithExpiredCertificate(false);

			// This parameter defines whether a signature creation/extension with a not yet valid certificate shall be allowed
			// Default : false (signature creation with a not yet valid certificate is not allowed)
			parameters.setSignWithNotYetValidCertificate(false);

			// This parameter defines whether a revocation check shall be performed on a signature creation/extension
			// Default : false (revocation check is not performed)
			// NOTE: a behavior of the revocation check shall be defined with alerts within the used {@code eu.europa.esig.dss.validation.CertificateVerifier}
			parameters.setCheckCertificateRevocation(false);

			// end::requirements[]

			testFinalDocument(signedDocument);

			DSSDocument xadesSignatureDocument = signedDocument;
			// tag::validateStructure[]
			Document signatureDocDom = DomUtils.buildDOM(xadesSignatureDocument);
			List<String> errors = XAdES319132Utils.getInstance().validateAgainstXSD(new DOMSource(signatureDocDom));
			// end::validateStructure[]
			assertTrue(Utils.isCollectionEmpty(errors));

		}
	}

}
