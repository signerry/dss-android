
package eu.europa.esig.xades.jaxb.xades111;

import java.io.Serializable;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for OCSPIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OCSPIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ResponderID" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPIdentifierType", propOrder = {
    "responderID",
    "producedAt"
})
public class OCSPIdentifierType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponderID", required = true)
    protected String responderID;
    @XmlElement(name = "ProducedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar producedAt;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the responderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderID() {
        return responderID;
    }

    /**
     * Sets the value of the responderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderID(String value) {
        this.responderID = value;
    }

    /**
     * Gets the value of the producedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProducedAt() {
        return producedAt;
    }

    /**
     * Sets the value of the producedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProducedAt(XMLGregorianCalendar value) {
        this.producedAt = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
