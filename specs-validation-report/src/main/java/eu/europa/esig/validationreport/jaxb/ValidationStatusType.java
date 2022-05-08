
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.Indication;
import eu.europa.esig.dss.enumerations.SubIndication;


/**
 * &lt;p&gt;Java class for ValidationStatusType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationStatusType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MainIndication" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="SubIndication" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssociatedValidationReportData" type="{http://uri.etsi.org/19102/v1.2.1#}ValidationReportDataType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationStatusType", propOrder = {
    "mainIndication",
    "subIndication",
    "associatedValidationReportData"
})
public class ValidationStatusType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MainIndication", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "anyURI")
    protected Indication mainIndication;
    @XmlElement(name = "SubIndication", type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @XmlSchemaType(name = "anyURI")
    protected List<SubIndication> subIndication;
    @XmlElement(name = "AssociatedValidationReportData")
    protected List<ValidationReportDataType> associatedValidationReportData;

    /**
     * Gets the value of the mainIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Indication getMainIndication() {
        return mainIndication;
    }

    /**
     * Sets the value of the mainIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainIndication(Indication value) {
        this.mainIndication = value;
    }

    /**
     * Gets the value of the subIndication property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subIndication property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSubIndication().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<SubIndication> getSubIndication() {
        if (subIndication == null) {
            subIndication = new ArrayList<SubIndication>();
        }
        return this.subIndication;
    }

    /**
     * Gets the value of the associatedValidationReportData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the associatedValidationReportData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAssociatedValidationReportData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationReportDataType }
     * 
     * 
     */
    public List<ValidationReportDataType> getAssociatedValidationReportData() {
        if (associatedValidationReportData == null) {
            associatedValidationReportData = new ArrayList<ValidationReportDataType>();
        }
        return this.associatedValidationReportData;
    }

}
