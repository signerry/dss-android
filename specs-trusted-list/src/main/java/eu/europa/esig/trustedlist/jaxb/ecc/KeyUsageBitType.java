
package eu.europa.esig.trustedlist.jaxb.ecc;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.KeyUsageBit;


/**
 * &lt;p&gt;Java class for KeyUsageBitType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="KeyUsageBitType"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;boolean"&amp;gt;
 *       &amp;lt;attribute name="name"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;enumeration value="digitalSignature"/&amp;gt;
 *             &amp;lt;enumeration value="nonRepudiation"/&amp;gt;
 *             &amp;lt;enumeration value="keyEncipherment"/&amp;gt;
 *             &amp;lt;enumeration value="dataEncipherment"/&amp;gt;
 *             &amp;lt;enumeration value="keyAgreement"/&amp;gt;
 *             &amp;lt;enumeration value="keyCertSign"/&amp;gt;
 *             &amp;lt;enumeration value="crlSign"/&amp;gt;
 *             &amp;lt;enumeration value="encipherOnly"/&amp;gt;
 *             &amp;lt;enumeration value="decipherOnly"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyUsageBitType", propOrder = {
    "value"
})
public class KeyUsageBitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected KeyUsageBit name;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public KeyUsageBit getName() {
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
    public void setName(KeyUsageBit value) {
        this.name = value;
    }

}
