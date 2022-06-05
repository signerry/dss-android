
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TimeSyncTokenType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimeSyncTokenType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="DeviceType" use="required" type="{urn:oasis:names:tc:SAML:2.0:ac}DeviceTypeType" /&amp;gt;
 *       &amp;lt;attribute name="SeedLength" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&amp;gt;
 *       &amp;lt;attribute name="DeviceInHand" use="required" type="{urn:oasis:names:tc:SAML:2.0:ac}booleanType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSyncTokenType")
public class TimeSyncTokenType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "DeviceType", required = true)
    protected DeviceTypeType deviceType;
    @XmlAttribute(name = "SeedLength", required = true)
    protected BigInteger seedLength;
    @XmlAttribute(name = "DeviceInHand", required = true)
    protected BooleanType deviceInHand;

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTypeType }
     *     
     */
    public DeviceTypeType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTypeType }
     *     
     */
    public void setDeviceType(DeviceTypeType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the seedLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeedLength() {
        return seedLength;
    }

    /**
     * Sets the value of the seedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeedLength(BigInteger value) {
        this.seedLength = value;
    }

    /**
     * Gets the value of the deviceInHand property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getDeviceInHand() {
        return deviceInHand;
    }

    /**
     * Sets the value of the deviceInHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setDeviceInHand(BooleanType value) {
        this.deviceInHand = value;
    }

}
