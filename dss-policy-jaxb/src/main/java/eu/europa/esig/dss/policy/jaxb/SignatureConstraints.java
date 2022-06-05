
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of constraints for the signature(s) (signed/unsigned properties, coverage,...)
 * 
 * &lt;p&gt;Java class for SignatureConstraints complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureConstraints"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="StructuralValidation" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AcceptablePolicies" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PolicyAvailable" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignaturePolicyStorePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PolicyHashMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AcceptableFormats" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FullScope" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignedAttributes" type="{http://dss.esig.europa.eu/validation/policy}SignedAttributesConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UnsignedAttributes" type="{http://dss.esig.europa.eu/validation/policy}UnsignedAttributesConstraints" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureConstraints", propOrder = {
    "structuralValidation",
    "acceptablePolicies",
    "policyAvailable",
    "signaturePolicyStorePresent",
    "policyHashMatch",
    "acceptableFormats",
    "fullScope",
    "basicSignatureConstraints",
    "signedAttributes",
    "unsignedAttributes"
})
public class SignatureConstraints
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StructuralValidation")
    protected LevelConstraint structuralValidation;
    @XmlElement(name = "AcceptablePolicies")
    protected MultiValuesConstraint acceptablePolicies;
    @XmlElement(name = "PolicyAvailable")
    protected LevelConstraint policyAvailable;
    @XmlElement(name = "SignaturePolicyStorePresent")
    protected LevelConstraint signaturePolicyStorePresent;
    @XmlElement(name = "PolicyHashMatch")
    protected LevelConstraint policyHashMatch;
    @XmlElement(name = "AcceptableFormats")
    protected MultiValuesConstraint acceptableFormats;
    @XmlElement(name = "FullScope")
    protected LevelConstraint fullScope;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;
    @XmlElement(name = "SignedAttributes")
    protected SignedAttributesConstraints signedAttributes;
    @XmlElement(name = "UnsignedAttributes")
    protected UnsignedAttributesConstraints unsignedAttributes;

    /**
     * Gets the value of the structuralValidation property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getStructuralValidation() {
        return structuralValidation;
    }

    /**
     * Sets the value of the structuralValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setStructuralValidation(LevelConstraint value) {
        this.structuralValidation = value;
    }

    /**
     * Gets the value of the acceptablePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getAcceptablePolicies() {
        return acceptablePolicies;
    }

    /**
     * Sets the value of the acceptablePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setAcceptablePolicies(MultiValuesConstraint value) {
        this.acceptablePolicies = value;
    }

    /**
     * Gets the value of the policyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPolicyAvailable() {
        return policyAvailable;
    }

    /**
     * Sets the value of the policyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPolicyAvailable(LevelConstraint value) {
        this.policyAvailable = value;
    }

    /**
     * Gets the value of the signaturePolicyStorePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignaturePolicyStorePresent() {
        return signaturePolicyStorePresent;
    }

    /**
     * Sets the value of the signaturePolicyStorePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignaturePolicyStorePresent(LevelConstraint value) {
        this.signaturePolicyStorePresent = value;
    }

    /**
     * Gets the value of the policyHashMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPolicyHashMatch() {
        return policyHashMatch;
    }

    /**
     * Sets the value of the policyHashMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPolicyHashMatch(LevelConstraint value) {
        this.policyHashMatch = value;
    }

    /**
     * Gets the value of the acceptableFormats property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getAcceptableFormats() {
        return acceptableFormats;
    }

    /**
     * Sets the value of the acceptableFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setAcceptableFormats(MultiValuesConstraint value) {
        this.acceptableFormats = value;
    }

    /**
     * Gets the value of the fullScope property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getFullScope() {
        return fullScope;
    }

    /**
     * Sets the value of the fullScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setFullScope(LevelConstraint value) {
        this.fullScope = value;
    }

    /**
     * Gets the value of the basicSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public BasicSignatureConstraints getBasicSignatureConstraints() {
        return basicSignatureConstraints;
    }

    /**
     * Sets the value of the basicSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public void setBasicSignatureConstraints(BasicSignatureConstraints value) {
        this.basicSignatureConstraints = value;
    }

    /**
     * Gets the value of the signedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public SignedAttributesConstraints getSignedAttributes() {
        return signedAttributes;
    }

    /**
     * Sets the value of the signedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAttributesConstraints }
     *     
     */
    public void setSignedAttributes(SignedAttributesConstraints value) {
        this.signedAttributes = value;
    }

    /**
     * Gets the value of the unsignedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public UnsignedAttributesConstraints getUnsignedAttributes() {
        return unsignedAttributes;
    }

    /**
     * Sets the value of the unsignedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedAttributesConstraints }
     *     
     */
    public void setUnsignedAttributes(UnsignedAttributesConstraints value) {
        this.unsignedAttributes = value;
    }

}
