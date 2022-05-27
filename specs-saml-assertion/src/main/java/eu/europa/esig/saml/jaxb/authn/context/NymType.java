
package eu.europa.esig.saml.jaxb.authn.context;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for nymType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="nymType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="anonymity"/&amp;gt;
 *     &amp;lt;enumeration value="verinymity"/&amp;gt;
 *     &amp;lt;enumeration value="pseudonymity"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "nymType")
@XmlEnum
public enum NymType {

    @XmlEnumValue("anonymity")
    ANONYMITY("anonymity"),
    @XmlEnumValue("verinymity")
    VERINYMITY("verinymity"),
    @XmlEnumValue("pseudonymity")
    PSEUDONYMITY("pseudonymity");
    private final String value;

    NymType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NymType fromValue(String v) {
        for (NymType c: NymType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
