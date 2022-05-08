
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for SignatureAttributesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignatureAttributesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element name="SigningTime" type="{http://uri.etsi.org/19102/v1.2.1#}SASigningTimeType"/&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://uri.etsi.org/19102/v1.2.1#}SACertIDListType"/&amp;gt;
 *         &amp;lt;element name="DataObjectFormat" type="{http://uri.etsi.org/19102/v1.2.1#}SADataObjectFormatType"/&amp;gt;
 *         &amp;lt;element name="CommitmentTypeIndication" type="{http://uri.etsi.org/19102/v1.2.1#}SACommitmentTypeIndicationType"/&amp;gt;
 *         &amp;lt;element name="AllDataObjectsTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="IndividualDataObjectsTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="SigPolicyIdentifier" type="{http://uri.etsi.org/19102/v1.2.1#}SASigPolicyIdentifierType"/&amp;gt;
 *         &amp;lt;element name="SignatureProductionPlace" type="{http://uri.etsi.org/19102/v1.2.1#}SASignatureProductionPlaceType"/&amp;gt;
 *         &amp;lt;element name="SignerRole" type="{http://uri.etsi.org/19102/v1.2.1#}SASignerRoleType"/&amp;gt;
 *         &amp;lt;element name="CounterSignature" type="{http://uri.etsi.org/19102/v1.2.1#}SACounterSignatureType"/&amp;gt;
 *         &amp;lt;element name="SignatureTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="CompleteCertificateRefs" type="{http://uri.etsi.org/19102/v1.2.1#}SACertIDListType"/&amp;gt;
 *         &amp;lt;element name="CompleteRevocationRefs" type="{http://uri.etsi.org/19102/v1.2.1#}SARevIDListType"/&amp;gt;
 *         &amp;lt;element name="AttributeCertificateRefs" type="{http://uri.etsi.org/19102/v1.2.1#}SACertIDListType"/&amp;gt;
 *         &amp;lt;element name="AttributeRevocationRefs" type="{http://uri.etsi.org/19102/v1.2.1#}SARevIDListType"/&amp;gt;
 *         &amp;lt;element name="SigAndRefsTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="RefsOnlyTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="CertificateValues" type="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"/&amp;gt;
 *         &amp;lt;element name="RevocationValues" type="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"/&amp;gt;
 *         &amp;lt;element name="AttrAuthoritiesCertValues" type="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"/&amp;gt;
 *         &amp;lt;element name="AttributeRevocationValues" type="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"/&amp;gt;
 *         &amp;lt;element name="TimeStampValidationData" type="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"/&amp;gt;
 *         &amp;lt;element name="ArchiveTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="RenewedDigests" type="{http://uri.etsi.org/19102/v1.2.1#}SAListOfIntegersType"/&amp;gt;
 *         &amp;lt;element name="MessageDigest" type="{http://uri.etsi.org/19102/v1.2.1#}SAMessageDigestType"/&amp;gt;
 *         &amp;lt;element name="DSS" type="{http://uri.etsi.org/19102/v1.2.1#}SADSSType"/&amp;gt;
 *         &amp;lt;element name="VRI" type="{http://uri.etsi.org/19102/v1.2.1#}SAVRIType"/&amp;gt;
 *         &amp;lt;element name="DocTimeStamp" type="{http://uri.etsi.org/19102/v1.2.1#}SATimestampType"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{http://uri.etsi.org/19102/v1.2.1#}SAReasonType"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://uri.etsi.org/19102/v1.2.1#}SANameType"/&amp;gt;
 *         &amp;lt;element name="ContactInfo" type="{http://uri.etsi.org/19102/v1.2.1#}SAContactInfoType"/&amp;gt;
 *         &amp;lt;element name="SubFilter" type="{http://uri.etsi.org/19102/v1.2.1#}SASubFilterType"/&amp;gt;
 *         &amp;lt;element name="ByteRange" type="{http://uri.etsi.org/19102/v1.2.1#}SAListOfIntegersType"/&amp;gt;
 *         &amp;lt;element name="Filter" type="{http://uri.etsi.org/19102/v1.2.1#}SAFilterType"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureAttributesType", propOrder = {
    "signingTimeOrSigningCertificateOrDataObjectFormat"
})
public class SignatureAttributesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRefs({
        @XmlElementRef(name = "SigningTime", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SigningCertificate", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DataObjectFormat", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CommitmentTypeIndication", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllDataObjectsTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IndividualDataObjectsTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SigPolicyIdentifier", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignatureProductionPlace", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignerRole", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CounterSignature", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignatureTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteCertificateRefs", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteRevocationRefs", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeCertificateRefs", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationRefs", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SigAndRefsTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefsOnlyTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CertificateValues", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RevocationValues", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttrAuthoritiesCertValues", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationValues", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TimeStampValidationData", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArchiveTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RenewedDigests", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MessageDigest", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DSS", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VRI", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DocTimeStamp", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Reason", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Name", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ContactInfo", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubFilter", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ByteRange", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Filter", namespace = "http://uri.etsi.org/19102/v1.2.1#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> signingTimeOrSigningCertificateOrDataObjectFormat;

    /**
     * Gets the value of the signingTimeOrSigningCertificateOrDataObjectFormat property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the signingTimeOrSigningCertificateOrDataObjectFormat property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSigningTimeOrSigningCertificateOrDataObjectFormat().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SASigningTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SADataObjectFormatType }{@code >}
     * {@link JAXBElement }{@code <}{@link SACommitmentTypeIndicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SASigPolicyIdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link SASignatureProductionPlaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SASignerRoleType }{@code >}
     * {@link JAXBElement }{@code <}{@link SACounterSignatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link SAMessageDigestType }{@code >}
     * {@link JAXBElement }{@code <}{@link SADSSType }{@code >}
     * {@link JAXBElement }{@code <}{@link SAVRIType }{@code >}
     * {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * {@link JAXBElement }{@code <}{@link SAReasonType }{@code >}
     * {@link JAXBElement }{@code <}{@link SANameType }{@code >}
     * {@link JAXBElement }{@code <}{@link SAContactInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link SASubFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link SAFilterType }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSigningTimeOrSigningCertificateOrDataObjectFormat() {
        if (signingTimeOrSigningCertificateOrDataObjectFormat == null) {
            signingTimeOrSigningCertificateOrDataObjectFormat = new ArrayList<Object>();
        }
        return this.signingTimeOrSigningCertificateOrDataObjectFormat;
    }

}
