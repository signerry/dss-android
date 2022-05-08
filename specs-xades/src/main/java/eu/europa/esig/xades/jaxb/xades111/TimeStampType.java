
package eu.europa.esig.xades.jaxb.xades111;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &amp;lt;element name="HashDataInfo" type="{http://uri.etsi.org/01903/v1.1.1#}HashDataInfoType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}EncapsulatedPKIDataType"/&amp;gt;
 *           &amp;lt;element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.1.1#}AnyType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeStampType", propOrder = {
    "hashDataInfo",
    "encapsulatedTimeStamp",
    "xmlTimeStamp"
})
public class TimeStampType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HashDataInfo", required = true)
    protected List<HashDataInfoType> hashDataInfo;
    @XmlElement(name = "EncapsulatedTimeStamp")
    protected EncapsulatedPKIDataType encapsulatedTimeStamp;
    @XmlElement(name = "XMLTimeStamp")
    protected AnyType xmlTimeStamp;

    /**
     * Gets the value of the hashDataInfo property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the hashDataInfo property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getHashDataInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link HashDataInfoType }
     * 
     * 
     */
    public List<HashDataInfoType> getHashDataInfo() {
        if (hashDataInfo == null) {
            hashDataInfo = new ArrayList<HashDataInfoType>();
        }
        return this.hashDataInfo;
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

}
