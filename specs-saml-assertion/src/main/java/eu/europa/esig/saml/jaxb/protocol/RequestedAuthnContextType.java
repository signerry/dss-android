
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RequestedAuthnContextType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RequestedAuthnContextType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AuthnContextClassRef" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AuthnContextDeclRef" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="Comparison" type="{urn:oasis:names:tc:SAML:2.0:protocol}AuthnContextComparisonType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedAuthnContextType", propOrder = {
    "authnContextClassRef",
    "authnContextDeclRef"
})
public class RequestedAuthnContextType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AuthnContextClassRef", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    @XmlSchemaType(name = "anyURI")
    protected List<String> authnContextClassRef;
    @XmlElement(name = "AuthnContextDeclRef", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    @XmlSchemaType(name = "anyURI")
    protected List<String> authnContextDeclRef;
    @XmlAttribute(name = "Comparison")
    protected AuthnContextComparisonType comparison;

    /**
     * Gets the value of the authnContextClassRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the authnContextClassRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAuthnContextClassRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuthnContextClassRef() {
        if (authnContextClassRef == null) {
            authnContextClassRef = new ArrayList<String>();
        }
        return this.authnContextClassRef;
    }

    /**
     * Gets the value of the authnContextDeclRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the authnContextDeclRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAuthnContextDeclRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAuthnContextDeclRef() {
        if (authnContextDeclRef == null) {
            authnContextDeclRef = new ArrayList<String>();
        }
        return this.authnContextDeclRef;
    }

    /**
     * Gets the value of the comparison property.
     * 
     * @return
     *     possible object is
     *     {@link AuthnContextComparisonType }
     *     
     */
    public AuthnContextComparisonType getComparison() {
        return comparison;
    }

    /**
     * Sets the value of the comparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthnContextComparisonType }
     *     
     */
    public void setComparison(AuthnContextComparisonType value) {
        this.comparison = value;
    }

}
