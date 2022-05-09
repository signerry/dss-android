
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;


/**
 * &lt;p&gt;Java class for DigestAlgoAndValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DigestAlgoAndValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DigestMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="match" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestAlgoAndValue", propOrder = {
    "digestMethod",
    "digestValue"
})
@XmlSeeAlso({
    XmlPolicyDigestAlgoAndValue.class,
    XmlDigestMatcher.class
})
public class XmlDigestAlgoAndValue implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DigestMethod", type = String.class)
    @XmlJavaTypeAdapter(Adapter23 .class)
    protected DigestAlgorithm digestMethod;
    @XmlElement(name = "DigestValue")
    protected byte[] digestValue;
    @XmlAttribute(name = "match")
    protected Boolean match;

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

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatch(Boolean value) {
        this.match = value;
    }

}
