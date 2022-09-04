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
package eu.europa.esig.xmldsig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static com.signerry.dss.test.TestUtils.getResourceAsFile;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URISyntaxException;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;

import eu.europa.esig.dss.alert.Alert;
import eu.europa.esig.dss.jaxb.common.DSSErrorHandler;
import eu.europa.esig.dss.jaxb.common.ValidatorConfigurator;
import eu.europa.esig.dss.jaxb.common.XmlDefinerUtils;
import eu.europa.esig.dss.jaxb.common.exception.XSDValidationException;
import eu.europa.esig.xmldsig.jaxb.SignatureType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class XmlDSigUtilsTest {

	
	private static XmlDSigUtils xmlDSigUtils;
	
	@BeforeAll
	public static void init() {
		xmlDSigUtils = XmlDSigUtils.getInstance();
	}

	@Test
	@SuppressWarnings("unchecked")
	public void test() throws JAXBException, SAXException, URISyntaxException, IOException {

		File xmldsigFile = getResourceAsFile("XmlAliceSig.xml");

		JAXBContext jc = xmlDSigUtils.getJAXBContext();
		assertNotNull(jc);

		Schema schema = xmlDSigUtils.getSchema();
		assertNotNull(schema);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		unmarshaller.setSchema(schema);

		JAXBElement<SignatureType> unmarshalled = (JAXBElement<SignatureType>) unmarshaller.unmarshal(xmldsigFile);
		assertNotNull(unmarshalled);

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setSchema(schema);

		StringWriter sw = new StringWriter();
		marshaller.marshal(unmarshalled, sw);

		String xmldsigString = sw.toString();

		JAXBElement<SignatureType> unmarshalled2 = (JAXBElement<SignatureType>) unmarshaller.unmarshal(new StringReader(xmldsigString));
		assertNotNull(unmarshalled2);
	}

	@Test
	public void getJAXBContext() throws JAXBException {
		assertNotNull(xmlDSigUtils.getJAXBContext());
		// cached
		assertNotNull(xmlDSigUtils.getJAXBContext());
	}

	@Test
	public void getSchema() throws SAXException {
		assertNotNull(xmlDSigUtils.getSchema());
		// cached
		assertNotNull(xmlDSigUtils.getSchema());
	}

	@Test
	public void validateTest() throws IOException, SAXException {
		StreamSource aliceFile = new StreamSource( getResourceAsFile("XmlAliceSig.xml"));
		xmlDSigUtils.validate(aliceFile, xmlDSigUtils.getSchema(), true);

		StreamSource bobFile = new StreamSource(getResourceAsFile("XmlBobSig.xml"));
		XSDValidationException exception = assertThrows(XSDValidationException.class,
				() -> xmlDSigUtils.validate(bobFile, xmlDSigUtils.getSchema(), true));
		assertNotNull(exception.getMessage());
		assertNotNull(exception.getAllMessages());
		assertEquals(2, exception.getAllMessages().size());

		ValidatorConfigurator validatorConfigurator = ValidatorConfigurator.getSecureValidatorConfigurator();
		validatorConfigurator.setErrorHandlerAlert(new Alert<DSSErrorHandler>() {
			@Override
			public void alert(DSSErrorHandler errorHandler) {
				if (!errorHandler.isValid()) {
					throw new RuntimeException(errorHandler.getErrors().iterator().next());
				}
			}
		});
		XmlDefinerUtils.getInstance().setValidatorConfigurator(validatorConfigurator);
		assertThrows(RuntimeException.class, () -> xmlDSigUtils.validate(bobFile, xmlDSigUtils.getSchema(), true));

		validatorConfigurator.setErrorHandlerAlert(new Alert<DSSErrorHandler>() {
			@Override
			public void alert(DSSErrorHandler errorHandler) {
				// do nothing
			}
		});
		XmlDefinerUtils.getInstance().setValidatorConfigurator(validatorConfigurator);
		xmlDSigUtils.validate(bobFile, xmlDSigUtils.getSchema(), true);

		// return settings
		XmlDefinerUtils.getInstance().setValidatorConfigurator(ValidatorConfigurator.getSecureValidatorConfigurator());
	}

}
