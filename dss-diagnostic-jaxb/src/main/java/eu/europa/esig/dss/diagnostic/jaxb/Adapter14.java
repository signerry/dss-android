
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.TimestampType;

public class Adapter14
    extends XmlAdapter<String, TimestampType>
{


    public TimestampType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampTypeParser.parse(value));
    }

    public String marshal(TimestampType value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampTypeParser.print(value));
    }

}
