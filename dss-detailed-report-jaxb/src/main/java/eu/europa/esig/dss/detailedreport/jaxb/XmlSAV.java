
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SAV complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SAV"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CryptographicValidation" type="{http://dss.esig.europa.eu/validation/detailed-report}CryptographicValidation"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAV", propOrder = {
    "cryptographicValidation"
})
public class XmlSAV
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CryptographicValidation", required = true)
    protected XmlCryptographicValidation cryptographicValidation;

    /**
     * Gets the value of the cryptographicValidation property.
     * 
     * @return
     *     possible object is
     *     {@link XmlCryptographicValidation }
     *     
     */
    public XmlCryptographicValidation getCryptographicValidation() {
        return cryptographicValidation;
    }

    /**
     * Sets the value of the cryptographicValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlCryptographicValidation }
     *     
     */
    public void setCryptographicValidation(XmlCryptographicValidation value) {
        this.cryptographicValidation = value;
    }

}
