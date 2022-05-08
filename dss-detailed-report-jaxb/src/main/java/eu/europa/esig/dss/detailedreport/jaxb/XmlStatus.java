
package eu.europa.esig.dss.detailedreport.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Status.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Status"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="OK"/&amp;gt;
 *     &amp;lt;enumeration value="NOT OK"/&amp;gt;
 *     &amp;lt;enumeration value="IGNORED"/&amp;gt;
 *     &amp;lt;enumeration value="INFORMATION"/&amp;gt;
 *     &amp;lt;enumeration value="WARNING"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Status")
@XmlEnum
public enum XmlStatus {

    OK("OK"),
    @XmlEnumValue("NOT OK")
    NOT_OK("NOT OK"),
    IGNORED("IGNORED"),
    INFORMATION("INFORMATION"),
    WARNING("WARNING");
    private final String value;

    XmlStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlStatus fromValue(String v) {
        for (XmlStatus c: XmlStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
