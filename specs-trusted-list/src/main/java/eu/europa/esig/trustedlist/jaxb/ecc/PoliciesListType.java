
package eu.europa.esig.trustedlist.jaxb.ecc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.xades.jaxb.xades132.ObjectIdentifierType;


/**
 * &lt;p&gt;Java class for PoliciesListType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PoliciesListType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="PolicyIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoliciesListType", propOrder = {
    "policyIdentifier"
})
public class PoliciesListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PolicyIdentifier", required = true)
    protected List<ObjectIdentifierType> policyIdentifier;

    /**
     * Gets the value of the policyIdentifier property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the policyIdentifier property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPolicyIdentifier().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getPolicyIdentifier() {
        if (policyIdentifier == null) {
            policyIdentifier = new ArrayList<ObjectIdentifierType>();
        }
        return this.policyIdentifier;
    }

}
