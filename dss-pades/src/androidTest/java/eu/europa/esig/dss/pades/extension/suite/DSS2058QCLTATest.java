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

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.signerry.dss.test.TestUtils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.diagnostic.TimestampWrapper;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.pades.extension.suite.dss2058.AbstractDSS2058;

@Tag("slow")
@Disabled
/** @TODO The test has been disabled because it failed even when using the standard "dss" library.
 * Reason: The used DigestAlgorithm SHA1 is not acceptable for revocation token
 * 2023-04-25 11:26:58,413  WARN | main | eu.europa.esig.dss.service.ocsp.OnlineOCSPSource        | Ignored OCSP Response from URL 'http://ocsp.quovadisglobal.com' : status -> UNAUTHORIZED
 * 2023-04-25 11:26:58,516  INFO | main | e.e.e.d.spi.x509.revocation.RepositoryRevocationSource  | Revocation token for certificate 'C-ADDFFA6FD0809A54A9F0B31FD25F74BF7F2D7AE11C80FD99DAA0FB603A65CD0E' is added into the cache
 * 2023-04-25 11:26:58,516  WARN | main | eu.europa.esig.dss.validation.RevocationDataVerifier    | The used DigestAlgorithm SHA1 is not acceptable for revocation token 'R-F6001E6ADB67633BB9752D7A1B8B2746DF95C9E85340313366405C3BBE3C0797'!
 * 2023-04-25 11:26:58,516  WARN | main | e.europa.esig.dss.validation.SignatureValidationContext | No revocation found for the certificate C-ADDFFA6FD0809A54A9F0B31FD25F74BF7F2D7AE11C80FD99DAA0FB603A65CD0E
 * 2023-04-25 11:26:58,519  WARN | main | eu.europa.esig.dss.service.ocsp.OnlineOCSPSource        | No OCSP location found for C-F2FD608F0533FE26F1FE13CE41921B5AAEC686184B92D1AE915630A3DB0E9D25
 * 2023-04-25 11:26:58,538  WARN | main | eu.europa.esig.dss.alert.handler.LogHandler             | Revocation data is missing for one or more certificate(s). [C-ADDFFA6FD0809A54A9F0B31FD25F74BF7F2D7AE11C80FD99DAA0FB603A65CD0E: No revocation data found for certificate!]
 *
 * eu.europa.esig.dss.alert.exception.AlertException: Expired signature found. [S-51D423A5C312D35666C45064E009FD4E9A1B78F09884C7C83E9361BB568737F4: The signing certificate has expired and there is no POE during its validity range : [2017-04-18T13:11:25Z - 2021-04-18T13:11:25Z]!]
 */
public class DSS2058QCLTATest extends AbstractDSS2058 {

	@Override
	protected DSSDocument getDocumentToExtend() {
		return new InMemoryDocument(TestUtils.getResourceAsStream("validation/dss-2058/dss-2058-QC-LTA-test.pdf"));
	}
	
	@Override
	protected void checkSignatureLevel(DiagnosticData diagnosticData) {
		// fails because one signature does not contain CMS timestamp
	}
	
	@Override
	protected void checkTimestamps(DiagnosticData diagnosticData) {
		for (TimestampWrapper timestampToken : diagnosticData.getTimestampList()) {
			assertTrue(timestampToken.isMessageImprintDataFound());
			assertTrue(timestampToken.isMessageImprintDataIntact());
		}
	}

}
