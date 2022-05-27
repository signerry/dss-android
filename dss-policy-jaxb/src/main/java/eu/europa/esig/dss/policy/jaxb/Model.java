
package eu.europa.esig.dss.policy.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Model.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="Model"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SHELL"/&amp;gt;
 *     &amp;lt;enumeration value="CHAIN"/&amp;gt;
 *     &amp;lt;enumeration value="HYBRID"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "Model")
@XmlEnum
public enum Model {

    SHELL,
    CHAIN,
    HYBRID;

    public String value() {
        return name();
    }

    public static Model fromValue(String v) {
        return valueOf(v);
    }

}
