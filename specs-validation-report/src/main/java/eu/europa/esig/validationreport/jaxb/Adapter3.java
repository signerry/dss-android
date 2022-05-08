
package eu.europa.esig.validationreport.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.validationreport.enums.ObjectType;

public class Adapter3
    extends XmlAdapter<String, ObjectType>
{


    public ObjectType unmarshal(String value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.parseObjectType(value));
    }

    public String marshal(ObjectType value) {
        return (eu.europa.esig.validationreport.parsers.UriBasedEnumParser.print(value));
    }

}
