
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificateStatus;

public class Adapter16
    extends XmlAdapter<String, CertificateStatus>
{


    public CertificateStatus unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateStatusParser.parse(value));
    }

    public String marshal(CertificateStatus value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateStatusParser.print(value));
    }

}
