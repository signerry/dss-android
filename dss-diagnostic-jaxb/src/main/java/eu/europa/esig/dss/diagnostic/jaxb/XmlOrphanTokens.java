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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrphanCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanCertificateToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrphanRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}OrphanRevocationToken" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orphanCertificates",
    "orphanRevocations"
})
public class XmlOrphanTokens implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrphanCertificate")
    protected List<XmlOrphanCertificateToken> orphanCertificates;
    @XmlElement(name = "OrphanRevocation")
    protected List<XmlOrphanRevocationToken> orphanRevocations;

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
     * {@link XmlOrphanCertificateToken }
     * 
     * 
     */
    public List<XmlOrphanCertificateToken> getOrphanCertificates() {
        if (orphanCertificates == null) {
            orphanCertificates = new ArrayList<XmlOrphanCertificateToken>();
        }
        return this.orphanCertificates;
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
     * {@link XmlOrphanRevocationToken }
     * 
     * 
     */
    public List<XmlOrphanRevocationToken> getOrphanRevocations() {
        if (orphanRevocations == null) {
            orphanRevocations = new ArrayList<XmlOrphanRevocationToken>();
        }
        return this.orphanRevocations;
    }

}
