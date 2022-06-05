
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PDFSignatureField complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PDFSignatureField"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigFieldLock" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFLockDictionary" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFSignatureField", propOrder = {
    "sigFieldLock"
})
public class XmlPDFSignatureField implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigFieldLock")
    protected XmlPDFLockDictionary sigFieldLock;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the sigFieldLock property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPDFLockDictionary }
     *     
     */
    public XmlPDFLockDictionary getSigFieldLock() {
        return sigFieldLock;
    }

    /**
     * Sets the value of the sigFieldLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPDFLockDictionary }
     *     
     */
    public void setSigFieldLock(XmlPDFLockDictionary value) {
        this.sigFieldLock = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
