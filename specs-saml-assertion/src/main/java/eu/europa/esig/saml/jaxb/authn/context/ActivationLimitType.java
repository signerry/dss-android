
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ActivationLimitType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivationLimitType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ActivationLimitDuration"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ActivationLimitUsages"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}ActivationLimitSession"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationLimitType", propOrder = {
    "activationLimitDuration",
    "activationLimitUsages",
    "activationLimitSession"
})
public class ActivationLimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ActivationLimitDuration")
    protected ActivationLimitDurationType activationLimitDuration;
    @XmlElement(name = "ActivationLimitUsages")
    protected ActivationLimitUsagesType activationLimitUsages;
    @XmlElement(name = "ActivationLimitSession")
    protected ActivationLimitSessionType activationLimitSession;

    /**
     * Gets the value of the activationLimitDuration property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLimitDurationType }
     *     
     */
    public ActivationLimitDurationType getActivationLimitDuration() {
        return activationLimitDuration;
    }

    /**
     * Sets the value of the activationLimitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLimitDurationType }
     *     
     */
    public void setActivationLimitDuration(ActivationLimitDurationType value) {
        this.activationLimitDuration = value;
    }

    /**
     * Gets the value of the activationLimitUsages property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLimitUsagesType }
     *     
     */
    public ActivationLimitUsagesType getActivationLimitUsages() {
        return activationLimitUsages;
    }

    /**
     * Sets the value of the activationLimitUsages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLimitUsagesType }
     *     
     */
    public void setActivationLimitUsages(ActivationLimitUsagesType value) {
        this.activationLimitUsages = value;
    }

    /**
     * Gets the value of the activationLimitSession property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationLimitSessionType }
     *     
     */
    public ActivationLimitSessionType getActivationLimitSession() {
        return activationLimitSession;
    }

    /**
     * Sets the value of the activationLimitSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationLimitSessionType }
     *     
     */
    public void setActivationLimitSession(ActivationLimitSessionType value) {
        this.activationLimitSession = value;
    }

}
