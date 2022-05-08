
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IDPListType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IDPListType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}IDPEntry" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}GetComplete" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDPListType", propOrder = {
    "idpEntry",
    "getComplete"
})
public class IDPListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IDPEntry", required = true)
    protected List<IDPEntryType> idpEntry;
    @XmlElement(name = "GetComplete")
    @XmlSchemaType(name = "anyURI")
    protected String getComplete;

    /**
     * Gets the value of the idpEntry property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the idpEntry property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIDPEntry().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link IDPEntryType }
     * 
     * 
     */
    public List<IDPEntryType> getIDPEntry() {
        if (idpEntry == null) {
            idpEntry = new ArrayList<IDPEntryType>();
        }
        return this.idpEntry;
    }

    /**
     * Gets the value of the getComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetComplete() {
        return getComplete;
    }

    /**
     * Sets the value of the getComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetComplete(String value) {
        this.getComplete = value;
    }

}
