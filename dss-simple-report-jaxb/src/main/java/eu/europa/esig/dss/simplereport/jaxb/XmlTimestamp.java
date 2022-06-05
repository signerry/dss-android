
package eu.europa.esig.dss.simplereport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for Timestamp complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Timestamp"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/simple-report}Token"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ProductionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="ProducedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimestampLevel" type="{http://dss.esig.europa.eu/validation/simple-report}TimestampLevel" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimestampScope" type="{http://dss.esig.europa.eu/validation/simple-report}SignatureScope" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timestamp", propOrder = {
    "productionTime",
    "producedBy",
    "timestampLevel",
    "timestampScope"
})
public class XmlTimestamp
    extends XmlToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductionTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date productionTime;
    @XmlElement(name = "ProducedBy")
    protected String producedBy;
    @XmlElement(name = "TimestampLevel")
    protected XmlTimestampLevel timestampLevel;
    @XmlElement(name = "TimestampScope")
    protected List<XmlSignatureScope> timestampScope;

    /**
     * Gets the value of the productionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProductionTime() {
        return productionTime;
    }

    /**
     * Sets the value of the productionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionTime(Date value) {
        this.productionTime = value;
    }

    /**
     * Gets the value of the producedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducedBy() {
        return producedBy;
    }

    /**
     * Sets the value of the producedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducedBy(String value) {
        this.producedBy = value;
    }

    /**
     * Gets the value of the timestampLevel property.
     * 
     * @return
     *     possible object is
     *     {@link XmlTimestampLevel }
     *     
     */
    public XmlTimestampLevel getTimestampLevel() {
        return timestampLevel;
    }

    /**
     * Sets the value of the timestampLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlTimestampLevel }
     *     
     */
    public void setTimestampLevel(XmlTimestampLevel value) {
        this.timestampLevel = value;
    }

    /**
     * Gets the value of the timestampScope property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the timestampScope property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTimestampScope().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignatureScope }
     * 
     * 
     */
    public List<XmlSignatureScope> getTimestampScope() {
        if (timestampScope == null) {
            timestampScope = new ArrayList<XmlSignatureScope>();
        }
        return this.timestampScope;
    }

}
