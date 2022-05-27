
package eu.europa.esig.validationreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.validationreport.enums.TypeOfProof;

public class Adapter2
    extends XmlAdapter<String, TypeOfProof>
{


    public TypeOfProof unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseTypeOfProof(value));
    }

    public String marshal(TypeOfProof value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
