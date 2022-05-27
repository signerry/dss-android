
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.ArchiveTimestampType;

public class Adapter15
    extends XmlAdapter<String, ArchiveTimestampType>
{


    public ArchiveTimestampType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.ArchiveTimestampTypeParser.parse(value));
    }

    public String marshal(ArchiveTimestampType value) {
        return (eu.europa.esig.dss.jaxb.parsers.ArchiveTimestampTypeParser.print(value));
    }

}
