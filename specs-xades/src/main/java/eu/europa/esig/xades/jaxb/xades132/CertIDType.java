
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.xmldsig.jaxb.X509IssuerSerialType;


/**
 * &lt;p&gt;Java class for CertIDType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CertIDType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CertDigest" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&amp;gt;
 *         &amp;lt;element name="IssuerSerial" type="{http://www.w3.org/2000/09/xmldsig#}X509IssuerSerialType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertIDType", propOrder = {
    "certDigest",
    "issuerSerial"
})
public class CertIDType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CertDigest", required = true)
    protected DigestAlgAndValueType certDigest;
    @XmlElement(name = "IssuerSerial", required = true)
    protected X509IssuerSerialType issuerSerial;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the certDigest property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getCertDigest() {
        return certDigest;
    }

    /**
     * Sets the value of the certDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setCertDigest(DigestAlgAndValueType value) {
        this.certDigest = value;
    }

    /**
     * Gets the value of the issuerSerial property.
     * 
     * @return
     *     possible object is
     *     {@link X509IssuerSerialType }
     *     
     */
    public X509IssuerSerialType getIssuerSerial() {
        return issuerSerial;
    }

    /**
     * Sets the value of the issuerSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link X509IssuerSerialType }
     *     
     */
    public void setIssuerSerial(X509IssuerSerialType value) {
        this.issuerSerial = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
