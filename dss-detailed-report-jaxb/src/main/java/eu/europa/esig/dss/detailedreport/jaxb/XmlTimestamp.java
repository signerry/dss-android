
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Timestamp complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Timestamp"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationProcessTimestamp" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessTimestamp"/&amp;gt;
 *         &amp;lt;element name="ValidationTimestampQualification" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationTimestampQualification" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timestamp", propOrder = {
    "validationProcessTimestamp",
    "validationTimestampQualification"
})
public class XmlTimestamp implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationProcessTimestamp", required = true)
    protected XmlValidationProcessTimestamp validationProcessTimestamp;
    @XmlElement(name = "ValidationTimestampQualification")
    protected XmlValidationTimestampQualification validationTimestampQualification;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the validationProcessTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessTimestamp }
     *     
     */
    public XmlValidationProcessTimestamp getValidationProcessTimestamp() {
        return validationProcessTimestamp;
    }

    /**
     * Sets the value of the validationProcessTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessTimestamp }
     *     
     */
    public void setValidationProcessTimestamp(XmlValidationProcessTimestamp value) {
        this.validationProcessTimestamp = value;
    }

    /**
     * Gets the value of the validationTimestampQualification property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationTimestampQualification }
     *     
     */
    public XmlValidationTimestampQualification getValidationTimestampQualification() {
        return validationTimestampQualification;
    }

    /**
     * Sets the value of the validationTimestampQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationTimestampQualification }
     *     
     */
    public void setValidationTimestampQualification(XmlValidationTimestampQualification value) {
        this.validationTimestampQualification = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
