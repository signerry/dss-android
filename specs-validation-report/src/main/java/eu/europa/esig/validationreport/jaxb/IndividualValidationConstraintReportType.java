
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IndividualValidationConstraintReportType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IndividualValidationConstraintReportType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidationConstraintIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="ValidationConstraintParameter" type="{http://uri.etsi.org/19102/v1.2.1#}TypedDataType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ConstraintStatus" type="{http://uri.etsi.org/19102/v1.2.1#}ConstraintStatusType"/&amp;gt;
 *         &amp;lt;element name="ValidationStatus" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationStatusType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Indications" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualValidationConstraintReportType", propOrder = {
    "validationConstraintIdentifier",
    "validationConstraintParameter",
    "constraintStatus",
    "validationStatus",
    "indications"
})
public class IndividualValidationConstraintReportType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidationConstraintIdentifier", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String validationConstraintIdentifier;
    @XmlElement(name = "ValidationConstraintParameter")
    protected List<TypedDataType> validationConstraintParameter;
    @XmlElement(name = "ConstraintStatus", required = true)
    protected ConstraintStatusType constraintStatus;
    @XmlElement(name = "ValidationStatus")
    protected ValidationStatusType validationStatus;
    @XmlElement(name = "Indications")
    protected Object indications;

    /**
     * Gets the value of the validationConstraintIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationConstraintIdentifier() {
        return validationConstraintIdentifier;
    }

    /**
     * Sets the value of the validationConstraintIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationConstraintIdentifier(String value) {
        this.validationConstraintIdentifier = value;
    }

    /**
     * Gets the value of the validationConstraintParameter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the validationConstraintParameter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getValidationConstraintParameter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TypedDataType }
     * 
     * 
     */
    public List<TypedDataType> getValidationConstraintParameter() {
        if (validationConstraintParameter == null) {
            validationConstraintParameter = new ArrayList<TypedDataType>();
        }
        return this.validationConstraintParameter;
    }

    /**
     * Gets the value of the constraintStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintStatusType }
     *     
     */
    public ConstraintStatusType getConstraintStatus() {
        return constraintStatus;
    }

    /**
     * Sets the value of the constraintStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintStatusType }
     *     
     */
    public void setConstraintStatus(ConstraintStatusType value) {
        this.constraintStatus = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusType }
     *     
     */
    public ValidationStatusType getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusType }
     *     
     */
    public void setValidationStatus(ValidationStatusType value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the indications property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndications() {
        return indications;
    }

    /**
     * Sets the value of the indications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndications(Object value) {
        this.indications = value;
    }

}
