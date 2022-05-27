
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.KeyUsageBit;

public class Adapter2
    extends XmlAdapter<String, KeyUsageBit>
{


    public KeyUsageBit unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.KeyUsageBitParser.parse(value));
    }

    public String marshal(KeyUsageBit value) {
        return (eu.europa.esig.dss.jaxb.parsers.KeyUsageBitParser.print(value));
    }

}
