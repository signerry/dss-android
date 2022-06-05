
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for SignatureReferenceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureReferenceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;sequence&amp;gt;
 *           &amp;lt;element name="CanonicalizationMethod" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="DigestMethod" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *           &amp;lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *         &amp;lt;/sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/19102/v1.2.1#}XAdESSignaturePtr"/&amp;gt;
 *         &amp;lt;element name="PAdESFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureReferenceType", propOrder = {
    "canonicalizationMethod",
    "digestMethod",
    "digestValue",
    "xAdESSignaturePtr",
    "pAdESFieldName",
    "any"
})
public class SignatureReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CanonicalizationMethod")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalizationMethod;
    @XmlElement(name = "DigestMethod")
    @XmlSchemaType(name = "anyURI")
    protected String digestMethod;
    @XmlElement(name = "DigestValue")
    protected byte[] digestValue;
    @XmlElement(name = "XAdESSignaturePtr")
    protected XAdESSignaturePtrType xAdESSignaturePtr;
    @XmlElement(name = "PAdESFieldName")
    protected String pAdESFieldName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalizationMethod(String value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the digestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestMethod() {
        return digestMethod;
    }

    /**
     * Sets the value of the digestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestMethod(String value) {
        this.digestMethod = value;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDigestValue(byte[] value) {
        this.digestValue = value;
    }

    /**
     * Gets the value of the xAdESSignaturePtr property.
     * 
     * @return
     *     possible object is
     *     {@link XAdESSignaturePtrType }
     *     
     */
    public XAdESSignaturePtrType getXAdESSignaturePtr() {
        return xAdESSignaturePtr;
    }

    /**
     * Sets the value of the xAdESSignaturePtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAdESSignaturePtrType }
     *     
     */
    public void setXAdESSignaturePtr(XAdESSignaturePtrType value) {
        this.xAdESSignaturePtr = value;
    }

    /**
     * Gets the value of the pAdESFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAdESFieldName() {
        return pAdESFieldName;
    }

    /**
     * Sets the value of the pAdESFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAdESFieldName(String value) {
        this.pAdESFieldName = value;
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
