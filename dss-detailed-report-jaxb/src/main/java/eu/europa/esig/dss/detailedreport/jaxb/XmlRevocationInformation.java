
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;


/**
 * &lt;p&gt;Java class for RevocationInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RevocationInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CertificateId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="RevocationId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{http://dss.esig.europa.eu/validation/detailed-report}RevocationReason" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationInformation", propOrder = {
    "certificateId",
    "revocationId",
    "reason",
    "revocationDate"
})
public class XmlRevocationInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CertificateId", required = true)
    protected String certificateId;
    @XmlElement(name = "RevocationId", required = true)
    protected String revocationId;
    @XmlElement(name = "Reason", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected RevocationReason reason;
    @XmlElement(name = "RevocationDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date revocationDate;

    /**
     * Gets the value of the certificateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Sets the value of the certificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateId(String value) {
        this.certificateId = value;
    }

    /**
     * Gets the value of the revocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevocationId() {
        return revocationId;
    }

    /**
     * Sets the value of the revocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationId(String value) {
        this.revocationId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(RevocationReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the revocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRevocationDate() {
        return revocationDate;
    }

    /**
     * Sets the value of the revocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationDate(Date value) {
        this.revocationDate = value;
    }

}
