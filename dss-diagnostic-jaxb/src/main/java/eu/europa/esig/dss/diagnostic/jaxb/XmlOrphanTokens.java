
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="OrphanCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanCertificateToken" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrphanRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanRevocationToken" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orphanCertificates",
    "orphanRevocations"
})
public class XmlOrphanTokens implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrphanCertificate")
    protected List<XmlOrphanCertificateToken> orphanCertificates;
    @XmlElement(name = "OrphanRevocation")
    protected List<XmlOrphanRevocationToken> orphanRevocations;

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
     * {@link XmlOrphanCertificateToken }
     * 
     * 
     */
    public List<XmlOrphanCertificateToken> getOrphanCertificates() {
        if (orphanCertificates == null) {
            orphanCertificates = new ArrayList<XmlOrphanCertificateToken>();
        }
        return this.orphanCertificates;
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
     * {@link XmlOrphanRevocationToken }
     * 
     * 
     */
    public List<XmlOrphanRevocationToken> getOrphanRevocations() {
        if (orphanRevocations == null) {
            orphanRevocations = new ArrayList<XmlOrphanRevocationToken>();
        }
        return this.orphanRevocations;
    }

}
