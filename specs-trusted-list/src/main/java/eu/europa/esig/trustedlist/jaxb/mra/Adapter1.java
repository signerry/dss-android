//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:13:44 AM EET 
//


package eu.europa.esig.trustedlist.jaxb.mra;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.enumerations.MRAStatus;

public class Adapter1
    extends XmlAdapter<String, MRAStatus>
{


    public MRAStatus unmarshal(String value) {
        return (eu.europa.esig.trustedlist.mra.parsers.MRAStatusParser.parse(value));
    }

    public String marshal(MRAStatus value) {
        return (eu.europa.esig.trustedlist.mra.parsers.MRAStatusParser.print(value));
    }

}