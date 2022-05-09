
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * &lt;p&gt;Java class for TSAGeneralName complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TSAGeneralName"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *       &amp;lt;attribute name="contentMatch" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="orderMatch" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSAGeneralName", propOrder = {
    "value"
})
public class XmlTSAGeneralName implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "contentMatch", required = true)
    protected boolean contentMatch;
    @XmlAttribute(name = "orderMatch", required = true)
    protected boolean orderMatch;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the contentMatch property.
     * 
     */
    public boolean isContentMatch() {
        return contentMatch;
    }

    /**
     * Sets the value of the contentMatch property.
     * 
     */
    public void setContentMatch(boolean value) {
        this.contentMatch = value;
    }

    /**
     * Gets the value of the orderMatch property.
     * 
     */
    public boolean isOrderMatch() {
        return orderMatch;
    }

    /**
     * Sets the value of the orderMatch property.
     * 
     */
    public void setOrderMatch(boolean value) {
        this.orderMatch = value;
    }

}
