
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.TimestampQualification;

public class Adapter6
    extends XmlAdapter<String, TimestampQualification>
{


    public TimestampQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampQualificationParser.parse(value));
    }

    public String marshal(TimestampQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampQualificationParser.print(value));
    }

}