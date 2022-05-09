
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.CertificateOrigin;


/**
 * &lt;p&gt;Java class for FoundCertificate complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FoundCertificate"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Origin" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateOriginType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateRef" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateRef" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundCertificate", propOrder = {
    "origins",
    "certificateRefs"
})
@XmlSeeAlso({
    XmlRelatedCertificate.class,
    XmlOrphanCertificate.class
})
public abstract class XmlFoundCertificate implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Origin", type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected List<CertificateOrigin> origins;
    @XmlElement(name = "CertificateRef")
    protected List<XmlCertificateRef> certificateRefs;

    /**
     * Gets the value of the origins property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the origins property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrigins().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<CertificateOrigin> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<CertificateOrigin>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the certificateRefs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the certificateRefs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCertificateRefs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlCertificateRef }
     * 
     * 
     */
    public List<XmlCertificateRef> getCertificateRefs() {
        if (certificateRefs == null) {
            certificateRefs = new ArrayList<XmlCertificateRef>();
        }
        return this.certificateRefs;
    }

}
