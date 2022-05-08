
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.saml.jaxb.assertion.AssertionType;
import eu.europa.esig.saml.jaxb.assertion.EncryptedElementType;


/**
 * &lt;p&gt;Java class for ResponseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}StatusResponseType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Assertion"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedAssertion"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "assertionOrEncryptedAssertion"
})
public class ResponseType
    extends StatusResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "Assertion", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = AssertionType.class),
        @XmlElement(name = "EncryptedAssertion", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = EncryptedElementType.class)
    })
    protected List<Serializable> assertionOrEncryptedAssertion;

    /**
     * Gets the value of the assertionOrEncryptedAssertion property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assertionOrEncryptedAssertion property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAssertionOrEncryptedAssertion().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AssertionType }
     * {@link EncryptedElementType }
     * 
     * 
     */
    public List<Serializable> getAssertionOrEncryptedAssertion() {
        if (assertionOrEncryptedAssertion == null) {
            assertionOrEncryptedAssertion = new ArrayList<Serializable>();
        }
        return this.assertionOrEncryptedAssertion;
    }

}
