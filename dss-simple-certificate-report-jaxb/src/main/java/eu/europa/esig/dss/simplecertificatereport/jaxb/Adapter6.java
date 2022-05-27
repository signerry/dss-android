
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.SubIndication;

public class Adapter6
    extends XmlAdapter<String, SubIndication>
{


    public SubIndication unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.parse(value));
    }

    public String marshal(SubIndication value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.print(value));
    }

}
