
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationRefOrigin;


/**
 * &lt;p&gt;Java class for RevocationRef complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RevocationRef"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Origin" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationRefOriginType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResponderId" type="{http://dss.esig.europa.eu/validation/diagnostic}SignerInfo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationRef", propOrder = {
    "origins",
    "digestAlgoAndValue",
    "producedAt",
    "responderId"
})
public class XmlRevocationRef implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Origin", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter21 .class)
    protected List<RevocationRefOrigin> origins;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;
    @XmlElement(name = "ProducedAt", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date producedAt;
    @XmlElement(name = "ResponderId")
    protected XmlSignerInfo responderId;

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
    public List<RevocationRefOrigin> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<RevocationRefOrigin>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

    /**
     * Gets the value of the producedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProducedAt() {
        return producedAt;
    }

    /**
     * Sets the value of the producedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducedAt(Date value) {
        this.producedAt = value;
    }

    /**
     * Gets the value of the responderId property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignerInfo }
     *     
     */
    public XmlSignerInfo getResponderId() {
        return responderId;
    }

    /**
     * Sets the value of the responderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignerInfo }
     *     
     */
    public void setResponderId(XmlSignerInfo value) {
        this.responderId = value;
    }

}
