
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OCSPRefsType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OCSPRefsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="OCSPRef" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPRefType" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPRefsType", propOrder = {
    "ocspRef"
})
public class OCSPRefsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OCSPRef", required = true)
    protected List<OCSPRefType> ocspRef;

    /**
     * Gets the value of the ocspRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ocspRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOCSPRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OCSPRefType }
     * 
     * 
     */
    public List<OCSPRefType> getOCSPRef() {
        if (ocspRef == null) {
            ocspRef = new ArrayList<OCSPRefType>();
        }
        return this.ocspRef;
    }

}
