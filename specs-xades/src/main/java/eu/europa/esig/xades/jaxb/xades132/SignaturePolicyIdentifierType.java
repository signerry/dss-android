
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SignaturePolicyIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignaturePolicyIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="SignaturePolicyId" type="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdType"/&amp;gt;
 *         &amp;lt;element name="SignaturePolicyImplied" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyIdentifierType", propOrder = {
    "signaturePolicyId",
    "signaturePolicyImplied"
})
public class SignaturePolicyIdentifierType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignaturePolicyId")
    protected SignaturePolicyIdType signaturePolicyId;
    @XmlElement(name = "SignaturePolicyImplied")
    protected Object signaturePolicyImplied;

    /**
     * Gets the value of the signaturePolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public SignaturePolicyIdType getSignaturePolicyId() {
        return signaturePolicyId;
    }

    /**
     * Sets the value of the signaturePolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public void setSignaturePolicyId(SignaturePolicyIdType value) {
        this.signaturePolicyId = value;
    }

    /**
     * Gets the value of the signaturePolicyImplied property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSignaturePolicyImplied() {
        return signaturePolicyImplied;
    }

    /**
     * Sets the value of the signaturePolicyImplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignaturePolicyImplied(Object value) {
        this.signaturePolicyImplied = value;
    }

}
