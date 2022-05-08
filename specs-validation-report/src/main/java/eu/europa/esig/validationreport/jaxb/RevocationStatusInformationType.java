
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;
import org.w3._2001.xmlschema.Adapter1;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for RevocationStatusInformationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RevocationStatusInformationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationObjectId" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType"/&amp;gt;
 *         &amp;lt;element name="RevocationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="RevocationReason" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationObject" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "RevocationStatusInformationType", propOrder = {
    "validationObjectId",
    "revocationTime",
    "revocationReason",
    "revocationObject",
    "any"
})
public class RevocationStatusInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationObjectId", required = true)
    protected VOReferenceType validationObjectId;
    @XmlElement(name = "RevocationTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date revocationTime;
    @XmlElement(name = "RevocationReason", type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    protected RevocationReason revocationReason;
    @XmlElement(name = "RevocationObject")
    protected VOReferenceType revocationObject;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the validationObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getValidationObjectId() {
        return validationObjectId;
    }

    /**
     * Sets the value of the validationObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setValidationObjectId(VOReferenceType value) {
        this.validationObjectId = value;
    }

    /**
     * Gets the value of the revocationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRevocationTime() {
        return revocationTime;
    }

    /**
     * Sets the value of the revocationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationTime(Date value) {
        this.revocationTime = value;
    }

    /**
     * Gets the value of the revocationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationReason getRevocationReason() {
        return revocationReason;
    }

    /**
     * Sets the value of the revocationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationReason(RevocationReason value) {
        this.revocationReason = value;
    }

    /**
     * Gets the value of the revocationObject property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getRevocationObject() {
        return revocationObject;
    }

    /**
     * Sets the value of the revocationObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setRevocationObject(VOReferenceType value) {
        this.revocationObject = value;
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
