
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SignerInformationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignerInformationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignerCertificate" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType"/&amp;gt;
 *         &amp;lt;element name="Signer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;any namespace='##other' minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Pseudonym" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerInformationType", propOrder = {
    "signerCertificate",
    "signer",
    "any"
})
public class SignerInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignerCertificate", required = true)
    protected VOReferenceType signerCertificate;
    @XmlElement(name = "Signer")
    protected String signer;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "Pseudonym")
    protected Boolean pseudonym;

    /**
     * Gets the value of the signerCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getSignerCertificate() {
        return signerCertificate;
    }

    /**
     * Sets the value of the signerCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setSignerCertificate(VOReferenceType value) {
        this.signerCertificate = value;
    }

    /**
     * Gets the value of the signer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigner() {
        return signer;
    }

    /**
     * Sets the value of the signer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigner(String value) {
        this.signer = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPseudonym(Boolean value) {
        this.pseudonym = value;
    }

}
