
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AdditionalInformationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AdditionalInformationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="TextualInformation" type="{http://uri.etsi.org/02231/v2#}MultiLangStringType"/&amp;gt;
 *         &amp;lt;element name="OtherInformation" type="{http://uri.etsi.org/02231/v2#}AnyType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformationType", propOrder = {
    "textualInformationOrOtherInformation"
})
public class AdditionalInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "TextualInformation", type = MultiLangStringType.class),
        @XmlElement(name = "OtherInformation", type = AnyType.class)
    })
    protected List<Serializable> textualInformationOrOtherInformation;

    /**
     * Gets the value of the textualInformationOrOtherInformation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the textualInformationOrOtherInformation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTextualInformationOrOtherInformation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MultiLangStringType }
     * {@link AnyType }
     * 
     * 
     */
    public List<Serializable> getTextualInformationOrOtherInformation() {
        if (textualInformationOrOtherInformation == null) {
            textualInformationOrOtherInformation = new ArrayList<Serializable>();
        }
        return this.textualInformationOrOtherInformation;
    }

}
