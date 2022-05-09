
package eu.europa.esig.dss.simplereport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.SignatureLevel;


/**
 * &lt;p&gt;Java class for Signature complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Signature"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/simple-report}Token"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BestSignatureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="SignedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureLevel" type="{http://dss.esig.europa.eu/validation/simple-report}SignatureLevel" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SignatureScope" type="{http://dss.esig.europa.eu/validation/simple-report}SignatureScope" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Timestamps" type="{http://dss.esig.europa.eu/validation/simple-report}Timestamps" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="CounterSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="ParentId" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="SignatureFormat" use="required" type="{http://dss.esig.europa.eu/validation/simple-report}SignatureFormat" /&amp;gt;
 *       &amp;lt;attribute name="ExtensionPeriodMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *       &amp;lt;attribute name="ExtensionPeriodMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = {
    "signingTime",
    "bestSignatureTime",
    "signedBy",
    "signatureLevel",
    "signatureScope",
    "timestamps"
})
public class XmlSignature
    extends XmlToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SigningTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date signingTime;
    @XmlElement(name = "BestSignatureTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date bestSignatureTime;
    @XmlElement(name = "SignedBy")
    protected String signedBy;
    @XmlElement(name = "SignatureLevel")
    protected XmlSignatureLevel signatureLevel;
    @XmlElement(name = "SignatureScope")
    protected List<XmlSignatureScope> signatureScope;
    @XmlElement(name = "Timestamps")
    protected XmlTimestamps timestamps;
    @XmlAttribute(name = "CounterSignature")
    protected Boolean counterSignature;
    @XmlAttribute(name = "ParentId")
    protected String parentId;
    @XmlAttribute(name = "SignatureFormat", required = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected SignatureLevel signatureFormat;
    @XmlAttribute(name = "ExtensionPeriodMin")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date extensionPeriodMin;
    @XmlAttribute(name = "ExtensionPeriodMax")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date extensionPeriodMax;

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningTime(Date value) {
        this.signingTime = value;
    }

    /**
     * Gets the value of the bestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBestSignatureTime() {
        return bestSignatureTime;
    }

    /**
     * Sets the value of the bestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestSignatureTime(Date value) {
        this.bestSignatureTime = value;
    }

    /**
     * Gets the value of the signedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedBy() {
        return signedBy;
    }

    /**
     * Sets the value of the signedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedBy(String value) {
        this.signedBy = value;
    }

    /**
     * Gets the value of the signatureLevel property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSignatureLevel }
     *     
     */
    public XmlSignatureLevel getSignatureLevel() {
        return signatureLevel;
    }

    /**
     * Sets the value of the signatureLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSignatureLevel }
     *     
     */
    public void setSignatureLevel(XmlSignatureLevel value) {
        this.signatureLevel = value;
    }

    /**
     * Gets the value of the signatureScope property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signatureScope property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSignatureScope().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignatureScope }
     * 
     * 
     */
    public List<XmlSignatureScope> getSignatureScope() {
        if (signatureScope == null) {
            signatureScope = new ArrayList<XmlSignatureScope>();
        }
        return this.signatureScope;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTimestamps }
     *     
     */
    public XmlTimestamps getTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTimestamps }
     *     
     */
    public void setTimestamps(XmlTimestamps value) {
        this.timestamps = value;
    }

    /**
     * Gets the value of the counterSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterSignature() {
        return counterSignature;
    }

    /**
     * Sets the value of the counterSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSignature(Boolean value) {
        this.counterSignature = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the signatureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SignatureLevel getSignatureFormat() {
        return signatureFormat;
    }

    /**
     * Sets the value of the signatureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFormat(SignatureLevel value) {
        this.signatureFormat = value;
    }

    /**
     * Gets the value of the extensionPeriodMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExtensionPeriodMin() {
        return extensionPeriodMin;
    }

    /**
     * Sets the value of the extensionPeriodMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionPeriodMin(Date value) {
        this.extensionPeriodMin = value;
    }

    /**
     * Gets the value of the extensionPeriodMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getExtensionPeriodMax() {
        return extensionPeriodMax;
    }

    /**
     * Sets the value of the extensionPeriodMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionPeriodMax(Date value) {
        this.extensionPeriodMax = value;
    }

}
