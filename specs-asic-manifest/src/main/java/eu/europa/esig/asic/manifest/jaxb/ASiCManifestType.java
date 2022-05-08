
package eu.europa.esig.asic.manifest.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ASiCManifestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ASiCManifestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02918/v1.2.1#}SigReference"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02918/v1.2.1#}DataObjectReference" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="ASiCManifestExtensions" type="{http://uri.etsi.org/02918/v1.2.1#}ExtensionsListType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASiCManifestType", propOrder = {
    "sigReference",
    "dataObjectReference",
    "aSiCManifestExtensions"
})
public class ASiCManifestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigReference", required = true)
    protected SigReferenceType sigReference;
    @XmlElement(name = "DataObjectReference", required = true)
    protected List<DataObjectReferenceType> dataObjectReference;
    @XmlElement(name = "ASiCManifestExtensions")
    protected ExtensionsListType aSiCManifestExtensions;

    /**
     * Gets the value of the sigReference property.
     * 
     * @return
     *     possible object is
     *     {@link SigReferenceType }
     *     
     */
    public SigReferenceType getSigReference() {
        return sigReference;
    }

    /**
     * Sets the value of the sigReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigReferenceType }
     *     
     */
    public void setSigReference(SigReferenceType value) {
        this.sigReference = value;
    }

    /**
     * Gets the value of the dataObjectReference property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dataObjectReference property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDataObjectReference().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectReferenceType }
     * 
     * 
     */
    public List<DataObjectReferenceType> getDataObjectReference() {
        if (dataObjectReference == null) {
            dataObjectReference = new ArrayList<DataObjectReferenceType>();
        }
        return this.dataObjectReference;
    }

    /**
     * Gets the value of the aSiCManifestExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsListType }
     *     
     */
    public ExtensionsListType getASiCManifestExtensions() {
        return aSiCManifestExtensions;
    }

    /**
     * Sets the value of the aSiCManifestExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsListType }
     *     
     */
    public void setASiCManifestExtensions(ExtensionsListType value) {
        this.aSiCManifestExtensions = value;
    }

}
