
package eu.europa.esig.dss.policy.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group of constraints related to cryptographic usage
 * 
 * &lt;p&gt;Java class for CryptographicConstraint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CryptographicConstraint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AcceptableEncryptionAlgo" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MiniPublicKeySize" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AcceptableDigestAlgo" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AlgoExpirationDate" type="{http://dss.esig.europa.eu/validation/policy}AlgoExpirationDate" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicConstraint", propOrder = {
    "acceptableEncryptionAlgo",
    "miniPublicKeySize",
    "acceptableDigestAlgo",
    "algoExpirationDate"
})
public class CryptographicConstraint
    extends LevelConstraint
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AcceptableEncryptionAlgo")
    protected ListAlgo acceptableEncryptionAlgo;
    @XmlElement(name = "MiniPublicKeySize")
    protected ListAlgo miniPublicKeySize;
    @XmlElement(name = "AcceptableDigestAlgo")
    protected ListAlgo acceptableDigestAlgo;
    @XmlElement(name = "AlgoExpirationDate")
    protected AlgoExpirationDate algoExpirationDate;

    /**
     * Gets the value of the acceptableEncryptionAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableEncryptionAlgo() {
        return acceptableEncryptionAlgo;
    }

    /**
     * Sets the value of the acceptableEncryptionAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableEncryptionAlgo(ListAlgo value) {
        this.acceptableEncryptionAlgo = value;
    }

    /**
     * Gets the value of the miniPublicKeySize property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getMiniPublicKeySize() {
        return miniPublicKeySize;
    }

    /**
     * Sets the value of the miniPublicKeySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setMiniPublicKeySize(ListAlgo value) {
        this.miniPublicKeySize = value;
    }

    /**
     * Gets the value of the acceptableDigestAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableDigestAlgo() {
        return acceptableDigestAlgo;
    }

    /**
     * Sets the value of the acceptableDigestAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableDigestAlgo(ListAlgo value) {
        this.acceptableDigestAlgo = value;
    }

    /**
     * Gets the value of the algoExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public AlgoExpirationDate getAlgoExpirationDate() {
        return algoExpirationDate;
    }

    /**
     * Sets the value of the algoExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public void setAlgoExpirationDate(AlgoExpirationDate value) {
        this.algoExpirationDate = value;
    }

}
