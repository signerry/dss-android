
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.SignatureScopeType;


/**
 * &lt;p&gt;Java class for SignatureScope complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureScope"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Scope" type="{http://dss.esig.europa.eu/validation/diagnostic}ScopeType"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Transformations" type="{http://dss.esig.europa.eu/validation/diagnostic}Transformations" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="SignerData" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureScope", propOrder = {
    "scope",
    "name",
    "description",
    "transformations"
})
public class XmlSignatureScope implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Scope", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected SignatureScopeType scope;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElementWrapper(name = "Transformations")
    @XmlElement(name = "Transformation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> transformations = new ArrayList<String>();
    @XmlAttribute(name = "SignerData", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected XmlSignerData signerData;

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public SignatureScopeType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(SignatureScopeType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the signerData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public XmlSignerData getSignerData() {
        return signerData;
    }

    /**
     * Sets the value of the signerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSignerData(XmlSignerData value) {
        this.signerData = value;
    }

    public List<String> getTransformations() {
        return transformations;
    }

    public void setTransformations(List<String> transformations) {
        this.transformations = transformations;
    }

}
