
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationType;


/**
 * &lt;p&gt;Java class for OrphanRevocationToken complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OrphanRevocationToken"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}OrphanToken"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RevocationType" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationType"/&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="Base64Encoded" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *           &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrphanRevocationToken", propOrder = {
    "revocationType",
    "base64Encoded",
    "digestAlgoAndValue"
})
public class XmlOrphanRevocationToken
    extends XmlOrphanToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RevocationType", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected RevocationType revocationType;
    @XmlElement(name = "Base64Encoded")
    protected byte[] base64Encoded;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;

    /**
     * Gets the value of the revocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationType getRevocationType() {
        return revocationType;
    }

    /**
     * Sets the value of the revocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationType(RevocationType value) {
        this.revocationType = value;
    }

    /**
     * Gets the value of the base64Encoded property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64Encoded() {
        return base64Encoded;
    }

    /**
     * Sets the value of the base64Encoded property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64Encoded(byte[] value) {
        this.base64Encoded = value;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

}
