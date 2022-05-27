
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;

public class Adapter17
    extends XmlAdapter<String, RevocationReason>
{


    public RevocationReason unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationReasonParser.parseShortName(value));
    }

    public String marshal(RevocationReason value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationReasonParser.printShortName(value));
    }

}
