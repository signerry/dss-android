
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for SAOCSPIDType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SAOCSPIDType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="ResponderIDByName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *           &amp;lt;element name="ResponderIDByKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAOCSPIDType", propOrder = {
    "producedAt",
    "responderIDByName",
    "responderIDByKey"
})
public class SAOCSPIDType implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProducedAt", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date producedAt;
    @XmlElement(name = "ResponderIDByName")
    protected String responderIDByName;
    @XmlElement(name = "ResponderIDByKey")
    protected byte[] responderIDByKey;

    /**
     * Gets the value of the producedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getProducedAt() {
        return producedAt;
    }

    /**
     * Sets the value of the producedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducedAt(Date value) {
        this.producedAt = value;
    }

    /**
     * Gets the value of the responderIDByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderIDByName() {
        return responderIDByName;
    }

    /**
     * Sets the value of the responderIDByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderIDByName(String value) {
        this.responderIDByName = value;
    }

    /**
     * Gets the value of the responderIDByKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getResponderIDByKey() {
        return responderIDByKey;
    }

    /**
     * Sets the value of the responderIDByKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setResponderIDByKey(byte[] value) {
        this.responderIDByKey = value;
    }

}
