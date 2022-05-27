
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.validationreport.enums.SignatureValidationProcessID;


/**
 * &lt;p&gt;Java class for SignatureValidationProcessType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureValidationProcessType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignatureValidationProcessID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValidationServicePolicy" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureValidationPracticeStatement" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *         &amp;lt;any namespace='##other' minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValidationProcessType", propOrder = {
    "signatureValidationProcessID",
    "signatureValidationServicePolicy",
    "signatureValidationPracticeStatement",
    "any"
})
public class SignatureValidationProcessType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignatureValidationProcessID", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "anyURI")
    protected SignatureValidationProcessID signatureValidationProcessID;
    @XmlElement(name = "SignatureValidationServicePolicy")
    @XmlSchemaType(name = "anyURI")
    protected String signatureValidationServicePolicy;
    @XmlElement(name = "SignatureValidationPracticeStatement")
    @XmlSchemaType(name = "anyURI")
    protected String signatureValidationPracticeStatement;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the signatureValidationProcessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SignatureValidationProcessID getSignatureValidationProcessID() {
        return signatureValidationProcessID;
    }

    /**
     * Sets the value of the signatureValidationProcessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureValidationProcessID(SignatureValidationProcessID value) {
        this.signatureValidationProcessID = value;
    }

    /**
     * Gets the value of the signatureValidationServicePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValidationServicePolicy() {
        return signatureValidationServicePolicy;
    }

    /**
     * Sets the value of the signatureValidationServicePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureValidationServicePolicy(String value) {
        this.signatureValidationServicePolicy = value;
    }

    /**
     * Gets the value of the signatureValidationPracticeStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValidationPracticeStatement() {
        return signatureValidationPracticeStatement;
    }

    /**
     * Sets the value of the signatureValidationPracticeStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureValidationPracticeStatement(String value) {
        this.signatureValidationPracticeStatement = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
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
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
