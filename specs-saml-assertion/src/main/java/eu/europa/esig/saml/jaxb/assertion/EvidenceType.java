
package eu.europa.esig.saml.jaxb.assertion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EvidenceType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EvidenceType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AssertionIDRef"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AssertionURIRef"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}Assertion"/&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedAssertion"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvidenceType", propOrder = {
    "assertionIDRefOrAssertionURIRefOrAssertion"
})
public class EvidenceType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "AssertionIDRef", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AssertionURIRef", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Assertion", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EncryptedAssertion", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> assertionIDRefOrAssertionURIRefOrAssertion;

    /**
     * Gets the value of the assertionIDRefOrAssertionURIRefOrAssertion property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assertionIDRefOrAssertionURIRefOrAssertion property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAssertionIDRefOrAssertionURIRefOrAssertion().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AssertionType }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getAssertionIDRefOrAssertionURIRefOrAssertion() {
        if (assertionIDRefOrAssertionURIRefOrAssertion == null) {
            assertionIDRefOrAssertionURIRefOrAssertion = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.assertionIDRefOrAssertionURIRefOrAssertion;
    }

}