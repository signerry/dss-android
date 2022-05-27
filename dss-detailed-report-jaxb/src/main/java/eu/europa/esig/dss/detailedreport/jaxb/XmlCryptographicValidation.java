
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for CryptographicValidation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CryptographicValidation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Algorithm" type="{http://dss.esig.europa.eu/validation/detailed-report}CryptographicAlgorithm"/&amp;gt;
 *         &amp;lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConcernedMaterial" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="secure" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicValidation", propOrder = {
    "algorithm",
    "notAfter",
    "validationTime",
    "concernedMaterial"
})
public class XmlCryptographicValidation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Algorithm", required = true)
    protected XmlCryptographicAlgorithm algorithm;
    @XmlElement(name = "NotAfter", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notAfter;
    @XmlElement(name = "ValidationTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationTime;
    @XmlElement(name = "ConcernedMaterial", required = true)
    protected String concernedMaterial;
    @XmlAttribute(name = "secure", required = true)
    protected boolean secure;

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCryptographicAlgorithm }
     *     
     */
    public XmlCryptographicAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCryptographicAlgorithm }
     *     
     */
    public void setAlgorithm(XmlCryptographicAlgorithm value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(Date value) {
        this.notAfter = value;
    }

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationTime(Date value) {
        this.validationTime = value;
    }

    /**
     * Gets the value of the concernedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcernedMaterial() {
        return concernedMaterial;
    }

    /**
     * Sets the value of the concernedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcernedMaterial(String value) {
        this.concernedMaterial = value;
    }

    /**
     * Gets the value of the secure property.
     * 
     */
    public boolean isSecure() {
        return secure;
    }

    /**
     * Sets the value of the secure property.
     * 
     */
    public void setSecure(boolean value) {
        this.secure = value;
    }

}
