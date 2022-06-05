
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.EncryptionAlgorithm;

public class Adapter27
    extends XmlAdapter<String, EncryptionAlgorithm>
{


    public EncryptionAlgorithm unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.EncryptionAlgorithmParser.parse(value));
    }

    public String marshal(EncryptionAlgorithm value) {
        return (eu.europa.esig.dss.jaxb.parsers.EncryptionAlgorithmParser.print(value));
    }

}
