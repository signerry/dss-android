
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for SignatureValidationReportType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureValidationReportType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignatureIdentifier" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureIdentifierType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationConstraintsEvaluationReport" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationConstraintsEvaluationReportType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationTimeInfo" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationTimeInfoType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignersDocument" type="{http://uri.etsi.org/19102/v1.2.1#}SignersDocumentType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureAttributes" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureAttributesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerInformation" type="{http://uri.etsi.org/19102/v1.2.1#}SignerInformationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureQuality" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureQualityType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValidationProcess" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureValidationProcessType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValidationStatus" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationStatusType"/&amp;gt;
 *         &amp;lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValidationReportType", propOrder = {
    "signatureIdentifier",
    "validationConstraintsEvaluationReport",
    "validationTimeInfo",
    "signersDocument",
    "signatureAttributes",
    "signerInformation",
    "signatureQuality",
    "signatureValidationProcess",
    "signatureValidationStatus",
    "any"
})
public class SignatureValidationReportType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignatureIdentifier")
    protected SignatureIdentifierType signatureIdentifier;
    @XmlElement(name = "ValidationConstraintsEvaluationReport")
    protected ValidationConstraintsEvaluationReportType validationConstraintsEvaluationReport;
    @XmlElement(name = "ValidationTimeInfo")
    protected ValidationTimeInfoType validationTimeInfo;
    @XmlElement(name = "SignersDocument")
    protected SignersDocumentType signersDocument;
    @XmlElement(name = "SignatureAttributes")
    protected SignatureAttributesType signatureAttributes;
    @XmlElement(name = "SignerInformation")
    protected SignerInformationType signerInformation;
    @XmlElement(name = "SignatureQuality")
    protected SignatureQualityType signatureQuality;
    @XmlElement(name = "SignatureValidationProcess")
    protected SignatureValidationProcessType signatureValidationProcess;
    @XmlElement(name = "SignatureValidationStatus", required = true)
    protected ValidationStatusType signatureValidationStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the signatureIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureIdentifierType }
     *     
     */
    public SignatureIdentifierType getSignatureIdentifier() {
        return signatureIdentifier;
    }

    /**
     * Sets the value of the signatureIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureIdentifierType }
     *     
     */
    public void setSignatureIdentifier(SignatureIdentifierType value) {
        this.signatureIdentifier = value;
    }

    /**
     * Gets the value of the validationConstraintsEvaluationReport property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationConstraintsEvaluationReportType }
     *     
     */
    public ValidationConstraintsEvaluationReportType getValidationConstraintsEvaluationReport() {
        return validationConstraintsEvaluationReport;
    }

    /**
     * Sets the value of the validationConstraintsEvaluationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationConstraintsEvaluationReportType }
     *     
     */
    public void setValidationConstraintsEvaluationReport(ValidationConstraintsEvaluationReportType value) {
        this.validationConstraintsEvaluationReport = value;
    }

    /**
     * Gets the value of the validationTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTimeInfoType }
     *     
     */
    public ValidationTimeInfoType getValidationTimeInfo() {
        return validationTimeInfo;
    }

    /**
     * Sets the value of the validationTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTimeInfoType }
     *     
     */
    public void setValidationTimeInfo(ValidationTimeInfoType value) {
        this.validationTimeInfo = value;
    }

    /**
     * Gets the value of the signersDocument property.
     * 
     * @return
     *     possible object is
     *     {@link SignersDocumentType }
     *     
     */
    public SignersDocumentType getSignersDocument() {
        return signersDocument;
    }

    /**
     * Sets the value of the signersDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignersDocumentType }
     *     
     */
    public void setSignersDocument(SignersDocumentType value) {
        this.signersDocument = value;
    }

    /**
     * Gets the value of the signatureAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureAttributesType }
     *     
     */
    public SignatureAttributesType getSignatureAttributes() {
        return signatureAttributes;
    }

    /**
     * Sets the value of the signatureAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureAttributesType }
     *     
     */
    public void setSignatureAttributes(SignatureAttributesType value) {
        this.signatureAttributes = value;
    }

    /**
     * Gets the value of the signerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SignerInformationType }
     *     
     */
    public SignerInformationType getSignerInformation() {
        return signerInformation;
    }

    /**
     * Sets the value of the signerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerInformationType }
     *     
     */
    public void setSignerInformation(SignerInformationType value) {
        this.signerInformation = value;
    }

    /**
     * Gets the value of the signatureQuality property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureQualityType }
     *     
     */
    public SignatureQualityType getSignatureQuality() {
        return signatureQuality;
    }

    /**
     * Sets the value of the signatureQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureQualityType }
     *     
     */
    public void setSignatureQuality(SignatureQualityType value) {
        this.signatureQuality = value;
    }

    /**
     * Gets the value of the signatureValidationProcess property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidationProcessType }
     *     
     */
    public SignatureValidationProcessType getSignatureValidationProcess() {
        return signatureValidationProcess;
    }

    /**
     * Sets the value of the signatureValidationProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidationProcessType }
     *     
     */
    public void setSignatureValidationProcess(SignatureValidationProcessType value) {
        this.signatureValidationProcess = value;
    }

    /**
     * Gets the value of the signatureValidationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusType }
     *     
     */
    public ValidationStatusType getSignatureValidationStatus() {
        return signatureValidationStatus;
    }

    /**
     * Sets the value of the signatureValidationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusType }
     *     
     */
    public void setSignatureValidationStatus(ValidationStatusType value) {
        this.signatureValidationStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
