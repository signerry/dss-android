
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for KeyStorageType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="KeyStorageType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="medium" use="required" type="{urn:oasis:names:tc:SAML:2.0:ac}mediumType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyStorageType")
public class KeyStorageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "medium", required = true)
    protected MediumType medium;

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link MediumType }
     *     
     */
    public MediumType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumType }
     *     
     */
    public void setMedium(MediumType value) {
        this.medium = value;
    }

}
