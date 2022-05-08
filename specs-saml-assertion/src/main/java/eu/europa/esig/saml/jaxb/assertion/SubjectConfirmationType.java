
package eu.europa.esig.saml.jaxb.assertion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SubjectConfirmationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SubjectConfirmationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}BaseID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}NameID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedID"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectConfirmationData" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Method" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectConfirmationType", propOrder = {
    "baseID",
    "nameID",
    "encryptedID",
    "subjectConfirmationData"
})
public class SubjectConfirmationType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BaseID")
    protected BaseIDAbstractType baseID;
    @XmlElement(name = "NameID")
    protected NameIDType nameID;
    @XmlElement(name = "EncryptedID")
    protected EncryptedElementType encryptedID;
    @XmlElement(name = "SubjectConfirmationData")
    protected SubjectConfirmationDataType subjectConfirmationData;
    @XmlAttribute(name = "Method", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String method;

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
     * Gets the value of the subjectConfirmationData property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectConfirmationDataType }
     *     
     */
    public SubjectConfirmationDataType getSubjectConfirmationData() {
        return subjectConfirmationData;
    }

    /**
     * Sets the value of the subjectConfirmationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectConfirmationDataType }
     *     
     */
    public void setSubjectConfirmationData(SubjectConfirmationDataType value) {
        this.subjectConfirmationData = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

}
