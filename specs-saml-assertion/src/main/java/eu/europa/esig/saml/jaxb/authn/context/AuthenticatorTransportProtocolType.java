
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthenticatorTransportProtocolType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuthenticatorTransportProtocolType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}HTTP"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}SSL"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}MobileNetworkNoEncryption"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}MobileNetworkRadioEncryption"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}MobileNetworkEndToEndEncryption"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}WTLS"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}IPSec"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}PSTN"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ISDN"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ADSL"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticatorTransportProtocolType", propOrder = {
    "http",
    "ssl",
    "mobileNetworkNoEncryption",
    "mobileNetworkRadioEncryption",
    "mobileNetworkEndToEndEncryption",
    "wtls",
    "ipSec",
    "pstn",
    "isdn",
    "adsl",
    "extension"
})
public class AuthenticatorTransportProtocolType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HTTP")
    protected ExtensionOnlyType http;
    @XmlElement(name = "SSL")
    protected ExtensionOnlyType ssl;
    @XmlElement(name = "MobileNetworkNoEncryption")
    protected ExtensionOnlyType mobileNetworkNoEncryption;
    @XmlElement(name = "MobileNetworkRadioEncryption")
    protected ExtensionOnlyType mobileNetworkRadioEncryption;
    @XmlElement(name = "MobileNetworkEndToEndEncryption")
    protected ExtensionOnlyType mobileNetworkEndToEndEncryption;
    @XmlElement(name = "WTLS")
    protected ExtensionOnlyType wtls;
    @XmlElement(name = "IPSec")
    protected ExtensionOnlyType ipSec;
    @XmlElement(name = "PSTN")
    protected ExtensionOnlyType pstn;
    @XmlElement(name = "ISDN")
    protected ExtensionOnlyType isdn;
    @XmlElement(name = "ADSL")
    protected ExtensionOnlyType adsl;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the http property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getHTTP() {
        return http;
    }

    /**
     * Sets the value of the http property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setHTTP(ExtensionOnlyType value) {
        this.http = value;
    }

    /**
     * Gets the value of the ssl property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getSSL() {
        return ssl;
    }

    /**
     * Sets the value of the ssl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setSSL(ExtensionOnlyType value) {
        this.ssl = value;
    }

    /**
     * Gets the value of the mobileNetworkNoEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getMobileNetworkNoEncryption() {
        return mobileNetworkNoEncryption;
    }

    /**
     * Sets the value of the mobileNetworkNoEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setMobileNetworkNoEncryption(ExtensionOnlyType value) {
        this.mobileNetworkNoEncryption = value;
    }

    /**
     * Gets the value of the mobileNetworkRadioEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getMobileNetworkRadioEncryption() {
        return mobileNetworkRadioEncryption;
    }

    /**
     * Sets the value of the mobileNetworkRadioEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setMobileNetworkRadioEncryption(ExtensionOnlyType value) {
        this.mobileNetworkRadioEncryption = value;
    }

    /**
     * Gets the value of the mobileNetworkEndToEndEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getMobileNetworkEndToEndEncryption() {
        return mobileNetworkEndToEndEncryption;
    }

    /**
     * Sets the value of the mobileNetworkEndToEndEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setMobileNetworkEndToEndEncryption(ExtensionOnlyType value) {
        this.mobileNetworkEndToEndEncryption = value;
    }

    /**
     * Gets the value of the wtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getWTLS() {
        return wtls;
    }

    /**
     * Sets the value of the wtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setWTLS(ExtensionOnlyType value) {
        this.wtls = value;
    }

    /**
     * Gets the value of the ipSec property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getIPSec() {
        return ipSec;
    }

    /**
     * Sets the value of the ipSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setIPSec(ExtensionOnlyType value) {
        this.ipSec = value;
    }

    /**
     * Gets the value of the pstn property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getPSTN() {
        return pstn;
    }

    /**
     * Sets the value of the pstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setPSTN(ExtensionOnlyType value) {
        this.pstn = value;
    }

    /**
     * Gets the value of the isdn property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getISDN() {
        return isdn;
    }

    /**
     * Sets the value of the isdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setISDN(ExtensionOnlyType value) {
        this.isdn = value;
    }

    /**
     * Gets the value of the adsl property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getADSL() {
        return adsl;
    }

    /**
     * Sets the value of the adsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setADSL(ExtensionOnlyType value) {
        this.adsl = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the extension property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExtension().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}