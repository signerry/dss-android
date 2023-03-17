//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:14:15 AM EET 
//


package eu.europa.esig.dss.simplecertificatereport.jaxb;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;


/**
 * <p>Java class for Revocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thisUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="revocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="revocationReason" type="{http://dss.esig.europa.eu/validation/simple-certificate-report}RevocationReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revocation", propOrder = {
    "thisUpdate",
    "revocationDate",
    "revocationReason"
})
public class XmlRevocation implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date thisUpdate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date revocationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected RevocationReason revocationReason;

    /**
     * Gets the value of the thisUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getThisUpdate() {
        return thisUpdate;
    }

    /**
     * Sets the value of the thisUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisUpdate(Date value) {
        this.thisUpdate = value;
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
     * Gets the value of the revocationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RevocationReason getRevocationReason() {
        return revocationReason;
    }

    /**
     * Sets the value of the revocationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevocationReason(RevocationReason value) {
        this.revocationReason = value;
    }

}
