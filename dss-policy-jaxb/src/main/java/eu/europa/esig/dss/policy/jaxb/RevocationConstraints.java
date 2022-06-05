
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of constraints on the revocation data
 * 
 * &lt;p&gt;Java class for RevocationConstraints complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RevocationConstraints"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UnknownStatus" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OCSPCertHashPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OCSPCertHashMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SelfIssuedOCSP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationConstraints", propOrder = {
    "unknownStatus",
    "ocspCertHashPresent",
    "ocspCertHashMatch",
    "selfIssuedOCSP",
    "basicSignatureConstraints"
})
public class RevocationConstraints
    extends LevelConstraint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UnknownStatus")
    protected LevelConstraint unknownStatus;
    @XmlElement(name = "OCSPCertHashPresent")
    protected LevelConstraint ocspCertHashPresent;
    @XmlElement(name = "OCSPCertHashMatch")
    protected LevelConstraint ocspCertHashMatch;
    @XmlElement(name = "SelfIssuedOCSP")
    protected LevelConstraint selfIssuedOCSP;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;

    /**
     * Gets the value of the unknownStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUnknownStatus() {
        return unknownStatus;
    }

    /**
     * Sets the value of the unknownStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUnknownStatus(LevelConstraint value) {
        this.unknownStatus = value;
    }

    /**
     * Gets the value of the ocspCertHashPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getOCSPCertHashPresent() {
        return ocspCertHashPresent;
    }

    /**
     * Sets the value of the ocspCertHashPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setOCSPCertHashPresent(LevelConstraint value) {
        this.ocspCertHashPresent = value;
    }

    /**
     * Gets the value of the ocspCertHashMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getOCSPCertHashMatch() {
        return ocspCertHashMatch;
    }

    /**
     * Sets the value of the ocspCertHashMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setOCSPCertHashMatch(LevelConstraint value) {
        this.ocspCertHashMatch = value;
    }

    /**
     * Gets the value of the selfIssuedOCSP property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSelfIssuedOCSP() {
        return selfIssuedOCSP;
    }

    /**
     * Sets the value of the selfIssuedOCSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSelfIssuedOCSP(LevelConstraint value) {
        this.selfIssuedOCSP = value;
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

}
