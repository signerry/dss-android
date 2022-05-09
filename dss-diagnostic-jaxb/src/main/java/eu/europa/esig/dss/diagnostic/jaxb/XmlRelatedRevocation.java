
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RelatedRevocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelatedRevocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}FoundRevocation"&amp;gt;
 *       &amp;lt;attribute name="Revocation" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedRevocation")
public class XmlRelatedRevocation
    extends XmlFoundRevocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Revocation", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlRevocation revocation;

    /**
     * Gets the value of the revocation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlRevocation getRevocation() {
        return revocation;
    }

    /**
     * Sets the value of the revocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRevocation(XmlRevocation value) {
        this.revocation = value;
    }

}
