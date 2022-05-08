
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for POEProvisioningType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="POEProvisioningType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="POETime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ValidationObject" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureReference" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureReferenceType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POEProvisioningType", propOrder = {
    "poeTime",
    "validationObject",
    "signatureReference"
})
public class POEProvisioningType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "POETime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date poeTime;
    @XmlElement(name = "ValidationObject")
    protected List<VOReferenceType> validationObject;
    @XmlElement(name = "SignatureReference")
    protected List<SignatureReferenceType> signatureReference;

    /**
     * Gets the value of the poeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPOETime() {
        return poeTime;
    }

    /**
     * Sets the value of the poeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOETime(Date value) {
        this.poeTime = value;
    }

    /**
     * Gets the value of the validationObject property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the validationObject property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getValidationObject().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link VOReferenceType }
     * 
     * 
     */
    public List<VOReferenceType> getValidationObject() {
        if (validationObject == null) {
            validationObject = new ArrayList<VOReferenceType>();
        }
        return this.validationObject;
    }

    /**
     * Gets the value of the signatureReference property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureReference property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureReference().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureReferenceType }
     * 
     * 
     */
    public List<SignatureReferenceType> getSignatureReference() {
        if (signatureReference == null) {
            signatureReference = new ArrayList<SignatureReferenceType>();
        }
        return this.signatureReference;
    }

}
