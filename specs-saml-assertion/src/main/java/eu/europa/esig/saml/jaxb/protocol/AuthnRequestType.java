
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import eu.europa.esig.saml.jaxb.assertion.ConditionsType;
import eu.europa.esig.saml.jaxb.assertion.SubjectType;


/**
 * &lt;p&gt;Java class for AuthnRequestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuthnRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}RequestAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Subject" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}NameIDPolicy" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Conditions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequestedAuthnContext" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}Scoping" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ForceAuthn" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="ProtocolBinding" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *       &amp;lt;attribute name="AssertionConsumerServiceIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&amp;gt;
 *       &amp;lt;attribute name="AssertionConsumerServiceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *       &amp;lt;attribute name="AttributeConsumingServiceIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" /&amp;gt;
 *       &amp;lt;attribute name="ProviderName" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnRequestType", propOrder = {
    "subject",
    "nameIDPolicy",
    "conditions",
    "requestedAuthnContext",
    "scoping"
})
public class AuthnRequestType
    extends RequestAbstractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Subject", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected SubjectType subject;
    @XmlElement(name = "NameIDPolicy")
    protected NameIDPolicyType nameIDPolicy;
    @XmlElement(name = "Conditions", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected ConditionsType conditions;
    @XmlElement(name = "RequestedAuthnContext")
    protected RequestedAuthnContextType requestedAuthnContext;
    @XmlElement(name = "Scoping")
    protected ScopingType scoping;
    @XmlAttribute(name = "ForceAuthn")
    protected Boolean forceAuthn;
    @XmlAttribute(name = "IsPassive")
    protected Boolean isPassive;
    @XmlAttribute(name = "ProtocolBinding")
    @XmlSchemaType(name = "anyURI")
    protected String protocolBinding;
    @XmlAttribute(name = "AssertionConsumerServiceIndex")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer assertionConsumerServiceIndex;
    @XmlAttribute(name = "AssertionConsumerServiceURL")
    @XmlSchemaType(name = "anyURI")
    protected String assertionConsumerServiceURL;
    @XmlAttribute(name = "AttributeConsumingServiceIndex")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer attributeConsumingServiceIndex;
    @XmlAttribute(name = "ProviderName")
    protected String providerName;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectType }
     *     
     */
    public SubjectType getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectType }
     *     
     */
    public void setSubject(SubjectType value) {
        this.subject = value;
    }

    /**
     * Gets the value of the nameIDPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link NameIDPolicyType }
     *     
     */
    public NameIDPolicyType getNameIDPolicy() {
        return nameIDPolicy;
    }

    /**
     * Sets the value of the nameIDPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIDPolicyType }
     *     
     */
    public void setNameIDPolicy(NameIDPolicyType value) {
        this.nameIDPolicy = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionsType }
     *     
     */
    public ConditionsType getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsType }
     *     
     */
    public void setConditions(ConditionsType value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the requestedAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public RequestedAuthnContextType getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    /**
     * Sets the value of the requestedAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public void setRequestedAuthnContext(RequestedAuthnContextType value) {
        this.requestedAuthnContext = value;
    }

    /**
     * Gets the value of the scoping property.
     * 
     * @return
     *     possible object is
     *     {@link ScopingType }
     *     
     */
    public ScopingType getScoping() {
        return scoping;
    }

    /**
     * Sets the value of the scoping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopingType }
     *     
     */
    public void setScoping(ScopingType value) {
        this.scoping = value;
    }

    /**
     * Gets the value of the forceAuthn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceAuthn() {
        return forceAuthn;
    }

    /**
     * Sets the value of the forceAuthn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceAuthn(Boolean value) {
        this.forceAuthn = value;
    }

    /**
     * Gets the value of the isPassive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPassive() {
        return isPassive;
    }

    /**
     * Sets the value of the isPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassive(Boolean value) {
        this.isPassive = value;
    }

    /**
     * Gets the value of the protocolBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolBinding() {
        return protocolBinding;
    }

    /**
     * Sets the value of the protocolBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolBinding(String value) {
        this.protocolBinding = value;
    }

    /**
     * Gets the value of the assertionConsumerServiceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssertionConsumerServiceIndex() {
        return assertionConsumerServiceIndex;
    }

    /**
     * Sets the value of the assertionConsumerServiceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssertionConsumerServiceIndex(Integer value) {
        this.assertionConsumerServiceIndex = value;
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

    /**
     * Gets the value of the attributeConsumingServiceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeConsumingServiceIndex() {
        return attributeConsumingServiceIndex;
    }

    /**
     * Sets the value of the attributeConsumingServiceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeConsumingServiceIndex(Integer value) {
        this.attributeConsumingServiceIndex = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

}
