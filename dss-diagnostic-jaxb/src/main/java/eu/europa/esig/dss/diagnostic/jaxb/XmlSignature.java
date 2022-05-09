
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.SignatureLevel;


/**
 * &lt;p&gt;Java class for Signature complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Signature"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}AbstractToken"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureFilename" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClaimedSigningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureFormat" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureFormat"/&amp;gt;
 *         &amp;lt;element name="StructuralValidation" type="{http://dss.esig.europa.eu/validation/diagnostic}StructuralValidation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DigestMatchers" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="DigestMatcher" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestMatcher" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="BasicSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignature"/&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}SigningCertificate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateChain" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentHints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureProductionPlace" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureProductionPlace" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommitmentTypeIndications" type="{http://dss.esig.europa.eu/validation/diagnostic}CommitmentTypeIndications" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerRole" type="{http://dss.esig.europa.eu/validation/diagnostic}SignerRole" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Policy" type="{http://dss.esig.europa.eu/validation/diagnostic}Policy" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignaturePolicyStore" type="{http://dss.esig.europa.eu/validation/diagnostic}SignaturePolicyStore" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerInformationStore" type="{http://dss.esig.europa.eu/validation/diagnostic}SignerInformationStore" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PDFRevision" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFRevision" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerDocumentRepresentations" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;attribute name="HashOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *                 &amp;lt;attribute name="DocHashOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FoundCertificates" type="{http://dss.esig.europa.eu/validation/diagnostic}FoundCertificates"/&amp;gt;
 *         &amp;lt;element name="FoundRevocations" type="{http://dss.esig.europa.eu/validation/diagnostic}FoundRevocations"/&amp;gt;
 *         &amp;lt;element name="FoundTimestamps"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="FoundTimestamp" type="{http://dss.esig.europa.eu/validation/diagnostic}FoundTimestamp" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SignatureScopes"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="SignatureScope" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureScope" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SignatureDigestReference" type="{http://dss.esig.europa.eu/validation/diagnostic}SignatureDigestReference"/&amp;gt;
 *         &amp;lt;element name="DataToBeSignedRepresentation" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="CounterSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="Parent" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *       &amp;lt;attribute name="Duplicated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "daIdentifier",
    "signatureFilename",
    "errorMessage",
    "claimedSigningTime",
    "signatureFormat",
    "structuralValidation",
    "digestMatchers",
    "basicSignature",
    "signingCertificate",
    "certificateChain",
    "contentType",
    "mimeType",
    "contentIdentifier",
    "contentHints",
    "signatureProductionPlace",
    "commitmentTypeIndications",
    "signerRole",
    "policy",
    "signaturePolicyStore",
    "signerInformationStore",
    "pdfRevision",
    "signerDocumentRepresentations",
    "foundCertificates",
    "foundRevocations",
    "foundTimestamps",
    "signatureScopes",
    "signatureDigestReference",
    "dataToBeSignedRepresentation",
    "signatureValue"
})
public class XmlSignature
    extends XmlAbstractToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DAIdentifier")
    protected String daIdentifier;
    @XmlElement(name = "SignatureFilename", required = true)
    protected String signatureFilename;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ClaimedSigningTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimedSigningTime;
    @XmlElement(name = "SignatureFormat", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected SignatureLevel signatureFormat;
    @XmlElement(name = "StructuralValidation")
    protected XmlStructuralValidation structuralValidation;
    @XmlElementWrapper(name = "DigestMatchers")
    @XmlElement(name = "DigestMatcher", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlDigestMatcher> digestMatchers = new ArrayList<XmlDigestMatcher>();
    @XmlElement(name = "BasicSignature", required = true)
    protected XmlBasicSignature basicSignature;
    @XmlElement(name = "SigningCertificate")
    protected XmlSigningCertificate signingCertificate;
    @XmlElementWrapper(name = "CertificateChain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlChainItem> certificateChain = new ArrayList<XmlChainItem>();
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "ContentIdentifier")
    protected String contentIdentifier;
    @XmlElement(name = "ContentHints")
    protected String contentHints;
    @XmlElement(name = "SignatureProductionPlace")
    protected XmlSignatureProductionPlace signatureProductionPlace;
    @XmlElementWrapper(name = "CommitmentTypeIndications")
    @XmlElement(name = "CommitmentTypeIndication", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlCommitmentTypeIndication> commitmentTypeIndications = new ArrayList<XmlCommitmentTypeIndication>();
    @XmlElement(name = "SignerRole")
    protected List<XmlSignerRole> signerRole;
    @XmlElement(name = "Policy")
    protected XmlPolicy policy;
    @XmlElement(name = "SignaturePolicyStore")
    protected XmlSignaturePolicyStore signaturePolicyStore;
    @XmlElementWrapper(name = "SignerInformationStore")
    @XmlElement(name = "SignerInfo", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignerInfo> signerInformationStore = new ArrayList<XmlSignerInfo>();
    @XmlElement(name = "PDFRevision")
    protected XmlPDFRevision pdfRevision;
    @XmlElement(name = "SignerDocumentRepresentations")
    protected XmlSignerDocumentRepresentations signerDocumentRepresentations;
    @XmlElement(name = "FoundCertificates", required = true)
    protected XmlFoundCertificates foundCertificates;
    @XmlElement(name = "FoundRevocations", required = true)
    protected XmlFoundRevocations foundRevocations;
    @XmlElementWrapper(name = "FoundTimestamps", required = true)
    @XmlElement(name = "FoundTimestamp", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlFoundTimestamp> foundTimestamps = new ArrayList<XmlFoundTimestamp>();
    @XmlElementWrapper(name = "SignatureScopes", required = true)
    @XmlElement(name = "SignatureScope", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlSignatureScope> signatureScopes = new ArrayList<XmlSignatureScope>();
    @XmlElement(name = "SignatureDigestReference", required = true)
    protected XmlSignatureDigestReference signatureDigestReference;
    @XmlElement(name = "DataToBeSignedRepresentation")
    protected XmlDigestAlgoAndValue dataToBeSignedRepresentation;
    @XmlElement(name = "SignatureValue")
    protected byte[] signatureValue;
    @XmlAttribute(name = "CounterSignature")
    protected Boolean counterSignature;
    @XmlAttribute(name = "Parent")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected eu.europa.esig.dss.diagnostic.jaxb.XmlSignature parent;
    @XmlAttribute(name = "Duplicated")
    protected Boolean duplicated;

    /**
     * Gets the value of the daIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAIdentifier() {
        return daIdentifier;
    }

    /**
     * Sets the value of the daIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAIdentifier(String value) {
        this.daIdentifier = value;
    }

    /**
     * Gets the value of the signatureFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureFilename() {
        return signatureFilename;
    }

    /**
     * Sets the value of the signatureFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFilename(String value) {
        this.signatureFilename = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the claimedSigningTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClaimedSigningTime() {
        return claimedSigningTime;
    }

    /**
     * Sets the value of the claimedSigningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimedSigningTime(Date value) {
        this.claimedSigningTime = value;
    }

    /**
     * Gets the value of the signatureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SignatureLevel getSignatureFormat() {
        return signatureFormat;
    }

    /**
     * Sets the value of the signatureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFormat(SignatureLevel value) {
        this.signatureFormat = value;
    }

    /**
     * Gets the value of the structuralValidation property.
     * 
     * @return
     *     possible object is
     *     {@link XmlStructuralValidation }
     *     
     */
    public XmlStructuralValidation getStructuralValidation() {
        return structuralValidation;
    }

    /**
     * Sets the value of the structuralValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlStructuralValidation }
     *     
     */
    public void setStructuralValidation(XmlStructuralValidation value) {
        this.structuralValidation = value;
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
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the contentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentIdentifier() {
        return contentIdentifier;
    }

    /**
     * Sets the value of the contentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentIdentifier(String value) {
        this.contentIdentifier = value;
    }

    /**
     * Gets the value of the contentHints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentHints() {
        return contentHints;
    }

    /**
     * Sets the value of the contentHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentHints(String value) {
        this.contentHints = value;
    }

    /**
     * Gets the value of the signatureProductionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignatureProductionPlace }
     *     
     */
    public XmlSignatureProductionPlace getSignatureProductionPlace() {
        return signatureProductionPlace;
    }

    /**
     * Sets the value of the signatureProductionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignatureProductionPlace }
     *     
     */
    public void setSignatureProductionPlace(XmlSignatureProductionPlace value) {
        this.signatureProductionPlace = value;
    }

    /**
     * Gets the value of the signerRole property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signerRole property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignerRole().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignerRole }
     * 
     * 
     */
    public List<XmlSignerRole> getSignerRole() {
        if (signerRole == null) {
            signerRole = new ArrayList<XmlSignerRole>();
        }
        return this.signerRole;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPolicy }
     *     
     */
    public XmlPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPolicy }
     *     
     */
    public void setPolicy(XmlPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the signaturePolicyStore property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignaturePolicyStore }
     *     
     */
    public XmlSignaturePolicyStore getSignaturePolicyStore() {
        return signaturePolicyStore;
    }

    /**
     * Sets the value of the signaturePolicyStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignaturePolicyStore }
     *     
     */
    public void setSignaturePolicyStore(XmlSignaturePolicyStore value) {
        this.signaturePolicyStore = value;
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
     * Gets the value of the signerDocumentRepresentations property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignerDocumentRepresentations }
     *     
     */
    public XmlSignerDocumentRepresentations getSignerDocumentRepresentations() {
        return signerDocumentRepresentations;
    }

    /**
     * Sets the value of the signerDocumentRepresentations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignerDocumentRepresentations }
     *     
     */
    public void setSignerDocumentRepresentations(XmlSignerDocumentRepresentations value) {
        this.signerDocumentRepresentations = value;
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
     * Gets the value of the signatureDigestReference property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignatureDigestReference }
     *     
     */
    public XmlSignatureDigestReference getSignatureDigestReference() {
        return signatureDigestReference;
    }

    /**
     * Sets the value of the signatureDigestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignatureDigestReference }
     *     
     */
    public void setSignatureDigestReference(XmlSignatureDigestReference value) {
        this.signatureDigestReference = value;
    }

    /**
     * Gets the value of the dataToBeSignedRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDataToBeSignedRepresentation() {
        return dataToBeSignedRepresentation;
    }

    /**
     * Sets the value of the dataToBeSignedRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDataToBeSignedRepresentation(XmlDigestAlgoAndValue value) {
        this.dataToBeSignedRepresentation = value;
    }

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignatureValue(byte[] value) {
        this.signatureValue = value;
    }

    /**
     * Gets the value of the counterSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSignature() {
        return counterSignature;
    }

    /**
     * Sets the value of the counterSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSignature(Boolean value) {
        this.counterSignature = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public eu.europa.esig.dss.diagnostic.jaxb.XmlSignature getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParent(eu.europa.esig.dss.diagnostic.jaxb.XmlSignature value) {
        this.parent = value;
    }

    /**
     * Gets the value of the duplicated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicated() {
        return duplicated;
    }

    /**
     * Sets the value of the duplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicated(Boolean value) {
        this.duplicated = value;
    }

    public List<XmlDigestMatcher> getDigestMatchers() {
        return digestMatchers;
    }

    public void setDigestMatchers(List<XmlDigestMatcher> digestMatchers) {
        this.digestMatchers = digestMatchers;
    }

    public List<XmlChainItem> getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(List<XmlChainItem> certificateChain) {
        this.certificateChain = certificateChain;
    }

    public List<XmlCommitmentTypeIndication> getCommitmentTypeIndications() {
        return commitmentTypeIndications;
    }

    public void setCommitmentTypeIndications(List<XmlCommitmentTypeIndication> commitmentTypeIndications) {
        this.commitmentTypeIndications = commitmentTypeIndications;
    }

    public List<XmlSignerInfo> getSignerInformationStore() {
        return signerInformationStore;
    }

    public void setSignerInformationStore(List<XmlSignerInfo> signerInformationStore) {
        this.signerInformationStore = signerInformationStore;
    }

    public List<XmlFoundTimestamp> getFoundTimestamps() {
        return foundTimestamps;
    }

    public void setFoundTimestamps(List<XmlFoundTimestamp> foundTimestamps) {
        this.foundTimestamps = foundTimestamps;
    }

    public List<XmlSignatureScope> getSignatureScopes() {
        return signatureScopes;
    }

    public void setSignatureScopes(List<XmlSignatureScope> signatureScopes) {
        this.signatureScopes = signatureScopes;
    }

}
