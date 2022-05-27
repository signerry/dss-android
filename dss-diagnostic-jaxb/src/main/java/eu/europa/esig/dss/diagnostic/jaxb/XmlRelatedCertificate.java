
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelatedCertificate complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelatedCertificate"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}FoundCertificate"&amp;gt;
 *       &amp;lt;attribute name="Certificate" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedCertificate")
public class XmlRelatedCertificate
    extends XmlFoundCertificate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Certificate", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlCertificate certificate;

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlCertificate getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCertificate(XmlCertificate value) {
        this.certificate = value;
    }

}
