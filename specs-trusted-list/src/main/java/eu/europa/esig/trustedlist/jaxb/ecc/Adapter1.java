
package eu.europa.esig.trustedlist.jaxb.ecc;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.KeyUsageBit;

public class Adapter1
    extends XmlAdapter<String, KeyUsageBit>
{


    public KeyUsageBit unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.KeyUsageBitParser.parse(value));
    }

    public String marshal(KeyUsageBit value) {
        return (eu.europa.esig.dss.jaxb.parsers.KeyUsageBitParser.print(value));
    }

}
