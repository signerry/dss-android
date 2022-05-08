
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ObjectIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ObjectIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Identifier" type="{http://uri.etsi.org/01903/v1.2.2#}IdentifierType"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentationReferences" type="{http://uri.etsi.org/01903/v1.2.2#}DocumentationReferencesType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIdentifierType", propOrder = {
    "identifier",
    "description",
    "documentationReferences"
})
public class ObjectIdentifierType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Identifier", required = true)
    protected IdentifierType identifier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DocumentationReferences")
    protected DocumentationReferencesType documentationReferences;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
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
     * Gets the value of the documentationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationReferencesType }
     *     
     */
    public DocumentationReferencesType getDocumentationReferences() {
        return documentationReferences;
    }

    /**
     * Sets the value of the documentationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationReferencesType }
     *     
     */
    public void setDocumentationReferences(DocumentationReferencesType value) {
        this.documentationReferences = value;
    }

}
