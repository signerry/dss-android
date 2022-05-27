
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TechnicalProtectionBaseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TechnicalProtectionBaseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}PrivateKeyProtection"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}SecretKeyProtection"/&amp;gt;
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
@XmlType(name = "TechnicalProtectionBaseType", propOrder = {
    "privateKeyProtection",
    "secretKeyProtection",
    "extension"
})
public class TechnicalProtectionBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PrivateKeyProtection")
    protected PrivateKeyProtectionType privateKeyProtection;
    @XmlElement(name = "SecretKeyProtection")
    protected SecretKeyProtectionType secretKeyProtection;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the privateKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateKeyProtectionType }
     *     
     */
    public PrivateKeyProtectionType getPrivateKeyProtection() {
        return privateKeyProtection;
    }

    /**
     * Sets the value of the privateKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateKeyProtectionType }
     *     
     */
    public void setPrivateKeyProtection(PrivateKeyProtectionType value) {
        this.privateKeyProtection = value;
    }

    /**
     * Gets the value of the secretKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link SecretKeyProtectionType }
     *     
     */
    public SecretKeyProtectionType getSecretKeyProtection() {
        return secretKeyProtection;
    }

    /**
     * Sets the value of the secretKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecretKeyProtectionType }
     *     
     */
    public void setSecretKeyProtection(SecretKeyProtectionType value) {
        this.secretKeyProtection = value;
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
