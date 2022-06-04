
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.DigestMatcherType;


/**
 * &lt;p&gt;Java class for DigestMatcher complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DigestMatcher"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DataFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="DataIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="type" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestMatcherType" /&amp;gt;
 *       &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="duplicated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestMatcher", propOrder = {
    "dataFound",
    "dataIntact"
})
public class XmlDigestMatcher
    extends XmlDigestAlgoAndValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataFound")
    protected boolean dataFound;
    @XmlElement(name = "DataIntact")
    protected boolean dataIntact;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected DigestMatcherType type;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "duplicated")
    protected Boolean duplicated;

    /**
     * Gets the value of the dataFound property.
     * 
     */
    public boolean isDataFound() {
        return dataFound;
    }

    /**
     * Sets the value of the dataFound property.
     * 
     */
    public void setDataFound(boolean value) {
        this.dataFound = value;
    }

    /**
     * Gets the value of the dataIntact property.
     * 
     */
    public boolean isDataIntact() {
        return dataIntact;
    }

    /**
     * Sets the value of the dataIntact property.
     * 
     */
    public void setDataIntact(boolean value) {
        this.dataIntact = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DigestMatcherType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(DigestMatcherType value) {
        this.type = value;
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

    /**
     * Gets the value of the duplicated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDuplicated() {
        if (duplicated == null) {
            return false;
        } else {
            return duplicated;
        }
    }

    /**
     * Sets the value of the duplicated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicated(Boolean value) {
        this.duplicated = value;
    }

}