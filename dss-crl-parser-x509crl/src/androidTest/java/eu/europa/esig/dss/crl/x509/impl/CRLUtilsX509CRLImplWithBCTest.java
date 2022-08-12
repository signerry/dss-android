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
package eu.europa.esig.dss.crl.x509.impl;

import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.security.cert.CertificateException;

import eu.europa.esig.dss.crl.AbstractBCTestCRLUtils;
import eu.europa.esig.dss.model.x509.CertificateToken;

public class CRLUtilsX509CRLImplWithBCTest extends AbstractBCTestCRLUtils {


    @Override
    @Test
    public void testPSSwithBouncyCastle() throws Exception {
        super.testPSSwithBouncyCastle();
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
    protected CertificateToken loadCert(InputStream is) throws CertificateException {
        return super.loadCert(is);
    }
}
