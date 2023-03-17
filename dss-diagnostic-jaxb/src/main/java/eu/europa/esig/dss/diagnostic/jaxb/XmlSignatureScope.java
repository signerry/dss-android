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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.SignatureScopeType;


/**
 * <p>Java class for SignatureScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureScope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Scope" type="{http://dss.esig.europa.eu/validation/diagnostic}ScopeType"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Transformations" type="{http://dss.esig.europa.eu/validation/diagnostic}Transformations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SignerData" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected SignatureScopeType scope;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElementWrapper(name = "Transformations")
    @XmlElement(name = "Transformation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> transformations;
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
        if (transformations == null) {
            transformations = new ArrayList<String>();
        }
        return transformations;
    }

    public void setTransformations(List<String> transformations) {
        this.transformations = transformations;
    }

}
