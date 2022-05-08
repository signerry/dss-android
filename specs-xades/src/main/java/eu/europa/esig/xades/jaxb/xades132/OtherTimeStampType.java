
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OtherTimeStampType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OtherTimeStampType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://uri.etsi.org/01903/v1.3.2#}GenericTimeStampType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ReferenceInfo" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/&amp;gt;
 *           &amp;lt;element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTimeStampType")
public class OtherTimeStampType
    extends GenericTimeStampType
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
