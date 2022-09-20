package com.signerry.dss.test;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceLoader;

import eu.europa.esig.dss.service.http.commons.IResourceLoader;

public class TestUtils {

    /** The implementation to be used */
    private static ITestUtils impl;

    static {
        ServiceLoader<ITestUtils> loader = ServiceLoader.load(ITestUtils.class);
        Iterator<ITestUtils> iterator = loader.iterator();

        if (!iterator.hasNext()) {
            throw new ExceptionInInitializerError(
                    "No implementation found for ITestUtils in classpath, please choose between dss-test-instrumented or dss-test-unit");
        }
        impl = iterator.next();
    }

    private TestUtils() {
    }

    public static Collection<File> listFiles(String folder, String[] extensions, boolean recursive) {
        return impl.listFiles(folder, extensions, recursive);
    }

    public static File getTmpDirectory() {
        return impl.getTmpDirectory();
    }

    public static File getTmpDedicatedDirectory() {
        return impl.getTmpDedicatedDirectory();
    }

    public static InputStream getResourceAsStream(String resourcePath) {
        return impl.getResourceAsStream(resourcePath);
    }

    public static File getResourceAsFile(String resourcePath) {
        return impl.getResourceAsFile(resourcePath);
    }

    public static File getTmpFile(String filename) {
        return impl.getTmpFile(filename);
    }

    public static IResourceLoader getResourceLoader() {
        return impl.getResourceLoader();
    }
}
