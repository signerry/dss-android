package com.signerry.android;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.validation.SchemaFactory;
import javax.xml.xpath.XPathFactory;

public class AndroidUtils {

    public static final HashMap<Class, Class> SERVICE_MAPPING = new HashMap();
    static {
        SERVICE_MAPPING.put(
                DocumentBuilderFactory.class,
                org.apache.xerces.jaxp.DocumentBuilderFactoryImpl.class);

        SERVICE_MAPPING.put(
                TransformerFactory.class,
                org.apache.xalan.processor.TransformerFactoryImpl.class);

        SERVICE_MAPPING.put(
                XPathFactory.class,
                org.apache.xpath.jaxp.XPathFactoryImpl.class);

        SERVICE_MAPPING.put(
                SchemaFactory.class,
                org.apache.xerces.jaxp.validation.XMLSchemaFactory.class);

        SERVICE_MAPPING.put(
                SAXParserFactory.class,
                org.apache.xerces.jaxp.SAXParserFactoryImpl.class);
    }

    public static <T> T getService(Class<T> implClass) {
        ServiceLoader load = ServiceLoader.load(implClass);
        Iterator itr = load.iterator();

        while (itr.hasNext()) {
            Object candidateService = itr.next();

            Class aClass = SERVICE_MAPPING.get(implClass);

            if(aClass.isInstance(candidateService)) {
                return (T) candidateService;
            }
        }
        throw new RuntimeException("No service found: " + implClass);
    }
}
