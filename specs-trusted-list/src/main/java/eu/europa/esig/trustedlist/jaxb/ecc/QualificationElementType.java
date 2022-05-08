
package eu.europa.esig.trustedlist.jaxb.ecc;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QualificationElementType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QualificationElementType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Qualifiers" type="{http://uri.etsi.org/TrstSvc/SvcInfoExt/eSigDir-1999-93-EC-TrustedList/#}QualifiersType"/&amp;gt;
 *         &amp;lt;element name="CriteriaList" type="{http://uri.etsi.org/TrstSvc/SvcInfoExt/eSigDir-1999-93-EC-TrustedList/#}CriteriaListType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationElementType", propOrder = {
    "qualifiers",
    "criteriaList"
})
public class QualificationElementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Qualifiers", required = true)
    protected QualifiersType qualifiers;
    @XmlElement(name = "CriteriaList", required = true)
    protected CriteriaListType criteriaList;

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiersType }
     *     
     */
    public QualifiersType getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiersType }
     *     
     */
    public void setQualifiers(QualifiersType value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the criteriaList property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaListType }
     *     
     */
    public CriteriaListType getCriteriaList() {
        return criteriaList;
    }

    /**
     * Sets the value of the criteriaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaListType }
     *     
     */
    public void setCriteriaList(CriteriaListType value) {
        this.criteriaList = value;
    }

}
