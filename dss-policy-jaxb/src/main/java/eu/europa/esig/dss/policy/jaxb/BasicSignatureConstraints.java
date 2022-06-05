
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of common checks for any kind of signed token (signature, timestamp or revocation data)
 * 
 * &lt;p&gt;Java class for BasicSignatureConstraints complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BasicSignatureConstraints"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ReferenceDataExistence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReferenceDataIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManifestEntryObjectExistence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValid" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureDuplicated" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProspectiveCertificateChain" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerInformationStore" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PdfPageDifference" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PdfAnnotationOverlap" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PdfVisualDifference" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocMDP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FieldMDP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigFieldLock" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UndefinedChanges" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TrustedServiceTypeIdentifier" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TrustedServiceStatus" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSignatureConstraints", propOrder = {
    "referenceDataExistence",
    "referenceDataIntact",
    "manifestEntryObjectExistence",
    "signatureIntact",
    "signatureValid",
    "signatureDuplicated",
    "prospectiveCertificateChain",
    "signerInformationStore",
    "pdfPageDifference",
    "pdfAnnotationOverlap",
    "pdfVisualDifference",
    "docMDP",
    "fieldMDP",
    "sigFieldLock",
    "undefinedChanges",
    "trustedServiceTypeIdentifier",
    "trustedServiceStatus",
    "signingCertificate",
    "caCertificate",
    "cryptographic"
})
public class BasicSignatureConstraints
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReferenceDataExistence")
    protected LevelConstraint referenceDataExistence;
    @XmlElement(name = "ReferenceDataIntact")
    protected LevelConstraint referenceDataIntact;
    @XmlElement(name = "ManifestEntryObjectExistence")
    protected LevelConstraint manifestEntryObjectExistence;
    @XmlElement(name = "SignatureIntact")
    protected LevelConstraint signatureIntact;
    @XmlElement(name = "SignatureValid")
    protected LevelConstraint signatureValid;
    @XmlElement(name = "SignatureDuplicated")
    protected LevelConstraint signatureDuplicated;
    @XmlElement(name = "ProspectiveCertificateChain")
    protected LevelConstraint prospectiveCertificateChain;
    @XmlElement(name = "SignerInformationStore")
    protected LevelConstraint signerInformationStore;
    @XmlElement(name = "PdfPageDifference")
    protected LevelConstraint pdfPageDifference;
    @XmlElement(name = "PdfAnnotationOverlap")
    protected LevelConstraint pdfAnnotationOverlap;
    @XmlElement(name = "PdfVisualDifference")
    protected LevelConstraint pdfVisualDifference;
    @XmlElement(name = "DocMDP")
    protected LevelConstraint docMDP;
    @XmlElement(name = "FieldMDP")
    protected LevelConstraint fieldMDP;
    @XmlElement(name = "SigFieldLock")
    protected LevelConstraint sigFieldLock;
    @XmlElement(name = "UndefinedChanges")
    protected LevelConstraint undefinedChanges;
    @XmlElement(name = "TrustedServiceTypeIdentifier")
    protected MultiValuesConstraint trustedServiceTypeIdentifier;
    @XmlElement(name = "TrustedServiceStatus")
    protected MultiValuesConstraint trustedServiceStatus;
    @XmlElement(name = "SigningCertificate")
    protected CertificateConstraints signingCertificate;
    @XmlElement(name = "CACertificate")
    protected CertificateConstraints caCertificate;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;

    /**
     * Gets the value of the referenceDataExistence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataExistence() {
        return referenceDataExistence;
    }

    /**
     * Sets the value of the referenceDataExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataExistence(LevelConstraint value) {
        this.referenceDataExistence = value;
    }

    /**
     * Gets the value of the referenceDataIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataIntact() {
        return referenceDataIntact;
    }

    /**
     * Sets the value of the referenceDataIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataIntact(LevelConstraint value) {
        this.referenceDataIntact = value;
    }

    /**
     * Gets the value of the manifestEntryObjectExistence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getManifestEntryObjectExistence() {
        return manifestEntryObjectExistence;
    }

    /**
     * Sets the value of the manifestEntryObjectExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setManifestEntryObjectExistence(LevelConstraint value) {
        this.manifestEntryObjectExistence = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureIntact(LevelConstraint value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signatureValid property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureValid() {
        return signatureValid;
    }

    /**
     * Sets the value of the signatureValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureValid(LevelConstraint value) {
        this.signatureValid = value;
    }

    /**
     * Gets the value of the signatureDuplicated property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureDuplicated() {
        return signatureDuplicated;
    }

    /**
     * Sets the value of the signatureDuplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureDuplicated(LevelConstraint value) {
        this.signatureDuplicated = value;
    }

    /**
     * Gets the value of the prospectiveCertificateChain property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getProspectiveCertificateChain() {
        return prospectiveCertificateChain;
    }

    /**
     * Sets the value of the prospectiveCertificateChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setProspectiveCertificateChain(LevelConstraint value) {
        this.prospectiveCertificateChain = value;
    }

    /**
     * Gets the value of the signerInformationStore property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignerInformationStore() {
        return signerInformationStore;
    }

    /**
     * Sets the value of the signerInformationStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignerInformationStore(LevelConstraint value) {
        this.signerInformationStore = value;
    }

    /**
     * Gets the value of the pdfPageDifference property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPdfPageDifference() {
        return pdfPageDifference;
    }

    /**
     * Sets the value of the pdfPageDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPdfPageDifference(LevelConstraint value) {
        this.pdfPageDifference = value;
    }

    /**
     * Gets the value of the pdfAnnotationOverlap property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPdfAnnotationOverlap() {
        return pdfAnnotationOverlap;
    }

    /**
     * Sets the value of the pdfAnnotationOverlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPdfAnnotationOverlap(LevelConstraint value) {
        this.pdfAnnotationOverlap = value;
    }

    /**
     * Gets the value of the pdfVisualDifference property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPdfVisualDifference() {
        return pdfVisualDifference;
    }

    /**
     * Sets the value of the pdfVisualDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPdfVisualDifference(LevelConstraint value) {
        this.pdfVisualDifference = value;
    }

    /**
     * Gets the value of the docMDP property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getDocMDP() {
        return docMDP;
    }

    /**
     * Sets the value of the docMDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setDocMDP(LevelConstraint value) {
        this.docMDP = value;
    }

    /**
     * Gets the value of the fieldMDP property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getFieldMDP() {
        return fieldMDP;
    }

    /**
     * Sets the value of the fieldMDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setFieldMDP(LevelConstraint value) {
        this.fieldMDP = value;
    }

    /**
     * Gets the value of the sigFieldLock property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigFieldLock() {
        return sigFieldLock;
    }

    /**
     * Sets the value of the sigFieldLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigFieldLock(LevelConstraint value) {
        this.sigFieldLock = value;
    }

    /**
     * Gets the value of the undefinedChanges property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUndefinedChanges() {
        return undefinedChanges;
    }

    /**
     * Sets the value of the undefinedChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUndefinedChanges(LevelConstraint value) {
        this.undefinedChanges = value;
    }

    /**
     * Gets the value of the trustedServiceTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getTrustedServiceTypeIdentifier() {
        return trustedServiceTypeIdentifier;
    }

    /**
     * Sets the value of the trustedServiceTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setTrustedServiceTypeIdentifier(MultiValuesConstraint value) {
        this.trustedServiceTypeIdentifier = value;
    }

    /**
     * Gets the value of the trustedServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getTrustedServiceStatus() {
        return trustedServiceStatus;
    }

    /**
     * Sets the value of the trustedServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setTrustedServiceStatus(MultiValuesConstraint value) {
        this.trustedServiceStatus = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setSigningCertificate(CertificateConstraints value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setCACertificate(CertificateConstraints value) {
        this.caCertificate = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

}
