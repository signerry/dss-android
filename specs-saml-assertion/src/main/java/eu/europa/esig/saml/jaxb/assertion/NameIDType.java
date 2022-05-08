
package eu.europa.esig.saml.jaxb.assertion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java class for NameIDType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NameIDType"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *       &amp;lt;attGroup ref="{urn:oasis:names:tc:SAML:2.0:assertion}IDNameQualifiers"/&amp;gt;
 *       &amp;lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *       &amp;lt;attribute name="SPProvidedID" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameIDType", propOrder = {
    "value"
})
public class NameIDType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "Format")
    @XmlSchemaType(name = "anyURI")
    protected String format;
    @XmlAttribute(name = "SPProvidedID")
    protected String spProvidedID;
    @XmlAttribute(name = "NameQualifier")
    protected String nameQualifier;
    @XmlAttribute(name = "SPNameQualifier")
    protected String spNameQualifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the spProvidedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPProvidedID() {
        return spProvidedID;
    }

    /**
     * Sets the value of the spProvidedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPProvidedID(String value) {
        this.spProvidedID = value;
    }

    /**
     * Gets the value of the nameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameQualifier() {
        return nameQualifier;
    }

    /**
     * Sets the value of the nameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameQualifier(String value) {
        this.nameQualifier = value;
    }

    /**
     * Gets the value of the spNameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPNameQualifier() {
        return spNameQualifier;
    }

    /**
     * Sets the value of the spNameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPNameQualifier(String value) {
        this.spNameQualifier = value;
    }

}
