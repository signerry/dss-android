
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FoundRevocations complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FoundRevocations"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RelatedRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}RelatedRevocation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrphanRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanRevocation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundRevocations", propOrder = {
    "relatedRevocations",
    "orphanRevocations"
})
public class XmlFoundRevocations implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedRevocation")
    protected List<XmlRelatedRevocation> relatedRevocations;
    @XmlElement(name = "OrphanRevocation")
    protected List<XmlOrphanRevocation> orphanRevocations;

    /**
     * Gets the value of the relatedRevocations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relatedRevocations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelatedRevocations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRelatedRevocation }
     * 
     * 
     */
    public List<XmlRelatedRevocation> getRelatedRevocations() {
        if (relatedRevocations == null) {
            relatedRevocations = new ArrayList<XmlRelatedRevocation>();
        }
        return this.relatedRevocations;
    }

    /**
     * Gets the value of the orphanRevocations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the orphanRevocations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrphanRevocations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlOrphanRevocation }
     * 
     * 
     */
    public List<XmlOrphanRevocation> getOrphanRevocations() {
        if (orphanRevocations == null) {
            orphanRevocations = new ArrayList<XmlOrphanRevocation>();
        }
        return this.orphanRevocations;
    }

}
