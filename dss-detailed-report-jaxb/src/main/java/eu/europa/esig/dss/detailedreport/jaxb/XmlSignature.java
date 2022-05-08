
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Signature complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Signature"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationProcessBasicSignature" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessBasicSignature" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/detailed-report}Timestamp" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationProcessLongTermData" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessLongTermData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationProcessArchivalData" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationProcessArchivalData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationSignatureQualification" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationSignatureQualification" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Conclusion" type="{http://dss.esig.europa.eu/validation/detailed-report}Conclusion"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="CounterSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "validationProcessBasicSignature",
    "timestamps",
    "validationProcessLongTermData",
    "validationProcessArchivalData",
    "validationSignatureQualification",
    "conclusion"
})
public class XmlSignature implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationProcessBasicSignature")
    protected XmlValidationProcessBasicSignature validationProcessBasicSignature;
    @XmlElement(name = "Timestamp")
    protected List<XmlTimestamp> timestamps;
    @XmlElement(name = "ValidationProcessLongTermData")
    protected XmlValidationProcessLongTermData validationProcessLongTermData;
    @XmlElement(name = "ValidationProcessArchivalData")
    protected XmlValidationProcessArchivalData validationProcessArchivalData;
    @XmlElement(name = "ValidationSignatureQualification")
    protected XmlValidationSignatureQualification validationSignatureQualification;
    @XmlElement(name = "Conclusion", required = true)
    protected XmlConclusion conclusion;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "CounterSignature")
    protected Boolean counterSignature;

    /**
     * Gets the value of the validationProcessBasicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessBasicSignature }
     *     
     */
    public XmlValidationProcessBasicSignature getValidationProcessBasicSignature() {
        return validationProcessBasicSignature;
    }

    /**
     * Sets the value of the validationProcessBasicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessBasicSignature }
     *     
     */
    public void setValidationProcessBasicSignature(XmlValidationProcessBasicSignature value) {
        this.validationProcessBasicSignature = value;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the timestamps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTimestamps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlTimestamp }
     * 
     * 
     */
    public List<XmlTimestamp> getTimestamps() {
        if (timestamps == null) {
            timestamps = new ArrayList<XmlTimestamp>();
        }
        return this.timestamps;
    }

    /**
     * Gets the value of the validationProcessLongTermData property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessLongTermData }
     *     
     */
    public XmlValidationProcessLongTermData getValidationProcessLongTermData() {
        return validationProcessLongTermData;
    }

    /**
     * Sets the value of the validationProcessLongTermData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessLongTermData }
     *     
     */
    public void setValidationProcessLongTermData(XmlValidationProcessLongTermData value) {
        this.validationProcessLongTermData = value;
    }

    /**
     * Gets the value of the validationProcessArchivalData property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationProcessArchivalData }
     *     
     */
    public XmlValidationProcessArchivalData getValidationProcessArchivalData() {
        return validationProcessArchivalData;
    }

    /**
     * Sets the value of the validationProcessArchivalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationProcessArchivalData }
     *     
     */
    public void setValidationProcessArchivalData(XmlValidationProcessArchivalData value) {
        this.validationProcessArchivalData = value;
    }

    /**
     * Gets the value of the validationSignatureQualification property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationSignatureQualification }
     *     
     */
    public XmlValidationSignatureQualification getValidationSignatureQualification() {
        return validationSignatureQualification;
    }

    /**
     * Sets the value of the validationSignatureQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationSignatureQualification }
     *     
     */
    public void setValidationSignatureQualification(XmlValidationSignatureQualification value) {
        this.validationSignatureQualification = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link XmlConclusion }
     *     
     */
    public XmlConclusion getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlConclusion }
     *     
     */
    public void setConclusion(XmlConclusion value) {
        this.conclusion = value;
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

    /**
     * Gets the value of the counterSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSignature() {
        return counterSignature;
    }

    /**
     * Sets the value of the counterSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSignature(Boolean value) {
        this.counterSignature = value;
    }

}
