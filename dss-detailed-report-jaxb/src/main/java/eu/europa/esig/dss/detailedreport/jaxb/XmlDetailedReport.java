
package eu.europa.esig.dss.detailedreport.jaxb;

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


/**
 * &lt;p&gt;Java class for DetailedReport complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DetailedReport"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;sequence maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;choice&amp;gt;
 *             &amp;lt;element name="Signature" type="{http://dss.esig.europa.eu/validation/detailed-report}Signature"/&amp;gt;
 *             &amp;lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/detailed-report}Timestamp"/&amp;gt;
 *             &amp;lt;element name="Certificate" type="{http://dss.esig.europa.eu/validation/detailed-report}Certificate"/&amp;gt;
 *           &amp;lt;/choice&amp;gt;
 *         &amp;lt;/sequence&amp;gt;
 *         &amp;lt;element name="BasicBuildingBlocks" type="{http://dss.esig.europa.eu/validation/detailed-report}BasicBuildingBlocks" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TLAnalysis" type="{http://dss.esig.europa.eu/validation/detailed-report}TLAnalysis" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Semantic" type="{http://dss.esig.europa.eu/validation/detailed-report}Semantic" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "DetailedReport", propOrder = {
    "signatureOrTimestampOrCertificate",
    "basicBuildingBlocks",
    "tlAnalysis",
    "semantic"
})
public class XmlDetailedReport
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "Signature", type = XmlSignature.class),
        @XmlElement(name = "Timestamp", type = XmlTimestamp.class),
        @XmlElement(name = "Certificate", type = XmlCertificate.class)
    })
    protected List<Serializable> signatureOrTimestampOrCertificate;
    @XmlElement(name = "BasicBuildingBlocks")
    protected List<XmlBasicBuildingBlocks> basicBuildingBlocks;
    @XmlElement(name = "TLAnalysis")
    protected List<XmlTLAnalysis> tlAnalysis;
    @XmlElement(name = "Semantic")
    protected List<XmlSemantic> semantic;
    @XmlAttribute(name = "ValidationTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationTime;

    /**
     * Gets the value of the signatureOrTimestampOrCertificate property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureOrTimestampOrCertificate property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureOrTimestampOrCertificate().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignature }
     * {@link XmlTimestamp }
     * {@link XmlCertificate }
     * 
     * 
     */
    public List<Serializable> getSignatureOrTimestampOrCertificate() {
        if (signatureOrTimestampOrCertificate == null) {
            signatureOrTimestampOrCertificate = new ArrayList<Serializable>();
        }
        return this.signatureOrTimestampOrCertificate;
    }

    /**
     * Gets the value of the basicBuildingBlocks property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the basicBuildingBlocks property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBasicBuildingBlocks().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlBasicBuildingBlocks }
     * 
     * 
     */
    public List<XmlBasicBuildingBlocks> getBasicBuildingBlocks() {
        if (basicBuildingBlocks == null) {
            basicBuildingBlocks = new ArrayList<XmlBasicBuildingBlocks>();
        }
        return this.basicBuildingBlocks;
    }

    /**
     * Gets the value of the tlAnalysis property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tlAnalysis property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTLAnalysis().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlTLAnalysis }
     * 
     * 
     */
    public List<XmlTLAnalysis> getTLAnalysis() {
        if (tlAnalysis == null) {
            tlAnalysis = new ArrayList<XmlTLAnalysis>();
        }
        return this.tlAnalysis;
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
