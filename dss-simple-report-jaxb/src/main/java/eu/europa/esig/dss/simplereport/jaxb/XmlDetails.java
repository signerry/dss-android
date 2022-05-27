
package eu.europa.esig.dss.simplereport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for Details complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Details"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Error" type="{http://dss.esig.europa.eu/validation/simple-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Warning" type="{http://dss.esig.europa.eu/validation/simple-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Info" type="{http://dss.esig.europa.eu/validation/simple-report}Message" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Details", propOrder = {
    "error",
    "warning",
    "info"
})
public class XmlDetails
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Error")
    protected List<XmlMessage> error;
    @XmlElement(name = "Warning")
    protected List<XmlMessage> warning;
    @XmlElement(name = "Info")
    protected List<XmlMessage> info;

    /**
     * Gets the value of the error property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the error property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getError().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getError() {
        if (error == null) {
            error = new ArrayList<XmlMessage>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the warning property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWarning().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getWarning() {
        if (warning == null) {
            warning = new ArrayList<XmlMessage>();
        }
        return this.warning;
    }

    /**
     * Gets the value of the info property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the info property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlMessage }
     * 
     * 
     */
    public List<XmlMessage> getInfo() {
        if (info == null) {
            info = new ArrayList<XmlMessage>();
        }
        return this.info;
    }

}
