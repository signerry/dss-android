package eu.europa.esig.dss;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class UnitTestRunnerListener extends RunListener {
    public void testRunStarted(Description description) throws Exception {
        System.out.println("exec2ute");
           Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
       PDFBoxResourceLoader.init(targetContext);
    }
}
