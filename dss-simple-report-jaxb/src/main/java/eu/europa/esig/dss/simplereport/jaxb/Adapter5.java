
package eu.europa.esig.dss.simplereport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.SignatureQualification;

public class Adapter5
    extends XmlAdapter<String, SignatureQualification>
{


    public SignatureQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureQualificationParser.parse(value));
    }

    public String marshal(SignatureQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureQualificationParser.print(value));
    }

}