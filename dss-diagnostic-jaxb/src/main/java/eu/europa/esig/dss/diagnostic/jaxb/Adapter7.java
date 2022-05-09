
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.SignatureScopeType;

public class Adapter7
    extends XmlAdapter<String, SignatureScopeType>
{


    public SignatureScopeType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureScopeTypeParser.parse(value));
    }

    public String marshal(SignatureScopeType value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureScopeTypeParser.print(value));
    }

}
