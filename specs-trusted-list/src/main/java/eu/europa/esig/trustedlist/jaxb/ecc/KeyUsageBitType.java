//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:13:44 AM EET 
//


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
 * <p>Java class for KeyUsageBitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyUsageBitType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *       &lt;attribute name="name"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="digitalSignature"/&gt;
 *             &lt;enumeration value="nonRepudiation"/&gt;
 *             &lt;enumeration value="keyEncipherment"/&gt;
 *             &lt;enumeration value="dataEncipherment"/&gt;
 *             &lt;enumeration value="keyAgreement"/&gt;
 *             &lt;enumeration value="keyCertSign"/&gt;
 *             &lt;enumeration value="crlSign"/&gt;
 *             &lt;enumeration value="encipherOnly"/&gt;
 *             &lt;enumeration value="decipherOnly"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
