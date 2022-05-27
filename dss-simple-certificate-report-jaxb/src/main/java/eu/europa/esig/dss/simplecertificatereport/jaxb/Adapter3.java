
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;

public class Adapter3
    extends XmlAdapter<String, RevocationReason>
{


    public RevocationReason unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationReasonParser.parseShortName(value));
    }

    public String marshal(RevocationReason value) {
        return (eu.europa.esig.dss.jaxb.parsers.RevocationReasonParser.printShortName(value));
    }

}
