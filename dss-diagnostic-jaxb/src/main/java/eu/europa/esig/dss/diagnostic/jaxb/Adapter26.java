
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.MaskGenerationFunction;

public class Adapter26
    extends XmlAdapter<String, MaskGenerationFunction>
{


    public MaskGenerationFunction unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.MaskGenerationFunctionParser.parse(value));
    }

    public String marshal(MaskGenerationFunction value) {
        return (eu.europa.esig.dss.jaxb.parsers.MaskGenerationFunctionParser.print(value));
    }

}
