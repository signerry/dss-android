
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import eu.europa.esig.trustedlist.jaxb.tsl.DigitalIdentityType;
import eu.europa.esig.trustedlist.jaxb.tsl.TSPInformationType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for SignatureValidatorType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureValidatorType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DigitalId" type="{http://uri.etsi.org/02231/v2#}DigitalIdentityType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="TSPInformation" type="{http://uri.etsi.org/02231/v2#}TSPInformationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValidatorType", propOrder = {
    "digitalId",
    "tspInformation",
    "any"
})
public class SignatureValidatorType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DigitalId", required = true)
    protected List<DigitalIdentityType> digitalId;
    @XmlElement(name = "TSPInformation")
    protected TSPInformationType tspInformation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the digitalId property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the digitalId property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDigitalId().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalIdentityType }
     * 
     * 
     */
    public List<DigitalIdentityType> getDigitalId() {
        if (digitalId == null) {
            digitalId = new ArrayList<DigitalIdentityType>();
        }
        return this.digitalId;
    }

    /**
     * Gets the value of the tspInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSPInformationType }
     *     
     */
    public TSPInformationType getTSPInformation() {
        return tspInformation;
    }

    /**
     * Sets the value of the tspInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPInformationType }
     *     
     */
    public void setTSPInformation(TSPInformationType value) {
        this.tspInformation = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAny().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
