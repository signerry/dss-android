
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EncapsulationType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EncapsulationType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="BINARIES"/&amp;gt;
 *     &amp;lt;enumeration value="REFERENCE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EncapsulationType")
@XmlEnum
public enum XmlEncapsulationType {

    BINARIES,
    REFERENCE;

    public String value() {
        return name();
    }

    public static XmlEncapsulationType fromValue(String v) {
        return valueOf(v);
    }

}
