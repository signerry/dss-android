
package eu.europa.esig.dss.diagnostic.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.PdfLockAction;

public class Adapter3
    extends XmlAdapter<String, PdfLockAction>
{


    public PdfLockAction unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.PdfLockActionParser.parse(value));
    }

    public String marshal(PdfLockAction value) {
        return (eu.europa.esig.dss.jaxb.parsers.PdfLockActionParser.print(value));
    }

}
