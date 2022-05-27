
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.Indication;

public class Adapter2
    extends XmlAdapter<String, Indication>
{


    public Indication unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.IndicationParser.parse(value));
    }

    public String marshal(Indication value) {
        return (eu.europa.esig.dss.jaxb.parsers.IndicationParser.print(value));
    }

}
