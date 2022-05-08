
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.EndorsementType;


/**
 * &lt;p&gt;Java class for SAOneSignerRoleType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SAOneSignerRoleType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="EndorsementType"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="certified"/&amp;gt;
 *               &amp;lt;enumeration value="claimed"/&amp;gt;
 *               &amp;lt;enumeration value="signed"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAOneSignerRoleType", propOrder = {
    "role",
    "endorsementType"
})
public class SAOneSignerRoleType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "EndorsementType", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected EndorsementType endorsementType;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the endorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public EndorsementType getEndorsementType() {
        return endorsementType;
    }

    /**
     * Sets the value of the endorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementType(EndorsementType value) {
        this.endorsementType = value;
    }

}
