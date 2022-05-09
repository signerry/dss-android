
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TrustedServiceProvider complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TrustedServiceProvider"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TSPNames"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TSPName" type="{http://dss.esig.europa.eu/validation/diagnostic}LangAndValue" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TSPTradeNames" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TSPTradeName" type="{http://dss.esig.europa.eu/validation/diagnostic}LangAndValue" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TSPRegistrationIdentifiers" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TSPRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="TrustedServices"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TrustedService" type="{http://dss.esig.europa.eu/validation/diagnostic}TrustedService" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="TL" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *       &amp;lt;attribute name="LOTL" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedServiceProvider", propOrder = {
    "tspNames",
    "tspTradeNames",
    "tspRegistrationIdentifiers",
    "trustedServices"
})
public class XmlTrustedServiceProvider implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "TSPNames", required = true)
    @XmlElement(name = "TSPName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlLangAndValue> tspNames = new ArrayList<XmlLangAndValue>();
    @XmlElementWrapper(name = "TSPTradeNames")
    @XmlElement(name = "TSPTradeName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlLangAndValue> tspTradeNames = new ArrayList<XmlLangAndValue>();
    @XmlElementWrapper(name = "TSPRegistrationIdentifiers")
    @XmlElement(name = "TSPRegistrationIdentifier", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> tspRegistrationIdentifiers = new ArrayList<String>();
    @XmlElementWrapper(name = "TrustedServices", required = true)
    @XmlElement(name = "TrustedService", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlTrustedService> trustedServices = new ArrayList<XmlTrustedService>();
    @XmlAttribute(name = "TL", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList tl;
    @XmlAttribute(name = "LOTL")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList lotl;

    /**
     * Gets the value of the tl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList getTL() {
        return tl;
    }

    /**
     * Sets the value of the tl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTL(eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList value) {
        this.tl = value;
    }

    /**
     * Gets the value of the lotl property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList getLOTL() {
        return lotl;
    }

    /**
     * Sets the value of the lotl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOTL(eu.europa.esig.dss.diagnostic.jaxb.XmlTrustedList value) {
        this.lotl = value;
    }

    public List<XmlLangAndValue> getTSPNames() {
        return tspNames;
    }

    public void setTSPNames(List<XmlLangAndValue> tspNames) {
        this.tspNames = tspNames;
    }

    public List<XmlLangAndValue> getTSPTradeNames() {
        return tspTradeNames;
    }

    public void setTSPTradeNames(List<XmlLangAndValue> tspTradeNames) {
        this.tspTradeNames = tspTradeNames;
    }

    public List<String> getTSPRegistrationIdentifiers() {
        return tspRegistrationIdentifiers;
    }

    public void setTSPRegistrationIdentifiers(List<String> tspRegistrationIdentifiers) {
        this.tspRegistrationIdentifiers = tspRegistrationIdentifiers;
    }

    public List<XmlTrustedService> getTrustedServices() {
        return trustedServices;
    }

    public void setTrustedServices(List<XmlTrustedService> trustedServices) {
        this.trustedServices = trustedServices;
    }

}
