
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.ValidationTime;

public class Adapter8
    extends XmlAdapter<String, ValidationTime>
{


    public ValidationTime unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.ValidationTimeParser.parse(value));
    }

    public String marshal(ValidationTime value) {
        return (eu.europa.esig.dss.jaxb.parsers.ValidationTimeParser.print(value));
    }

}
