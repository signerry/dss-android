
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ModificationDetection complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ModificationDetection"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AnnotationOverlap" type="{http://dss.esig.europa.eu/validation/diagnostic}Modification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="VisualDifference" type="{http://dss.esig.europa.eu/validation/diagnostic}Modification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PageDifference" type="{http://dss.esig.europa.eu/validation/diagnostic}Modification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ObjectModifications" type="{http://dss.esig.europa.eu/validation/diagnostic}ObjectModifications" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationDetection", propOrder = {
    "annotationOverlap",
    "visualDifference",
    "pageDifference",
    "objectModifications"
})
public class XmlModificationDetection implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AnnotationOverlap")
    protected List<XmlModification> annotationOverlap;
    @XmlElement(name = "VisualDifference")
    protected List<XmlModification> visualDifference;
    @XmlElement(name = "PageDifference")
    protected List<XmlModification> pageDifference;
    @XmlElement(name = "ObjectModifications")
    protected XmlObjectModifications objectModifications;

    /**
     * Gets the value of the annotationOverlap property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the annotationOverlap property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnnotationOverlap().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlModification }
     * 
     * 
     */
    public List<XmlModification> getAnnotationOverlap() {
        if (annotationOverlap == null) {
            annotationOverlap = new ArrayList<XmlModification>();
        }
        return this.annotationOverlap;
    }

    /**
     * Gets the value of the visualDifference property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the visualDifference property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getVisualDifference().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlModification }
     * 
     * 
     */
    public List<XmlModification> getVisualDifference() {
        if (visualDifference == null) {
            visualDifference = new ArrayList<XmlModification>();
        }
        return this.visualDifference;
    }

    /**
     * Gets the value of the pageDifference property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pageDifference property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPageDifference().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlModification }
     * 
     * 
     */
    public List<XmlModification> getPageDifference() {
        if (pageDifference == null) {
            pageDifference = new ArrayList<XmlModification>();
        }
        return this.pageDifference;
    }

    /**
     * Gets the value of the objectModifications property.
     * 
     * @return
     *     possible object is
     *     {@link XmlObjectModifications }
     *     
     */
    public XmlObjectModifications getObjectModifications() {
        return objectModifications;
    }

    /**
     * Sets the value of the objectModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlObjectModifications }
     *     
     */
    public void setObjectModifications(XmlObjectModifications value) {
        this.objectModifications = value;
    }

}
