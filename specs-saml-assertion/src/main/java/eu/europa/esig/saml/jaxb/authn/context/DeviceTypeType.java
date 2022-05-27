
package eu.europa.esig.saml.jaxb.authn.context;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeviceTypeType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DeviceTypeType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="hardware"/&amp;gt;
 *     &amp;lt;enumeration value="software"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DeviceTypeType")
@XmlEnum
public enum DeviceTypeType {

    @XmlEnumValue("hardware")
    HARDWARE("hardware"),
    @XmlEnumValue("software")
    SOFTWARE("software");
    private final String value;

    DeviceTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceTypeType fromValue(String v) {
        for (DeviceTypeType c: DeviceTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
