
package eu.europa.esig.validationreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.validationreport.enums.SignatureValidationProcessID;

public class Adapter5
    extends XmlAdapter<String, SignatureValidationProcessID>
{


    public SignatureValidationProcessID unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseSignatureValidationProcessID(value));
    }

    public String marshal(SignatureValidationProcessID value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
