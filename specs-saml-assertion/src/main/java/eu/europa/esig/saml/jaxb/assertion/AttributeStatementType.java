
package eu.europa.esig.saml.jaxb.assertion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeStatementType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AttributeStatementType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:assertion}StatementAbstractType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Attribute"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedAttribute"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeStatementType", propOrder = {
    "attributeOrEncryptedAttribute"
})
public class AttributeStatementType
    extends StatementAbstractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "Attribute", type = AttributeType.class),
        @XmlElement(name = "EncryptedAttribute", type = EncryptedElementType.class)
    })
    protected List<Serializable> attributeOrEncryptedAttribute;

    /**
     * Gets the value of the attributeOrEncryptedAttribute property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the attributeOrEncryptedAttribute property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAttributeOrEncryptedAttribute().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * {@link EncryptedElementType }
     * 
     * 
     */
    public List<Serializable> getAttributeOrEncryptedAttribute() {
        if (attributeOrEncryptedAttribute == null) {
            attributeOrEncryptedAttribute = new ArrayList<Serializable>();
        }
        return this.attributeOrEncryptedAttribute;
    }

}
