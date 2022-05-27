
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Time based check : follows the specified level behavior if the checked element is over the time limit
 * 
 * &lt;p&gt;Java class for TimeConstraint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimeConstraint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint"&amp;gt;
 *       &amp;lt;attribute name="Unit" type="{http://dss.esig.europa.eu/validation/policy}TimeUnit" /&amp;gt;
 *       &amp;lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeConstraint")
public class TimeConstraint
    extends LevelConstraint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "Unit")
    protected TimeUnit unit;
    @XmlAttribute(name = "Value")
    protected Integer value;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit }
     *     
     */
    public TimeUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit }
     *     
     */
    public void setUnit(TimeUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
