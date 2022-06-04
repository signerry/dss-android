
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SAMessageDigestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SAMessageDigestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAMessageDigestType", propOrder = {
    "digest"
})
public class SAMessageDigestType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Digest", required = true)
    protected byte[] digest;

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigest(byte[] value) {
        this.digest = value;
    }

}