//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:14:09 AM EET 
//


package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyDigestAlgoAndValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyDigestAlgoAndValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"&gt;
 *       &lt;attribute name="digestAlgorithmsEqual" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="zeroHash" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
