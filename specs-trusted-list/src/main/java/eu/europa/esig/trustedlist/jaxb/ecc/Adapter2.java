
package eu.europa.esig.trustedlist.jaxb.ecc;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.trustedlist.enums.Assert;

public class Adapter2
    extends XmlAdapter<String, Assert>
{


    public Assert unmarshal(String value) {
        return (eu.europa.esig.trustedlist.parsers.AssertParser.parse(value));
    }

    public String marshal(Assert value) {
        return (eu.europa.esig.trustedlist.parsers.AssertParser.print(value));
    }

}
