
package eu.europa.esig.dss.diagnostic.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificateRefOrigin;

public class Adapter13
    extends XmlAdapter<String, CertificateRefOrigin>
{


    public CertificateRefOrigin unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateRefOriginParser.parse(value));
    }

    public String marshal(CertificateRefOrigin value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateRefOriginParser.print(value));
    }

}
