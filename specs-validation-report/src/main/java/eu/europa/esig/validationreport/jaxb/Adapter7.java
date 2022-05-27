
package eu.europa.esig.validationreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.Indication;

public class Adapter7
    extends XmlAdapter<String, Indication>
{


    public Indication unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseMainIndication(value));
    }

    public String marshal(Indication value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
