
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for UnsignedPropertiesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnsignedPropertiesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="UnsignedSignatureProperties" type="{http://uri.etsi.org/01903/v1.2.2#}UnsignedSignaturePropertiesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UnsignedDataObjectProperties" type="{http://uri.etsi.org/01903/v1.2.2#}UnsignedDataObjectPropertiesType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedPropertiesType", propOrder = {
    "unsignedSignatureProperties",
    "unsignedDataObjectProperties"
})
public class UnsignedPropertiesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UnsignedSignatureProperties")
    protected UnsignedSignaturePropertiesType unsignedSignatureProperties;
    @XmlElement(name = "UnsignedDataObjectProperties")
    protected UnsignedDataObjectPropertiesType unsignedDataObjectProperties;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the unsignedSignatureProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public UnsignedSignaturePropertiesType getUnsignedSignatureProperties() {
        return unsignedSignatureProperties;
    }

    /**
     * Sets the value of the unsignedSignatureProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public void setUnsignedSignatureProperties(UnsignedSignaturePropertiesType value) {
        this.unsignedSignatureProperties = value;
    }

    /**
     * Gets the value of the unsignedDataObjectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public UnsignedDataObjectPropertiesType getUnsignedDataObjectProperties() {
        return unsignedDataObjectProperties;
    }

    /**
     * Sets the value of the unsignedDataObjectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public void setUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType value) {
        this.unsignedDataObjectProperties = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
