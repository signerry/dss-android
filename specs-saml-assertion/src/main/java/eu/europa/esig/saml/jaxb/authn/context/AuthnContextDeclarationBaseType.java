
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for AuthnContextDeclarationBaseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuthnContextDeclarationBaseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Identification" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}TechnicalProtection" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}OperationalProtection" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}AuthnMethod" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}GoverningAgreements" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnContextDeclarationBaseType", propOrder = {
    "identification",
    "technicalProtection",
    "operationalProtection",
    "authnMethod",
    "governingAgreements",
    "extension"
})
public class AuthnContextDeclarationBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Identification")
    protected IdentificationType identification;
    @XmlElement(name = "TechnicalProtection")
    protected TechnicalProtectionBaseType technicalProtection;
    @XmlElement(name = "OperationalProtection")
    protected OperationalProtectionType operationalProtection;
    @XmlElement(name = "AuthnMethod")
    protected AuthnMethodBaseType authnMethod;
    @XmlElement(name = "GoverningAgreements")
    protected GoverningAgreementsType governingAgreements;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setIdentification(IdentificationType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the technicalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalProtectionBaseType }
     *     
     */
    public TechnicalProtectionBaseType getTechnicalProtection() {
        return technicalProtection;
    }

    /**
     * Sets the value of the technicalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalProtectionBaseType }
     *     
     */
    public void setTechnicalProtection(TechnicalProtectionBaseType value) {
        this.technicalProtection = value;
    }

    /**
     * Gets the value of the operationalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalProtectionType }
     *     
     */
    public OperationalProtectionType getOperationalProtection() {
        return operationalProtection;
    }

    /**
     * Sets the value of the operationalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalProtectionType }
     *     
     */
    public void setOperationalProtection(OperationalProtectionType value) {
        this.operationalProtection = value;
    }

    /**
     * Gets the value of the authnMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AuthnMethodBaseType }
     *     
     */
    public AuthnMethodBaseType getAuthnMethod() {
        return authnMethod;
    }

    /**
     * Sets the value of the authnMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthnMethodBaseType }
     *     
     */
    public void setAuthnMethod(AuthnMethodBaseType value) {
        this.authnMethod = value;
    }

    /**
     * Gets the value of the governingAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningAgreementsType }
     *     
     */
    public GoverningAgreementsType getGoverningAgreements() {
        return governingAgreements;
    }

    /**
     * Sets the value of the governingAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningAgreementsType }
     *     
     */
    public void setGoverningAgreements(GoverningAgreementsType value) {
        this.governingAgreements = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
