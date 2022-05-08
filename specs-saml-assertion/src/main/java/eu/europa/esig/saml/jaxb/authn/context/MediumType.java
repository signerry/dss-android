
package eu.europa.esig.saml.jaxb.authn.context;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for mediumType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="mediumType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="memory"/&amp;gt;
 *     &amp;lt;enumeration value="smartcard"/&amp;gt;
 *     &amp;lt;enumeration value="token"/&amp;gt;
 *     &amp;lt;enumeration value="MobileDevice"/&amp;gt;
 *     &amp;lt;enumeration value="MobileAuthCard"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "mediumType")
@XmlEnum
public enum MediumType {

    @XmlEnumValue("memory")
    MEMORY("memory"),
    @XmlEnumValue("smartcard")
    SMARTCARD("smartcard"),
    @XmlEnumValue("token")
    TOKEN("token"),
    @XmlEnumValue("MobileDevice")
    MOBILE_DEVICE("MobileDevice"),
    @XmlEnumValue("MobileAuthCard")
    MOBILE_AUTH_CARD("MobileAuthCard");
    private final String value;

    MediumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediumType fromValue(String v) {
        for (MediumType c: MediumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
