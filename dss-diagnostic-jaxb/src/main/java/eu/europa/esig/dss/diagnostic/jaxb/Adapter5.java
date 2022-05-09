
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.PdfObjectModificationType;

public class Adapter5
    extends XmlAdapter<String, PdfObjectModificationType>
{


    public PdfObjectModificationType unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.PdfObjectModificationTypeParser.parse(value));
    }

    public String marshal(PdfObjectModificationType value) {
        return (eu.europa.esig.dss.jaxb.parsers.PdfObjectModificationTypeParser.print(value));
    }

}
