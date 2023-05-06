package eu.europa.esig.dss;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

import eu.europa.esig.dss.pdf.pdfbox.PdfBoxDocumentReader;

public class UnitTestRunnerListener extends RunListener {
    public void testRunStarted(Description description) throws Exception {
           Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

           PDFBoxResourceLoader.init(targetContext);
           PdfBoxDocumentReader.setAndroidContext(targetContext);
    }
}
