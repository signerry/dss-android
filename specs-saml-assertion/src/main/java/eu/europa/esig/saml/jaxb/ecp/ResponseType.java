
package eu.europa.esig.saml.jaxb.ecp;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.saml.jaxb.assertion.runtime.ZeroOneBooleanAdapter;


/**
 * &lt;p&gt;Java class for ResponseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}mustUnderstand use="required""/&amp;gt;
 *       &amp;lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}actor use="required""/&amp;gt;
 *       &amp;lt;attribute name="AssertionConsumerServiceURL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType")
public class ResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "mustUnderstand", namespace = "http://schemas.xmlsoap.org/soap/envelope/", required = true)
    @XmlJavaTypeAdapter(ZeroOneBooleanAdapter.class)
    protected Boolean mustUnderstand;
    @XmlAttribute(name = "actor", namespace = "http://schemas.xmlsoap.org/soap/envelope/", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String actor;
    @XmlAttribute(name = "AssertionConsumerServiceURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String assertionConsumerServiceURL;

    /**
     * Gets the value of the mustUnderstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isMustUnderstand() {
        return mustUnderstand;
    }

    /**
     * Sets the value of the mustUnderstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMustUnderstand(Boolean value) {
        this.mustUnderstand = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActor(String value) {
        this.actor = value;
    }

    /**
     * Gets the value of the assertionConsumerServiceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssertionConsumerServiceURL() {
        return assertionConsumerServiceURL;
    }

    /**
     * Sets the value of the assertionConsumerServiceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssertionConsumerServiceURL(String value) {
        this.assertionConsumerServiceURL = value;
    }

}
