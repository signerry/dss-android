package com.signerry.android;

import java.util.Iterator;
import java.util.ServiceLoader;

public class AndroidUtils {
    public static <T> T getService(Class<T> implClass) {
        ServiceLoader load = ServiceLoader.load(implClass);
        Iterator itr = load.iterator();

        while (itr.hasNext()) {
            Object unknownServiceImpl = itr.next();
            return (T) unknownServiceImpl;

//            if(unknownServiceImpl.getClass().isAssignableFrom(implClass)) {
//                return (T) unknownServiceImpl;
//            }
        }
        throw new RuntimeException("No service found: " + implClass);
    }
}
