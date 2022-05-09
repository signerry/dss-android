
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.ASiCContainerType;

public class Adapter2
    extends XmlAdapter<String, ASiCContainerType>
{


    public ASiCContainerType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.ASiCContainerTypeParser.parse(value));
    }

    public String marshal(ASiCContainerType value) {
        return (eu.europa.esig.dss.jaxb.parsers.ASiCContainerTypeParser.print(value));
    }

}
