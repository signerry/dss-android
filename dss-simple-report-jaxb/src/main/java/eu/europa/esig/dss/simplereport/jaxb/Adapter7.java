
package eu.europa.esig.dss.simplereport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.TimestampQualification;

public class Adapter7
    extends XmlAdapter<String, TimestampQualification>
{


    public TimestampQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampQualificationParser.parse(value));
    }

    public String marshal(TimestampQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampQualificationParser.print(value));
    }

}
