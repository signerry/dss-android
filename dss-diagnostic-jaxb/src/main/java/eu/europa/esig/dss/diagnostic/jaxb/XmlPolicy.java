
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
 * &lt;p&gt;Java class for Policy complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Policy"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserNotice" type="{http://dss.esig.europa.eu/validation/diagnostic}UserNotice" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocSpecification" type="{http://dss.esig.europa.eu/validation/diagnostic}SPDocSpecification" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Identified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Asn1Processable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Transformations" type="{http://dss.esig.europa.eu/validation/diagnostic}Transformations" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentationReferences" type="{http://dss.esig.europa.eu/validation/diagnostic}DocumentationReferences" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProcessingError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}PolicyDigestAlgoAndValue" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Policy", propOrder = {
    "id",
    "url",
    "userNotice",
    "docSpecification",
    "description",
    "identified",
    "asn1Processable",
    "transformations",
    "documentationReferences",
    "processingError",
    "digestAlgoAndValue"
})
public class XmlPolicy implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "UserNotice")
    protected XmlUserNotice userNotice;
    @XmlElement(name = "DocSpecification")
    protected XmlSPDocSpecification docSpecification;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Identified")
    protected Boolean identified;
    @XmlElement(name = "Asn1Processable")
    protected Boolean asn1Processable;
    @XmlElementWrapper(name = "Transformations")
    @XmlElement(name = "Transformation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> transformations = new ArrayList<String>();
    @XmlElementWrapper(name = "DocumentationReferences")
    @XmlElement(name = "DocumentationReference", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> documentationReferences = new ArrayList<String>();
    @XmlElement(name = "ProcessingError")
    protected String processingError;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlPolicyDigestAlgoAndValue digestAlgoAndValue;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the userNotice property.
     * 
     * @return
     *     possible object is
     *     {@link XmlUserNotice }
     *     
     */
    public XmlUserNotice getUserNotice() {
        return userNotice;
    }

    /**
     * Sets the value of the userNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlUserNotice }
     *     
     */
    public void setUserNotice(XmlUserNotice value) {
        this.userNotice = value;
    }

    /**
     * Gets the value of the docSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSPDocSpecification }
     *     
     */
    public XmlSPDocSpecification getDocSpecification() {
        return docSpecification;
    }

    /**
     * Sets the value of the docSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSPDocSpecification }
     *     
     */
    public void setDocSpecification(XmlSPDocSpecification value) {
        this.docSpecification = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the identified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentified() {
        return identified;
    }

    /**
     * Sets the value of the identified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentified(Boolean value) {
        this.identified = value;
    }

    /**
     * Gets the value of the asn1Processable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsn1Processable() {
        return asn1Processable;
    }

    /**
     * Sets the value of the asn1Processable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsn1Processable(Boolean value) {
        this.asn1Processable = value;
    }

    /**
     * Gets the value of the processingError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingError() {
        return processingError;
    }

    /**
     * Sets the value of the processingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingError(String value) {
        this.processingError = value;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPolicyDigestAlgoAndValue }
     *     
     */
    public XmlPolicyDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPolicyDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlPolicyDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

    public List<String> getTransformations() {
        return transformations;
    }

    public void setTransformations(List<String> transformations) {
        this.transformations = transformations;
    }

    public List<String> getDocumentationReferences() {
        return documentationReferences;
    }

    public void setDocumentationReferences(List<String> documentationReferences) {
        this.documentationReferences = documentationReferences;
    }

}
