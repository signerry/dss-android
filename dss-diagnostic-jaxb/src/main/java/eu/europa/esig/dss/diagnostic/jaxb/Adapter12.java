
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificateOrigin;

public class Adapter12
    extends XmlAdapter<String, CertificateOrigin>
{


    public CertificateOrigin unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateOriginParser.parse(value));
    }

    public String marshal(CertificateOrigin value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateOriginParser.print(value));
    }

}
