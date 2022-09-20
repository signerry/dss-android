package eu.europa.esig.dss.service.http.commons;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class AndroidResourceLoader extends ResourceLoader implements IResourceLoader {
    private final Context androidContext;

    public AndroidResourceLoader(Context androidContext) {
        this.androidContext = androidContext;
    }

    public InputStream getInputStream(String urlString) {

        if(urlString.startsWith("/")) {
            urlString = urlString.substring(1);
        }
        try {
            return androidContext.getAssets().open(urlString);
        } catch (IOException e) {
           return null;
        }
    }
}
