
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for CertificateChainType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CertificateChainType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType"/&amp;gt;
 *         &amp;lt;element name="IntermediateCertificate" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TrustAnchor" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateChainType", propOrder = {
    "signingCertificate",
    "intermediateCertificate",
    "trustAnchor",
    "any"
})
public class CertificateChainType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigningCertificate", required = true)
    protected VOReferenceType signingCertificate;
    @XmlElement(name = "IntermediateCertificate")
    protected List<VOReferenceType> intermediateCertificate;
    @XmlElement(name = "TrustAnchor")
    protected VOReferenceType trustAnchor;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setSigningCertificate(VOReferenceType value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the intermediateCertificate property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the intermediateCertificate property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIntermediateCertificate().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link VOReferenceType }
     * 
     * 
     */
    public List<VOReferenceType> getIntermediateCertificate() {
        if (intermediateCertificate == null) {
            intermediateCertificate = new ArrayList<VOReferenceType>();
        }
        return this.intermediateCertificate;
    }

    /**
     * Gets the value of the trustAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getTrustAnchor() {
        return trustAnchor;
    }

    /**
     * Sets the value of the trustAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setTrustAnchor(VOReferenceType value) {
        this.trustAnchor = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
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
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
