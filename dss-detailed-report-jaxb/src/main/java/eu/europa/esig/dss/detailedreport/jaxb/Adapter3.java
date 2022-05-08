
package eu.europa.esig.dss.detailedreport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.SubIndication;

public class Adapter3
    extends XmlAdapter<String, SubIndication>
{


    public SubIndication unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.parse(value));
    }

    public String marshal(SubIndication value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.print(value));
    }

}
