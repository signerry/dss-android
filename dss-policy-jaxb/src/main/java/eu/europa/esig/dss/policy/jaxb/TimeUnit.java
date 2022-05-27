
package eu.europa.esig.dss.policy.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TimeUnit.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TimeUnit"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="DAYS"/&amp;gt;
 *     &amp;lt;enumeration value="HOURS"/&amp;gt;
 *     &amp;lt;enumeration value="MINUTES"/&amp;gt;
 *     &amp;lt;enumeration value="SECONDS"/&amp;gt;
 *     &amp;lt;enumeration value="MILLISECONDS"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TimeUnit")
@XmlEnum
public enum TimeUnit {

    DAYS,
    HOURS,
    MINUTES,
    SECONDS,
    MILLISECONDS;

    public String value() {
        return name();
    }

    public static TimeUnit fromValue(String v) {
        return valueOf(v);
    }

}
