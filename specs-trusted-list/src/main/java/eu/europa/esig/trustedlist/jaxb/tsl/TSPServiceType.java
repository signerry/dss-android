
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TSPServiceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TSPServiceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceInformation"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceHistory" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServiceType", propOrder = {
    "serviceInformation",
    "serviceHistory"
})
public class TSPServiceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceInformation", required = true)
    protected TSPServiceInformationType serviceInformation;
    @XmlElement(name = "ServiceHistory")
    protected ServiceHistoryType serviceHistory;

    /**
     * Gets the value of the serviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSPServiceInformationType }
     *     
     */
    public TSPServiceInformationType getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPServiceInformationType }
     *     
     */
    public void setServiceInformation(TSPServiceInformationType value) {
        this.serviceInformation = value;
    }

    /**
     * Gets the value of the serviceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHistoryType }
     *     
     */
    public ServiceHistoryType getServiceHistory() {
        return serviceHistory;
    }

    /**
     * Sets the value of the serviceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHistoryType }
     *     
     */
    public void setServiceHistory(ServiceHistoryType value) {
        this.serviceHistory = value;
    }

}
