//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:14:09 AM EET 
//


package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoundCertificates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoundCertificates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatedCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}RelatedCertificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrphanCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanCertificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundCertificates", propOrder = {
    "relatedCertificates",
    "orphanCertificates"
})
public class XmlFoundCertificates implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedCertificate")
    protected List<XmlRelatedCertificate> relatedCertificates;
    @XmlElement(name = "OrphanCertificate")
    protected List<XmlOrphanCertificate> orphanCertificates;

    /**
     * Gets the value of the relatedCertificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedCertificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRelatedCertificate }
     * 
     * 
     */
    public List<XmlRelatedCertificate> getRelatedCertificates() {
        if (relatedCertificates == null) {
            relatedCertificates = new ArrayList<XmlRelatedCertificate>();
        }
        return this.relatedCertificates;
    }

    /**
     * Gets the value of the orphanCertificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orphanCertificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrphanCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlOrphanCertificate }
     * 
     * 
     */
    public List<XmlOrphanCertificate> getOrphanCertificates() {
        if (orphanCertificates == null) {
            orphanCertificates = new ArrayList<XmlOrphanCertificate>();
        }
        return this.orphanCertificates;
    }

}
