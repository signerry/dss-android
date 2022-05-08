
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OCSPValuesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OCSPValuesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EncapsulatedOCSPValue" type="{http://uri.etsi.org/01903/v1.2.2#}EncapsulatedPKIDataType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPValuesType", propOrder = {
    "encapsulatedOCSPValue"
})
public class OCSPValuesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EncapsulatedOCSPValue", required = true)
    protected List<EncapsulatedPKIDataType> encapsulatedOCSPValue;

    /**
     * Gets the value of the encapsulatedOCSPValue property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the encapsulatedOCSPValue property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEncapsulatedOCSPValue().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedPKIDataType }
     * 
     * 
     */
    public List<EncapsulatedPKIDataType> getEncapsulatedOCSPValue() {
        if (encapsulatedOCSPValue == null) {
            encapsulatedOCSPValue = new ArrayList<EncapsulatedPKIDataType>();
        }
        return this.encapsulatedOCSPValue;
    }

}
