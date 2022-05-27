
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.esig.saml.jaxb.assertion.BaseIDAbstractType;
import eu.europa.esig.saml.jaxb.assertion.EncryptedElementType;
import eu.europa.esig.saml.jaxb.assertion.NameIDType;


/**
 * &lt;p&gt;Java class for LogoutRequestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LogoutRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}RequestAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}BaseID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}NameID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedID"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}SessionIndex" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="NotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogoutRequestType", propOrder = {
    "baseID",
    "nameID",
    "encryptedID",
    "sessionIndex"
})
public class LogoutRequestType
    extends RequestAbstractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BaseID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected BaseIDAbstractType baseID;
    @XmlElement(name = "NameID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected NameIDType nameID;
    @XmlElement(name = "EncryptedID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected EncryptedElementType encryptedID;
    @XmlElement(name = "SessionIndex")
    protected List<String> sessionIndex;
    @XmlAttribute(name = "Reason")
    protected String reason;
    @XmlAttribute(name = "NotOnOrAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notOnOrAfter;

    /**
     * Gets the value of the baseID property.
     * 
     * @return
     *     possible object is
     *     {@link BaseIDAbstractType }
     *     
     */
    public BaseIDAbstractType getBaseID() {
        return baseID;
    }

    /**
     * Sets the value of the baseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseIDAbstractType }
     *     
     */
    public void setBaseID(BaseIDAbstractType value) {
        this.baseID = value;
    }

    /**
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link NameIDType }
     *     
     */
    public NameIDType getNameID() {
        return nameID;
    }

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameIDType }
     *     
     */
    public void setNameID(NameIDType value) {
        this.nameID = value;
    }

    /**
     * Gets the value of the encryptedID property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedElementType }
     *     
     */
    public EncryptedElementType getEncryptedID() {
        return encryptedID;
    }

    /**
     * Sets the value of the encryptedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedElementType }
     *     
     */
    public void setEncryptedID(EncryptedElementType value) {
        this.encryptedID = value;
    }

    /**
     * Gets the value of the sessionIndex property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sessionIndex property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSessionIndex().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSessionIndex() {
        if (sessionIndex == null) {
            sessionIndex = new ArrayList<String>();
        }
        return this.sessionIndex;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
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
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the notOnOrAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotOnOrAfter() {
        return notOnOrAfter;
    }

    /**
     * Sets the value of the notOnOrAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotOnOrAfter(XMLGregorianCalendar value) {
        this.notOnOrAfter = value;
    }

}
