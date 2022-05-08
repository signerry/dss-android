
package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for ServiceHistoryInstanceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ServiceHistoryInstanceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceTypeIdentifier"/&amp;gt;
 *         &amp;lt;element name="ServiceName" type="{http://uri.etsi.org/02231/v2#}InternationalNamesType"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceDigitalIdentity"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceStatus"/&amp;gt;
 *         &amp;lt;element name="StatusStartingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ServiceInformationExtensions" type="{http://uri.etsi.org/02231/v2#}ExtensionsListType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHistoryInstanceType", propOrder = {
    "serviceTypeIdentifier",
    "serviceName",
    "serviceDigitalIdentity",
    "serviceStatus",
    "statusStartingTime",
    "serviceInformationExtensions"
})
public class ServiceHistoryInstanceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceTypeIdentifier", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceTypeIdentifier;
    @XmlElement(name = "ServiceName", required = true)
    protected InternationalNamesType serviceName;
    @XmlElement(name = "ServiceDigitalIdentity", required = true)
    protected DigitalIdentityListType serviceDigitalIdentity;
    @XmlElement(name = "ServiceStatus", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serviceStatus;
    @XmlElement(name = "StatusStartingTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusStartingTime;
    @XmlElement(name = "ServiceInformationExtensions")
    protected ExtensionsListType serviceInformationExtensions;

    /**
     * Gets the value of the serviceTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeIdentifier() {
        return serviceTypeIdentifier;
    }

    /**
     * Sets the value of the serviceTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeIdentifier(String value) {
        this.serviceTypeIdentifier = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setServiceName(InternationalNamesType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceDigitalIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalIdentityListType }
     *     
     */
    public DigitalIdentityListType getServiceDigitalIdentity() {
        return serviceDigitalIdentity;
    }

    /**
     * Sets the value of the serviceDigitalIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalIdentityListType }
     *     
     */
    public void setServiceDigitalIdentity(DigitalIdentityListType value) {
        this.serviceDigitalIdentity = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the statusStartingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusStartingTime() {
        return statusStartingTime;
    }

    /**
     * Sets the value of the statusStartingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusStartingTime(XMLGregorianCalendar value) {
        this.statusStartingTime = value;
    }

    /**
     * Gets the value of the serviceInformationExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsListType }
     *     
     */
    public ExtensionsListType getServiceInformationExtensions() {
        return serviceInformationExtensions;
    }

    /**
     * Sets the value of the serviceInformationExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsListType }
     *     
     */
    public void setServiceInformationExtensions(ExtensionsListType value) {
        this.serviceInformationExtensions = value;
    }

}
