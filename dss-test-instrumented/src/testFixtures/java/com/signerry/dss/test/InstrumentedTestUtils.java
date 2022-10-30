package com.signerry.dss.test;

import android.content.Context;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import androidx.test.platform.app.InstrumentationRegistry;
import eu.europa.esig.dss.service.http.commons.AndroidResourceLoader;
import eu.europa.esig.dss.service.http.commons.IResourceLoader;

public class InstrumentedTestUtils implements ITestUtils {

    public Context getCtx() {
        return  InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @Override
    public Collection<File> listFiles(String folder, String[] extensions, boolean recursive) {
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

    @Override
    public File getTmpFile(String filename) {
        File file = new File(getTmpDirectory().getPath(), filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    @Override
    public File getTmpDedicatedDirectory() {
        File folder = new File(getTmpDirectory(), UUID.randomUUID().toString());
        folder.mkdir();
        return folder;
    }

    @Override
    public File getTmpDirectory() {
        return getCtx().getCacheDir();
    }

    @Override
    public InputStream getResourceAsStream(String resourcePath) {
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

    @Override
    public File getResourceAsFile(String resourcePath) {
        try {

            final InputStream in = getResourceAsStream(resourcePath);
            if (in == null) {
                throw new RuntimeException("resourcePath not found " + resourcePath);
            }

            String fileName = FilenameUtils.getName(resourcePath);

            File copyOfTheFile = new File(getCtx().getCacheDir(), fileName);

            try (FileOutputStream out = new FileOutputStream(copyOfTheFile)) {
                IOUtils.copy(in ,out);
            }
            return copyOfTheFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public IResourceLoader getResourceLoader() {
        return new AndroidResourceLoader(this.getCtx());
    }
}
