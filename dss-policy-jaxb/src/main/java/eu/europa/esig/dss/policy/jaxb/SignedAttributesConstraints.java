
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of constraints on the signed attributes/properties
 * 
 * &lt;p&gt;Java class for SignedAttributesConstraints complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignedAttributesConstraints"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigningCertificatePresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UnicitySigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigningCertificateRefersCertificateChain" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ReferencesToAllCertificateChainPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigningCertificateDigestAlgorithm" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertDigestPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertDigestMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IssuerSerialMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyIdentifierPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyIdentifierMatch" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigningTime" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentType" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentHints" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentIdentifier" type="{http://dss.esig.europa.eu/validation/policy}ValueConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MessageDigestOrSignedPropertiesPresent" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommitmentTypeIndication" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignerLocation" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ClaimedRoles" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertifiedRoles" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentTimeStamp" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ContentTimeStampMessageImprint" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedAttributesConstraints", propOrder = {
    "signingCertificatePresent",
    "unicitySigningCertificate",
    "signingCertificateRefersCertificateChain",
    "referencesToAllCertificateChainPresent",
    "signingCertificateDigestAlgorithm",
    "certDigestPresent",
    "certDigestMatch",
    "issuerSerialMatch",
    "keyIdentifierPresent",
    "keyIdentifierMatch",
    "signingTime",
    "contentType",
    "contentHints",
    "contentIdentifier",
    "messageDigestOrSignedPropertiesPresent",
    "commitmentTypeIndication",
    "signerLocation",
    "claimedRoles",
    "certifiedRoles",
    "contentTimeStamp",
    "contentTimeStampMessageImprint"
})
public class SignedAttributesConstraints
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigningCertificatePresent")
    protected LevelConstraint signingCertificatePresent;
    @XmlElement(name = "UnicitySigningCertificate")
    protected LevelConstraint unicitySigningCertificate;
    @XmlElement(name = "SigningCertificateRefersCertificateChain")
    protected LevelConstraint signingCertificateRefersCertificateChain;
    @XmlElement(name = "ReferencesToAllCertificateChainPresent")
    protected LevelConstraint referencesToAllCertificateChainPresent;
    @XmlElement(name = "SigningCertificateDigestAlgorithm")
    protected LevelConstraint signingCertificateDigestAlgorithm;
    @XmlElement(name = "CertDigestPresent")
    protected LevelConstraint certDigestPresent;
    @XmlElement(name = "CertDigestMatch")
    protected LevelConstraint certDigestMatch;
    @XmlElement(name = "IssuerSerialMatch")
    protected LevelConstraint issuerSerialMatch;
    @XmlElement(name = "KeyIdentifierPresent")
    protected LevelConstraint keyIdentifierPresent;
    @XmlElement(name = "KeyIdentifierMatch")
    protected LevelConstraint keyIdentifierMatch;
    @XmlElement(name = "SigningTime")
    protected LevelConstraint signingTime;
    @XmlElement(name = "ContentType")
    protected ValueConstraint contentType;
    @XmlElement(name = "ContentHints")
    protected ValueConstraint contentHints;
    @XmlElement(name = "ContentIdentifier")
    protected ValueConstraint contentIdentifier;
    @XmlElement(name = "MessageDigestOrSignedPropertiesPresent")
    protected LevelConstraint messageDigestOrSignedPropertiesPresent;
    @XmlElement(name = "CommitmentTypeIndication")
    protected MultiValuesConstraint commitmentTypeIndication;
    @XmlElement(name = "SignerLocation")
    protected LevelConstraint signerLocation;
    @XmlElement(name = "ClaimedRoles")
    protected MultiValuesConstraint claimedRoles;
    @XmlElement(name = "CertifiedRoles")
    protected MultiValuesConstraint certifiedRoles;
    @XmlElement(name = "ContentTimeStamp")
    protected LevelConstraint contentTimeStamp;
    @XmlElement(name = "ContentTimeStampMessageImprint")
    protected LevelConstraint contentTimeStampMessageImprint;

    /**
     * Gets the value of the signingCertificatePresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigningCertificatePresent() {
        return signingCertificatePresent;
    }

    /**
     * Sets the value of the signingCertificatePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigningCertificatePresent(LevelConstraint value) {
        this.signingCertificatePresent = value;
    }

    /**
     * Gets the value of the unicitySigningCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getUnicitySigningCertificate() {
        return unicitySigningCertificate;
    }

    /**
     * Sets the value of the unicitySigningCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setUnicitySigningCertificate(LevelConstraint value) {
        this.unicitySigningCertificate = value;
    }

    /**
     * Gets the value of the signingCertificateRefersCertificateChain property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigningCertificateRefersCertificateChain() {
        return signingCertificateRefersCertificateChain;
    }

    /**
     * Sets the value of the signingCertificateRefersCertificateChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigningCertificateRefersCertificateChain(LevelConstraint value) {
        this.signingCertificateRefersCertificateChain = value;
    }

    /**
     * Gets the value of the referencesToAllCertificateChainPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferencesToAllCertificateChainPresent() {
        return referencesToAllCertificateChainPresent;
    }

    /**
     * Sets the value of the referencesToAllCertificateChainPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferencesToAllCertificateChainPresent(LevelConstraint value) {
        this.referencesToAllCertificateChainPresent = value;
    }

    /**
     * Gets the value of the signingCertificateDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigningCertificateDigestAlgorithm() {
        return signingCertificateDigestAlgorithm;
    }

    /**
     * Sets the value of the signingCertificateDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigningCertificateDigestAlgorithm(LevelConstraint value) {
        this.signingCertificateDigestAlgorithm = value;
    }

    /**
     * Gets the value of the certDigestPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getCertDigestPresent() {
        return certDigestPresent;
    }

    /**
     * Sets the value of the certDigestPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setCertDigestPresent(LevelConstraint value) {
        this.certDigestPresent = value;
    }

    /**
     * Gets the value of the certDigestMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getCertDigestMatch() {
        return certDigestMatch;
    }

    /**
     * Sets the value of the certDigestMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setCertDigestMatch(LevelConstraint value) {
        this.certDigestMatch = value;
    }

    /**
     * Gets the value of the issuerSerialMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getIssuerSerialMatch() {
        return issuerSerialMatch;
    }

    /**
     * Sets the value of the issuerSerialMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setIssuerSerialMatch(LevelConstraint value) {
        this.issuerSerialMatch = value;
    }

    /**
     * Gets the value of the keyIdentifierPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getKeyIdentifierPresent() {
        return keyIdentifierPresent;
    }

    /**
     * Sets the value of the keyIdentifierPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setKeyIdentifierPresent(LevelConstraint value) {
        this.keyIdentifierPresent = value;
    }

    /**
     * Gets the value of the keyIdentifierMatch property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getKeyIdentifierMatch() {
        return keyIdentifierMatch;
    }

    /**
     * Sets the value of the keyIdentifierMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setKeyIdentifierMatch(LevelConstraint value) {
        this.keyIdentifierMatch = value;
    }

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigningTime(LevelConstraint value) {
        this.signingTime = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setContentType(ValueConstraint value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the contentHints property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getContentHints() {
        return contentHints;
    }

    /**
     * Sets the value of the contentHints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setContentHints(ValueConstraint value) {
        this.contentHints = value;
    }

    /**
     * Gets the value of the contentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ValueConstraint }
     *     
     */
    public ValueConstraint getContentIdentifier() {
        return contentIdentifier;
    }

    /**
     * Sets the value of the contentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueConstraint }
     *     
     */
    public void setContentIdentifier(ValueConstraint value) {
        this.contentIdentifier = value;
    }

    /**
     * Gets the value of the messageDigestOrSignedPropertiesPresent property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getMessageDigestOrSignedPropertiesPresent() {
        return messageDigestOrSignedPropertiesPresent;
    }

    /**
     * Sets the value of the messageDigestOrSignedPropertiesPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setMessageDigestOrSignedPropertiesPresent(LevelConstraint value) {
        this.messageDigestOrSignedPropertiesPresent = value;
    }

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCommitmentTypeIndication() {
        return commitmentTypeIndication;
    }

    /**
     * Sets the value of the commitmentTypeIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCommitmentTypeIndication(MultiValuesConstraint value) {
        this.commitmentTypeIndication = value;
    }

    /**
     * Gets the value of the signerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignerLocation() {
        return signerLocation;
    }

    /**
     * Sets the value of the signerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignerLocation(LevelConstraint value) {
        this.signerLocation = value;
    }

    /**
     * Gets the value of the claimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Sets the value of the claimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setClaimedRoles(MultiValuesConstraint value) {
        this.claimedRoles = value;
    }

    /**
     * Gets the value of the certifiedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getCertifiedRoles() {
        return certifiedRoles;
    }

    /**
     * Sets the value of the certifiedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setCertifiedRoles(MultiValuesConstraint value) {
        this.certifiedRoles = value;
    }

    /**
     * Gets the value of the contentTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getContentTimeStamp() {
        return contentTimeStamp;
    }

    /**
     * Sets the value of the contentTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setContentTimeStamp(LevelConstraint value) {
        this.contentTimeStamp = value;
    }

    /**
     * Gets the value of the contentTimeStampMessageImprint property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getContentTimeStampMessageImprint() {
        return contentTimeStampMessageImprint;
    }

    /**
     * Sets the value of the contentTimeStampMessageImprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setContentTimeStampMessageImprint(LevelConstraint value) {
        this.contentTimeStampMessageImprint = value;
    }

}
