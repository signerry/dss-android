
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for TrustedService complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TrustedService"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ServiceNames"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ServiceName" type="{http://dss.esig.europa.eu/validation/diagnostic}LangAndValue" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CapturedQualifiers" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="AdditionalServiceInfoUris" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="AdditionalServiceInfoUri" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ServiceSupplyPoints" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ServiceSupplyPoint" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExpiredCertsRevocationInfo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ServiceDigitalIdentifier" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedService", propOrder = {
    "serviceNames",
    "serviceType",
    "status",
    "startDate",
    "endDate",
    "capturedQualifiers",
    "additionalServiceInfoUris",
    "serviceSupplyPoints",
    "expiredCertsRevocationInfo"
})
public class XmlTrustedService implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "ServiceNames", required = true)
    @XmlElement(name = "ServiceName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlLangAndValue> serviceNames;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StartDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElementWrapper(name = "CapturedQualifiers")
    @XmlElement(name = "Qualifier", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> capturedQualifiers;
    @XmlElementWrapper(name = "AdditionalServiceInfoUris")
    @XmlElement(name = "AdditionalServiceInfoUri", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> additionalServiceInfoUris;
    @XmlElementWrapper(name = "ServiceSupplyPoints")
    @XmlElement(name = "ServiceSupplyPoint", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> serviceSupplyPoints;
    @XmlElement(name = "ExpiredCertsRevocationInfo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date expiredCertsRevocationInfo;
    @XmlAttribute(name = "ServiceDigitalIdentifier", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlCertificate serviceDigitalIdentifier;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the expiredCertsRevocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExpiredCertsRevocationInfo() {
        return expiredCertsRevocationInfo;
    }

    /**
     * Sets the value of the expiredCertsRevocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredCertsRevocationInfo(Date value) {
        this.expiredCertsRevocationInfo = value;
    }

    /**
     * Gets the value of the serviceDigitalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlCertificate getServiceDigitalIdentifier() {
        return serviceDigitalIdentifier;
    }

    /**
     * Sets the value of the serviceDigitalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setServiceDigitalIdentifier(XmlCertificate value) {
        this.serviceDigitalIdentifier = value;
    }

    public List<XmlLangAndValue> getServiceNames() {
        if (serviceNames == null) {
            serviceNames = new ArrayList<XmlLangAndValue>();
        }
        return serviceNames;
    }

    public void setServiceNames(List<XmlLangAndValue> serviceNames) {
        this.serviceNames = serviceNames;
    }

    public List<String> getCapturedQualifiers() {
        if (capturedQualifiers == null) {
            capturedQualifiers = new ArrayList<String>();
        }
        return capturedQualifiers;
    }

    public void setCapturedQualifiers(List<String> capturedQualifiers) {
        this.capturedQualifiers = capturedQualifiers;
    }

    public List<String> getAdditionalServiceInfoUris() {
        if (additionalServiceInfoUris == null) {
            additionalServiceInfoUris = new ArrayList<String>();
        }
        return additionalServiceInfoUris;
    }

    public void setAdditionalServiceInfoUris(List<String> additionalServiceInfoUris) {
        this.additionalServiceInfoUris = additionalServiceInfoUris;
    }

    public List<String> getServiceSupplyPoints() {
        if (serviceSupplyPoints == null) {
            serviceSupplyPoints = new ArrayList<String>();
        }
        return serviceSupplyPoints;
    }

    public void setServiceSupplyPoints(List<String> serviceSupplyPoints) {
        this.serviceSupplyPoints = serviceSupplyPoints;
    }

}
