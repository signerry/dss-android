
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.CertificateStatus;
import eu.europa.esig.dss.enumerations.RevocationReason;


/**
 * &lt;p&gt;Java class for CertificateRevocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CertificateRevocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Status" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateStatus"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{http://dss.esig.europa.eu/validation/diagnostic}RevocationReason" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RevocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Revocation" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateRevocation", propOrder = {
    "status",
    "reason",
    "revocationDate"
})
public class XmlCertificateRevocation implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected CertificateStatus status;
    @XmlElement(name = "Reason", type = String.class)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected RevocationReason reason;
    @XmlElement(name = "RevocationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date revocationDate;
    @XmlAttribute(name = "Revocation", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlRevocation revocation;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public CertificateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(CertificateStatus value) {
        this.status = value;
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

    /**
     * Gets the value of the revocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlRevocation getRevocation() {
        return revocation;
    }

    /**
     * Sets the value of the revocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRevocation(XmlRevocation value) {
        this.revocation = value;
    }

}
