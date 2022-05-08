
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for ConstraintsConclusionWithControlTime complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConstraintsConclusionWithControlTime"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ControlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintsConclusionWithControlTime", propOrder = {
    "controlTime"
})
@XmlSeeAlso({
    XmlVTS.class,
    XmlPCV.class,
    XmlPSV.class
})
public class XmlConstraintsConclusionWithControlTime
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ControlTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date controlTime;

    /**
     * Gets the value of the controlTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getControlTime() {
        return controlTime;
    }

    /**
     * Sets the value of the controlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlTime(Date value) {
        this.controlTime = value;
    }

}
