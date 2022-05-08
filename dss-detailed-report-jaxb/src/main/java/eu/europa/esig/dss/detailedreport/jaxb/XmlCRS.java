
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CRS complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CRS"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RAC" type="{http://dss.esig.europa.eu/validation/detailed-report}RAC" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AcceptableRevocationId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="LatestAcceptableRevocationId" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRS", propOrder = {
    "rac",
    "acceptableRevocationId"
})
public class XmlCRS
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RAC")
    protected List<XmlRAC> rac;
    @XmlList
    @XmlElement(name = "AcceptableRevocationId")
    protected List<String> acceptableRevocationId;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "LatestAcceptableRevocationId")
    protected String latestAcceptableRevocationId;

    /**
     * Gets the value of the rac property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rac property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRAC().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRAC }
     * 
     * 
     */
    public List<XmlRAC> getRAC() {
        if (rac == null) {
            rac = new ArrayList<XmlRAC>();
        }
        return this.rac;
    }

    /**
     * Gets the value of the acceptableRevocationId property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the acceptableRevocationId property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAcceptableRevocationId().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcceptableRevocationId() {
        if (acceptableRevocationId == null) {
            acceptableRevocationId = new ArrayList<String>();
        }
        return this.acceptableRevocationId;
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
     * Gets the value of the latestAcceptableRevocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestAcceptableRevocationId() {
        return latestAcceptableRevocationId;
    }

    /**
     * Sets the value of the latestAcceptableRevocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestAcceptableRevocationId(String value) {
        this.latestAcceptableRevocationId = value;
    }

}
