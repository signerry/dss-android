
package eu.europa.esig.xades.jaxb.xades111;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.ObjectIdentifierQualifier;

public class Adapter1
    extends XmlAdapter<String, ObjectIdentifierQualifier>
{


    public ObjectIdentifierQualifier unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.ObjectIdentifierQualifierParser.parse(value));
    }

    public String marshal(ObjectIdentifierQualifier value) {
        return (eu.europa.esig.dss.jaxb.parsers.ObjectIdentifierQualifierParser.print(value));
    }

}
