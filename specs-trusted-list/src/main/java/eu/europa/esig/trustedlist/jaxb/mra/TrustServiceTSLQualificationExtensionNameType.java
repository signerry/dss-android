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
 * <p>Java class for TrustServiceTSLQualificationExtensionNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustServiceTSLQualificationExtensionNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrustServiceTSLQualificationExtensionNamePointingParty" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrustServiceTSLQualificationExtensionNamePointedParty" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustServiceTSLQualificationExtensionNameType", propOrder = {
    "trustServiceTSLQualificationExtensionNamePointingParty",
    "trustServiceTSLQualificationExtensionNamePointedParty"
})
public class TrustServiceTSLQualificationExtensionNameType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrustServiceTSLQualificationExtensionNamePointingParty", required = true)
    protected String trustServiceTSLQualificationExtensionNamePointingParty;
    @XmlElement(name = "TrustServiceTSLQualificationExtensionNamePointedParty", required = true)
    protected String trustServiceTSLQualificationExtensionNamePointedParty;

    /**
     * Gets the value of the trustServiceTSLQualificationExtensionNamePointingParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustServiceTSLQualificationExtensionNamePointingParty() {
        return trustServiceTSLQualificationExtensionNamePointingParty;
    }

    /**
     * Sets the value of the trustServiceTSLQualificationExtensionNamePointingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustServiceTSLQualificationExtensionNamePointingParty(String value) {
        this.trustServiceTSLQualificationExtensionNamePointingParty = value;
    }

    /**
     * Gets the value of the trustServiceTSLQualificationExtensionNamePointedParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustServiceTSLQualificationExtensionNamePointedParty() {
        return trustServiceTSLQualificationExtensionNamePointedParty;
    }

    /**
     * Sets the value of the trustServiceTSLQualificationExtensionNamePointedParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustServiceTSLQualificationExtensionNamePointedParty(String value) {
        this.trustServiceTSLQualificationExtensionNamePointedParty = value;
    }

}