package eu.europa.esig.dss.test;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class TestUtils {
    public static Context getCtx() {
        return  InstrumentationRegistry.getInstrumentation().getTargetContext();
    }


    public static File getTmpDirectory() {

        try {
            return getCtx().getCacheDir();
        }
        catch (java.lang.IllegalStateException e) {
            try {
                return Files.createTempDirectory("test").toFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

    public static InputStream getResourceAsStream(String resourcePath) {
        try {
            return TestUtils.class.getResourceAsStream("/" + resourcePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static File getResourceAsFile(String resourcePath) {
        try {
            InputStream in = TestUtils.class.getResourceAsStream("/" + resourcePath);
            if (in == null) {
                return null;
            }

            File tempFile = File.createTempFile(String.valueOf(in.hashCode()), ".tmp");
            tempFile.deleteOnExit();

            try (FileOutputStream out = new FileOutputStream(tempFile)) {
                //copy stream
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            return tempFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
