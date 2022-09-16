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
package eu.europa.esig.dss.crl.stream.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import eu.europa.esig.dss.crl.AbstractTestCRLUtils;

public class CRLUtilsStreamImplTest extends AbstractTestCRLUtils {

    @Override
    @Test
    public void isValidCRL() throws Exception {
        super.isValidCRL();
    }

    @Override
    @Test
    public void testUA() throws Exception {
        super.testUA();
    }

    @Override
    @Test
    public void isValidPEMCRL() throws Exception {
        super.isValidPEMCRL();
    }

    @Override
    @Test
    public void isValidCRLWrongCertificate() throws Exception {
        super.isValidCRLWrongCertificate();
    }

    @Override
    @Test
    public void testLTGRCA() throws Exception {
        super.testLTGRCA();
    }

    @Override
    @Test
    public void testGetExpiredCertsOnCRL() throws Exception {
        super.testGetExpiredCertsOnCRL();
    }

    @Override
    @Test
    public void testGetExpiredCertsOnCRLUTCTime() throws Exception {
        super.testGetExpiredCertsOnCRLUTCTime();
    }

    @Override
    @Test
    public void derVsPemEncodedTest() throws Exception {
        super.derVsPemEncodedTest();
    }

    @Override
    @Test
    public void retrieveRevocation() throws Exception {
        super.retrieveRevocation();
    }

    @Override
    @Test
    public void testARLFile() throws Exception {
        super.testARLFile();
    }

    @Override
    @Disabled
    public void testHugeCRL() throws Exception {
        super.testHugeCRL();
    }

    @Override
    @Test
    public void testRealNot() throws Exception {
        super.testRealNot();
    }

    @Override
    @Test
    public void testECDSA() throws Exception {
        super.testECDSA();
    }

    @Override
    @Test
    public void testECDSAwithRSACert() throws Exception {
        super.testECDSAwithRSACert();
    }

    @Override
    @Test
    public void testPSSwithoutBouncyCastleBeforeJDK16() throws Exception {
        super.testPSSwithoutBouncyCastleBeforeJDK16();
    }

    @Override
    @Test
    public void incompleteCRL() throws Exception {
        super.incompleteCRL();
    }

    @Override
    @Test
    public void rsaSHA1() throws Exception {
        super.rsaSHA1();
    }

    @Override
    @Test
    public void rsaSHA1bis() throws Exception {
        super.rsaSHA1bis();
    }

    @Override
    @Test
    public void rsaSHA256() throws Exception {
        super.rsaSHA256();
    }

    @Override
    @Test
    public void testPE() throws Exception {
        super.testPE();
    }

    @Override
    @Test
    public void loopIssue() throws Exception {
        super.loopIssue();
    }

    @Override
    @Test
    public void loopIssue2() throws Exception {
        super.loopIssue2();
    }

    @Override
    @Test
    public void noRevoc() throws Exception {
        super.noRevoc();
    }
}
