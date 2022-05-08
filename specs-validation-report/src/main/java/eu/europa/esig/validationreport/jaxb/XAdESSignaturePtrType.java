
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for XAdESSignaturePtrType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="XAdESSignaturePtrType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NsPrefixMapping" type="{http://uri.etsi.org/19102/v1.2.1#}NsPrefixMappingType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="WhichDocument" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *       &amp;lt;attribute name="XPath" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="SchemaRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAdESSignaturePtrType", propOrder = {
    "nsPrefixMapping"
})
public class XAdESSignaturePtrType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NsPrefixMapping")
    protected List<NsPrefixMappingType> nsPrefixMapping;
    @XmlAttribute(name = "WhichDocument")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichDocument;
    @XmlAttribute(name = "XPath")
    protected String xPath;
    @XmlAttribute(name = "SchemaRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> schemaRefs;

    /**
     * Gets the value of the nsPrefixMapping property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the nsPrefixMapping property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNsPrefixMapping().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NsPrefixMappingType }
     * 
     * 
     */
    public List<NsPrefixMappingType> getNsPrefixMapping() {
        if (nsPrefixMapping == null) {
            nsPrefixMapping = new ArrayList<NsPrefixMappingType>();
        }
        return this.nsPrefixMapping;
    }

    /**
     * Gets the value of the whichDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWhichDocument() {
        return whichDocument;
    }

    /**
     * Sets the value of the whichDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWhichDocument(Object value) {
        this.whichDocument = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the schemaRefs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the schemaRefs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSchemaRefs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSchemaRefs() {
        if (schemaRefs == null) {
            schemaRefs = new ArrayList<Object>();
        }
        return this.schemaRefs;
    }

}
