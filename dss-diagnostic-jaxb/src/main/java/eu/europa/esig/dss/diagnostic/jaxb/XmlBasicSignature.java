
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.enumerations.EncryptionAlgorithm;
import eu.europa.esig.dss.enumerations.MaskGenerationFunction;


/**
 * &lt;p&gt;Java class for BasicSignature complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BasicSignature"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EncryptionAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KeyLengthUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DigestAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaskGenerationFunctionUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureIntact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSignature", propOrder = {
    "encryptionAlgoUsedToSignThisToken",
    "keyLengthUsedToSignThisToken",
    "digestAlgoUsedToSignThisToken",
    "maskGenerationFunctionUsedToSignThisToken",
    "signatureIntact",
    "signatureValid"
})
public class XmlBasicSignature implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EncryptionAlgoUsedToSignThisToken", type = String.class)
    @XmlJavaTypeAdapter(Adapter24 .class)
    protected EncryptionAlgorithm encryptionAlgoUsedToSignThisToken;
    @XmlElement(name = "KeyLengthUsedToSignThisToken")
    protected String keyLengthUsedToSignThisToken;
    @XmlElement(name = "DigestAlgoUsedToSignThisToken", type = String.class)
    @XmlJavaTypeAdapter(Adapter25 .class)
    protected DigestAlgorithm digestAlgoUsedToSignThisToken;
    @XmlElement(name = "MaskGenerationFunctionUsedToSignThisToken", type = String.class)
    @XmlJavaTypeAdapter(Adapter26 .class)
    protected MaskGenerationFunction maskGenerationFunctionUsedToSignThisToken;
    @XmlElement(name = "SignatureIntact")
    protected Boolean signatureIntact;
    @XmlElement(name = "SignatureValid")
    protected Boolean signatureValid;

    /**
     * Gets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public EncryptionAlgorithm getEncryptionAlgoUsedToSignThisToken() {
        return encryptionAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionAlgoUsedToSignThisToken(EncryptionAlgorithm value) {
        this.encryptionAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLengthUsedToSignThisToken() {
        return keyLengthUsedToSignThisToken;
    }

    /**
     * Sets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLengthUsedToSignThisToken(String value) {
        this.keyLengthUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DigestAlgorithm getDigestAlgoUsedToSignThisToken() {
        return digestAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAlgoUsedToSignThisToken(DigestAlgorithm value) {
        this.digestAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the maskGenerationFunctionUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public MaskGenerationFunction getMaskGenerationFunctionUsedToSignThisToken() {
        return maskGenerationFunctionUsedToSignThisToken;
    }

    /**
     * Sets the value of the maskGenerationFunctionUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskGenerationFunctionUsedToSignThisToken(MaskGenerationFunction value) {
        this.maskGenerationFunctionUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureIntact(Boolean value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signatureValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureValid() {
        return signatureValid;
    }

    /**
     * Sets the value of the signatureValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureValid(Boolean value) {
        this.signatureValid = value;
    }

}
