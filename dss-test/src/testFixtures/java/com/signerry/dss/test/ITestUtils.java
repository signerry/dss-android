package com.signerry.dss.test;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;

import eu.europa.esig.dss.service.http.commons.IResourceLoader;

public interface ITestUtils {
    Collection<File> listFiles(String folder, String[] extensions, boolean recursive);

    File getTmpFile(String filename);

    File getTmpDedicatedDirectory();

    File getTmpDirectory();

    InputStream getResourceAsStream(String resourcePath);

    File getResourceAsFile(String resourcePath);

    IResourceLoader getResourceLoader();
}
