
package eu.europa.esig.dss.simplereport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.Indication;

public class Adapter3
    extends XmlAdapter<String, Indication>
{


    public Indication unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.IndicationParser.parse(value));
    }

    public String marshal(Indication value) {
        return (eu.europa.esig.dss.jaxb.parsers.IndicationParser.print(value));
    }

}
