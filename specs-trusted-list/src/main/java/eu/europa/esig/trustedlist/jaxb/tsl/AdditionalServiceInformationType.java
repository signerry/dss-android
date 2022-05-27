
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AdditionalServiceInformationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AdditionalServiceInformationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="URI" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType"/&amp;gt;
 *         &amp;lt;element name="InformationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OtherInformation" type="{http://uri.etsi.org/02231/v2#}AnyType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceInformationType", propOrder = {
    "uri",
    "informationValue",
    "otherInformation"
})
public class AdditionalServiceInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "URI", required = true)
    protected NonEmptyMultiLangURIType uri;
    @XmlElement(name = "InformationValue")
    protected String informationValue;
    @XmlElement(name = "OtherInformation")
    protected AnyType otherInformation;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public NonEmptyMultiLangURIType getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public void setURI(NonEmptyMultiLangURIType value) {
        this.uri = value;
    }

    /**
     * Gets the value of the informationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationValue() {
        return informationValue;
    }

    /**
     * Sets the value of the informationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationValue(String value) {
        this.informationValue = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOtherInformation(AnyType value) {
        this.otherInformation = value;
    }

}
