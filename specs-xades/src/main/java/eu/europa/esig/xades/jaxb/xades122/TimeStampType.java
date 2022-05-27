
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.xmldsig.jaxb.CanonicalizationMethodType;


/**
 * &lt;p&gt;Java class for TimeStampType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimeStampType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Include" type="{http://uri.etsi.org/01903/v1.2.2#}IncludeType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}EncapsulatedPKIDataType"/&amp;gt;
 *           &amp;lt;element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}AnyType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
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
@XmlType(name = "TimeStampType", propOrder = {
    "include",
    "canonicalizationMethod",
    "encapsulatedTimeStamp",
    "xmlTimeStamp"
})
public class TimeStampType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Include", required = true)
    protected List<IncludeType> include;
    @XmlElement(name = "CanonicalizationMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected CanonicalizationMethodType canonicalizationMethod;
    @XmlElement(name = "EncapsulatedTimeStamp")
    protected EncapsulatedPKIDataType encapsulatedTimeStamp;
    @XmlElement(name = "XMLTimeStamp")
    protected AnyType xmlTimeStamp;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the include property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the include property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getInclude().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeType }
     * 
     * 
     */
    public List<IncludeType> getInclude() {
        if (include == null) {
            include = new ArrayList<IncludeType>();
        }
        return this.include;
    }

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public CanonicalizationMethodType getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethodType value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the encapsulatedTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public EncapsulatedPKIDataType getEncapsulatedTimeStamp() {
        return encapsulatedTimeStamp;
    }

    /**
     * Sets the value of the encapsulatedTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public void setEncapsulatedTimeStamp(EncapsulatedPKIDataType value) {
        this.encapsulatedTimeStamp = value;
    }

    /**
     * Gets the value of the xmlTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getXMLTimeStamp() {
        return xmlTimeStamp;
    }

    /**
     * Sets the value of the xmlTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setXMLTimeStamp(AnyType value) {
        this.xmlTimeStamp = value;
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
