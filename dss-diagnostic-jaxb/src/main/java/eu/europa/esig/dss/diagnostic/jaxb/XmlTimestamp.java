
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.ArchiveTimestampType;
import eu.europa.esig.dss.enumerations.TimestampType;


/**
 * &lt;p&gt;Java class for Timestamp complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Timestamp"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}AbstractToken"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TimestampFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ArchiveTimestampType" type="{http://dss.esig.europa.eu/validation/diagnostic}ArchiveTimestampType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProductionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="DigestMatcher" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestMatcher" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="BasicSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignature"/&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}SigningCertificate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateChain" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerInformationStore" type="{http://dss.esig.europa.eu/validation/diagnostic}SignerInformationStore" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TSAGeneralName" type="{http://dss.esig.europa.eu/validation/diagnostic}TSAGeneralName" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PDFRevision" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFRevision" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FoundCertificates" type="{http://dss.esig.europa.eu/validation/diagnostic}FoundCertificates"/&amp;gt;
 *         &amp;lt;element name="FoundRevocations" type="{http://dss.esig.europa.eu/validation/diagnostic}FoundRevocations"/&amp;gt;
 *         &amp;lt;element name="TimestampedObjects" type="{http://dss.esig.europa.eu/validation/diagnostic}TimestampedObjects"/&amp;gt;
 *         &amp;lt;element name="TimestampScopes" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TimestampScope" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureScope" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="Base64Encoded" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *           &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Type" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}TimestampType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timestamp", propOrder = {
    "timestampFilename",
    "archiveTimestampType",
    "productionTime",
    "digestMatchers",
    "basicSignature",
    "signingCertificate",
    "certificateChain",
    "signerInformationStore",
    "tsaGeneralName",
    "pdfRevision",
    "foundCertificates",
    "foundRevocations",
    "timestampedObjects",
    "timestampScopes",
    "base64Encoded",
    "digestAlgoAndValue"
})
public class XmlTimestamp
    extends XmlAbstractToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TimestampFilename")
    protected String timestampFilename;
    @XmlElement(name = "ArchiveTimestampType", type = String.class)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected ArchiveTimestampType archiveTimestampType;
    @XmlElement(name = "ProductionTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date productionTime;
    @XmlElement(name = "DigestMatcher", required = true)
    protected List<XmlDigestMatcher> digestMatchers;
    @XmlElement(name = "BasicSignature", required = true)
    protected XmlBasicSignature basicSignature;
    @XmlElement(name = "SigningCertificate")
    protected XmlSigningCertificate signingCertificate;
    @XmlElementWrapper(name = "CertificateChain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlChainItem> certificateChain = new ArrayList<XmlChainItem>();
    @XmlElementWrapper(name = "SignerInformationStore")
    @XmlElement(name = "SignerInfo", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignerInfo> signerInformationStore = new ArrayList<XmlSignerInfo>();
    @XmlElement(name = "TSAGeneralName")
    protected XmlTSAGeneralName tsaGeneralName;
    @XmlElement(name = "PDFRevision")
    protected XmlPDFRevision pdfRevision;
    @XmlElement(name = "FoundCertificates", required = true)
    protected XmlFoundCertificates foundCertificates;
    @XmlElement(name = "FoundRevocations", required = true)
    protected XmlFoundRevocations foundRevocations;
    @XmlElementWrapper(name = "TimestampedObjects", required = true)
    @XmlElement(name = "TimestampedObject", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlTimestampedObject> timestampedObjects = new ArrayList<XmlTimestampedObject>();
    @XmlElementWrapper(name = "TimestampScopes")
    @XmlElement(name = "TimestampScope", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignatureScope> timestampScopes = new ArrayList<XmlSignatureScope>();
    @XmlElement(name = "Base64Encoded")
    protected byte[] base64Encoded;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected TimestampType type;

    /**
     * Gets the value of the timestampFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampFilename() {
        return timestampFilename;
    }

    /**
     * Sets the value of the timestampFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampFilename(String value) {
        this.timestampFilename = value;
    }

    /**
     * Gets the value of the archiveTimestampType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ArchiveTimestampType getArchiveTimestampType() {
        return archiveTimestampType;
    }

    /**
     * Sets the value of the archiveTimestampType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveTimestampType(ArchiveTimestampType value) {
        this.archiveTimestampType = value;
    }

    /**
     * Gets the value of the productionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProductionTime() {
        return productionTime;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionTime(Date value) {
        this.productionTime = value;
    }

    /**
     * Gets the value of the digestMatchers property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the digestMatchers property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDigestMatchers().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDigestMatcher }
     * 
     * 
     */
    public List<XmlDigestMatcher> getDigestMatchers() {
        if (digestMatchers == null) {
            digestMatchers = new ArrayList<XmlDigestMatcher>();
        }
        return this.digestMatchers;
    }

    /**
     * Gets the value of the basicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link XmlBasicSignature }
     *     
     */
    public XmlBasicSignature getBasicSignature() {
        return basicSignature;
    }

    /**
     * Sets the value of the basicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlBasicSignature }
     *     
     */
    public void setBasicSignature(XmlBasicSignature value) {
        this.basicSignature = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public XmlSigningCertificate getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public void setSigningCertificate(XmlSigningCertificate value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the tsaGeneralName property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTSAGeneralName }
     *     
     */
    public XmlTSAGeneralName getTSAGeneralName() {
        return tsaGeneralName;
    }

    /**
     * Sets the value of the tsaGeneralName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTSAGeneralName }
     *     
     */
    public void setTSAGeneralName(XmlTSAGeneralName value) {
        this.tsaGeneralName = value;
    }

    /**
     * Gets the value of the pdfRevision property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPDFRevision }
     *     
     */
    public XmlPDFRevision getPDFRevision() {
        return pdfRevision;
    }

    /**
     * Sets the value of the pdfRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPDFRevision }
     *     
     */
    public void setPDFRevision(XmlPDFRevision value) {
        this.pdfRevision = value;
    }

    /**
     * Gets the value of the foundCertificates property.
     * 
     * @return
     *     possible object is
     *     {@link XmlFoundCertificates }
     *     
     */
    public XmlFoundCertificates getFoundCertificates() {
        return foundCertificates;
    }

    /**
     * Sets the value of the foundCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlFoundCertificates }
     *     
     */
    public void setFoundCertificates(XmlFoundCertificates value) {
        this.foundCertificates = value;
    }

    /**
     * Gets the value of the foundRevocations property.
     * 
     * @return
     *     possible object is
     *     {@link XmlFoundRevocations }
     *     
     */
    public XmlFoundRevocations getFoundRevocations() {
        return foundRevocations;
    }

    /**
     * Sets the value of the foundRevocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlFoundRevocations }
     *     
     */
    public void setFoundRevocations(XmlFoundRevocations value) {
        this.foundRevocations = value;
    }

    /**
     * Gets the value of the base64Encoded property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64Encoded() {
        return base64Encoded;
    }

    /**
     * Sets the value of the base64Encoded property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64Encoded(byte[] value) {
        this.base64Encoded = value;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TimestampType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(TimestampType value) {
        this.type = value;
    }

    public List<XmlChainItem> getCertificateChain() {
       if (certificateChain == null) {
            certificateChain = new ArrayList<XmlChainItem>();
        }
        return certificateChain;
    }

    public void setCertificateChain(List<XmlChainItem> certificateChain) {
        this.certificateChain = certificateChain;
    }

    public List<XmlSignerInfo> getSignerInformationStore() {
        if (signerInformationStore == null) {
            signerInformationStore = new ArrayList<XmlSignerInfo>();
        }
        return signerInformationStore;
    }

    public void setSignerInformationStore(List<XmlSignerInfo> signerInformationStore) {
        this.signerInformationStore = signerInformationStore;
    }

    public List<XmlTimestampedObject> getTimestampedObjects() {
        if (timestampedObjects == null) {
            timestampedObjects = new ArrayList<XmlTimestampedObject>();
        }
        return timestampedObjects;
    }

    public void setTimestampedObjects(List<XmlTimestampedObject> timestampedObjects) {
        this.timestampedObjects = timestampedObjects;
    }

    public List<XmlSignatureScope> getTimestampScopes() {
       if (timestampScopes == null) {
            timestampScopes = new ArrayList<XmlSignatureScope>();
        }
        return timestampScopes;
    }

    public void setTimestampScopes(List<XmlSignatureScope> timestampScopes) {
        this.timestampScopes = timestampScopes;
    }

}
