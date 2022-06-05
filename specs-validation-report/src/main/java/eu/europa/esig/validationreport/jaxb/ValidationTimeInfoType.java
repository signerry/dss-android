
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for ValidationTimeInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationTimeInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="BestSignatureTime" type="{http://uri.etsi.org/19102/v1.2.1#}POEType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationTimeInfoType", propOrder = {
    "validationTime",
    "bestSignatureTime"
})
public class ValidationTimeInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationTime;
    @XmlElement(name = "BestSignatureTime", required = true)
    protected POEType bestSignatureTime;

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationTime(Date value) {
        this.validationTime = value;
    }

    /**
     * Gets the value of the bestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link POEType }
     *     
     */
    public POEType getBestSignatureTime() {
        return bestSignatureTime;
    }

    /**
     * Sets the value of the bestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link POEType }
     *     
     */
    public void setBestSignatureTime(POEType value) {
        this.bestSignatureTime = value;
    }

}
