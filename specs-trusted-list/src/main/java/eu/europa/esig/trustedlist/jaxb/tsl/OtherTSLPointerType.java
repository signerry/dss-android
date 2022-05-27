
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OtherTSLPointerType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OtherTSLPointerType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceDigitalIdentities" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TSLLocation" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIType"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}AdditionalInformation" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTSLPointerType", propOrder = {
    "serviceDigitalIdentities",
    "tslLocation",
    "additionalInformation"
})
public class OtherTSLPointerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceDigitalIdentities")
    protected ServiceDigitalIdentityListType serviceDigitalIdentities;
    @XmlElement(name = "TSLLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tslLocation;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInformationType additionalInformation;

    /**
     * Gets the value of the serviceDigitalIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDigitalIdentityListType }
     *     
     */
    public ServiceDigitalIdentityListType getServiceDigitalIdentities() {
        return serviceDigitalIdentities;
    }

    /**
     * Sets the value of the serviceDigitalIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDigitalIdentityListType }
     *     
     */
    public void setServiceDigitalIdentities(ServiceDigitalIdentityListType value) {
        this.serviceDigitalIdentities = value;
    }

    /**
     * Gets the value of the tslLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLLocation() {
        return tslLocation;
    }

    /**
     * Sets the value of the tslLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLLocation(String value) {
        this.tslLocation = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

}
