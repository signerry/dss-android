//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.09 at 12:15:26 AM EEST 
//


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
 * <p>Java class for DigestMatcher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigestMatcher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DataIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestMatcherType" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="duplicated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    @XmlJavaTypeAdapter(Adapter11 .class)
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
