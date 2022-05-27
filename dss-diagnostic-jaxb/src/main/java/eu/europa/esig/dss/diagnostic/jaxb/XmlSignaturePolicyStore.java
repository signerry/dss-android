
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SignaturePolicyStore complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignaturePolicyStore"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}SPDocSpecification"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyStore", propOrder = {
    "digestAlgoAndValue"
})
public class XmlSignaturePolicyStore
    extends XmlSPDocSpecification
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

}
