package eu.europa.esig.dss.pdf.pdfbox;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PdfBoxDictTest {

    @Test
    public void getLongValueTest() throws IOException {
        COSDictionary cosDictionary = new COSDictionary();
        cosDictionary.setItem(COSName.getPDFName("Integer"), COSInteger.get(123456789));

        COSBase integer = cosDictionary.getDictionaryObject(COSName.getPDFName("Integer"));
        assertNotNull(integer);
        assertTrue(integer instanceof COSNumber);

        try (PDDocument pdDocument = new PDDocument()) {
            PdfBoxDict pdfBoxDict = new PdfBoxDict(cosDictionary, pdDocument);
            Number numberValue = pdfBoxDict.getNumberValue("Integer");
            assertNotNull(numberValue);
            assertEquals(123456789, numberValue.longValue());
        }
    }

    @Test
    public void getFloatValueTest() throws IOException {
        COSDictionary cosDictionary = new COSDictionary();
        cosDictionary.setItem(COSName.getPDFName("Float"), COSFloat.get("1.23456789e8"));

        COSBase floatNumber = cosDictionary.getDictionaryObject(COSName.getPDFName("Float"));
        assertNotNull(floatNumber);
        assertTrue(floatNumber instanceof COSFloat);

        try (PDDocument pdDocument = new PDDocument()) {
            PdfBoxDict pdfBoxDict = new PdfBoxDict(cosDictionary, pdDocument);
            Number numberValue = pdfBoxDict.getNumberValue("Float");
            assertNotNull(numberValue);
            assertEquals(123456789f, numberValue.floatValue());
        }
    }

}
