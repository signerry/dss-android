
package eu.europa.esig.dss.detailedreport.jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.CertificateQualification;

public class Adapter4
    extends XmlAdapter<String, CertificateQualification>
{


    public CertificateQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateQualificationParser.parse(value));
    }

    public String marshal(CertificateQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.CertificateQualificationParser.print(value));
    }

}
