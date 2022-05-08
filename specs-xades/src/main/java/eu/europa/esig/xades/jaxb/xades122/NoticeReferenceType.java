
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NoticeReferenceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NoticeReferenceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="NoticeNumbers" type="{http://uri.etsi.org/01903/v1.2.2#}IntegerListType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeReferenceType", propOrder = {
    "organization",
    "noticeNumbers"
})
public class NoticeReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Organization", required = true)
    protected String organization;
    @XmlElement(name = "NoticeNumbers", required = true)
    protected IntegerListType noticeNumbers;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the noticeNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerListType }
     *     
     */
    public IntegerListType getNoticeNumbers() {
        return noticeNumbers;
    }

    /**
     * Sets the value of the noticeNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerListType }
     *     
     */
    public void setNoticeNumbers(IntegerListType value) {
        this.noticeNumbers = value;
    }

}
