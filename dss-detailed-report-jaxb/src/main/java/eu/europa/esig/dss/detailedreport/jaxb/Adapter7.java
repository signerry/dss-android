
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.Context;

public class Adapter7
    extends XmlAdapter<String, Context>
{


    public Context unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.ContextParser.parse(value));
    }

    public String marshal(Context value) {
        return (eu.europa.esig.dss.jaxb.parsers.ContextParser.print(value));
    }

}
