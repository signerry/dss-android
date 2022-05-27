
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConstraintsConclusion complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConstraintsConclusion"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Constraint" type="{http://dss.esig.europa.eu/validation/detailed-report}Constraint" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Conclusion" type="{http://dss.esig.europa.eu/validation/detailed-report}Conclusion"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintsConclusion", propOrder = {
    "constraint",
    "conclusion"
})
@XmlSeeAlso({
    XmlCertificate.class,
    XmlTLAnalysis.class,
    XmlValidationSignatureQualification.class,
    XmlValidationCertificateQualification.class,
    XmlValidationProcessTimestamp.class,
    XmlValidationTimestampQualification.class,
    XmlRevocationBasicValidation.class,
    XmlConstraintsConclusionWithProofOfExistence.class,
    XmlFC.class,
    XmlISC.class,
    XmlVCI.class,
    XmlRFC.class,
    XmlCRS.class,
    XmlRAC.class,
    XmlCC.class,
    XmlCV.class,
    XmlSAV.class,
    XmlXCV.class,
    XmlSubXCV.class,
    XmlConstraintsConclusionWithControlTime.class
})
public class XmlConstraintsConclusion implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Constraint")
    protected List<XmlConstraint> constraint;
    @XmlElement(name = "Conclusion", required = true)
    protected XmlConclusion conclusion;
    @XmlAttribute(name = "Title", required = true)
    protected String title;

    /**
     * Gets the value of the constraint property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the constraint property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getConstraint().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlConstraint }
     * 
     * 
     */
    public List<XmlConstraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<XmlConstraint>();
        }
        return this.constraint;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link XmlConclusion }
     *     
     */
    public XmlConclusion getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlConclusion }
     *     
     */
    public void setConclusion(XmlConclusion value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
