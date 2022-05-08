
package eu.europa.esig.asic.manifest.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.asic.manifest.jaxb package. 
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

    private final static QName _ASiCManifest_QNAME = new QName("http://uri.etsi.org/02918/v1.2.1#", "ASiCManifest");
    private final static QName _SigReference_QNAME = new QName("http://uri.etsi.org/02918/v1.2.1#", "SigReference");
    private final static QName _DataObjectReference_QNAME = new QName("http://uri.etsi.org/02918/v1.2.1#", "DataObjectReference");
    private final static QName _Extension_QNAME = new QName("http://uri.etsi.org/02918/v1.2.1#", "Extension");
    private final static QName _XAdESSignatures_QNAME = new QName("http://uri.etsi.org/02918/v1.2.1#", "XAdESSignatures");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.asic.manifest.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ASiCManifestType }
     * 
     */
    public ASiCManifestType createASiCManifestType() {
        return new ASiCManifestType();
    }

    /**
     * Create an instance of {@link SigReferenceType }
     * 
     */
    public SigReferenceType createSigReferenceType() {
        return new SigReferenceType();
    }

    /**
     * Create an instance of {@link DataObjectReferenceType }
     * 
     */
    public DataObjectReferenceType createDataObjectReferenceType() {
        return new DataObjectReferenceType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link XAdESSignaturesType }
     * 
     */
    public XAdESSignaturesType createXAdESSignaturesType() {
        return new XAdESSignaturesType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link ExtensionsListType }
     * 
     */
    public ExtensionsListType createExtensionsListType() {
        return new ExtensionsListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ASiCManifestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ASiCManifestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02918/v1.2.1#", name = "ASiCManifest")
    public JAXBElement<ASiCManifestType> createASiCManifest(ASiCManifestType value) {
        return new JAXBElement<ASiCManifestType>(_ASiCManifest_QNAME, ASiCManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SigReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02918/v1.2.1#", name = "SigReference")
    public JAXBElement<SigReferenceType> createSigReference(SigReferenceType value) {
        return new JAXBElement<SigReferenceType>(_SigReference_QNAME, SigReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataObjectReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataObjectReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02918/v1.2.1#", name = "DataObjectReference")
    public JAXBElement<DataObjectReferenceType> createDataObjectReference(DataObjectReferenceType value) {
        return new JAXBElement<DataObjectReferenceType>(_DataObjectReference_QNAME, DataObjectReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02918/v1.2.1#", name = "Extension")
    public JAXBElement<ExtensionType> createExtension(ExtensionType value) {
        return new JAXBElement<ExtensionType>(_Extension_QNAME, ExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESSignaturesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESSignaturesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/02918/v1.2.1#", name = "XAdESSignatures")
    public JAXBElement<XAdESSignaturesType> createXAdESSignatures(XAdESSignaturesType value) {
        return new JAXBElement<XAdESSignaturesType>(_XAdESSignatures_QNAME, XAdESSignaturesType.class, null, value);
    }

}
