
package eu.europa.esig.xades.jaxb.xades111;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



/**
 * &lt;p&gt;Java class for UnsignedSignaturePropertiesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnsignedSignaturePropertiesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CounterSignature" type="{http://uri.etsi.org/01903/v1.1.1#}CounterSignatureType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompleteCertificateRefs" type="{http://uri.etsi.org/01903/v1.1.1#}CompleteCertificateRefsType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompleteRevocationRefs" type="{http://uri.etsi.org/01903/v1.1.1#}CompleteRevocationRefsType" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="SigAndRefsTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="RefsOnlyTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="CertificateValues" type="{http://uri.etsi.org/01903/v1.1.1#}CertificateValuesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationValues" type="{http://uri.etsi.org/01903/v1.1.1#}RevocationValuesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ArchiveTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedSignaturePropertiesType", propOrder = {
    "counterSignature",
    "signatureTimeStamp",
    "completeCertificateRefs",
    "completeRevocationRefs",
    "sigAndRefsTimeStamp",
    "refsOnlyTimeStamp",
    "certificateValues",
    "revocationValues",
    "archiveTimeStamp"
})
public class UnsignedSignaturePropertiesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CounterSignature")
    protected List<CounterSignatureType> counterSignature;
    @XmlElement(name = "SignatureTimeStamp")
    protected List<TimeStampType> signatureTimeStamp;
    @XmlElement(name = "CompleteCertificateRefs")
    protected CompleteCertificateRefsType completeCertificateRefs;
    @XmlElement(name = "CompleteRevocationRefs")
    protected CompleteRevocationRefsType completeRevocationRefs;
    @XmlElement(name = "SigAndRefsTimeStamp")
    protected List<TimeStampType> sigAndRefsTimeStamp;
    @XmlElement(name = "RefsOnlyTimeStamp")
    protected List<TimeStampType> refsOnlyTimeStamp;
    @XmlElement(name = "CertificateValues")
    protected CertificateValuesType certificateValues;
    @XmlElement(name = "RevocationValues")
    protected RevocationValuesType revocationValues;
    @XmlElement(name = "ArchiveTimeStamp")
    protected List<TimeStampType> archiveTimeStamp;

    /**
     * Gets the value of the counterSignature property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the counterSignature property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCounterSignature().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CounterSignatureType }
     * 
     * 
     */
    public List<CounterSignatureType> getCounterSignature() {
        if (counterSignature == null) {
            counterSignature = new ArrayList<CounterSignatureType>();
        }
        return this.counterSignature;
    }

    /**
     * Gets the value of the signatureTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getSignatureTimeStamp() {
        if (signatureTimeStamp == null) {
            signatureTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.signatureTimeStamp;
    }

    /**
     * Gets the value of the completeCertificateRefs property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteCertificateRefsType }
     *     
     */
    public CompleteCertificateRefsType getCompleteCertificateRefs() {
        return completeCertificateRefs;
    }

    /**
     * Sets the value of the completeCertificateRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteCertificateRefsType }
     *     
     */
    public void setCompleteCertificateRefs(CompleteCertificateRefsType value) {
        this.completeCertificateRefs = value;
    }

    /**
     * Gets the value of the completeRevocationRefs property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteRevocationRefsType }
     *     
     */
    public CompleteRevocationRefsType getCompleteRevocationRefs() {
        return completeRevocationRefs;
    }

    /**
     * Sets the value of the completeRevocationRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteRevocationRefsType }
     *     
     */
    public void setCompleteRevocationRefs(CompleteRevocationRefsType value) {
        this.completeRevocationRefs = value;
    }

    /**
     * Gets the value of the sigAndRefsTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sigAndRefsTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSigAndRefsTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getSigAndRefsTimeStamp() {
        if (sigAndRefsTimeStamp == null) {
            sigAndRefsTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.sigAndRefsTimeStamp;
    }

    /**
     * Gets the value of the refsOnlyTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the refsOnlyTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRefsOnlyTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getRefsOnlyTimeStamp() {
        if (refsOnlyTimeStamp == null) {
            refsOnlyTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.refsOnlyTimeStamp;
    }

    /**
     * Gets the value of the certificateValues property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateValuesType }
     *     
     */
    public CertificateValuesType getCertificateValues() {
        return certificateValues;
    }

    /**
     * Sets the value of the certificateValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateValuesType }
     *     
     */
    public void setCertificateValues(CertificateValuesType value) {
        this.certificateValues = value;
    }

    /**
     * Gets the value of the revocationValues property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationValuesType }
     *     
     */
    public RevocationValuesType getRevocationValues() {
        return revocationValues;
    }

    /**
     * Sets the value of the revocationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationValuesType }
     *     
     */
    public void setRevocationValues(RevocationValuesType value) {
        this.revocationValues = value;
    }

    /**
     * Gets the value of the archiveTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the archiveTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getArchiveTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getArchiveTimeStamp() {
        if (archiveTimeStamp == null) {
            archiveTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.archiveTimeStamp;
    }

}
