
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.validationreport.enums.TypeOfProof;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for POEType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="POEType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="POETime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="TypeOfProof" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *         &amp;lt;element name="POEObject" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POEType", propOrder = {
    "poeTime",
    "typeOfProof",
    "poeObject"
})
public class POEType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "POETime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date poeTime;
    @XmlElement(name = "TypeOfProof", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anyURI")
    protected TypeOfProof typeOfProof;
    @XmlElement(name = "POEObject")
    protected VOReferenceType poeObject;

    /**
     * Gets the value of the poeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPOETime() {
        return poeTime;
    }

    /**
     * Sets the value of the poeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOETime(Date value) {
        this.poeTime = value;
    }

    /**
     * Gets the value of the typeOfProof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TypeOfProof getTypeOfProof() {
        return typeOfProof;
    }

    /**
     * Sets the value of the typeOfProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfProof(TypeOfProof value) {
        this.typeOfProof = value;
    }

    /**
     * Gets the value of the poeObject property.
     * 
     * @return
     *     possible object is
     *     {@link VOReferenceType }
     *     
     */
    public VOReferenceType getPOEObject() {
        return poeObject;
    }

    /**
     * Sets the value of the poeObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link VOReferenceType }
     *     
     */
    public void setPOEObject(VOReferenceType value) {
        this.poeObject = value;
    }

}
