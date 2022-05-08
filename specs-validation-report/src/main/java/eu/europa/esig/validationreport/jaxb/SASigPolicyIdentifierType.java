
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SASigPolicyIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SASigPolicyIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigPolicyId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SASigPolicyIdentifierType", propOrder = {
    "sigPolicyId"
})
public class SASigPolicyIdentifierType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigPolicyId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String sigPolicyId;

    /**
     * Gets the value of the sigPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPolicyId() {
        return sigPolicyId;
    }

    /**
     * Sets the value of the sigPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPolicyId(String value) {
        this.sigPolicyId = value;
    }

}
