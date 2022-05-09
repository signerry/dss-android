
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrphanToken complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OrphanToken"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}AbstractToken"&amp;gt;
 *       &amp;lt;attribute name="EncapsulationType" use="required" type="{http://dss.esig.europa.eu/validation/diagnostic}EncapsulationType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrphanToken")
@XmlSeeAlso({
    XmlOrphanCertificateToken.class,
    XmlOrphanRevocationToken.class
})
public abstract class XmlOrphanToken
    extends XmlAbstractToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "EncapsulationType", required = true)
    protected XmlEncapsulationType encapsulationType;

    /**
     * Gets the value of the encapsulationType property.
     * 
     * @return
     *     possible object is
     *     {@link XmlEncapsulationType }
     *     
     */
    public XmlEncapsulationType getEncapsulationType() {
        return encapsulationType;
    }

    /**
     * Sets the value of the encapsulationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlEncapsulationType }
     *     
     */
    public void setEncapsulationType(XmlEncapsulationType value) {
        this.encapsulationType = value;
    }

}
