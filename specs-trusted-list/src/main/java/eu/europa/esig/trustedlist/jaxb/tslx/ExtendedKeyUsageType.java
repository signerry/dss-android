
package eu.europa.esig.trustedlist.jaxb.tslx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import eu.europa.esig.xades.jaxb.xades132.ObjectIdentifierType;


/**
 * &lt;p&gt;Java class for ExtendedKeyUsageType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExtendedKeyUsageType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="KeyPurposeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedKeyUsageType", propOrder = {
    "keyPurposeId"
})
public class ExtendedKeyUsageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyPurposeId", required = true)
    protected List<ObjectIdentifierType> keyPurposeId;

    /**
     * Gets the value of the keyPurposeId property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the keyPurposeId property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getKeyPurposeId().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getKeyPurposeId() {
        if (keyPurposeId == null) {
            keyPurposeId = new ArrayList<ObjectIdentifierType>();
        }
        return this.keyPurposeId;
    }

}
