
package eu.europa.esig.trustedlist.jaxb.tslx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.trustedlist.jaxb.tsl.AnyType;
import eu.europa.esig.trustedlist.jaxb.tsl.InternationalNamesType;
import eu.europa.esig.trustedlist.jaxb.tsl.NonEmptyMultiLangURIType;


/**
 * &lt;p&gt;Java class for TakenOverByType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TakenOverByType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="URI" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType"/&amp;gt;
 *         &amp;lt;element name="TSPName" type="{http://uri.etsi.org/02231/v2#}InternationalNamesType"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeOperatorName"/&amp;gt;
 *         &amp;lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeTerritory"/&amp;gt;
 *         &amp;lt;element name="OtherQualifier" type="{http://uri.etsi.org/02231/v2#}AnyType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TakenOverByType", propOrder = {
    "uri",
    "tspName",
    "schemeOperatorName",
    "schemeTerritory",
    "otherQualifier"
})
public class TakenOverByType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "URI", required = true)
    protected NonEmptyMultiLangURIType uri;
    @XmlElement(name = "TSPName", required = true)
    protected InternationalNamesType tspName;
    @XmlElement(name = "SchemeOperatorName", namespace = "http://uri.etsi.org/02231/v2#", required = true)
    protected InternationalNamesType schemeOperatorName;
    @XmlElement(name = "SchemeTerritory", namespace = "http://uri.etsi.org/02231/v2#", required = true)
    protected String schemeTerritory;
    @XmlElement(name = "OtherQualifier")
    protected List<AnyType> otherQualifier;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public NonEmptyMultiLangURIType getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyMultiLangURIType }
     *     
     */
    public void setURI(NonEmptyMultiLangURIType value) {
        this.uri = value;
    }

    /**
     * Gets the value of the tspName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getTSPName() {
        return tspName;
    }

    /**
     * Sets the value of the tspName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setTSPName(InternationalNamesType value) {
        this.tspName = value;
    }

    /**
     * Gets the value of the schemeOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getSchemeOperatorName() {
        return schemeOperatorName;
    }

    /**
     * Sets the value of the schemeOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setSchemeOperatorName(InternationalNamesType value) {
        this.schemeOperatorName = value;
    }

    /**
     * Gets the value of the schemeTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeTerritory() {
        return schemeTerritory;
    }

    /**
     * Sets the value of the schemeTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeTerritory(String value) {
        this.schemeTerritory = value;
    }

    /**
     * Gets the value of the otherQualifier property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the otherQualifier property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOtherQualifier().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getOtherQualifier() {
        if (otherQualifier == null) {
            otherQualifier = new ArrayList<AnyType>();
        }
        return this.otherQualifier;
    }

}
