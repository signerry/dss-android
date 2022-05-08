
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for CryptoInformationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CryptoInformationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationObjectId" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType"/&amp;gt;
 *         &amp;lt;element name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="AlgorithmParameters" type="{http://uri.etsi.org/19102/v1.2.1#}TypedDataType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SecureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoInformationType", propOrder = {
    "validationObjectId",
    "algorithm",
    "algorithmParameters",
    "secureAlgorithm",
    "notAfter",
    "any"
})
public class CryptoInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationObjectId", required = true)
    protected VOReferenceType validationObjectId;
    @XmlElement(name = "Algorithm", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String algorithm;
    @XmlElement(name = "AlgorithmParameters")
    protected TypedDataType algorithmParameters;
    @XmlElement(name = "SecureAlgorithm")
    protected boolean secureAlgorithm;
    @XmlElement(name = "NotAfter", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notAfter;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the validationObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getValidationObjectId() {
        return validationObjectId;
    }

    /**
     * Sets the value of the validationObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setValidationObjectId(VOReferenceType value) {
        this.validationObjectId = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the algorithmParameters property.
     * 
     * @return
     *     possible object is
     *     {@link TypedDataType }
     *     
     */
    public TypedDataType getAlgorithmParameters() {
        return algorithmParameters;
    }

    /**
     * Sets the value of the algorithmParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypedDataType }
     *     
     */
    public void setAlgorithmParameters(TypedDataType value) {
        this.algorithmParameters = value;
    }

    /**
     * Gets the value of the secureAlgorithm property.
     * 
     */
    public boolean isSecureAlgorithm() {
        return secureAlgorithm;
    }

    /**
     * Sets the value of the secureAlgorithm property.
     * 
     */
    public void setSecureAlgorithm(boolean value) {
        this.secureAlgorithm = value;
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
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
