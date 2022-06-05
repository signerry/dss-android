
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.TimestampedObjectType;

public class Adapter8
    extends XmlAdapter<String, TimestampedObjectType>
{


    public TimestampedObjectType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampedObjectTypeParser.parse(value));
    }

    public String marshal(TimestampedObjectType value) {
        return (eu.europa.esig.dss.jaxb.parsers.TimestampedObjectTypeParser.print(value));
    }

}
