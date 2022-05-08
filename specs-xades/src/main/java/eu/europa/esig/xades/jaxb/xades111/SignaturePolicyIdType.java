
package eu.europa.esig.xades.jaxb.xades111;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.xmldsig.jaxb.TransformsType;


/**
 * &lt;p&gt;Java class for SignaturePolicyIdType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignaturePolicyIdType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigPolicyId" type="{http://uri.etsi.org/01903/v1.1.1#}ObjectIdentifierType"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SigPolicyHash" type="{http://uri.etsi.org/01903/v1.1.1#}DigestAlgAndValueType"/&amp;gt;
 *         &amp;lt;element name="SigPolicyQualifiers" type="{http://uri.etsi.org/01903/v1.1.1#}SigPolicyQualifiersListType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyIdType", propOrder = {
    "sigPolicyId",
    "transforms",
    "sigPolicyHash",
    "sigPolicyQualifiers"
})
public class SignaturePolicyIdType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigPolicyId", required = true)
    protected ObjectIdentifierType sigPolicyId;
    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlElement(name = "SigPolicyHash", required = true)
    protected DigestAlgAndValueType sigPolicyHash;
    @XmlElement(name = "SigPolicyQualifiers")
    protected SigPolicyQualifiersListType sigPolicyQualifiers;

    /**
     * Gets the value of the sigPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSigPolicyId() {
        return sigPolicyId;
    }

    /**
     * Sets the value of the sigPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSigPolicyId(ObjectIdentifierType value) {
        this.sigPolicyId = value;
    }

    /**
     * Gets the value of the transforms property.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Sets the value of the transforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Gets the value of the sigPolicyHash property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getSigPolicyHash() {
        return sigPolicyHash;
    }

    /**
     * Sets the value of the sigPolicyHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setSigPolicyHash(DigestAlgAndValueType value) {
        this.sigPolicyHash = value;
    }

    /**
     * Gets the value of the sigPolicyQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SigPolicyQualifiersListType }
     *     
     */
    public SigPolicyQualifiersListType getSigPolicyQualifiers() {
        return sigPolicyQualifiers;
    }

    /**
     * Sets the value of the sigPolicyQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigPolicyQualifiersListType }
     *     
     */
    public void setSigPolicyQualifiers(SigPolicyQualifiersListType value) {
        this.sigPolicyQualifiers = value;
    }

}
