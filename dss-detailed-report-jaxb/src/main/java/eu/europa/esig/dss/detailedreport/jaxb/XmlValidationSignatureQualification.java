
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.SignatureQualification;


/**
 * &lt;p&gt;Java class for ValidationSignatureQualification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationSignatureQualification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationCertificateQualification" type="{http://dss.esig.europa.eu/validation/detailed-report}ValidationCertificateQualification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="SignatureQualification" use="required" type="{http://dss.esig.europa.eu/validation/detailed-report}SignatureQualification" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationSignatureQualification", propOrder = {
    "validationCertificateQualification"
})
public class XmlValidationSignatureQualification
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationCertificateQualification")
    protected List<XmlValidationCertificateQualification> validationCertificateQualification;
    @XmlAttribute(name = "SignatureQualification", required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected SignatureQualification signatureQualification;

    /**
     * Gets the value of the validationCertificateQualification property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the validationCertificateQualification property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getValidationCertificateQualification().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlValidationCertificateQualification }
     * 
     * 
     */
    public List<XmlValidationCertificateQualification> getValidationCertificateQualification() {
        if (validationCertificateQualification == null) {
            validationCertificateQualification = new ArrayList<XmlValidationCertificateQualification>();
        }
        return this.validationCertificateQualification;
    }

    /**
     * Gets the value of the signatureQualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SignatureQualification getSignatureQualification() {
        return signatureQualification;
    }

    /**
     * Sets the value of the signatureQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureQualification(SignatureQualification value) {
        this.signatureQualification = value;
    }

}
