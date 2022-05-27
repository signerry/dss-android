
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group of constraints on the timestamps
 * 
 * &lt;p&gt;Java class for TimestampConstraints complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimestampConstraints"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TimestampDelay" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationTimeAgainstBestSignatureTime" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BestSignatureTimeBeforeExpirationDateOfSigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Coherence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignedAttributes" type="{http://dss.esig.europa.eu/validation/policy}SignedAttributesConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TSAGeneralNamePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TSAGeneralNameContentMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TSAGeneralNameOrderMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampConstraints", propOrder = {
    "timestampDelay",
    "revocationTimeAgainstBestSignatureTime",
    "bestSignatureTimeBeforeExpirationDateOfSigningCertificate",
    "coherence",
    "basicSignatureConstraints",
    "signedAttributes",
    "tsaGeneralNamePresent",
    "tsaGeneralNameContentMatch",
    "tsaGeneralNameOrderMatch"
})
public class TimestampConstraints
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TimestampDelay")
    protected TimeConstraint timestampDelay;
    @XmlElement(name = "RevocationTimeAgainstBestSignatureTime")
    protected LevelConstraint revocationTimeAgainstBestSignatureTime;
    @XmlElement(name = "BestSignatureTimeBeforeExpirationDateOfSigningCertificate")
    protected LevelConstraint bestSignatureTimeBeforeExpirationDateOfSigningCertificate;
    @XmlElement(name = "Coherence")
    protected LevelConstraint coherence;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;
    @XmlElement(name = "SignedAttributes")
    protected SignedAttributesConstraints signedAttributes;
    @XmlElement(name = "TSAGeneralNamePresent")
    protected LevelConstraint tsaGeneralNamePresent;
    @XmlElement(name = "TSAGeneralNameContentMatch")
    protected LevelConstraint tsaGeneralNameContentMatch;
    @XmlElement(name = "TSAGeneralNameOrderMatch")
    protected LevelConstraint tsaGeneralNameOrderMatch;

    /**
     * Gets the value of the timestampDelay property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getTimestampDelay() {
        return timestampDelay;
    }

    /**
     * Sets the value of the timestampDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setTimestampDelay(TimeConstraint value) {
        this.timestampDelay = value;
    }

    /**
     * Gets the value of the revocationTimeAgainstBestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationTimeAgainstBestSignatureTime() {
        return revocationTimeAgainstBestSignatureTime;
    }

    /**
     * Sets the value of the revocationTimeAgainstBestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationTimeAgainstBestSignatureTime(LevelConstraint value) {
        this.revocationTimeAgainstBestSignatureTime = value;
    }

    /**
     * Gets the value of the bestSignatureTimeBeforeExpirationDateOfSigningCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getBestSignatureTimeBeforeExpirationDateOfSigningCertificate() {
        return bestSignatureTimeBeforeExpirationDateOfSigningCertificate;
    }

    /**
     * Sets the value of the bestSignatureTimeBeforeExpirationDateOfSigningCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setBestSignatureTimeBeforeExpirationDateOfSigningCertificate(LevelConstraint value) {
        this.bestSignatureTimeBeforeExpirationDateOfSigningCertificate = value;
    }

    /**
     * Gets the value of the coherence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getCoherence() {
        return coherence;
    }

    /**
     * Sets the value of the coherence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setCoherence(LevelConstraint value) {
        this.coherence = value;
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
     * Gets the value of the tsaGeneralNamePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTSAGeneralNamePresent() {
        return tsaGeneralNamePresent;
    }

    /**
     * Sets the value of the tsaGeneralNamePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTSAGeneralNamePresent(LevelConstraint value) {
        this.tsaGeneralNamePresent = value;
    }

    /**
     * Gets the value of the tsaGeneralNameContentMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTSAGeneralNameContentMatch() {
        return tsaGeneralNameContentMatch;
    }

    /**
     * Sets the value of the tsaGeneralNameContentMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTSAGeneralNameContentMatch(LevelConstraint value) {
        this.tsaGeneralNameContentMatch = value;
    }

    /**
     * Gets the value of the tsaGeneralNameOrderMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTSAGeneralNameOrderMatch() {
        return tsaGeneralNameOrderMatch;
    }

    /**
     * Sets the value of the tsaGeneralNameOrderMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTSAGeneralNameOrderMatch(LevelConstraint value) {
        this.tsaGeneralNameOrderMatch = value;
    }

}
