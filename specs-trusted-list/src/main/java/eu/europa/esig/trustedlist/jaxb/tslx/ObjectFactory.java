
package eu.europa.esig.trustedlist.jaxb.tslx;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.trustedlist.jaxb.tslx package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MimeType_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "MimeType");
    private final static QName _X509CertificateLocation_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "X509CertificateLocation");
    private final static QName _PublicKeyLocation_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "PublicKeyLocation");
    private final static QName _ExtendedKeyUsage_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "ExtendedKeyUsage");
    private final static QName _TakenOverBy_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "TakenOverBy");
    private final static QName _CertSubjectDNAttribute_QNAME = new QName("http://uri.etsi.org/02231/v2/additionaltypes#", "CertSubjectDNAttribute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.trustedlist.jaxb.tslx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtendedKeyUsageType }
     * 
     */
    public ExtendedKeyUsageType createExtendedKeyUsageType() {
        return new ExtendedKeyUsageType();
    }

    /**
     * Create an instance of {@link TakenOverByType }
     * 
     */
    public TakenOverByType createTakenOverByType() {
        return new TakenOverByType();
    }

    /**
     * Create an instance of {@link CertSubjectDNAttributeType }
     * 
     */
    public CertSubjectDNAttributeType createCertSubjectDNAttributeType() {
        return new CertSubjectDNAttributeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "MimeType")
    public JAXBElement<String> createMimeType(String value) {
        return new JAXBElement<String>(_MimeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "X509CertificateLocation")
    public JAXBElement<String> createX509CertificateLocation(String value) {
        return new JAXBElement<String>(_X509CertificateLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "PublicKeyLocation")
    public JAXBElement<String> createPublicKeyLocation(String value) {
        return new JAXBElement<String>(_PublicKeyLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedKeyUsageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtendedKeyUsageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "ExtendedKeyUsage")
    public JAXBElement<ExtendedKeyUsageType> createExtendedKeyUsage(ExtendedKeyUsageType value) {
        return new JAXBElement<ExtendedKeyUsageType>(_ExtendedKeyUsage_QNAME, ExtendedKeyUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakenOverByType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TakenOverByType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "TakenOverBy")
    public JAXBElement<TakenOverByType> createTakenOverBy(TakenOverByType value) {
        return new JAXBElement<TakenOverByType>(_TakenOverBy_QNAME, TakenOverByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertSubjectDNAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertSubjectDNAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02231/v2/additionaltypes#", name = "CertSubjectDNAttribute")
    public JAXBElement<CertSubjectDNAttributeType> createCertSubjectDNAttribute(CertSubjectDNAttributeType value) {
        return new JAXBElement<CertSubjectDNAttributeType>(_CertSubjectDNAttribute_QNAME, CertSubjectDNAttributeType.class, null, value);
    }

}