
package eu.europa.esig.validationreport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.EndorsementType;

public class Adapter1
    extends XmlAdapter<String, EndorsementType>
{


    public EndorsementType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.EndorsementTypeParser.parse(value));
    }

    public String marshal(EndorsementType value) {
        return (eu.europa.esig.dss.jaxb.parsers.EndorsementTypeParser.print(value));
    }

}
