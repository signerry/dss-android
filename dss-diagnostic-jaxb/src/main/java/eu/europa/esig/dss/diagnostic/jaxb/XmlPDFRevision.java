
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PDFRevision complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PDFRevision"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SignatureField" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFSignatureField" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="PDFSignatureDictionary" type="{http://dss.esig.europa.eu/validation/diagnostic}PDFSignatureDictionary"/&amp;gt;
 *         &amp;lt;element name="ModificationDetection" type="{http://dss.esig.europa.eu/validation/diagnostic}ModificationDetection" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFRevision", propOrder = {
    "fields",
    "pdfSignatureDictionary",
    "modificationDetection"
})
public class XmlPDFRevision implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SignatureField", required = true)
    protected List<XmlPDFSignatureField> fields;
    @XmlElement(name = "PDFSignatureDictionary", required = true)
    protected XmlPDFSignatureDictionary pdfSignatureDictionary;
    @XmlElement(name = "ModificationDetection")
    protected XmlModificationDetection modificationDetection;

    /**
     * Gets the value of the fields property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fields property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFields().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlPDFSignatureField }
     * 
     * 
     */
    public List<XmlPDFSignatureField> getFields() {
        if (fields == null) {
            fields = new ArrayList<XmlPDFSignatureField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the pdfSignatureDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPDFSignatureDictionary }
     *     
     */
    public XmlPDFSignatureDictionary getPDFSignatureDictionary() {
        return pdfSignatureDictionary;
    }

    /**
     * Sets the value of the pdfSignatureDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPDFSignatureDictionary }
     *     
     */
    public void setPDFSignatureDictionary(XmlPDFSignatureDictionary value) {
        this.pdfSignatureDictionary = value;
    }

    /**
     * Gets the value of the modificationDetection property.
     * 
     * @return
     *     possible object is
     *     {@link XmlModificationDetection }
     *     
     */
    public XmlModificationDetection getModificationDetection() {
        return modificationDetection;
    }

    /**
     * Sets the value of the modificationDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlModificationDetection }
     *     
     */
    public void setModificationDetection(XmlModificationDetection value) {
        this.modificationDetection = value;
    }

}
