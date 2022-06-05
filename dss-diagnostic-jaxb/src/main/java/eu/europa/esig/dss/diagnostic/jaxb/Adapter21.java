
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationRefOrigin;

public class Adapter21
    extends XmlAdapter<String, RevocationRefOrigin>
{


    public RevocationRefOrigin unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationRefOriginParser.parse(value));
    }

    public String marshal(RevocationRefOrigin value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationRefOriginParser.print(value));
    }

}
