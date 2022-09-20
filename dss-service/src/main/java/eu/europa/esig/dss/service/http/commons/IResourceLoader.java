package eu.europa.esig.dss.service.http.commons;

import java.io.InputStream;

public interface IResourceLoader {
    InputStream getInputStream(String path);
}
