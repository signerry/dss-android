
package eu.europa.esig.dss.simplereport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.ASiCContainerType;


/**
 * &lt;p&gt;Java class for SimpleReport complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SimpleReport"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationPolicy"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="PolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="PolicyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidSignaturesCount" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="SignaturesCount" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="ContainerType" type="{http://dss.esig.europa.eu/validation/simple-report}ContainerType" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element name="Signature" type="{http://dss.esig.europa.eu/validation/simple-report}Signature"/&amp;gt;
 *           &amp;lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/simple-report}Timestamp"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="Semantic" type="{http://dss.esig.europa.eu/validation/simple-report}Semantic" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ValidationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleReport", propOrder = {
    "validationPolicy",
    "documentName",
    "validSignaturesCount",
    "signaturesCount",
    "containerType",
    "signatureOrTimestamp",
    "semantic"
})
public class XmlSimpleReport
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationPolicy", required = true)
    protected XmlValidationPolicy validationPolicy;
    @XmlElement(name = "DocumentName")
    protected String documentName;
    @XmlElement(name = "ValidSignaturesCount")
    protected int validSignaturesCount;
    @XmlElement(name = "SignaturesCount")
    protected int signaturesCount;
    @XmlElement(name = "ContainerType", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected ASiCContainerType containerType;
    @XmlElements({
        @XmlElement(name = "Signature", type = XmlSignature.class),
        @XmlElement(name = "Timestamp", type = XmlTimestamp.class)
    })
    protected List<XmlToken> signatureOrTimestamp;
    @XmlElement(name = "Semantic")
    protected List<XmlSemantic> semantic;
    @XmlAttribute(name = "ValidationTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationTime;

    /**
     * Gets the value of the validationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidationPolicy }
     *     
     */
    public XmlValidationPolicy getValidationPolicy() {
        return validationPolicy;
    }

    /**
     * Sets the value of the validationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidationPolicy }
     *     
     */
    public void setValidationPolicy(XmlValidationPolicy value) {
        this.validationPolicy = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the validSignaturesCount property.
     * 
     */
    public int getValidSignaturesCount() {
        return validSignaturesCount;
    }

    /**
     * Sets the value of the validSignaturesCount property.
     * 
     */
    public void setValidSignaturesCount(int value) {
        this.validSignaturesCount = value;
    }

    /**
     * Gets the value of the signaturesCount property.
     * 
     */
    public int getSignaturesCount() {
        return signaturesCount;
    }

    /**
     * Sets the value of the signaturesCount property.
     * 
     */
    public void setSignaturesCount(int value) {
        this.signaturesCount = value;
    }

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ASiCContainerType getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(ASiCContainerType value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the signatureOrTimestamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureOrTimestamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureOrTimestamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignature }
     * {@link XmlTimestamp }
     * 
     * 
     */
    public List<XmlToken> getSignatureOrTimestamp() {
        if (signatureOrTimestamp == null) {
            signatureOrTimestamp = new ArrayList<XmlToken>();
        }
        return this.signatureOrTimestamp;
    }

    /**
     * Gets the value of the semantic property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the semantic property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSemantic().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSemantic }
     * 
     * 
     */
    public List<XmlSemantic> getSemantic() {
        if (semantic == null) {
            semantic = new ArrayList<XmlSemantic>();
        }
        return this.semantic;
    }

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationTime(Date value) {
        this.validationTime = value;
    }

}
