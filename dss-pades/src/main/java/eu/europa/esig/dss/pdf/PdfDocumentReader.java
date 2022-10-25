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
package eu.europa.esig.dss.pdf;

import android.graphics.Bitmap;

import eu.europa.esig.dss.enumerations.CertificationPermission;
import eu.europa.esig.dss.pades.validation.PdfSignatureDictionary;
import eu.europa.esig.dss.pades.validation.PdfSignatureField;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Reads the PDF Document
 */
public interface PdfDocumentReader extends Closeable {
	
	/**
	 * Loads the last DSS dictionary from the document if exists
	 * NOTE: can return null if DSS dictionary is not present
	 * 
	 * @return {@link PdfDssDict}
	 */
	PdfDssDict getDSSDictionary();
	
	/**
	 * Extracts PdfSignatureDictionaries present in the signature
	 * 
	 * @return a map between {@link PdfSignatureDictionary} and related {@link PdfSignatureField}s
	 * @throws IOException if an exception occurs
	 */
	Map<PdfSignatureDictionary, List<PdfSignatureField>> extractSigDictionaries() throws IOException;
	
	/**
	 * Checks if a signature for the given PDF Signature Dictionary covers the whole document
	 * 
	 * @param signatureDictionary {@link PdfSignatureDictionary} to check the result for
	 * @return TRUE if the signature covers the whole document, false otherwise
	 */
	boolean isSignatureCoversWholeDocument(PdfSignatureDictionary signatureDictionary);
	
	/**
	 * Returns an amount of pages found in the document
	 * 
	 * @return number of pages
	 */
	int getNumberOfPages();
	
	/**
	 * Returns a page box dimensions
	 * 
	 * @param page number of a page to get annotation box of
	 * @return {@link AnnotationBox} representing page dimensions
	 */
	AnnotationBox getPageBox(int page);

	/**
	 * This method returns a corresponding page's rotation within the document
	 *
	 * @param page number of a page to get rotation of
	 * @return rotation degrees
	 */
	int getPageRotation(int page);
	
	/**
	 * Retrieves all annotations found in the document
	 * 
	 * @param page number
	 * @return a list of {@link PdfAnnotation}s associated with the given page
	 * @throws IOException if an exception occurs
	 */
	List<PdfAnnotation> getPdfAnnotations(int page) throws IOException;
	
	/**
	 * Generates the image screenshot for the given page of the PDF
	 * 
	 * @param page number to be generated
	 * @return {@link BufferedImage} screenshot for the given page
	 * @throws IOException if an exception occurs
	 */
	Bitmap generateImageScreenshot(int page) throws IOException;
	
	/**
	 * Generates the image screenshot by hiding the given list of {@code annotationBoxes}
	 * 
	 * @param page number to be generated
	 * @param addedAnnotations a list of {@link PdfAnnotation}s to be hidden
	 * @return {@link BufferedImage} screenshot for the given page
	 * @throws IOException if an exception occurs
	 */
	Bitmap generateImageScreenshotWithoutAnnotations(int page, List<PdfAnnotation> addedAnnotations) throws IOException;

	/**
	 * This method checks if the document is not encrypted or with limited edition rights
	 */
	void checkDocumentPermissions();

	/**
	 * Returns value of /DocMDP dictionary defining the permitted modification in a PDF, when present
	 *
	 * @return {@link CertificationPermission}
	 */
	CertificationPermission getCertificationPermission();

	/**
	 * This method verifies whether a PDF contains a usage rights signature
	 *
	 * @return TRUE of a PDF contains a usage rights signature, FALSE otherwise
	 */
	boolean isUsageRightsSignaturePresent();

	/**
	 * Returns a document catalog as a dictionary
	 *
	 * @return {@link PdfDict}
	 */
	PdfDict getCatalogDictionary();

}
