package com.signerry.dss.test;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.UUID;

import eu.europa.esig.dss.service.http.commons.IResourceLoader;
import eu.europa.esig.dss.service.http.commons.ResourceLoader;

public class UnitTestUtils implements ITestUtils {
    @Override
    public Collection<File> listFiles(String folder, String[] extensions, boolean recursive) {
       return FileUtils.listFiles(TestUtils.getResourceAsFile(folder), extensions, true);
    }

    @Override
    public File getTmpFile(String filename) {
        File file = new File(getTmpDirectory(), filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    @Override
    public File getTmpDedicatedDirectory() {
        File dirToCreate = new File(getTmpDirectory(), UUID.randomUUID().toString());
        try {
            Path dir = Files.createDirectories(dirToCreate.toPath());
            return dir.toFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public File getTmpDirectory() {
        String projectDir = System.getProperty("projectDir");

        try {
            Path dir = Files.createDirectories(Paths.get(projectDir, "build", "tmp"));
            return dir.toFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public InputStream getResourceAsStream(String resourcePath) {
        return UnitTestUtils.class.getResourceAsStream("/" + resourcePath);
    }

    @Override
    public File getResourceAsFile(String resourcePath) {
        URL resource = UnitTestUtils.class.getResource("/" + resourcePath);

        try {
            return Paths.get(resource.toURI()).toFile();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IResourceLoader getResourceLoader() {
        return new ResourceLoader();
    }
}
