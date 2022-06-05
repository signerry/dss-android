
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for BlockType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="BlockType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SIG_BBB"/&amp;gt;
 *     &amp;lt;enumeration value="REV_BBB"/&amp;gt;
 *     &amp;lt;enumeration value="TST_BBB"/&amp;gt;
 *     &amp;lt;enumeration value="CNT_TST_BBB"/&amp;gt;
 *     &amp;lt;enumeration value="CRS"/&amp;gt;
 *     &amp;lt;enumeration value="PSV_CRS"/&amp;gt;
 *     &amp;lt;enumeration value="RAC"/&amp;gt;
 *     &amp;lt;enumeration value="RFC"/&amp;gt;
 *     &amp;lt;enumeration value="SUB_XCV"/&amp;gt;
 *     &amp;lt;enumeration value="REV_CC"/&amp;gt;
 *     &amp;lt;enumeration value="PSV"/&amp;gt;
 *     &amp;lt;enumeration value="PCV"/&amp;gt;
 *     &amp;lt;enumeration value="VTS"/&amp;gt;
 *     &amp;lt;enumeration value="TST_PSV"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "BlockType")
@XmlEnum
public enum XmlBlockType {

    SIG_BBB,
    REV_BBB,
    TST_BBB,
    CNT_TST_BBB,
    CRS,
    PSV_CRS,
    RAC,
    RFC,
    SUB_XCV,
    REV_CC,
    PSV,
    PCV,
    VTS,
    TST_PSV;

    public String value() {
        return name();
    }

    public static XmlBlockType fromValue(String v) {
        return valueOf(v);
    }

}
