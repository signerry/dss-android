
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificationPermission;

public class Adapter4
    extends XmlAdapter<String, CertificationPermission>
{


    public CertificationPermission unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificationPermissionParser.parse(value));
    }

    public String marshal(CertificationPermission value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificationPermissionParser.print(value));
    }

}
