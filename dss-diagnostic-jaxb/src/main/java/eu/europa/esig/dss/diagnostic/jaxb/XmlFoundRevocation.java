
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationOrigin;
import eu.europa.esig.dss.enumerations.RevocationType;


/**
 * &lt;p&gt;Java class for FoundRevocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FoundRevocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Type" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationType"/&amp;gt;
 *         &amp;lt;element name="Origin" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationOriginType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationRef" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationRef" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundRevocation", propOrder = {
    "type",
    "origins",
    "revocationRefs"
})
@XmlSeeAlso({
    XmlRelatedRevocation.class,
    XmlOrphanRevocation.class
})
public abstract class XmlFoundRevocation implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Type", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected RevocationType type;
    @XmlElement(name = "Origin", type = String.class)
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected List<RevocationOrigin> origins;
    @XmlElement(name = "RevocationRef")
    protected List<XmlRevocationRef> revocationRefs;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(RevocationType value) {
        this.type = value;
    }

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
    public List<RevocationOrigin> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<RevocationOrigin>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the revocationRefs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the revocationRefs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRevocationRefs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRevocationRef }
     * 
     * 
     */
    public List<XmlRevocationRef> getRevocationRefs() {
        if (revocationRefs == null) {
            revocationRefs = new ArrayList<XmlRevocationRef>();
        }
        return this.revocationRefs;
    }

}
