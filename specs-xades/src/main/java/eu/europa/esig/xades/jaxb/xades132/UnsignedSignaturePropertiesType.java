
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for UnsignedSignaturePropertiesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnsignedSignaturePropertiesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="CounterSignature" type="{http://uri.etsi.org/01903/v1.3.2#}CounterSignatureType"/&amp;gt;
 *         &amp;lt;element name="SignatureTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType"/&amp;gt;
 *         &amp;lt;element name="CompleteCertificateRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CompleteCertificateRefsType"/&amp;gt;
 *         &amp;lt;element name="CompleteRevocationRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CompleteRevocationRefsType"/&amp;gt;
 *         &amp;lt;element name="AttributeCertificateRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CompleteCertificateRefsType"/&amp;gt;
 *         &amp;lt;element name="AttributeRevocationRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CompleteRevocationRefsType"/&amp;gt;
 *         &amp;lt;element name="SigAndRefsTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType"/&amp;gt;
 *         &amp;lt;element name="RefsOnlyTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType"/&amp;gt;
 *         &amp;lt;element name="CertificateValues" type="{http://uri.etsi.org/01903/v1.3.2#}CertificateValuesType"/&amp;gt;
 *         &amp;lt;element name="RevocationValues" type="{http://uri.etsi.org/01903/v1.3.2#}RevocationValuesType"/&amp;gt;
 *         &amp;lt;element name="AttrAuthoritiesCertValues" type="{http://uri.etsi.org/01903/v1.3.2#}CertificateValuesType"/&amp;gt;
 *         &amp;lt;element name="AttributeRevocationValues" type="{http://uri.etsi.org/01903/v1.3.2#}RevocationValuesType"/&amp;gt;
 *         &amp;lt;element name="ArchiveTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}XAdESTimeStampType"/&amp;gt;
 *         &amp;lt;any namespace='##other'/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedSignaturePropertiesType", propOrder = {
    "counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs"
})
public class UnsignedSignaturePropertiesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "CounterSignature", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "SignatureTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "CompleteCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "CompleteRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "AttributeCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "AttributeRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "SigAndRefsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "RefsOnlyTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "CertificateValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "RevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "AttrAuthoritiesCertValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "AttributeRevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class),
        @XmlElementRef(name = "ArchiveTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CounterSignatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCounterSignatureOrSignatureTimeStampOrCompleteCertificateRefs() {
        if (counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs == null) {
            counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs = new ArrayList<Object>();
        }
        return this.counterSignatureOrSignatureTimeStampOrCompleteCertificateRefs;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
