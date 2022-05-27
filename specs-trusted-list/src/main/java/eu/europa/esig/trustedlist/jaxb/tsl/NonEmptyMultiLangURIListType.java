
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NonEmptyMultiLangURIListType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NonEmptyMultiLangURIListType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="URI" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyMultiLangURIListType", propOrder = {
    "uri"
})
public class NonEmptyMultiLangURIListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "URI", required = true)
    protected List<NonEmptyMultiLangURIType> uri;

    /**
     * Gets the value of the uri property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the uri property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getURI().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NonEmptyMultiLangURIType }
     * 
     * 
     */
    public List<NonEmptyMultiLangURIType> getURI() {
        if (uri == null) {
            uri = new ArrayList<NonEmptyMultiLangURIType>();
        }
        return this.uri;
    }

}
