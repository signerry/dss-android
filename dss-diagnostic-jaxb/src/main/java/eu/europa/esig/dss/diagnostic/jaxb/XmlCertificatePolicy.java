
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CertificatePolicy complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CertificatePolicy"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://dss.esig.europa.eu/validation/diagnostic&amp;gt;OID"&amp;gt;
 *       &amp;lt;attribute name="cpsUrl" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificatePolicy")
public class XmlCertificatePolicy
    extends XmlOID
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "cpsUrl")
    protected String cpsUrl;

    /**
     * Gets the value of the cpsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpsUrl() {
        return cpsUrl;
    }

    /**
     * Sets the value of the cpsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpsUrl(String value) {
        this.cpsUrl = value;
    }

}
