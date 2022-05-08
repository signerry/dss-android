
package eu.europa.esig.trustedlist.jaxb.tslx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.xades.jaxb.xades132.ObjectIdentifierType;


/**
 * &lt;p&gt;Java class for CertSubjectDNAttributeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CertSubjectDNAttributeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="AttributeOID" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertSubjectDNAttributeType", propOrder = {
    "attributeOID"
})
public class CertSubjectDNAttributeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AttributeOID", required = true)
    protected List<ObjectIdentifierType> attributeOID;

    /**
     * Gets the value of the attributeOID property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the attributeOID property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAttributeOID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getAttributeOID() {
        if (attributeOID == null) {
            attributeOID = new ArrayList<ObjectIdentifierType>();
        }
        return this.attributeOID;
    }

}
