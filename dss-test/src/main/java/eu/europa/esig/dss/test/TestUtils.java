package eu.europa.esig.dss.test;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestUtils {
    public static Context getCtx() {
        return  InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    public static Collection<File> listFiles(String folder, String[] extensions, boolean recursive) {
        List<File> fileList = new ArrayList<>();

        List<String> allowedExtensions = Arrays.asList(extensions);
        try {
            String[] list = getCtx().getAssets().list(folder);
            for(String filename: list) {
                String extension = FilenameUtils.getExtension(filename);

                if(!allowedExtensions.isEmpty()) {
                    if(!allowedExtensions.contains(extension)) {
                        continue;
                    }

                    if(filename.equals("logback.xml")) {
                        continue;
                    }
                }

                String url;
                if(folder.isEmpty()) {
                    url = filename;
                }
                else {
                    url = folder + "/" + filename;
                }
                fileList.add(getResourceAsFile(url));
            }
            return fileList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File getTmpFile(String filename) {
        return new File(getTmpDirectory().getPath() +  filename);
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

            InputStream resourceAsStream = getCtx().getAssets().open(resourcePath);

            if (resourceAsStream == null) {
                throw new RuntimeException("resourcePath not found " + resourcePath);
            }

            return resourceAsStream;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static File getResourceAsFile(String resourcePath) {

        try {
            final InputStream in = getResourceAsStream(resourcePath);
            if (in == null) {
                throw new RuntimeException("resourcePath not found " + resourcePath);
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
