
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ObjectModifications complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ObjectModifications"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ExtensionChange" type="{http://dss.esig.europa.eu/validation/diagnostic}ObjectModification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureOrFormFill" type="{http://dss.esig.europa.eu/validation/diagnostic}ObjectModification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AnnotationChange" type="{http://dss.esig.europa.eu/validation/diagnostic}ObjectModification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Undefined" type="{http://dss.esig.europa.eu/validation/diagnostic}ObjectModification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectModifications", propOrder = {
    "extensionChanges",
    "signatureOrFormFill",
    "annotationChanges",
    "undefined"
})
public class XmlObjectModifications implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ExtensionChange")
    protected List<XmlObjectModification> extensionChanges;
    @XmlElement(name = "SignatureOrFormFill")
    protected List<XmlObjectModification> signatureOrFormFill;
    @XmlElement(name = "AnnotationChange")
    protected List<XmlObjectModification> annotationChanges;
    @XmlElement(name = "Undefined")
    protected List<XmlObjectModification> undefined;

    /**
     * Gets the value of the extensionChanges property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the extensionChanges property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExtensionChanges().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlObjectModification }
     * 
     * 
     */
    public List<XmlObjectModification> getExtensionChanges() {
        if (extensionChanges == null) {
            extensionChanges = new ArrayList<XmlObjectModification>();
        }
        return this.extensionChanges;
    }

    /**
     * Gets the value of the signatureOrFormFill property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureOrFormFill property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureOrFormFill().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlObjectModification }
     * 
     * 
     */
    public List<XmlObjectModification> getSignatureOrFormFill() {
        if (signatureOrFormFill == null) {
            signatureOrFormFill = new ArrayList<XmlObjectModification>();
        }
        return this.signatureOrFormFill;
    }

    /**
     * Gets the value of the annotationChanges property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the annotationChanges property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnnotationChanges().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlObjectModification }
     * 
     * 
     */
    public List<XmlObjectModification> getAnnotationChanges() {
        if (annotationChanges == null) {
            annotationChanges = new ArrayList<XmlObjectModification>();
        }
        return this.annotationChanges;
    }

    /**
     * Gets the value of the undefined property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the undefined property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUndefined().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlObjectModification }
     * 
     * 
     */
    public List<XmlObjectModification> getUndefined() {
        if (undefined == null) {
            undefined = new ArrayList<XmlObjectModification>();
        }
        return this.undefined;
    }

}
