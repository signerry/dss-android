
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.TimestampedObjectType;


/**
 * &lt;p&gt;Java class for TimestampedObject complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimestampedObject"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Token" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *       &amp;lt;attribute name="Category" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}TimestampedObjectType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampedObject")
public class XmlTimestampedObject implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Token", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlAbstractToken token;
    @XmlAttribute(name = "Category", required = true)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected TimestampedObjectType category;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlAbstractToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setToken(XmlAbstractToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TimestampedObjectType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(TimestampedObjectType value) {
        this.category = value;
    }

}
