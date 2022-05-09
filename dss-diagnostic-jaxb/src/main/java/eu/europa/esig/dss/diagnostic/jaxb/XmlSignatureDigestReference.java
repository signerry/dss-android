
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;


/**
 * &lt;p&gt;Java class for SignatureDigestReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureDigestReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CanonicalizationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DigestMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureDigestReference", propOrder = {
    "canonicalizationMethod",
    "digestMethod",
    "digestValue"
})
public class XmlSignatureDigestReference implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CanonicalizationMethod")
    protected String canonicalizationMethod;
    @XmlElement(name = "DigestMethod", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter22 .class)
    protected DigestAlgorithm digestMethod;
    @XmlElement(name = "DigestValue", required = true)
    protected byte[] digestValue;

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalizationMethod(String value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the digestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DigestAlgorithm getDigestMethod() {
        return digestMethod;
    }

    /**
     * Sets the value of the digestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestMethod(DigestAlgorithm value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigestValue(byte[] value) {
        this.digestValue = value;
    }

}
