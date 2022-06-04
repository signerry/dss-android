
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrivateKeyProtectionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PrivateKeyProtectionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}KeyActivation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}KeyStorage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}KeySharing" minOccurs="0"/&amp;gt;
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
@XmlType(name = "PrivateKeyProtectionType", propOrder = {
    "keyActivation",
    "keyStorage",
    "keySharing",
    "extension"
})
public class PrivateKeyProtectionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyActivation")
    protected KeyActivationType keyActivation;
    @XmlElement(name = "KeyStorage")
    protected KeyStorageType keyStorage;
    @XmlElement(name = "KeySharing")
    protected KeySharingType keySharing;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the keyActivation property.
     * 
     * @return
     *     possible object is
     *     {@link KeyActivationType }
     *     
     */
    public KeyActivationType getKeyActivation() {
        return keyActivation;
    }

    /**
     * Sets the value of the keyActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyActivationType }
     *     
     */
    public void setKeyActivation(KeyActivationType value) {
        this.keyActivation = value;
    }

    /**
     * Gets the value of the keyStorage property.
     * 
     * @return
     *     possible object is
     *     {@link KeyStorageType }
     *     
     */
    public KeyStorageType getKeyStorage() {
        return keyStorage;
    }

    /**
     * Sets the value of the keyStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyStorageType }
     *     
     */
    public void setKeyStorage(KeyStorageType value) {
        this.keyStorage = value;
    }

    /**
     * Gets the value of the keySharing property.
     * 
     * @return
     *     possible object is
     *     {@link KeySharingType }
     *     
     */
    public KeySharingType getKeySharing() {
        return keySharing;
    }

    /**
     * Sets the value of the keySharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeySharingType }
     *     
     */
    public void setKeySharing(KeySharingType value) {
        this.keySharing = value;
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