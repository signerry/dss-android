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
package eu.europa.esig.dss.pdf.visible;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorSpace;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.jfif.JfifDirectory;
import com.drew.metadata.png.PngDirectory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import eu.europa.esig.dss.exception.IllegalInputException;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.DSSException;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.model.MimeType;
import eu.europa.esig.dss.pades.SignatureImageParameters;
import eu.europa.esig.dss.pdf.AnnotationBox;
import eu.europa.esig.dss.utils.Utils;

/**
 * Static utilities for image creation and processing
 * 
 * @author pakeyser
 */
public class ImageUtils {

	private static final Logger LOG = LoggerFactory.getLogger(ImageUtils.class);

	/** The default name for a screenshot document */
	private static final String SCREENSHOT_PNG_NAME = "screenshot.png";

	/**
	 * Default image DPI
	 */
	private static final int DEFAULT_DPI = 96;

	/**
	 * Defines a number of a first page in a document
	 */
	public static final int DEFAULT_FIRST_PAGE = 1;

	/**
	 * Default constructor
	 */
	private ImageUtils() {
	}

	/**
	 * Reads image's metadata in a secure way. If metadata is not accessible from
	 * {@code image}, returns values from {@code imageParameters}
	 * 
	 * @param imageParameters {@link SignatureImageParameters}
	 * @return {@link ImageResolution} metadata
	 * @throws IOException in case of image reading error
	 */
	public static ImageResolution secureReadMetadata(SignatureImageParameters imageParameters) throws IOException {
		ImageResolution imageAndResolution;
		try {
			imageAndResolution = ImageUtils.readDisplayMetadata(imageParameters.getImage());
		} catch (Exception e) {
			LOG.warn("Cannot access the image metadata : {}. Returns default info.", e.getMessage());
			imageAndResolution = new ImageResolution(imageParameters.getDpi(), imageParameters.getDpi());
		}
		return imageAndResolution;
	}

	/**
	 * Reads image's metadata
	 * 
	 * @param image {@link DSSDocument} image to read metadata from
	 * @return {@link ImageResolution} metadata
	 * @throws IOException in case of image reading error
	 */
	public static ImageResolution readDisplayMetadata(DSSDocument image) throws IOException {
		if (isImageWithContentType(image, MimeType.JPEG)) {
			return readAndDisplayMetadataJPEG(image);
		} else if (isImageWithContentType(image, MimeType.PNG)) {
			return readAndDisplayMetadataPNG(image);
		}
		throw new IllegalInputException("Unsupported image type");
	}

	private static boolean isImageWithContentType(DSSDocument image, MimeType expectedContentType) {
		if (image.getMimeType() != null) {
			return image.getMimeType().equals(expectedContentType);
		} else if (image.getName() != null) {
			String contentType = null;
			try {
				contentType = Files.probeContentType(Paths.get(image.getName()));
			} catch (IOException e) {
				LOG.warn("Unable to retrieve the content-type : {}", e.getMessage());
			} catch (Exception e) {
				throw new DSSException("An error occurred during an attempt to read the image's content type", e);
			}
			return Utils.areStringsEqual(expectedContentType.getMimeTypeString(), contentType);
		} else {
			throw new IllegalArgumentException("Cannot read image metadata. MimeType or image name must be specified!");
		}
	}

	private static ImageResolution readAndDisplayMetadataJPEG(DSSDocument image) throws IOException {
		int hdpi = DEFAULT_DPI;
		int vdpi = DEFAULT_DPI;

		try {
			Metadata metadata = ImageMetadataReader.readMetadata(image.openStream());

			for (JfifDirectory xmpDirectory : metadata.getDirectoriesOfType(JfifDirectory.class)) {
				try {
					hdpi = xmpDirectory.getResX();
					vdpi = xmpDirectory.getResY();
				} catch (MetadataException e) {
					throw new IOException(e);
				}
			}
			return new ImageResolution(hdpi, vdpi);

		} catch (ImageProcessingException e) {
			throw new IOException(e);
		}
	}

	private static ImageResolution readAndDisplayMetadataPNG(DSSDocument image) throws IOException {
		int hdpi = DEFAULT_DPI;
		int vdpi = DEFAULT_DPI;

		Metadata metadata = null;
		try {
			metadata = ImageMetadataReader.readMetadata(image.openStream());
		} catch (ImageProcessingException e) {
			throw new IOException(e);
		}

		double mm2inch = 25.4;

		for (PngDirectory xmpDirectory : metadata.getDirectoriesOfType(PngDirectory.class)) {

			if(xmpDirectory.containsTag(PngDirectory.TAG_PIXELS_PER_UNIT_X)) {
				int x = 0;
				try {
					x = xmpDirectory.getInt(PngDirectory.TAG_PIXELS_PER_UNIT_X);

					vdpi = (int) (mm2inch / x);

				} catch (MetadataException e) {
					e.printStackTrace();
				}
			}

			if(xmpDirectory.containsTag(PngDirectory.TAG_PIXELS_PER_UNIT_Y)) {

				try {
					int y = xmpDirectory.getInt(PngDirectory.TAG_PIXELS_PER_UNIT_Y);
					hdpi = (int) (mm2inch / y);

				} catch (MetadataException e) {
					e.printStackTrace();
				}
			}
		}

		return new ImageResolution(hdpi, vdpi);

	}

	/**
	 * Returns the AnnotationBox for the given image document
	 *
	 * @param imageDocument {@link DSSDocument} representing an image
	 * @return {@link AnnotationBox}
	 */
	public static AnnotationBox getImageBoundaryBox(DSSDocument imageDocument) {
		try (InputStream is = imageDocument.openStream();) {
			Bitmap bitmap = BitmapFactory.decodeStream(is);
			int height = bitmap.getHeight();
			int width = bitmap.getWidth();
			return new AnnotationBox(0, 0, width, height);

		} catch (IOException e) {
			throw new IllegalInputException(String.format("Cannot read the given image. Reason : %s", e.getMessage()), e);
		}
	}

	/**
	 * Returns a coefficient applying to a signature field width/height calculation
	 * 
	 * @param zoom - zoom value to compute scale factor from
	 * @return {@code float} scale factor
	 */
	public static float getScaleFactor(int zoom) {
		return zoom / 100f;
	}

	/**
	 * Transforms a {@code BufferedImage} to {@code DSSDocument}
	 *
	 * @param bitmap {@link BufferedImage} to convert
	 * @return {@link DSSDocument}
	 */
	public static DSSDocument toDSSDocument(Bitmap bitmap) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
			return new InMemoryDocument(baos.toByteArray(), SCREENSHOT_PNG_NAME, MimeType.PNG);
		} catch (IOException e) {
			throw new DSSException(
					String.format("Unable to convert BufferedImage to DSSDocument. Reason : %s", e.getMessage()), e);
		}
	}

	/**
	 * Reads the image document and returns a {@code BufferedImage}
	 *
	 * @param imageDocument {@link DSSDocument} image document to read
	 * @return {@link Bitmap}
	 * @throws IOException - in case of InputStream reading error
	 */
	public static Bitmap toBufferedImage(DSSDocument imageDocument) throws IOException {
		try (InputStream is = imageDocument.openStream()) {
			return toBufferedImage(is);
		}
	}

	/**
	 * Reads image from InputStream. Detects and converts CMYK images to RGB if
	 * needed
	 * 
	 * @param is {@link InputStream} to read the image from
	 * @return {@link BufferedImage}
	 * @throws IOException - in case of InputStream reading error
	 */
	public static Bitmap toBufferedImage(InputStream is) throws IOException {
		Bitmap bitmap = BitmapFactory.decodeStream(is);

		if (isCMYKType(bitmap)) {
			LOG.info("Converting from CMYK to RGB...");
			return convertCMYKToRGB(bitmap);
		}
		else {
			return bitmap;
		}
	}


	private static boolean isCMYKType(Bitmap raster) {
		ColorSpace colorSpace = raster.getColorSpace();
		return colorSpace.getModel() == ColorSpace.Model.CMYK;
	}

	private static Bitmap convertCMYKToRGB(Bitmap raster) {
		int width = raster.getWidth();
		int height = raster.getHeight();
		Bitmap rgbImage = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				Color color = raster.getColor(x, y);
				rgbImage.setPixel(x, y, color.toArgb());
			}
		}
		return rgbImage;
	}

	/**
	 * Checks if the image has a transparent layer
	 *
	 * @param bitmap {@link BufferedImage}
	 * @return TRUE if the image has a transparent layer, FALSE otherwise
	 */
	public static boolean isTransparent(Bitmap bitmap) {
		return bitmap.hasAlpha();
	}

	/**
	 * Checks if the two given images are equal
	 * 
	 * @param img1 {@link BufferedImage}
	 * @param img2 {@link BufferedImage}
	 * @return TRUE if the two images are equal, FALSE otherwise
	 */
	public static boolean imagesEqual(Bitmap img1, Bitmap img2) {
		if (imageDimensionsEqual(img1, img2)) {
			int diffAmount = drawSubtractionImage(img1, img2, null);
			return diffAmount == 0;
		}
		return false;
	}

	/**
	 * Checks if the dimensions of the provided images is equal
	 * 
	 * @param img1 {@link BufferedImage}
	 * @param img2 {@link BufferedImage}
	 * @return TRUE if the size dimensions of both images is equal, FALSE otherwise
	 */
	public static boolean imageDimensionsEqual(Bitmap img1, Bitmap img2) {
		if ((img1.getWidth() != img2.getWidth()) || (img1.getHeight() != img2.getHeight())) {
			LOG.warn("Screenshot comparison error! Images dimensions mismatch.");
			return false;
		}
		return true;
	}

	/**
	 * Draws the subtraction image and returns different pixels amount
	 * 
	 * @param img1   {@link BufferedImage} to compare
	 * @param img2   {@link BufferedImage} to compare
	 * @param outImg {@link BufferedImage} the output result (subtraction image)
	 * @return amount of different pixels between two images
	 */
	public static int drawSubtractionImage(Bitmap img1, Bitmap img2, Bitmap outImg) {
		int diffAmount = 0;
		int diff; // Defines current pixel color difference
		int result; // Stores output pixel
		for (int i = 0; i < img1.getHeight() && i < img2.getHeight(); i++) {
			for (int j = 0; j < img1.getWidth() && j < img2.getWidth(); j++) {
				Color rgb1 = img1.getColor(j, i);
				Color rgb2 = img2.getColor(j, i);


				// Overwrite for a new pixel
				diff = Math.abs((int)rgb1.red() - (int)rgb2.red());
				diff += Math.abs((int)rgb1.green() - (int)rgb2.green());
				diff += Math.abs((int)rgb1.blue() - (int)rgb2.blue());

				if (diff > 0) {
					diffAmount++;
				}

				if (outImg != null) {
					// Change - Ensure result is between 0 - 255
					diff /= 3;
				// Make the difference image gray scale
				// The RGB components are all the same
					result = (diff << 16) | (diff << 8) | diff;
					// Set result
					outImg.setPixel(j, i, result);
				}
			}
		}
		return diffAmount;
	}

}
