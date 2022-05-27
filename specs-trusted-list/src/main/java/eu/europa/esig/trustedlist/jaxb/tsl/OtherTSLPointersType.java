
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OtherTSLPointersType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OtherTSLPointersType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}OtherTSLPointer" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTSLPointersType", propOrder = {
    "otherTSLPointer"
})
public class OtherTSLPointersType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OtherTSLPointer", required = true)
    protected List<OtherTSLPointerType> otherTSLPointer;

    /**
     * Gets the value of the otherTSLPointer property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the otherTSLPointer property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOtherTSLPointer().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTSLPointerType }
     * 
     * 
     */
    public List<OtherTSLPointerType> getOtherTSLPointer() {
        if (otherTSLPointer == null) {
            otherTSLPointer = new ArrayList<OtherTSLPointerType>();
        }
        return this.otherTSLPointer;
    }

}
