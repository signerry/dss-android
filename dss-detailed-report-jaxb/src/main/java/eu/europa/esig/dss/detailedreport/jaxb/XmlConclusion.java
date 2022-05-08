
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.Indication;
import eu.europa.esig.dss.enumerations.SubIndication;


/**
 * &lt;p&gt;Java class for Conclusion complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Conclusion"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Indication" type="{http://dss.esig.europa.eu/validation/detailed-report}Indication"/&amp;gt;
 *         &amp;lt;element name="SubIndication" type="{http://dss.esig.europa.eu/validation/detailed-report}SubIndication" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Errors" type="{http://dss.esig.europa.eu/validation/detailed-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warnings" type="{http://dss.esig.europa.eu/validation/detailed-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Infos" type="{http://dss.esig.europa.eu/validation/detailed-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conclusion", propOrder = {
    "indication",
    "subIndication",
    "errors",
    "warnings",
    "infos"
})
public class XmlConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Indication", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Indication indication;
    @XmlElement(name = "SubIndication", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected SubIndication subIndication;
    @XmlElement(name = "Errors")
    protected List<XmlMessage> errors;
    @XmlElement(name = "Warnings")
    protected List<XmlMessage> warnings;
    @XmlElement(name = "Infos")
    protected List<XmlMessage> infos;

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Indication getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(Indication value) {
        this.indication = value;
    }

    /**
     * Gets the value of the subIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SubIndication getSubIndication() {
        return subIndication;
    }

    /**
     * Sets the value of the subIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIndication(SubIndication value) {
        this.subIndication = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the errors property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getErrors().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getErrors() {
        if (errors == null) {
            errors = new ArrayList<XmlMessage>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the warnings property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWarnings().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<XmlMessage>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the infos property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the infos property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getInfos().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getInfos() {
        if (infos == null) {
            infos = new ArrayList<XmlMessage>();
        }
        return this.infos;
    }

}
