package com.signerry.dss.test;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.UUID;

import eu.europa.esig.dss.utils.Utils;

public class UnitTestUtils implements ITestUtils {
    @Override
    public Collection<File> listFiles(String folder, String[] extensions, boolean recursive) {
       return Utils.listFiles(new File(folder), extensions, true);
    }

    @Override
    public File getTmpFile(String filename) {
        return new File(getTmpDirectory(), filename);
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
        return new File(UnitTestUtils.class.getResource("/" + resourcePath).getFile());
    }
}
