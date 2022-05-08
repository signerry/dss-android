
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ValidationProcessLongTermData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ValidationProcessLongTermData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusionWithProofOfExistence"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CRS" type="{http://dss.esig.europa.eu/validation/detailed-report}CRS" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RFC" type="{http://dss.esig.europa.eu/validation/detailed-report}RFC" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationProcessLongTermData", propOrder = {
    "crs",
    "rfc"
})
public class XmlValidationProcessLongTermData
    extends XmlConstraintsConclusionWithProofOfExistence
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CRS")
    protected List<XmlCRS> crs;
    @XmlElement(name = "RFC")
    protected List<XmlRFC> rfc;

    /**
     * Gets the value of the crs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the crs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCRS().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlCRS }
     * 
     * 
     */
    public List<XmlCRS> getCRS() {
        if (crs == null) {
            crs = new ArrayList<XmlCRS>();
        }
        return this.crs;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rfc property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRFC().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlRFC }
     * 
     * 
     */
    public List<XmlRFC> getRFC() {
        if (rfc == null) {
            rfc = new ArrayList<XmlRFC>();
        }
        return this.rfc;
    }

}
