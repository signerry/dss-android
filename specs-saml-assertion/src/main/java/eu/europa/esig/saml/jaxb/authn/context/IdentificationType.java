
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IdentificationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IdentificationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}PhysicalVerification" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}WrittenConsent" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}GoverningAgreements" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nym" type="{urn:oasis:names:tc:SAML:2.0:ac}nymType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "physicalVerification",
    "writtenConsent",
    "governingAgreements",
    "extension"
})
public class IdentificationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PhysicalVerification")
    protected PhysicalVerification physicalVerification;
    @XmlElement(name = "WrittenConsent")
    protected ExtensionOnlyType writtenConsent;
    @XmlElement(name = "GoverningAgreements")
    protected GoverningAgreementsType governingAgreements;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "nym")
    protected NymType nym;

    /**
     * Gets the value of the physicalVerification property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalVerification }
     *     
     */
    public PhysicalVerification getPhysicalVerification() {
        return physicalVerification;
    }

    /**
     * Sets the value of the physicalVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalVerification }
     *     
     */
    public void setPhysicalVerification(PhysicalVerification value) {
        this.physicalVerification = value;
    }

    /**
     * Gets the value of the writtenConsent property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getWrittenConsent() {
        return writtenConsent;
    }

    /**
     * Sets the value of the writtenConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setWrittenConsent(ExtensionOnlyType value) {
        this.writtenConsent = value;
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
     * Gets the value of the nym property.
     * 
     * @return
     *     possible object is
     *     {@link NymType }
     *     
     */
    public NymType getNym() {
        return nym;
    }

    /**
     * Sets the value of the nym property.
     * 
     * @param value
     *     allowed object is
     *     {@link NymType }
     *     
     */
    public void setNym(NymType value) {
        this.nym = value;
    }

}
