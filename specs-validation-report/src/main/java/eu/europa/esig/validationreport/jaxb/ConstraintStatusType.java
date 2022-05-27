
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.validationreport.enums.ConstraintStatus;


/**
 * &lt;p&gt;Java class for ConstraintStatusType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConstraintStatusType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="OverriddenBy" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintStatusType", propOrder = {
    "status",
    "overriddenBy"
})
public class ConstraintStatusType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "anyURI")
    protected ConstraintStatus status;
    @XmlElement(name = "OverriddenBy")
    @XmlSchemaType(name = "anyURI")
    protected String overriddenBy;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ConstraintStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(ConstraintStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the overriddenBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverriddenBy() {
        return overriddenBy;
    }

    /**
     * Sets the value of the overriddenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverriddenBy(String value) {
        this.overriddenBy = value;
    }

}
