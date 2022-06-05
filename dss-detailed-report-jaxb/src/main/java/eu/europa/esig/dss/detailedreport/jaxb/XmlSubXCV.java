
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SubXCV complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SubXCV"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CrossCertificate" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="EquivalentCertificate" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CRS" type="{http://dss.esig.europa.eu/validation/detailed-report}CRS" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RFC" type="{http://dss.esig.europa.eu/validation/detailed-report}RFC" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationInfo" type="{http://dss.esig.europa.eu/validation/detailed-report}RevocationInformation" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="TrustAnchor" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="SelfSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubXCV", propOrder = {
    "crossCertificates",
    "equivalentCertificates",
    "crs",
    "rfc",
    "revocationInfo"
})
public class XmlSubXCV
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlList
    @XmlElement(name = "CrossCertificate")
    protected List<String> crossCertificates;
    @XmlList
    @XmlElement(name = "EquivalentCertificate")
    protected List<String> equivalentCertificates;
    @XmlElement(name = "CRS")
    protected XmlCRS crs;
    @XmlElement(name = "RFC")
    protected XmlRFC rfc;
    @XmlElement(name = "RevocationInfo")
    protected XmlRevocationInformation revocationInfo;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "TrustAnchor")
    protected Boolean trustAnchor;
    @XmlAttribute(name = "SelfSigned")
    protected Boolean selfSigned;

    /**
     * Gets the value of the crossCertificates property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the crossCertificates property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCrossCertificates().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCrossCertificates() {
        if (crossCertificates == null) {
            crossCertificates = new ArrayList<String>();
        }
        return this.crossCertificates;
    }

    /**
     * Gets the value of the equivalentCertificates property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the equivalentCertificates property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEquivalentCertificates().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquivalentCertificates() {
        if (equivalentCertificates == null) {
            equivalentCertificates = new ArrayList<String>();
        }
        return this.equivalentCertificates;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCRS }
     *     
     */
    public XmlCRS getCRS() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCRS }
     *     
     */
    public void setCRS(XmlCRS value) {
        this.crs = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link XmlRFC }
     *     
     */
    public XmlRFC getRFC() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlRFC }
     *     
     */
    public void setRFC(XmlRFC value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the revocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XmlRevocationInformation }
     *     
     */
    public XmlRevocationInformation getRevocationInfo() {
        return revocationInfo;
    }

    /**
     * Sets the value of the revocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlRevocationInformation }
     *     
     */
    public void setRevocationInfo(XmlRevocationInformation value) {
        this.revocationInfo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the trustAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrustAnchor() {
        return trustAnchor;
    }

    /**
     * Sets the value of the trustAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrustAnchor(Boolean value) {
        this.trustAnchor = value;
    }

    /**
     * Gets the value of the selfSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfSigned() {
        return selfSigned;
    }

    /**
     * Sets the value of the selfSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfSigned(Boolean value) {
        this.selfSigned = value;
    }

}
