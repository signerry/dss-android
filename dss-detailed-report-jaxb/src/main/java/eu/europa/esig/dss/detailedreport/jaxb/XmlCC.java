
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for CC complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CC"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="VerifiedAlgorithm" type="{http://dss.esig.europa.eu/validation/detailed-report}CryptographicAlgorithm"/&amp;gt;
 *         &amp;lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CC", propOrder = {
    "verifiedAlgorithm",
    "notAfter"
})
public class XmlCC
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VerifiedAlgorithm", required = true)
    protected XmlCryptographicAlgorithm verifiedAlgorithm;
    @XmlElement(name = "NotAfter", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notAfter;

    /**
     * Gets the value of the verifiedAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCryptographicAlgorithm }
     *     
     */
    public XmlCryptographicAlgorithm getVerifiedAlgorithm() {
        return verifiedAlgorithm;
    }

    /**
     * Sets the value of the verifiedAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCryptographicAlgorithm }
     *     
     */
    public void setVerifiedAlgorithm(XmlCryptographicAlgorithm value) {
        this.verifiedAlgorithm = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(Date value) {
        this.notAfter = value;
    }

}
