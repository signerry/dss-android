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
package eu.europa.esig.dss.spi.x509;

import eu.europa.esig.dss.model.DSSException;
import eu.europa.esig.dss.model.x509.CertificateToken;
import eu.europa.esig.dss.spi.DSSUtils;
import com.signerry.dss.test.TestUtils;
import eu.europa.esig.dss.utils.Utils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyStoreCertificateSourceTest {

	private static final String KEYSTORE_PASSWORD = "dss-password";
	private static final String KEYSTORE_TYPE = "BKS";
	private static final String KEYSTORE_FILEPATH = "keystore.jks";

	@Test
	public void testLoadAddAndDelete() throws IOException {
		KeyStoreCertificateSource kscs = new KeyStoreCertificateSource(TestUtils.getResourceAsStream(KEYSTORE_FILEPATH), KEYSTORE_TYPE, KEYSTORE_PASSWORD);
		assertNotNull(kscs);

		int startSize = Utils.collectionSize(kscs.getCertificates());
		assertTrue(startSize > 0);

		CertificateToken token = DSSUtils.loadCertificate(TestUtils.getResourceAsFile("citizen_ca.cer"));
		CertificateToken token2 = DSSUtils.loadCertificate(TestUtils.getResourceAsFile("ecdsa.cer"));
		kscs.addCertificateToKeyStore(token);

		int sizeAfterAdd = Utils.collectionSize(kscs.getCertificates());
		assertEquals(sizeAfterAdd,startSize + 1);
		String tokenId = token.getDSSIdAsString();

		CertificateToken certificate = kscs.getCertificate(tokenId);
		assertNotNull(certificate);

		kscs.deleteCertificateFromKeyStore(tokenId);

		int sizeAfterDelete = Utils.collectionSize(kscs.getCertificates());
		assertEquals(sizeAfterDelete,startSize);

		kscs.addAllCertificatesToKeyStore(Arrays.asList(token, token2));

		sizeAfterAdd = Utils.collectionSize(kscs.getCertificates());
		assertEquals(sizeAfterAdd,startSize + 2);

		assertNull(kscs.getCertificate("AAAAAAAAAAAAAAAA"));
	}

	@Test
	public void loadKeystoreAndTruststore() throws IOException {
		KeyStoreCertificateSource kscs = new KeyStoreCertificateSource(TestUtils.getResourceAsFile("good-user.p12"), "PKCS12", "ks-password");
		assertTrue(kscs.getCertificates().size() > 0);

		kscs = new KeyStoreCertificateSource(TestUtils.getResourceAsFile("trust-anchors.jks"), "BKS", "ks-password");
		assertTrue(kscs.getCertificates().size() > 0);
	}

	@Test
	public void testCreateNewKeystore() throws IOException {
		KeyStoreCertificateSource kscs = new KeyStoreCertificateSource(KEYSTORE_TYPE, KEYSTORE_PASSWORD);
		CertificateToken token = DSSUtils.loadCertificate(TestUtils.getResourceAsFile("citizen_ca.cer"));
		kscs.addCertificateToKeyStore(token);

		File tmpFile = TestUtils.getTmpFile("new_keystore.jks");

		kscs.store(new FileOutputStream(tmpFile));

		KeyStoreCertificateSource kscs2 = new KeyStoreCertificateSource(tmpFile, KEYSTORE_TYPE, KEYSTORE_PASSWORD);
		assertEquals(1, Utils.collectionSize(kscs2.getCertificates()));
	}

	@Test
	public void wrongPassword() throws IOException {
		File ksFile = TestUtils.getResourceAsFile(KEYSTORE_FILEPATH);
		assertThrows(DSSException.class, () -> new KeyStoreCertificateSource(ksFile, KEYSTORE_TYPE, "wrong password"));
	}

	@Test
	public void wrongFile() throws IOException {
		File wrongFile = new File("keystore.p13");
		assertThrows(IOException.class,
				() -> new KeyStoreCertificateSource(wrongFile, KEYSTORE_TYPE, KEYSTORE_PASSWORD));
	}

	@Test
	void clearAllCertificates() throws IOException {
		File tempJKS = TestUtils.getTmpFile("temp.jks");
		Utils.copy(TestUtils.getResourceAsStream(KEYSTORE_FILEPATH), new FileOutputStream(tempJKS));

		KeyStoreCertificateSource kscs = new KeyStoreCertificateSource(tempJKS, KEYSTORE_TYPE, KEYSTORE_PASSWORD);
		List<CertificateToken> certificates = kscs.getCertificates();
		assertTrue(Utils.isCollectionNotEmpty(certificates));

		kscs.clearAllCertificates();

		certificates = kscs.getCertificates();
		assertTrue(Utils.isCollectionEmpty(certificates));
	}

}
