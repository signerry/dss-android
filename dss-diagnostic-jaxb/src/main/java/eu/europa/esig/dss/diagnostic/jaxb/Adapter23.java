
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.DigestAlgorithm;

public class Adapter23
    extends XmlAdapter<String, DigestAlgorithm>
{


    public DigestAlgorithm unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.DigestAlgorithmParser.parse(value));
    }

    public String marshal(DigestAlgorithm value) {
        return (eu.europa.esig.dss.jaxb.parsers.DigestAlgorithmParser.print(value));
    }

}
