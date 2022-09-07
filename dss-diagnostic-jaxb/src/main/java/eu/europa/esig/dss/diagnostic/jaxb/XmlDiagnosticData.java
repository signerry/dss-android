
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for DiagnosticData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DiagnosticData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ContainerInfo" type="{http://dss.esig.europa.eu/validation/diagnostic}ContainerInfo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Signatures" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Signature" type="{http://dss.esig.europa.eu/validation/diagnostic}Signature" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UsedCertificates" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Certificate" type="{http://dss.esig.europa.eu/validation/diagnostic}Certificate" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UsedRevocations" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Revocation" type="{http://dss.esig.europa.eu/validation/diagnostic}Revocation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UsedTimestamps" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Timestamp" type="{http://dss.esig.europa.eu/validation/diagnostic}Timestamp" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OrphanTokens" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="OrphanCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanCertificateToken" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="OrphanRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanRevocationToken" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OriginalDocuments" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="SignerData" type="{http://dss.esig.europa.eu/validation/diagnostic}SignerData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TrustedLists" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TrustedList" type="{http://dss.esig.europa.eu/validation/diagnostic}TrustedList" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticData", propOrder = {
    "documentName",
    "validationDate",
    "containerInfo",
    "signatures",
    "usedCertificates",
    "usedRevocations",
    "usedTimestamps",
    "orphanTokens",
    "originalDocuments",
    "trustedLists"
})
public class XmlDiagnosticData implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DocumentName")
    protected String documentName;
    @XmlElement(name = "ValidationDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationDate;
    @XmlElement(name = "ContainerInfo")
    protected XmlContainerInfo containerInfo;
    @XmlElementWrapper(name = "Signatures")
    @XmlElement(name = "Signature", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignature> signatures;
    @XmlElementWrapper(name = "UsedCertificates")
    @XmlElement(name = "Certificate", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlCertificate> usedCertificates;
    @XmlElementWrapper(name = "UsedRevocations")
    @XmlElement(name = "Revocation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlRevocation> usedRevocations;
    @XmlElementWrapper(name = "UsedTimestamps")
    @XmlElement(name = "Timestamp", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlTimestamp> usedTimestamps;
    @XmlElement(name = "OrphanTokens")
    protected XmlOrphanTokens orphanTokens;
    @XmlElementWrapper(name = "OriginalDocuments")
    @XmlElement(name = "SignerData", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignerData> originalDocuments;
    @XmlElementWrapper(name = "TrustedLists")
    @XmlElement(name = "TrustedList", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlTrustedList> trustedLists;

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
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationDate(Date value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the containerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XmlContainerInfo }
     *     
     */
    public XmlContainerInfo getContainerInfo() {
        return containerInfo;
    }

    /**
     * Sets the value of the containerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlContainerInfo }
     *     
     */
    public void setContainerInfo(XmlContainerInfo value) {
        this.containerInfo = value;
    }

    /**
     * Gets the value of the orphanTokens property.
     * 
     * @return
     *     possible object is
     *     {@link XmlOrphanTokens }
     *     
     */
    public XmlOrphanTokens getOrphanTokens() {
        return orphanTokens;
    }

    /**
     * Sets the value of the orphanTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlOrphanTokens }
     *     
     */
    public void setOrphanTokens(XmlOrphanTokens value) {
        this.orphanTokens = value;
    }

    public List<XmlSignature> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<XmlSignature>();
        }
        return signatures;
    }

    public void setSignatures(List<XmlSignature> signatures) {
        this.signatures = signatures;
    }

    public List<XmlCertificate> getUsedCertificates() {
        if (usedCertificates == null) {
            usedCertificates = new ArrayList<XmlCertificate>();
        }
        return usedCertificates;
    }

    public void setUsedCertificates(List<XmlCertificate> usedCertificates) {
        this.usedCertificates = usedCertificates;
    }

    public List<XmlRevocation> getUsedRevocations() {
        if (usedRevocations == null) {
            usedRevocations = new ArrayList<XmlRevocation>();
        }
        return usedRevocations;
    }

    public void setUsedRevocations(List<XmlRevocation> usedRevocations) {
        this.usedRevocations = usedRevocations;
    }

    public List<XmlTimestamp> getUsedTimestamps() {
        if (usedTimestamps == null) {
            usedTimestamps = new ArrayList<XmlTimestamp>();
        }
        return usedTimestamps;
    }

    public void setUsedTimestamps(List<XmlTimestamp> usedTimestamps) {
        this.usedTimestamps = usedTimestamps;
    }

    public List<XmlSignerData> getOriginalDocuments() {
        if (originalDocuments == null) {
            originalDocuments = new ArrayList<XmlSignerData>();
        }
        return originalDocuments;
    }

    public void setOriginalDocuments(List<XmlSignerData> originalDocuments) {
        this.originalDocuments = originalDocuments;
    }

    public List<XmlTrustedList> getTrustedLists() {
        if (trustedLists == null) {
            trustedLists = new ArrayList<XmlTrustedList>();
        }
        return trustedLists;
    }

    public void setTrustedLists(List<XmlTrustedList> trustedLists) {
        this.trustedLists = trustedLists;
    }

}
