
package eu.europa.esig.dss.policy.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for level.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="level"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="FAIL"/&amp;gt;
 *     &amp;lt;enumeration value="WARN"/&amp;gt;
 *     &amp;lt;enumeration value="INFORM"/&amp;gt;
 *     &amp;lt;enumeration value="IGNORE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "level")
@XmlEnum
public enum Level {


    /**
     * Stops the validation process and reports as error
     * 
     */
    FAIL,

    /**
     * Continues the validation process and adds a warning message
     * 
     */
    WARN,

    /**
     * Continues the validation process and adds an informative message
     * 
     */
    INFORM,

    /**
     * Continues the validation process and skips the current check (equals to not present check)
     * 
     */
    IGNORE;

    public String value() {
        return name();
    }

    public static Level fromValue(String v) {
        return valueOf(v);
    }

}
