
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Boolean check : follows the specified validation model
 * 
 * &lt;p&gt;Java class for ModelConstraint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ModelConstraint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="Value" type="{http://dss.esig.europa.eu/validation/policy}Model" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelConstraint")
public class ModelConstraint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Value")
    protected Model value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setValue(Model value) {
        this.value = value;
    }

}
