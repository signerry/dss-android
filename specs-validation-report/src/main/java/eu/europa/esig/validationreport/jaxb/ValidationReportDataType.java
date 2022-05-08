
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ValidationReportDataType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationReportDataType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TrustAnchor" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateChain" type="{http://uri.etsi.org/19102/v1.2.1#}CertificateChainType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RelatedValidationObject" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationStatusInformation" type="{http://uri.etsi.org/19102/v1.2.1#}RevocationStatusInformationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CryptoInformation" type="{http://uri.etsi.org/19102/v1.2.1#}CryptoInformationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AdditionalValidationReportData" type="{http://uri.etsi.org/19102/v1.2.1#}AdditionalValidationReportDataType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationReportDataType", propOrder = {
    "trustAnchor",
    "certificateChain",
    "relatedValidationObject",
    "revocationStatusInformation",
    "cryptoInformation",
    "additionalValidationReportData"
})
public class ValidationReportDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TrustAnchor")
    protected VOReferenceType trustAnchor;
    @XmlElement(name = "CertificateChain")
    protected CertificateChainType certificateChain;
    @XmlElement(name = "RelatedValidationObject")
    protected List<VOReferenceType> relatedValidationObject;
    @XmlElement(name = "RevocationStatusInformation")
    protected RevocationStatusInformationType revocationStatusInformation;
    @XmlElement(name = "CryptoInformation")
    protected CryptoInformationType cryptoInformation;
    @XmlElement(name = "AdditionalValidationReportData")
    protected AdditionalValidationReportDataType additionalValidationReportData;

    /**
     * Gets the value of the trustAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getTrustAnchor() {
        return trustAnchor;
    }

    /**
     * Sets the value of the trustAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setTrustAnchor(VOReferenceType value) {
        this.trustAnchor = value;
    }

    /**
     * Gets the value of the certificateChain property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateChainType }
     *     
     */
    public CertificateChainType getCertificateChain() {
        return certificateChain;
    }

    /**
     * Sets the value of the certificateChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateChainType }
     *     
     */
    public void setCertificateChain(CertificateChainType value) {
        this.certificateChain = value;
    }

    /**
     * Gets the value of the relatedValidationObject property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relatedValidationObject property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelatedValidationObject().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link VOReferenceType }
     * 
     * 
     */
    public List<VOReferenceType> getRelatedValidationObject() {
        if (relatedValidationObject == null) {
            relatedValidationObject = new ArrayList<VOReferenceType>();
        }
        return this.relatedValidationObject;
    }

    /**
     * Gets the value of the revocationStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationStatusInformationType }
     *     
     */
    public RevocationStatusInformationType getRevocationStatusInformation() {
        return revocationStatusInformation;
    }

    /**
     * Sets the value of the revocationStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationStatusInformationType }
     *     
     */
    public void setRevocationStatusInformation(RevocationStatusInformationType value) {
        this.revocationStatusInformation = value;
    }

    /**
     * Gets the value of the cryptoInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoInformationType }
     *     
     */
    public CryptoInformationType getCryptoInformation() {
        return cryptoInformation;
    }

    /**
     * Sets the value of the cryptoInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoInformationType }
     *     
     */
    public void setCryptoInformation(CryptoInformationType value) {
        this.cryptoInformation = value;
    }

    /**
     * Gets the value of the additionalValidationReportData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalValidationReportDataType }
     *     
     */
    public AdditionalValidationReportDataType getAdditionalValidationReportData() {
        return additionalValidationReportData;
    }

    /**
     * Sets the value of the additionalValidationReportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalValidationReportDataType }
     *     
     */
    public void setAdditionalValidationReportData(AdditionalValidationReportDataType value) {
        this.additionalValidationReportData = value;
    }

}
