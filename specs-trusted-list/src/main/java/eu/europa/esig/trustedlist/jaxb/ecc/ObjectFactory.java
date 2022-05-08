
package eu.europa.esig.trustedlist.jaxb.ecc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.trustedlist.jaxb.ecc package. 
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

    private final static QName _Qualifications_QNAME = new QName("http://uri.etsi.org/TrstSvc/SvcInfoExt/eSigDir-1999-93-EC-TrustedList/#", "Qualifications");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.trustedlist.jaxb.ecc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualificationsType }
     * 
     */
    public QualificationsType createQualificationsType() {
        return new QualificationsType();
    }

    /**
     * Create an instance of {@link QualificationElementType }
     * 
     */
    public QualificationElementType createQualificationElementType() {
        return new QualificationElementType();
    }

    /**
     * Create an instance of {@link CriteriaListType }
     * 
     */
    public CriteriaListType createCriteriaListType() {
        return new CriteriaListType();
    }

    /**
     * Create an instance of {@link QualifiersType }
     * 
     */
    public QualifiersType createQualifiersType() {
        return new QualifiersType();
    }

    /**
     * Create an instance of {@link QualifierType }
     * 
     */
    public QualifierType createQualifierType() {
        return new QualifierType();
    }

    /**
     * Create an instance of {@link PoliciesListType }
     * 
     */
    public PoliciesListType createPoliciesListType() {
        return new PoliciesListType();
    }

    /**
     * Create an instance of {@link KeyUsageType }
     * 
     */
    public KeyUsageType createKeyUsageType() {
        return new KeyUsageType();
    }

    /**
     * Create an instance of {@link KeyUsageBitType }
     * 
     */
    public KeyUsageBitType createKeyUsageBitType() {
        return new KeyUsageBitType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QualificationsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/TrstSvc/SvcInfoExt/eSigDir-1999-93-EC-TrustedList/#", name = "Qualifications")
    public JAXBElement<QualificationsType> createQualifications(QualificationsType value) {
        return new JAXBElement<QualificationsType>(_Qualifications_QNAME, QualificationsType.class, null, value);
    }

}
