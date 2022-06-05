
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SAVRIType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SAVRIType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Certs" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CRLs" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OCSPs" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TS" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAVRIType", propOrder = {
    "certs",
    "crLs",
    "ocsPs",
    "tu",
    "ts"
})
public class SAVRIType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Certs")
    protected VOReferenceType certs;
    @XmlElement(name = "CRLs")
    protected VOReferenceType crLs;
    @XmlElement(name = "OCSPs")
    protected VOReferenceType ocsPs;
    @XmlElement(name = "TU")
    protected String tu;
    @XmlElement(name = "TS")
    protected SATimestampType ts;

    /**
     * Gets the value of the certs property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getCerts() {
        return certs;
    }

    /**
     * Sets the value of the certs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setCerts(VOReferenceType value) {
        this.certs = value;
    }

    /**
     * Gets the value of the crLs property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getCRLs() {
        return crLs;
    }

    /**
     * Sets the value of the crLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setCRLs(VOReferenceType value) {
        this.crLs = value;
    }

    /**
     * Gets the value of the ocsPs property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getOCSPs() {
        return ocsPs;
    }

    /**
     * Sets the value of the ocsPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setOCSPs(VOReferenceType value) {
        this.ocsPs = value;
    }

    /**
     * Gets the value of the tu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTU() {
        return tu;
    }

    /**
     * Sets the value of the tu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTU(String value) {
        this.tu = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link SATimestampType }
     *     
     */
    public SATimestampType getTS() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SATimestampType }
     *     
     */
    public void setTS(SATimestampType value) {
        this.ts = value;
    }

}
