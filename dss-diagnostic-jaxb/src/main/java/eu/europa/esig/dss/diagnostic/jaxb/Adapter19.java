
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationType;

public class Adapter19
    extends XmlAdapter<String, RevocationType>
{


    public RevocationType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationTypeParser.parse(value));
    }

    public String marshal(RevocationType value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationTypeParser.print(value));
    }

}
