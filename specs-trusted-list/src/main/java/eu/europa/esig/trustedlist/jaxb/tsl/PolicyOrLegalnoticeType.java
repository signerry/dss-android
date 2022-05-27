
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PolicyOrLegalnoticeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PolicyOrLegalnoticeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="TSLPolicy" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="TSLLegalNotice" type="{http://uri.etsi.org/02231/v2#}MultiLangStringType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOrLegalnoticeType", propOrder = {
    "tslPolicy",
    "tslLegalNotice"
})
public class PolicyOrLegalnoticeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TSLPolicy")
    protected List<NonEmptyMultiLangURIType> tslPolicy;
    @XmlElement(name = "TSLLegalNotice")
    protected List<MultiLangStringType> tslLegalNotice;

    /**
     * Gets the value of the tslPolicy property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tslPolicy property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTSLPolicy().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NonEmptyMultiLangURIType }
     * 
     * 
     */
    public List<NonEmptyMultiLangURIType> getTSLPolicy() {
        if (tslPolicy == null) {
            tslPolicy = new ArrayList<NonEmptyMultiLangURIType>();
        }
        return this.tslPolicy;
    }

    /**
     * Gets the value of the tslLegalNotice property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tslLegalNotice property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTSLLegalNotice().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MultiLangStringType }
     * 
     * 
     */
    public List<MultiLangStringType> getTSLLegalNotice() {
        if (tslLegalNotice == null) {
            tslLegalNotice = new ArrayList<MultiLangStringType>();
        }
        return this.tslLegalNotice;
    }

}
