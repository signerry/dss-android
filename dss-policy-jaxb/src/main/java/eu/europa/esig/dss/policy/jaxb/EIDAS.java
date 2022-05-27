
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group of checks related to Trusted Lists
 * 
 * &lt;p&gt;Java class for eIDAS complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="eIDAS"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TLFreshness" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TLNotExpired" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TLWellSigned" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TLVersion" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eIDAS", propOrder = {
    "tlFreshness",
    "tlNotExpired",
    "tlWellSigned",
    "tlVersion"
})
public class EIDAS
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TLFreshness")
    protected TimeConstraint tlFreshness;
    @XmlElement(name = "TLNotExpired")
    protected LevelConstraint tlNotExpired;
    @XmlElement(name = "TLWellSigned")
    protected LevelConstraint tlWellSigned;
    @XmlElement(name = "TLVersion")
    protected ValueConstraint tlVersion;

    /**
     * Gets the value of the tlFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getTLFreshness() {
        return tlFreshness;
    }

    /**
     * Sets the value of the tlFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setTLFreshness(TimeConstraint value) {
        this.tlFreshness = value;
    }

    /**
     * Gets the value of the tlNotExpired property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTLNotExpired() {
        return tlNotExpired;
    }

    /**
     * Sets the value of the tlNotExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTLNotExpired(LevelConstraint value) {
        this.tlNotExpired = value;
    }

    /**
     * Gets the value of the tlWellSigned property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getTLWellSigned() {
        return tlWellSigned;
    }

    /**
     * Sets the value of the tlWellSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setTLWellSigned(LevelConstraint value) {
        this.tlWellSigned = value;
    }

    /**
     * Gets the value of the tlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getTLVersion() {
        return tlVersion;
    }

    /**
     * Sets the value of the tlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setTLVersion(ValueConstraint value) {
        this.tlVersion = value;
    }

}
