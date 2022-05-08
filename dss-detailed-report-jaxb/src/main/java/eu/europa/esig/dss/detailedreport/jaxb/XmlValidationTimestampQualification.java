
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.TimestampQualification;


/**
 * &lt;p&gt;Java class for ValidationTimestampQualification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationTimestampQualification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;attribute name="TimestampQualification" use="required" type="{http://dss.esig.europa.eu/validation/detailed-report}TimestampQualification" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationTimestampQualification")
public class XmlValidationTimestampQualification
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "TimestampQualification", required = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected TimestampQualification timestampQualification;

    /**
     * Gets the value of the timestampQualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TimestampQualification getTimestampQualification() {
        return timestampQualification;
    }

    /**
     * Sets the value of the timestampQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampQualification(TimestampQualification value) {
        this.timestampQualification = value;
    }

}
