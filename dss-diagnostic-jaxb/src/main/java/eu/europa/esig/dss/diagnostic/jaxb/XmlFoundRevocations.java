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
 * <p>Java class for FoundRevocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoundRevocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelatedRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}RelatedRevocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrphanRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanRevocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoundRevocations", propOrder = {
    "relatedRevocations",
    "orphanRevocations"
})
public class XmlFoundRevocations implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelatedRevocation")
    protected List<XmlRelatedRevocation> relatedRevocations;
    @XmlElement(name = "OrphanRevocation")
    protected List<XmlOrphanRevocation> orphanRevocations;

    /**
     * Gets the value of the relatedRevocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedRevocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedRevocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRelatedRevocation }
     * 
     * 
     */
    public List<XmlRelatedRevocation> getRelatedRevocations() {
        if (relatedRevocations == null) {
            relatedRevocations = new ArrayList<XmlRelatedRevocation>();
        }
        return this.relatedRevocations;
    }

    /**
     * Gets the value of the orphanRevocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orphanRevocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrphanRevocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlOrphanRevocation }
     * 
     * 
     */
    public List<XmlOrphanRevocation> getOrphanRevocations() {
        if (orphanRevocations == null) {
            orphanRevocations = new ArrayList<XmlOrphanRevocation>();
        }
        return this.orphanRevocations;
    }

}
