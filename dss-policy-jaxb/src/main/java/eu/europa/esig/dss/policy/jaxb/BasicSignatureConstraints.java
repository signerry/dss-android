//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:14:06 AM EET 
//


package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of common checks for any kind of signed token (signature, timestamp or revocation data)
 * 
 * <p>Java class for BasicSignatureConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicSignatureConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceDataExistence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceDataIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ManifestEntryObjectExistence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SignatureIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SignatureValid" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SignatureDuplicated" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ProspectiveCertificateChain" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SignerInformationStore" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ByteRange" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ByteRangeCollision" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="ByteRangeAllDocument" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PdfSignatureDictionary" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PdfPageDifference" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PdfAnnotationOverlap" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="PdfVisualDifference" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="DocMDP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="FieldMDP" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SigFieldLock" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="UndefinedChanges" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="TrustedServiceTypeIdentifier" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="TrustedServiceStatus" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/&gt;
 *         &lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/&gt;
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    "byteRange",
    "byteRangeCollision",
    "byteRangeAllDocument",
    "pdfSignatureDictionary",
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
    @XmlElement(name = "ByteRange")
    protected LevelConstraint byteRange;
    @XmlElement(name = "ByteRangeCollision")
    protected LevelConstraint byteRangeCollision;
    @XmlElement(name = "ByteRangeAllDocument")
    protected LevelConstraint byteRangeAllDocument;
    @XmlElement(name = "PdfSignatureDictionary")
    protected LevelConstraint pdfSignatureDictionary;
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
     * Gets the value of the byteRange property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getByteRange() {
        return byteRange;
    }

    /**
     * Sets the value of the byteRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setByteRange(LevelConstraint value) {
        this.byteRange = value;
    }

    /**
     * Gets the value of the byteRangeCollision property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getByteRangeCollision() {
        return byteRangeCollision;
    }

    /**
     * Sets the value of the byteRangeCollision property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setByteRangeCollision(LevelConstraint value) {
        this.byteRangeCollision = value;
    }

    /**
     * Gets the value of the byteRangeAllDocument property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getByteRangeAllDocument() {
        return byteRangeAllDocument;
    }

    /**
     * Sets the value of the byteRangeAllDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setByteRangeAllDocument(LevelConstraint value) {
        this.byteRangeAllDocument = value;
    }

    /**
     * Gets the value of the pdfSignatureDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getPdfSignatureDictionary() {
        return pdfSignatureDictionary;
    }

    /**
     * Sets the value of the pdfSignatureDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setPdfSignatureDictionary(LevelConstraint value) {
        this.pdfSignatureDictionary = value;
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
