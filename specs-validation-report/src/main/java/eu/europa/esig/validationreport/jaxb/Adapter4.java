
package eu.europa.esig.validationreport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.RevocationReason;

public class Adapter4
    extends XmlAdapter<String, RevocationReason>
{


    public RevocationReason unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseRevocationReason(value));
    }

    public String marshal(RevocationReason value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
