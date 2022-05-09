
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.SignatureLevel;

public class Adapter6
    extends XmlAdapter<String, SignatureLevel>
{


    public SignatureLevel unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureFormatParser.parse(value));
    }

    public String marshal(SignatureLevel value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureFormatParser.print(value));
    }

}
