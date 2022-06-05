
package eu.europa.esig.xmlenc.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CipherDataType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CipherDataType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="CipherValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2001/04/xmlenc#}CipherReference"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CipherDataType", propOrder = {
    "cipherValue",
    "cipherReference"
})
public class CipherDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CipherValue")
    protected byte[] cipherValue;
    @XmlElement(name = "CipherReference")
    protected CipherReferenceType cipherReference;

    /**
     * Gets the value of the cipherValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCipherValue() {
        return cipherValue;
    }

    /**
     * Sets the value of the cipherValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCipherValue(byte[] value) {
        this.cipherValue = value;
    }

    /**
     * Gets the value of the cipherReference property.
     * 
     * @return
     *     possible object is
     *     {@link CipherReferenceType }
     *     
     */
    public CipherReferenceType getCipherReference() {
        return cipherReference;
    }

    /**
     * Sets the value of the cipherReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CipherReferenceType }
     *     
     */
    public void setCipherReference(CipherReferenceType value) {
        this.cipherReference = value;
    }

}
