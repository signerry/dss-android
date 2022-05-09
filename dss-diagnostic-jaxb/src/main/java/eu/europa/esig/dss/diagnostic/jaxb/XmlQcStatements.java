
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for QcStatements complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QcStatements"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="QcCompliance" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;attribute name="present" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QcEuLimitValue" type="{http://dss.esig.europa.eu/validation/diagnostic}QcEuLimitValue" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="QcEuRetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="QcSSCD" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;attribute name="present" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QcEuPDS" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="PdsLocation" type="{http://dss.esig.europa.eu/validation/diagnostic}LangAndValue" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QcTypes" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="QcType" type="{http://dss.esig.europa.eu/validation/diagnostic}OID" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QcCClegislation" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="SemanticsIdentifier" type="{http://dss.esig.europa.eu/validation/diagnostic}OID" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PSD2QcInfo" type="{http://dss.esig.europa.eu/validation/diagnostic}PSD2QcInfo" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QcStatements", propOrder = {
    "qcCompliance",
    "qcEuLimitValue",
    "qcEuRetentionPeriod",
    "qcSSCD",
    "qcEuPDS",
    "qcTypes",
    "qcCClegislation",
    "semanticsIdentifier",
    "psd2QcInfo"
})
public class XmlQcStatements implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QcCompliance")
    protected XmlQcCompliance qcCompliance;
    @XmlElement(name = "QcEuLimitValue")
    protected XmlQcEuLimitValue qcEuLimitValue;
    @XmlElement(name = "QcEuRetentionPeriod")
    protected Integer qcEuRetentionPeriod;
    @XmlElement(name = "QcSSCD")
    protected XmlQcSSCD qcSSCD;
    @XmlElementWrapper(name = "QcEuPDS")
    @XmlElement(name = "PdsLocation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlLangAndValue> qcEuPDS = new ArrayList<XmlLangAndValue>();
    @XmlElementWrapper(name = "QcTypes")
    @XmlElement(name = "QcType", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlOID> qcTypes = new ArrayList<XmlOID>();
    @XmlElementWrapper(name = "QcCClegislation")
    @XmlElement(name = "CountryName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> qcCClegislation = new ArrayList<String>();
    @XmlElement(name = "SemanticsIdentifier")
    protected XmlOID semanticsIdentifier;
    @XmlElement(name = "PSD2QcInfo")
    protected XmlPSD2QcInfo psd2QcInfo;

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
     * Gets the value of the qcEuLimitValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQcEuLimitValue }
     *     
     */
    public XmlQcEuLimitValue getQcEuLimitValue() {
        return qcEuLimitValue;
    }

    /**
     * Sets the value of the qcEuLimitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQcEuLimitValue }
     *     
     */
    public void setQcEuLimitValue(XmlQcEuLimitValue value) {
        this.qcEuLimitValue = value;
    }

    /**
     * Gets the value of the qcEuRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQcEuRetentionPeriod() {
        return qcEuRetentionPeriod;
    }

    /**
     * Sets the value of the qcEuRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQcEuRetentionPeriod(Integer value) {
        this.qcEuRetentionPeriod = value;
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

    /**
     * Gets the value of the semanticsIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link XmlOID }
     *     
     */
    public XmlOID getSemanticsIdentifier() {
        return semanticsIdentifier;
    }

    /**
     * Sets the value of the semanticsIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlOID }
     *     
     */
    public void setSemanticsIdentifier(XmlOID value) {
        this.semanticsIdentifier = value;
    }

    /**
     * Gets the value of the psd2QcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPSD2QcInfo }
     *     
     */
    public XmlPSD2QcInfo getPSD2QcInfo() {
        return psd2QcInfo;
    }

    /**
     * Sets the value of the psd2QcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPSD2QcInfo }
     *     
     */
    public void setPSD2QcInfo(XmlPSD2QcInfo value) {
        this.psd2QcInfo = value;
    }

    public List<XmlLangAndValue> getQcEuPDS() {
        return qcEuPDS;
    }

    public void setQcEuPDS(List<XmlLangAndValue> qcEuPDS) {
        this.qcEuPDS = qcEuPDS;
    }

    public List<XmlOID> getQcTypes() {
        return qcTypes;
    }

    public void setQcTypes(List<XmlOID> qcTypes) {
        this.qcTypes = qcTypes;
    }

    public List<String> getQcCClegislation() {
        return qcCClegislation;
    }

    public void setQcCClegislation(List<String> qcCClegislation) {
        this.qcCClegislation = qcCClegislation;
    }

}
