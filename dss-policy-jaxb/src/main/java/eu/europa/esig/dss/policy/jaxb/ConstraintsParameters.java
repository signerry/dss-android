
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Root element for the DSS validation policy : that allows to customize the validation process : add/remove a check and set its criticality.
 * 
 * &lt;p&gt;Java class for ConstraintsParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConstraintsParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ContainerConstraints" type="{http://dss.esig.europa.eu/validation/policy}ContainerConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}SignatureConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CounterSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}SignatureConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/policy}TimestampConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Revocation" type="{http://dss.esig.europa.eu/validation/policy}RevocationConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Model" type="{http://dss.esig.europa.eu/validation/policy}ModelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eIDAS" type="{http://dss.esig.europa.eu/validation/policy}eIDAS" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintsParameters", propOrder = {
    "description",
    "containerConstraints",
    "signatureConstraints",
    "counterSignatureConstraints",
    "timestamp",
    "revocation",
    "cryptographic",
    "model",
    "eidas"
})
public class ConstraintsParameters
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ContainerConstraints")
    protected ContainerConstraints containerConstraints;
    @XmlElement(name = "SignatureConstraints")
    protected SignatureConstraints signatureConstraints;
    @XmlElement(name = "CounterSignatureConstraints")
    protected SignatureConstraints counterSignatureConstraints;
    @XmlElement(name = "Timestamp")
    protected TimestampConstraints timestamp;
    @XmlElement(name = "Revocation")
    protected RevocationConstraints revocation;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;
    @XmlElement(name = "Model")
    protected ModelConstraint model;
    @XmlElement(name = "eIDAS")
    protected EIDAS eidas;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the containerConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerConstraints }
     *     
     */
    public ContainerConstraints getContainerConstraints() {
        return containerConstraints;
    }

    /**
     * Sets the value of the containerConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerConstraints }
     *     
     */
    public void setContainerConstraints(ContainerConstraints value) {
        this.containerConstraints = value;
    }

    /**
     * Gets the value of the signatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureConstraints }
     *     
     */
    public SignatureConstraints getSignatureConstraints() {
        return signatureConstraints;
    }

    /**
     * Sets the value of the signatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureConstraints }
     *     
     */
    public void setSignatureConstraints(SignatureConstraints value) {
        this.signatureConstraints = value;
    }

    /**
     * Gets the value of the counterSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureConstraints }
     *     
     */
    public SignatureConstraints getCounterSignatureConstraints() {
        return counterSignatureConstraints;
    }

    /**
     * Sets the value of the counterSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureConstraints }
     *     
     */
    public void setCounterSignatureConstraints(SignatureConstraints value) {
        this.counterSignatureConstraints = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link TimestampConstraints }
     *     
     */
    public TimestampConstraints getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampConstraints }
     *     
     */
    public void setTimestamp(TimestampConstraints value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the revocation property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationConstraints }
     *     
     */
    public RevocationConstraints getRevocation() {
        return revocation;
    }

    /**
     * Sets the value of the revocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationConstraints }
     *     
     */
    public void setRevocation(RevocationConstraints value) {
        this.revocation = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link ModelConstraint }
     *     
     */
    public ModelConstraint getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelConstraint }
     *     
     */
    public void setModel(ModelConstraint value) {
        this.model = value;
    }

    /**
     * Gets the value of the eidas property.
     * 
     * @return
     *     possible object is
     *     {@link EIDAS }
     *     
     */
    public EIDAS getEIDAS() {
        return eidas;
    }

    /**
     * Sets the value of the eidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDAS }
     *     
     */
    public void setEIDAS(EIDAS value) {
        this.eidas = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}