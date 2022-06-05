
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.EndorsementType;

public class Adapter9
    extends XmlAdapter<String, EndorsementType>
{


    public EndorsementType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.EndorsementTypeParser.parse(value));
    }

    public String marshal(EndorsementType value) {
        return (eu.europa.esig.dss.jaxb.parsers.EndorsementTypeParser.print(value));
    }

}
