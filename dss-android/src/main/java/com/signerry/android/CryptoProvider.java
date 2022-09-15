package com.signerry.android;

import org.apache.xml.security.exceptions.XMLSecurityException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.OperatorCreationException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class CryptoProvider {

    public static Provider BCProvider = new BouncyCastleProvider();
//    private static final org.slf4j.Logger LOG =
//            org.slf4j.LoggerFactory.getLogger(CryptoProvider.class);
//
//    static final List<String> preferredProviders = CryptoAlgorithms.PREFERRED_PROVIDERS;
//    static final List<Provider> availableProviders = new ArrayList<>();
//
//    static  {
//        for(String providerName: preferredProviders) {
//            Provider provider = Security.getProvider(providerName);
//
//            if(provider != null) {
//                availableProviders.add(provider);
//            }
//        }
//
//       availableProviders.add(new BouncyCastleProvider());
//    }
//
//
//    @FunctionalInterface
//    public interface BcFunc<T, R> {
//        R apply(T t) throws NoSuchAlgorithmException, CertificateException, InvalidKeyException, OperatorCreationException, IOException, XMLSecurityException, SignatureException, KeyStoreException, NoSuchProviderException;
//    }
//
//    public static <R> Supplier<R> bind(BcFunc<Provider,R> fn) {
//        return () -> {
//            Iterator<Provider> itr = availableProviders.iterator();
//
//            while(itr.hasNext()) {
//                Provider provider = itr.next();
//
//                try {
//                    return fn.apply(provider);
//                } catch (NoSuchAlgorithmException | CertificateException | InvalidKeyException | OperatorCreationException | IOException | XMLSecurityException | SignatureException | KeyStoreException | NoSuchProviderException e) {
//                    LOG.error("Provider '{}' failed, exception:", provider.getName(), e.getMessage());
//
//                    if(itr.hasNext()) {
//                        continue;
//                    }
//                    else {
//                        String msg = String.format(
//                                "'%s' provider returned error '%s'",
//                                provider.getName(),
//                                e.getMessage());
//                        throw new RuntimeException(msg, e);
//                    }
//                }
//            }
//
//            throw new RuntimeException("Should not happen");
//        };
//    }
}
