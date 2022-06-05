
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.dss.simplecertificatereport.jaxb package. 
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

    private final static QName _SimpleCertificateReport_QNAME = new QName("http://dss.esig.europa.eu/validation/simple-certificate-report", "SimpleCertificateReport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.dss.simplecertificatereport.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlSimpleCertificateReport }
     * 
     */
    public XmlSimpleCertificateReport createXmlSimpleCertificateReport() {
        return new XmlSimpleCertificateReport();
    }

    /**
     * Create an instance of {@link XmlChainItem }
     * 
     */
    public XmlChainItem createXmlChainItem() {
        return new XmlChainItem();
    }

    /**
     * Create an instance of {@link XmlSubject }
     * 
     */
    public XmlSubject createXmlSubject() {
        return new XmlSubject();
    }

    /**
     * Create an instance of {@link XmlRevocation }
     * 
     */
    public XmlRevocation createXmlRevocation() {
        return new XmlRevocation();
    }

    /**
     * Create an instance of {@link XmlTrustAnchor }
     * 
     */
    public XmlTrustAnchor createXmlTrustAnchor() {
        return new XmlTrustAnchor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlSimpleCertificateReport }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XmlSimpleCertificateReport }{@code >}
     */
    @XmlElementDecl(namespace = "http://dss.esig.europa.eu/validation/simple-certificate-report", name = "SimpleCertificateReport")
    public JAXBElement<XmlSimpleCertificateReport> createSimpleCertificateReport(XmlSimpleCertificateReport value) {
        return new JAXBElement<XmlSimpleCertificateReport>(_SimpleCertificateReport_QNAME, XmlSimpleCertificateReport.class, null, value);
    }

}
