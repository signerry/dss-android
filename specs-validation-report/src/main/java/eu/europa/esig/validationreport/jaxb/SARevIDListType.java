
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SARevIDListType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SARevIDListType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *         &amp;lt;element name="CRLID" type="{http://uri.etsi.org/19102/v1.2.1#}SACRLIDType"/&amp;gt;
 *         &amp;lt;element name="OCSPID" type="{http://uri.etsi.org/19102/v1.2.1#}SAOCSPIDType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SARevIDListType", propOrder = {
    "crlidOrOCSPID"
})
public class SARevIDListType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "CRLID", type = SACRLIDType.class),
        @XmlElement(name = "OCSPID", type = SAOCSPIDType.class)
    })
    protected List<Serializable> crlidOrOCSPID;

    /**
     * Gets the value of the crlidOrOCSPID property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the crlidOrOCSPID property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCRLIDOrOCSPID().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SACRLIDType }
     * {@link SAOCSPIDType }
     * 
     * 
     */
    public List<Serializable> getCRLIDOrOCSPID() {
        if (crlidOrOCSPID == null) {
            crlidOrOCSPID = new ArrayList<Serializable>();
        }
        return this.crlidOrOCSPID;
    }

}
