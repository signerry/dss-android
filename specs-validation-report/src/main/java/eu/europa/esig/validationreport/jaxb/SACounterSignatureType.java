
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SACounterSignatureType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SACounterSignatureType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CounterSignature" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureReferenceType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SACounterSignatureType", propOrder = {
    "counterSignature"
})
public class SACounterSignatureType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CounterSignature", required = true)
    protected SignatureReferenceType counterSignature;

    /**
     * Gets the value of the counterSignature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureReferenceType }
     *     
     */
    public SignatureReferenceType getCounterSignature() {
        return counterSignature;
    }

    /**
     * Sets the value of the counterSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureReferenceType }
     *     
     */
    public void setCounterSignature(SignatureReferenceType value) {
        this.counterSignature = value;
    }

}
