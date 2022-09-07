
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PSD2QcInfo complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PSD2QcInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RolesOfPSP"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="RoleOfPSP" type="{http://dss.esig.europa.eu/validation/diagnostic}RoleOfPSP" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ncaName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ncaId" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSD2QcInfo", propOrder = {
    "rolesOfPSP",
    "ncaName",
    "ncaId"
})
public class XmlPSD2QcInfo implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "RolesOfPSP", required = true)
    @XmlElement(name = "RoleOfPSP", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlRoleOfPSP> rolesOfPSP;
    @XmlElement(required = true)
    protected String ncaName;
    @XmlElement(required = true)
    protected String ncaId;

    /**
     * Gets the value of the ncaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcaName() {
        return ncaName;
    }

    /**
     * Sets the value of the ncaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcaName(String value) {
        this.ncaName = value;
    }

    /**
     * Gets the value of the ncaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcaId() {
        return ncaId;
    }

    /**
     * Sets the value of the ncaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcaId(String value) {
        this.ncaId = value;
    }

    public List<XmlRoleOfPSP> getRolesOfPSP() {
        if (rolesOfPSP == null) {
            rolesOfPSP = new ArrayList<XmlRoleOfPSP>();
        }
        return rolesOfPSP;
    }

    public void setRolesOfPSP(List<XmlRoleOfPSP> rolesOfPSP) {
        this.rolesOfPSP = rolesOfPSP;
    }

}
