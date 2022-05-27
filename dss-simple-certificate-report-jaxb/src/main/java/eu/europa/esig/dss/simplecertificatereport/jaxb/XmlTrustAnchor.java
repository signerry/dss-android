
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TrustAnchor complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TrustAnchor"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="trustServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="trustServiceProviderRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="trustServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustAnchor", propOrder = {
    "countryCode",
    "trustServiceProvider",
    "trustServiceProviderRegistrationId",
    "trustServiceName"
})
public class XmlTrustAnchor implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(required = true)
    protected String trustServiceProvider;
    @XmlElement(required = true)
    protected String trustServiceProviderRegistrationId;
    @XmlElement(required = true)
    protected String trustServiceName;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the trustServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustServiceProvider() {
        return trustServiceProvider;
    }

    /**
     * Sets the value of the trustServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustServiceProvider(String value) {
        this.trustServiceProvider = value;
    }

    /**
     * Gets the value of the trustServiceProviderRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustServiceProviderRegistrationId() {
        return trustServiceProviderRegistrationId;
    }

    /**
     * Sets the value of the trustServiceProviderRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustServiceProviderRegistrationId(String value) {
        this.trustServiceProviderRegistrationId = value;
    }

    /**
     * Gets the value of the trustServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustServiceName() {
        return trustServiceName;
    }

    /**
     * Sets the value of the trustServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustServiceName(String value) {
        this.trustServiceName = value;
    }

}
