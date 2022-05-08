
package eu.europa.esig.saml.jaxb.assertion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SubjectType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SubjectType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;sequence&amp;gt;
 *           &amp;lt;choice&amp;gt;
 *             &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}BaseID"/&amp;gt;
 *             &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}NameID"/&amp;gt;
 *             &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}EncryptedID"/&amp;gt;
 *           &amp;lt;/choice&amp;gt;
 *           &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectConfirmation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;/sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectConfirmation" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectType", propOrder = {
    "content"
})
public class SubjectType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "BaseID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NameID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EncryptedID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubjectConfirmation", namespace = "urn:oasis:names:tc:SAML:2.0:assertion", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * &lt;p&gt;
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "SubjectConfirmation" is used by two different parts of a schema. See: 
     * line 87 of file:/C:/w/signerry/dss-android/specs-saml-assertion/src/main/resources/xsd/saml-schema-assertion-2.0.xsd
     * line 85 of file:/C:/w/signerry/dss-android/specs-saml-assertion/src/main/resources/xsd/saml-schema-assertion-2.0.xsd
     * &lt;p&gt;
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the content property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BaseIDAbstractType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameIDType }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptedElementType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubjectConfirmationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}
