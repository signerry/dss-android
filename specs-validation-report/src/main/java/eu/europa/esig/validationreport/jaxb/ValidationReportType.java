
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.xmldsig.jaxb.SignatureType;


/**
 * &lt;p&gt;Java class for ValidationReportType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationReportType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignatureValidationReport" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureValidationReportType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="SignatureValidationObjects" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationObjectListType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValidator" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureValidatorType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationReportType", propOrder = {
    "signatureValidationReport",
    "signatureValidationObjects",
    "signatureValidator",
    "signature"
})
public class ValidationReportType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignatureValidationReport", required = true)
    protected List<SignatureValidationReportType> signatureValidationReport;
    @XmlElement(name = "SignatureValidationObjects")
    protected ValidationObjectListType signatureValidationObjects;
    @XmlElement(name = "SignatureValidator")
    protected SignatureValidatorType signatureValidator;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Gets the value of the signatureValidationReport property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureValidationReport property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureValidationReport().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureValidationReportType }
     * 
     * 
     */
    public List<SignatureValidationReportType> getSignatureValidationReport() {
        if (signatureValidationReport == null) {
            signatureValidationReport = new ArrayList<SignatureValidationReportType>();
        }
        return this.signatureValidationReport;
    }

    /**
     * Gets the value of the signatureValidationObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationObjectListType }
     *     
     */
    public ValidationObjectListType getSignatureValidationObjects() {
        return signatureValidationObjects;
    }

    /**
     * Sets the value of the signatureValidationObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationObjectListType }
     *     
     */
    public void setSignatureValidationObjects(ValidationObjectListType value) {
        this.signatureValidationObjects = value;
    }

    /**
     * Gets the value of the signatureValidator property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidatorType }
     *     
     */
    public SignatureValidatorType getSignatureValidator() {
        return signatureValidator;
    }

    /**
     * Sets the value of the signatureValidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidatorType }
     *     
     */
    public void setSignatureValidator(SignatureValidatorType value) {
        this.signatureValidator = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
