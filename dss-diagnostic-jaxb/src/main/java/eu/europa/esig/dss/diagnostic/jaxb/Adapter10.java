
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.DigestMatcherType;

public class Adapter10
    extends XmlAdapter<String, DigestMatcherType>
{


    public DigestMatcherType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.DigestMatcherTypeParser.parse(value));
    }

    public String marshal(DigestMatcherType value) {
        return (eu.europa.esig.dss.jaxb.parsers.DigestMatcherTypeParser.print(value));
    }

}
