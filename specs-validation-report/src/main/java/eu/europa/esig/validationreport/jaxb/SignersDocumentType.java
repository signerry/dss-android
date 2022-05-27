
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import eu.europa.esig.xades.jaxb.xades132.DigestAlgAndValueType;


/**
 * &lt;p&gt;Java class for SignersDocumentType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignersDocumentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;sequence&amp;gt;
 *             &amp;lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&amp;gt;
 *             &amp;lt;element name="SignersDocumentRepresentation" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *           &amp;lt;/sequence&amp;gt;
 *           &amp;lt;element name="SignersDocumentRepresentation" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="SignersDocumentRef" type="{http://uri.etsi.org/19102/v1.2.1#}VOReferenceType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignersDocumentType", propOrder = {
    "content"
})
public class SignersDocumentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "DigestAlgAndValue", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignersDocumentRepresentation", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignersDocumentRef", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * &lt;p&gt;
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "SignersDocumentRepresentation" is used by two different parts of a schema. See: 
     * line 133 of file:/C:/w/signerry/dss-android/specs-validation-report/src/main/resources/xsd/1910202xmlSchema.xsd
     * line 131 of file:/C:/w/signerry/dss-android/specs-validation-report/src/main/resources/xsd/1910202xmlSchema.xsd
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
     * {@link JAXBElement }{@code <}{@link DigestAlgAndValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
