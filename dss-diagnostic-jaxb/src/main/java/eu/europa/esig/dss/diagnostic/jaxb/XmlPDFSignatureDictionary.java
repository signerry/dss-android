
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PDFSignatureDictionary complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PDFSignatureDictionary"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SubFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureByteRange" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;list itemType="{http://www.w3.org/2001/XMLSchema}integer" /&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocMDP" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Permissions" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificationPermission"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FieldMDP" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFLockDictionary" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFSignatureDictionary", propOrder = {
    "signerName",
    "type",
    "filter",
    "subFilter",
    "contactInfo",
    "location",
    "reason",
    "signatureByteRange",
    "docMDP",
    "fieldMDP"
})
public class XmlPDFSignatureDictionary implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignerName")
    protected String signerName;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Filter")
    protected String filter;
    @XmlElement(name = "SubFilter")
    protected String subFilter;
    @XmlElement(name = "ContactInfo")
    protected String contactInfo;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlList
    @XmlElement(name = "SignatureByteRange")
    protected List<BigInteger> signatureByteRange;
    @XmlElement(name = "DocMDP")
    protected XmlDocMDP docMDP;
    @XmlElement(name = "FieldMDP")
    protected XmlPDFLockDictionary fieldMDP;

    /**
     * Gets the value of the signerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerName() {
        return signerName;
    }

    /**
     * Sets the value of the signerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerName(String value) {
        this.signerName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the subFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFilter() {
        return subFilter;
    }

    /**
     * Sets the value of the subFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFilter(String value) {
        this.subFilter = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the signatureByteRange property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureByteRange property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureByteRange().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSignatureByteRange() {
        if (signatureByteRange == null) {
            signatureByteRange = new ArrayList<BigInteger>();
        }
        return this.signatureByteRange;
    }

    /**
     * Gets the value of the docMDP property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDocMDP }
     *     
     */
    public XmlDocMDP getDocMDP() {
        return docMDP;
    }

    /**
     * Sets the value of the docMDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDocMDP }
     *     
     */
    public void setDocMDP(XmlDocMDP value) {
        this.docMDP = value;
    }

    /**
     * Gets the value of the fieldMDP property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPDFLockDictionary }
     *     
     */
    public XmlPDFLockDictionary getFieldMDP() {
        return fieldMDP;
    }

    /**
     * Sets the value of the fieldMDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPDFLockDictionary }
     *     
     */
    public void setFieldMDP(XmlPDFLockDictionary value) {
        this.fieldMDP = value;
    }

}
