
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FoundCertificates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FoundCertificates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RelatedCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}RelatedCertificate" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrphanCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanCertificate" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundCertificates", propOrder = {
    "relatedCertificates",
    "orphanCertificates"
})
public class XmlFoundCertificates implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedCertificate")
    protected List<XmlRelatedCertificate> relatedCertificates;
    @XmlElement(name = "OrphanCertificate")
    protected List<XmlOrphanCertificate> orphanCertificates;

    /**
     * Gets the value of the relatedCertificates property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relatedCertificates property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelatedCertificates().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRelatedCertificate }
     * 
     * 
     */
    public List<XmlRelatedCertificate> getRelatedCertificates() {
        if (relatedCertificates == null) {
            relatedCertificates = new ArrayList<XmlRelatedCertificate>();
        }
        return this.relatedCertificates;
    }

    /**
     * Gets the value of the orphanCertificates property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the orphanCertificates property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrphanCertificates().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlOrphanCertificate }
     * 
     * 
     */
    public List<XmlOrphanCertificate> getOrphanCertificates() {
        if (orphanCertificates == null) {
            orphanCertificates = new ArrayList<XmlOrphanCertificate>();
        }
        return this.orphanCertificates;
    }

}
