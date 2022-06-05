
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.validationreport.enums.ObjectType;


/**
 * &lt;p&gt;Java class for ValidationObjectType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationObjectType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="ValidationObjectRepresentation" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationObjectRepresentationType"/&amp;gt;
 *         &amp;lt;element name="POE" type="{http://uri.etsi.org/19102/v1.2.1#}POEType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="POEProvisioning" type="{http://uri.etsi.org/19102/v1.2.1#}POEProvisioningType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValidationReport" type="{http://uri.etsi.org/19102/v1.2.1#}SignatureValidationReportType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationObjectType", propOrder = {
    "objectType",
    "validationObjectRepresentation",
    "poe",
    "poeProvisioning",
    "validationReport"
})
public class ValidationObjectType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ObjectType", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anyURI")
    protected ObjectType objectType;
    @XmlElement(name = "ValidationObjectRepresentation", required = true)
    protected ValidationObjectRepresentationType validationObjectRepresentation;
    @XmlElement(name = "POE")
    protected POEType poe;
    @XmlElement(name = "POEProvisioning")
    protected POEProvisioningType poeProvisioning;
    @XmlElement(name = "ValidationReport")
    protected SignatureValidationReportType validationReport;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(ObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the validationObjectRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationObjectRepresentationType }
     *     
     */
    public ValidationObjectRepresentationType getValidationObjectRepresentation() {
        return validationObjectRepresentation;
    }

    /**
     * Sets the value of the validationObjectRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationObjectRepresentationType }
     *     
     */
    public void setValidationObjectRepresentation(ValidationObjectRepresentationType value) {
        this.validationObjectRepresentation = value;
    }

    /**
     * Gets the value of the poe property.
     * 
     * @return
     *     possible object is
     *     {@link POEType }
     *     
     */
    public POEType getPOE() {
        return poe;
    }

    /**
     * Sets the value of the poe property.
     * 
     * @param value
     *     allowed object is
     *     {@link POEType }
     *     
     */
    public void setPOE(POEType value) {
        this.poe = value;
    }

    /**
     * Gets the value of the poeProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link POEProvisioningType }
     *     
     */
    public POEProvisioningType getPOEProvisioning() {
        return poeProvisioning;
    }

    /**
     * Sets the value of the poeProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link POEProvisioningType }
     *     
     */
    public void setPOEProvisioning(POEProvisioningType value) {
        this.poeProvisioning = value;
    }

    /**
     * Gets the value of the validationReport property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureValidationReportType }
     *     
     */
    public SignatureValidationReportType getValidationReport() {
        return validationReport;
    }

    /**
     * Sets the value of the validationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureValidationReportType }
     *     
     */
    public void setValidationReport(SignatureValidationReportType value) {
        this.validationReport = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
