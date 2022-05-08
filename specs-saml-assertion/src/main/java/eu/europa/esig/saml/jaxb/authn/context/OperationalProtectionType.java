
package eu.europa.esig.saml.jaxb.authn.context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OperationalProtectionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OperationalProtectionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}SecurityAudit" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}DeactivationCallCenter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalProtectionType", propOrder = {
    "securityAudit",
    "deactivationCallCenter",
    "extension"
})
public class OperationalProtectionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SecurityAudit")
    protected SecurityAuditType securityAudit;
    @XmlElement(name = "DeactivationCallCenter")
    protected ExtensionOnlyType deactivationCallCenter;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the securityAudit property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAuditType }
     *     
     */
    public SecurityAuditType getSecurityAudit() {
        return securityAudit;
    }

    /**
     * Sets the value of the securityAudit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAuditType }
     *     
     */
    public void setSecurityAudit(SecurityAuditType value) {
        this.securityAudit = value;
    }

    /**
     * Gets the value of the deactivationCallCenter property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getDeactivationCallCenter() {
        return deactivationCallCenter;
    }

    /**
     * Sets the value of the deactivationCallCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setDeactivationCallCenter(ExtensionOnlyType value) {
        this.deactivationCallCenter = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the extension property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExtension().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
