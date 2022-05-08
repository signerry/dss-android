
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrincipalAuthenticationMechanismType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PrincipalAuthenticationMechanismType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Password" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}RestrictedPassword" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Token" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Smartcard" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ActivationPin" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="preauth" type="{http://www.w3.org/2001/XMLSchema}integer" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAuthenticationMechanismType", propOrder = {
    "password",
    "restrictedPassword",
    "token",
    "smartcard",
    "activationPin",
    "extension"
})
public class PrincipalAuthenticationMechanismType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Password")
    protected PasswordType password;
    @XmlElement(name = "RestrictedPassword")
    protected RestrictedPasswordType restrictedPassword;
    @XmlElement(name = "Token")
    protected TokenType token;
    @XmlElement(name = "Smartcard")
    protected ExtensionOnlyType smartcard;
    @XmlElement(name = "ActivationPin")
    protected ActivationPinType activationPin;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "preauth")
    protected BigInteger preauth;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordType }
     *     
     */
    public PasswordType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordType }
     *     
     */
    public void setPassword(PasswordType value) {
        this.password = value;
    }

    /**
     * Gets the value of the restrictedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedPasswordType }
     *     
     */
    public RestrictedPasswordType getRestrictedPassword() {
        return restrictedPassword;
    }

    /**
     * Sets the value of the restrictedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedPasswordType }
     *     
     */
    public void setRestrictedPassword(RestrictedPasswordType value) {
        this.restrictedPassword = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link TokenType }
     *     
     */
    public TokenType getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenType }
     *     
     */
    public void setToken(TokenType value) {
        this.token = value;
    }

    /**
     * Gets the value of the smartcard property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getSmartcard() {
        return smartcard;
    }

    /**
     * Sets the value of the smartcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setSmartcard(ExtensionOnlyType value) {
        this.smartcard = value;
    }

    /**
     * Gets the value of the activationPin property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPinType }
     *     
     */
    public ActivationPinType getActivationPin() {
        return activationPin;
    }

    /**
     * Sets the value of the activationPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPinType }
     *     
     */
    public void setActivationPin(ActivationPinType value) {
        this.activationPin = value;
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

    /**
     * Gets the value of the preauth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreauth() {
        return preauth;
    }

    /**
     * Sets the value of the preauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreauth(BigInteger value) {
        this.preauth = value;
    }

}
