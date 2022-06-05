
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificateSourceType;

public class Adapter11
    extends XmlAdapter<String, CertificateSourceType>
{


    public CertificateSourceType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateSourceTypeParser.parse(value));
    }

    public String marshal(CertificateSourceType value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateSourceTypeParser.print(value));
    }

}
