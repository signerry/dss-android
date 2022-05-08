
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.saml.jaxb.assertion.EncryptedElementType;
import eu.europa.esig.saml.jaxb.assertion.NameIDType;


/**
 * &lt;p&gt;Java class for ManageNameIDRequestType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ManageNameIDRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}RequestAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}NameID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedID"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}NewID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}NewEncryptedID"/&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}Terminate"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageNameIDRequestType", propOrder = {
    "nameID",
    "encryptedID",
    "newID",
    "newEncryptedID",
    "terminate"
})
public class ManageNameIDRequestType
    extends RequestAbstractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected NameIDType nameID;
    @XmlElement(name = "EncryptedID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    protected EncryptedElementType encryptedID;
    @XmlElement(name = "NewID")
    protected String newID;
    @XmlElement(name = "NewEncryptedID")
    protected EncryptedElementType newEncryptedID;
    @XmlElement(name = "Terminate")
    protected TerminateType terminate;

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
     * Gets the value of the newID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewID() {
        return newID;
    }

    /**
     * Sets the value of the newID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewID(String value) {
        this.newID = value;
    }

    /**
     * Gets the value of the newEncryptedID property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedElementType }
     *     
     */
    public EncryptedElementType getNewEncryptedID() {
        return newEncryptedID;
    }

    /**
     * Sets the value of the newEncryptedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedElementType }
     *     
     */
    public void setNewEncryptedID(EncryptedElementType value) {
        this.newEncryptedID = value;
    }

    /**
     * Gets the value of the terminate property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateType }
     *     
     */
    public TerminateType getTerminate() {
        return terminate;
    }

    /**
     * Sets the value of the terminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateType }
     *     
     */
    public void setTerminate(TerminateType value) {
        this.terminate = value;
    }

}
