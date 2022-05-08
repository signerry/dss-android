
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ScopingType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ScopingType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}IDPList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequesterID" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ProxyCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopingType", propOrder = {
    "idpList",
    "requesterID"
})
public class ScopingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IDPList")
    protected IDPListType idpList;
    @XmlElement(name = "RequesterID")
    @XmlSchemaType(name = "anyURI")
    protected List<String> requesterID;
    @XmlAttribute(name = "ProxyCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger proxyCount;

    /**
     * Gets the value of the idpList property.
     * 
     * @return
     *     possible object is
     *     {@link IDPListType }
     *     
     */
    public IDPListType getIDPList() {
        return idpList;
    }

    /**
     * Sets the value of the idpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDPListType }
     *     
     */
    public void setIDPList(IDPListType value) {
        this.idpList = value;
    }

    /**
     * Gets the value of the requesterID property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the requesterID property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRequesterID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequesterID() {
        if (requesterID == null) {
            requesterID = new ArrayList<String>();
        }
        return this.requesterID;
    }

    /**
     * Gets the value of the proxyCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProxyCount() {
        return proxyCount;
    }

    /**
     * Sets the value of the proxyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProxyCount(BigInteger value) {
        this.proxyCount = value;
    }

}
