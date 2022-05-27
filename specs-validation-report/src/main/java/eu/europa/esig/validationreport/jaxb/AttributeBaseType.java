
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeBaseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AttributeBaseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AttributeObject" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Signed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeBaseType", propOrder = {
    "attributeObject"
})
@XmlSeeAlso({
    SASigningTimeType.class,
    SACertIDListType.class,
    SADataObjectFormatType.class,
    SACommitmentTypeIndicationType.class,
    SASigPolicyIdentifierType.class,
    SASignatureProductionPlaceType.class,
    SASignerRoleType.class,
    SACounterSignatureType.class,
    SARevIDListType.class,
    SADSSType.class,
    SAVRIType.class,
    SAReasonType.class,
    SANameType.class,
    SAContactInfoType.class,
    SASubFilterType.class,
    SATimestampType.class,
    SAMessageDigestType.class
})
public class AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeObject")
    protected List<VOReferenceType> attributeObject;
    @XmlAttribute(name = "Signed")
    protected Boolean signed;

    /**
     * Gets the value of the attributeObject property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the attributeObject property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAttributeObject().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link VOReferenceType }
     * 
     * 
     */
    public List<VOReferenceType> getAttributeObject() {
        if (attributeObject == null) {
            attributeObject = new ArrayList<VOReferenceType>();
        }
        return this.attributeObject;
    }

    /**
     * Gets the value of the signed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSigned(Boolean value) {
        this.signed = value;
    }

}
