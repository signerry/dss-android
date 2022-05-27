
package eu.europa.esig.dss.simplecertificatereport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for SimpleCertificateReport complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SimpleCertificateReport"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Chain" type="{http://dss.esig.europa.eu/validation/simple-certificate-report}Chain" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="ValidationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCertificateReport", propOrder = {
    "chain"
})
public class XmlSimpleCertificateReport implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "Chain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/simple-certificate-report")
    protected List<XmlChainItem> chain = new ArrayList<XmlChainItem>();
    @XmlAttribute(name = "ValidationTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date validationTime;

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationTime(Date value) {
        this.validationTime = value;
    }

    public List<XmlChainItem> getChain() {
        return chain;
    }

    public void setChain(List<XmlChainItem> chain) {
        this.chain = chain;
    }

}
