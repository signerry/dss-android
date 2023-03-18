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
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalThirdCountryQcStatementsMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalThirdCountryQcStatementsMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QcCompliance" type="{http://dss.esig.europa.eu/validation/diagnostic}QcCompliance" minOccurs="0"/&gt;
 *         &lt;element name="QcSSCD" type="{http://dss.esig.europa.eu/validation/diagnostic}QcSSCD" minOccurs="0"/&gt;
 *         &lt;element name="QcTypes" type="{http://dss.esig.europa.eu/validation/diagnostic}QcTypes" minOccurs="0"/&gt;
 *         &lt;element name="QcCClegislation" type="{http://dss.esig.europa.eu/validation/diagnostic}QcCClegislation" minOccurs="0"/&gt;
 *         &lt;element name="OtherOIDs" type="{http://dss.esig.europa.eu/validation/diagnostic}OIDs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalThirdCountryQcStatementsMapping", propOrder = {
    "qcCompliance",
    "qcSSCD",
    "qcTypes",
    "qcCClegislation",
    "otherOIDs"
})
public class XmlOriginalThirdCountryQcStatementsMapping implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QcCompliance")
    protected XmlQcCompliance qcCompliance;
    @XmlElement(name = "QcSSCD")
    protected XmlQcSSCD qcSSCD;
    @XmlElementWrapper(name = "QcTypes")
    @XmlElement(name = "QcType", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlOID> qcTypes;
    @XmlElementWrapper(name = "QcCClegislation")
    @XmlElement(name = "CountryName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> qcCClegislation;
    @XmlElementWrapper(name = "OtherOIDs")
    @XmlElement(name = "OID", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlOID> otherOIDs;

    /**
     * Gets the value of the qcCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQcCompliance }
     *     
     */
    public XmlQcCompliance getQcCompliance() {
        return qcCompliance;
    }

    /**
     * Sets the value of the qcCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQcCompliance }
     *     
     */
    public void setQcCompliance(XmlQcCompliance value) {
        this.qcCompliance = value;
    }

    /**
     * Gets the value of the qcSSCD property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQcSSCD }
     *     
     */
    public XmlQcSSCD getQcSSCD() {
        return qcSSCD;
    }

    /**
     * Sets the value of the qcSSCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQcSSCD }
     *     
     */
    public void setQcSSCD(XmlQcSSCD value) {
        this.qcSSCD = value;
    }

    public List<XmlOID> getQcTypes() {
        if (qcTypes == null) {
            qcTypes = new ArrayList<XmlOID>();
        }
        return qcTypes;
    }

    public void setQcTypes(List<XmlOID> qcTypes) {
        this.qcTypes = qcTypes;
    }

    public List<String> getQcCClegislation() {
        if (qcCClegislation == null) {
            qcCClegislation = new ArrayList<String>();
        }
        return qcCClegislation;
    }

    public void setQcCClegislation(List<String> qcCClegislation) {
        this.qcCClegislation = qcCClegislation;
    }

    public List<XmlOID> getOtherOIDs() {
        if (otherOIDs == null) {
            otherOIDs = new ArrayList<XmlOID>();
        }
        return otherOIDs;
    }

    public void setOtherOIDs(List<XmlOID> otherOIDs) {
        this.otherOIDs = otherOIDs;
    }

}