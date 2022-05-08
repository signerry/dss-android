
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TSPType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TSPType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}TSPInformation"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}TSPServices"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPType", propOrder = {
    "tspInformation",
    "tspServices"
})
public class TSPType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TSPInformation", required = true)
    protected TSPInformationType tspInformation;
    @XmlElement(name = "TSPServices", required = true)
    protected TSPServicesListType tspServices;

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
     * Gets the value of the tspServices property.
     * 
     * @return
     *     possible object is
     *     {@link TSPServicesListType }
     *     
     */
    public TSPServicesListType getTSPServices() {
        return tspServices;
    }

    /**
     * Sets the value of the tspServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPServicesListType }
     *     
     */
    public void setTSPServices(TSPServicesListType value) {
        this.tspServices = value;
    }

}
