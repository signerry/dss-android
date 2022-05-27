
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationOrigin;

public class Adapter20
    extends XmlAdapter<String, RevocationOrigin>
{


    public RevocationOrigin unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.parse(value));
    }

    public String marshal(RevocationOrigin value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationOriginTypeParser.print(value));
    }

}
