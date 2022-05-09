
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PolicyDigestAlgoAndValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PolicyDigestAlgoAndValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"&amp;gt;
 *       &amp;lt;attribute name="digestAlgorithmsEqual" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="zeroHash" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyDigestAlgoAndValue")
public class XmlPolicyDigestAlgoAndValue
    extends XmlDigestAlgoAndValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "digestAlgorithmsEqual")
    protected Boolean digestAlgorithmsEqual;
    @XmlAttribute(name = "zeroHash")
    protected Boolean zeroHash;

    /**
     * Gets the value of the digestAlgorithmsEqual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigestAlgorithmsEqual() {
        return digestAlgorithmsEqual;
    }

    /**
     * Sets the value of the digestAlgorithmsEqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigestAlgorithmsEqual(Boolean value) {
        this.digestAlgorithmsEqual = value;
    }

    /**
     * Gets the value of the zeroHash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroHash() {
        return zeroHash;
    }

    /**
     * Sets the value of the zeroHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroHash(Boolean value) {
        this.zeroHash = value;
    }

}
