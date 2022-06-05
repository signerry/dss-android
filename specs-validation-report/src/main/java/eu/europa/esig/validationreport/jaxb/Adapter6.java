
package eu.europa.esig.validationreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.validationreport.enums.ConstraintStatus;

public class Adapter6
    extends XmlAdapter<String, ConstraintStatus>
{


    public ConstraintStatus unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseConstraintStatus(value));
    }

    public String marshal(ConstraintStatus value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
