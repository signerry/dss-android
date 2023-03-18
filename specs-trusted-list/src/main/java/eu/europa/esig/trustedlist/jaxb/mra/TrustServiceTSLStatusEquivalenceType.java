//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:13:44 AM EET 
//


package eu.europa.esig.trustedlist.jaxb.mra;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustServiceTSLStatusEquivalenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustServiceTSLStatusEquivalenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrustServiceTSLStatusListPointingParty" type="{http://ec.europa.eu/tools/lotl/mra/schema/v2#}TrustServiceTSLStatusList"/&gt;
 *         &lt;element name="TrustServiceTSLStatusListPointedParty" type="{http://ec.europa.eu/tools/lotl/mra/schema/v2#}TrustServiceTSLStatusList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustServiceTSLStatusEquivalenceType", propOrder = {
    "trustServiceTSLStatusListPointingParty",
    "trustServiceTSLStatusListPointedParty"
})
public class TrustServiceTSLStatusEquivalenceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrustServiceTSLStatusListPointingParty", required = true)
    protected TrustServiceTSLStatusList trustServiceTSLStatusListPointingParty;
    @XmlElement(name = "TrustServiceTSLStatusListPointedParty", required = true)
    protected TrustServiceTSLStatusList trustServiceTSLStatusListPointedParty;

    /**
     * Gets the value of the trustServiceTSLStatusListPointingParty property.
     * 
     * @return
     *     possible object is
     *     {@link TrustServiceTSLStatusList }
     *     
     */
    public TrustServiceTSLStatusList getTrustServiceTSLStatusListPointingParty() {
        return trustServiceTSLStatusListPointingParty;
    }

    /**
     * Sets the value of the trustServiceTSLStatusListPointingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustServiceTSLStatusList }
     *     
     */
    public void setTrustServiceTSLStatusListPointingParty(TrustServiceTSLStatusList value) {
        this.trustServiceTSLStatusListPointingParty = value;
    }

    /**
     * Gets the value of the trustServiceTSLStatusListPointedParty property.
     * 
     * @return
     *     possible object is
     *     {@link TrustServiceTSLStatusList }
     *     
     */
    public TrustServiceTSLStatusList getTrustServiceTSLStatusListPointedParty() {
        return trustServiceTSLStatusListPointedParty;
    }

    /**
     * Sets the value of the trustServiceTSLStatusListPointedParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustServiceTSLStatusList }
     *     
     */
    public void setTrustServiceTSLStatusListPointedParty(TrustServiceTSLStatusList value) {
        this.trustServiceTSLStatusListPointedParty = value;
    }

}