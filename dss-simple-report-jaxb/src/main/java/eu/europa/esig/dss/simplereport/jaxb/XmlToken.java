
package eu.europa.esig.dss.simplereport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.Indication;
import eu.europa.esig.dss.enumerations.SubIndication;


/**
 * &lt;p&gt;Java class for Token complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Token"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/simple-report}CertificateChain" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Indication" type="{http://dss.esig.europa.eu/validation/simple-report}Indication"/&amp;gt;
 *         &amp;lt;element name="SubIndication" type="{http://dss.esig.europa.eu/validation/simple-report}SubIndication" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AdESValidationDetails" type="{http://dss.esig.europa.eu/validation/simple-report}Details" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="QualificationDetails" type="{http://dss.esig.europa.eu/validation/simple-report}Details" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token", propOrder = {
    "filename",
    "certificateChain",
    "indication",
    "subIndication",
    "adESValidationDetails",
    "qualificationDetails"
})
@XmlSeeAlso({
    XmlSignature.class,
    XmlTimestamp.class
})
public abstract class XmlToken implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Filename")
    protected String filename;
    @XmlElement(name = "CertificateChain")
    protected XmlCertificateChain certificateChain;
    @XmlElement(name = "Indication", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Indication indication;
    @XmlElement(name = "SubIndication", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected SubIndication subIndication;
    @XmlElement(name = "AdESValidationDetails")
    protected XmlDetails adESValidationDetails;
    @XmlElement(name = "QualificationDetails")
    protected XmlDetails qualificationDetails;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the certificateChain property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCertificateChain }
     *     
     */
    public XmlCertificateChain getCertificateChain() {
        return certificateChain;
    }

    /**
     * Sets the value of the certificateChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCertificateChain }
     *     
     */
    public void setCertificateChain(XmlCertificateChain value) {
        this.certificateChain = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Indication getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(Indication value) {
        this.indication = value;
    }

    /**
     * Gets the value of the subIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SubIndication getSubIndication() {
        return subIndication;
    }

    /**
     * Sets the value of the subIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIndication(SubIndication value) {
        this.subIndication = value;
    }

    /**
     * Gets the value of the adESValidationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDetails }
     *     
     */
    public XmlDetails getAdESValidationDetails() {
        return adESValidationDetails;
    }

    /**
     * Sets the value of the adESValidationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDetails }
     *     
     */
    public void setAdESValidationDetails(XmlDetails value) {
        this.adESValidationDetails = value;
    }

    /**
     * Gets the value of the qualificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDetails }
     *     
     */
    public XmlDetails getQualificationDetails() {
        return qualificationDetails;
    }

    /**
     * Sets the value of the qualificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDetails }
     *     
     */
    public void setQualificationDetails(XmlDetails value) {
        this.qualificationDetails = value;
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