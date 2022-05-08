
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GoverningAgreementRefType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GoverningAgreementRefType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="governingAgreementRef" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoverningAgreementRefType")
public class GoverningAgreementRefType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "governingAgreementRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String governingAgreementRef;

    /**
     * Gets the value of the governingAgreementRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoverningAgreementRef() {
        return governingAgreementRef;
    }

    /**
     * Sets the value of the governingAgreementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoverningAgreementRef(String value) {
        this.governingAgreementRef = value;
    }

}
