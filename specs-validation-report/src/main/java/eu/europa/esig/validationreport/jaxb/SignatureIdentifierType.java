
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.xades.jaxb.xades132.DigestAlgAndValueType;
import eu.europa.esig.xmldsig.jaxb.SignatureValueType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for SignatureIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureValue" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HashOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DocHashOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureIdentifierType", propOrder = {
    "digestAlgAndValue",
    "signatureValue",
    "hashOnly",
    "docHashOnly",
    "daIdentifier",
    "any"
})
public class SignatureIdentifierType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DigestAlgAndValue")
    protected DigestAlgAndValueType digestAlgAndValue;
    @XmlElement(name = "SignatureValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureValueType signatureValue;
    @XmlElement(name = "HashOnly")
    protected boolean hashOnly;
    @XmlElement(name = "DocHashOnly")
    protected boolean docHashOnly;
    @XmlElement(name = "DAIdentifier")
    protected String daIdentifier;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the digestAlgAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getDigestAlgAndValue() {
        return digestAlgAndValue;
    }

    /**
     * Sets the value of the digestAlgAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setDigestAlgAndValue(DigestAlgAndValueType value) {
        this.digestAlgAndValue = value;
    }

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValueType }
     *     
     */
    public SignatureValueType getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValueType }
     *     
     */
    public void setSignatureValue(SignatureValueType value) {
        this.signatureValue = value;
    }

    /**
     * Gets the value of the hashOnly property.
     * 
     */
    public boolean isHashOnly() {
        return hashOnly;
    }

    /**
     * Sets the value of the hashOnly property.
     * 
     */
    public void setHashOnly(boolean value) {
        this.hashOnly = value;
    }

    /**
     * Gets the value of the docHashOnly property.
     * 
     */
    public boolean isDocHashOnly() {
        return docHashOnly;
    }

    /**
     * Sets the value of the docHashOnly property.
     * 
     */
    public void setDocHashOnly(boolean value) {
        this.docHashOnly = value;
    }

    /**
     * Gets the value of the daIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAIdentifier() {
        return daIdentifier;
    }

    /**
     * Sets the value of the daIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAIdentifier(String value) {
        this.daIdentifier = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
