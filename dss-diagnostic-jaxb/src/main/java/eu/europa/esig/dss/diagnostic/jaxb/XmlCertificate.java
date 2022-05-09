
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.CertificateSourceType;
import eu.europa.esig.dss.enumerations.EncryptionAlgorithm;
import eu.europa.esig.dss.enumerations.KeyUsageBit;


/**
 * &lt;p&gt;Java class for Certificate complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Certificate"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}AbstractToken"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SubjectDistinguishedName" type="{http://dss.esig.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="IssuerDistinguishedName" type="{http://dss.esig.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&amp;gt;
 *         &amp;lt;element name="SubjectSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrganizationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OrganizationalUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Pseudonym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SubjectAlternativeNames" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="subjectAlternativeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="AuthorityInformationAccessUrls" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="aiaUrl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CRLDistributionPoints" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="crlUrl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OCSPAccessUrls" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ocspServerUrl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Sources"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Source" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateSourceType" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="PublicKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="PublicKeyEncryptionAlgo" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="KeyUsageBits" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="KeyUsage" type="{http://dss.esig.europa.eu/validation/diagnostic}KeyUsage" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExtendedKeyUsages" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="extendedKeyUsagesOid" type="{http://dss.esig.europa.eu/validation/diagnostic}OID" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IdPkixOcspNoCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ValAssuredShortTermCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BasicSignature" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicSignature"/&amp;gt;
 *         &amp;lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}SigningCertificate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CertificateChain" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateChain" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Trusted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="SelfSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="CertificatePolicies" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="certificatePolicy" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificatePolicy" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="QcStatements" type="{http://dss.esig.europa.eu/validation/diagnostic}QcStatements" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TrustedServiceProviders" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="TrustedServiceProvider" type="{http://dss.esig.europa.eu/validation/diagnostic}TrustedServiceProvider" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Revocations" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CertificateRevocation" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateRevocation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="Base64Encoded" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&amp;gt;
 *           &amp;lt;element name="DigestAlgoAndValue" type="{http://dss.esig.europa.eu/validation/diagnostic}DigestAlgoAndValue"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Certificate", propOrder = {
    "subjectDistinguishedName",
    "issuerDistinguishedName",
    "serialNumber",
    "subjectSerialNumber",
    "commonName",
    "locality",
    "state",
    "countryName",
    "organizationIdentifier",
    "organizationName",
    "organizationalUnit",
    "title",
    "givenName",
    "surname",
    "pseudonym",
    "email",
    "subjectAlternativeNames",
    "authorityInformationAccessUrls",
    "crlDistributionPoints",
    "ocspAccessUrls",
    "sources",
    "notAfter",
    "notBefore",
    "publicKeySize",
    "publicKeyEncryptionAlgo",
    "entityKey",
    "keyUsageBits",
    "extendedKeyUsages",
    "idPkixOcspNoCheck",
    "valAssuredShortTermCertificate",
    "basicSignature",
    "signingCertificate",
    "certificateChain",
    "trusted",
    "selfSigned",
    "certificatePolicies",
    "qcStatements",
    "trustedServiceProviders",
    "revocations",
    "base64Encoded",
    "digestAlgoAndValue"
})
public class XmlCertificate
    extends XmlAbstractToken
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubjectDistinguishedName", required = true)
    protected List<XmlDistinguishedName> subjectDistinguishedName;
    @XmlElement(name = "IssuerDistinguishedName", required = true)
    protected List<XmlDistinguishedName> issuerDistinguishedName;
    @XmlElement(name = "SerialNumber", required = true)
    protected BigInteger serialNumber;
    @XmlElement(name = "SubjectSerialNumber")
    protected String subjectSerialNumber;
    @XmlElement(name = "CommonName")
    protected String commonName;
    @XmlElement(name = "Locality")
    protected String locality;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "OrganizationIdentifier")
    protected String organizationIdentifier;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "OrganizationalUnit")
    protected String organizationalUnit;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Pseudonym")
    protected String pseudonym;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElementWrapper(name = "SubjectAlternativeNames")
    @XmlElement(name = "subjectAlternativeName", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> subjectAlternativeNames = new ArrayList<String>();
    @XmlElementWrapper(name = "AuthorityInformationAccessUrls")
    @XmlElement(name = "aiaUrl", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> authorityInformationAccessUrls = new ArrayList<String>();
    @XmlElementWrapper(name = "CRLDistributionPoints")
    @XmlElement(name = "crlUrl", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> crlDistributionPoints = new ArrayList<String>();
    @XmlElementWrapper(name = "OCSPAccessUrls")
    @XmlElement(name = "ocspServerUrl", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> ocspAccessUrls = new ArrayList<String>();
    @XmlElementWrapper(name = "Sources", required = true)
    @XmlElement(name = "Source", namespace = "http://dss.esig.europa.eu/validation/diagnostic", type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected List<CertificateSourceType> sources = new ArrayList<CertificateSourceType>();
    @XmlElement(name = "NotAfter", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notAfter;
    @XmlElement(name = "NotBefore", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date notBefore;
    @XmlElement(name = "PublicKeySize")
    protected int publicKeySize;
    @XmlElement(name = "PublicKeyEncryptionAlgo", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter27 .class)
    protected EncryptionAlgorithm publicKeyEncryptionAlgo;
    @XmlElement(name = "EntityKey", required = true)
    protected String entityKey;
    @XmlElementWrapper(name = "KeyUsageBits")
    @XmlElement(name = "KeyUsage", namespace = "http://dss.esig.europa.eu/validation/diagnostic", type = String.class)
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected List<KeyUsageBit> keyUsageBits = new ArrayList<KeyUsageBit>();
    @XmlElementWrapper(name = "ExtendedKeyUsages")
    @XmlElement(name = "extendedKeyUsagesOid", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlOID> extendedKeyUsages = new ArrayList<XmlOID>();
    @XmlElement(name = "IdPkixOcspNoCheck")
    protected Boolean idPkixOcspNoCheck;
    @XmlElement(name = "ValAssuredShortTermCertificate")
    protected Boolean valAssuredShortTermCertificate;
    @XmlElement(name = "BasicSignature", required = true)
    protected XmlBasicSignature basicSignature;
    @XmlElement(name = "SigningCertificate")
    protected XmlSigningCertificate signingCertificate;
    @XmlElementWrapper(name = "CertificateChain")
    @XmlElement(name = "ChainItem", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlChainItem> certificateChain = new ArrayList<XmlChainItem>();
    @XmlElement(name = "Trusted")
    protected boolean trusted;
    @XmlElement(name = "SelfSigned")
    protected boolean selfSigned;
    @XmlElementWrapper(name = "CertificatePolicies")
    @XmlElement(name = "certificatePolicy", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlCertificatePolicy> certificatePolicies = new ArrayList<XmlCertificatePolicy>();
    @XmlElement(name = "QcStatements")
    protected XmlQcStatements qcStatements;
    @XmlElementWrapper(name = "TrustedServiceProviders")
    @XmlElement(name = "TrustedServiceProvider", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlTrustedServiceProvider> trustedServiceProviders = new ArrayList<XmlTrustedServiceProvider>();
    @XmlElementWrapper(name = "Revocations")
    @XmlElement(name = "CertificateRevocation", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlCertificateRevocation> revocations = new ArrayList<XmlCertificateRevocation>();
    @XmlElement(name = "Base64Encoded")
    protected byte[] base64Encoded;
    @XmlElement(name = "DigestAlgoAndValue")
    protected XmlDigestAlgoAndValue digestAlgoAndValue;

    /**
     * Gets the value of the subjectDistinguishedName property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subjectDistinguishedName property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSubjectDistinguishedName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDistinguishedName }
     * 
     * 
     */
    public List<XmlDistinguishedName> getSubjectDistinguishedName() {
        if (subjectDistinguishedName == null) {
            subjectDistinguishedName = new ArrayList<XmlDistinguishedName>();
        }
        return this.subjectDistinguishedName;
    }

    /**
     * Gets the value of the issuerDistinguishedName property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the issuerDistinguishedName property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIssuerDistinguishedName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link XmlDistinguishedName }
     * 
     * 
     */
    public List<XmlDistinguishedName> getIssuerDistinguishedName() {
        if (issuerDistinguishedName == null) {
            issuerDistinguishedName = new ArrayList<XmlDistinguishedName>();
        }
        return this.issuerDistinguishedName;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSerialNumber(BigInteger value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the subjectSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectSerialNumber() {
        return subjectSerialNumber;
    }

    /**
     * Sets the value of the subjectSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectSerialNumber(String value) {
        this.subjectSerialNumber = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the organizationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationIdentifier() {
        return organizationIdentifier;
    }

    /**
     * Sets the value of the organizationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationIdentifier(String value) {
        this.organizationIdentifier = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * Sets the value of the organizationalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnit(String value) {
        this.organizationalUnit = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonym(String value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAfter(Date value) {
        this.notAfter = value;
    }

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotBefore(Date value) {
        this.notBefore = value;
    }

    /**
     * Gets the value of the publicKeySize property.
     * 
     */
    public int getPublicKeySize() {
        return publicKeySize;
    }

    /**
     * Sets the value of the publicKeySize property.
     * 
     */
    public void setPublicKeySize(int value) {
        this.publicKeySize = value;
    }

    /**
     * Gets the value of the publicKeyEncryptionAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public EncryptionAlgorithm getPublicKeyEncryptionAlgo() {
        return publicKeyEncryptionAlgo;
    }

    /**
     * Sets the value of the publicKeyEncryptionAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKeyEncryptionAlgo(EncryptionAlgorithm value) {
        this.publicKeyEncryptionAlgo = value;
    }

    /**
     * Gets the value of the entityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityKey() {
        return entityKey;
    }

    /**
     * Sets the value of the entityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityKey(String value) {
        this.entityKey = value;
    }

    /**
     * Gets the value of the idPkixOcspNoCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdPkixOcspNoCheck() {
        return idPkixOcspNoCheck;
    }

    /**
     * Sets the value of the idPkixOcspNoCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdPkixOcspNoCheck(Boolean value) {
        this.idPkixOcspNoCheck = value;
    }

    /**
     * Gets the value of the valAssuredShortTermCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValAssuredShortTermCertificate() {
        return valAssuredShortTermCertificate;
    }

    /**
     * Sets the value of the valAssuredShortTermCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValAssuredShortTermCertificate(Boolean value) {
        this.valAssuredShortTermCertificate = value;
    }

    /**
     * Gets the value of the basicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link XmlBasicSignature }
     *     
     */
    public XmlBasicSignature getBasicSignature() {
        return basicSignature;
    }

    /**
     * Sets the value of the basicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlBasicSignature }
     *     
     */
    public void setBasicSignature(XmlBasicSignature value) {
        this.basicSignature = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public XmlSigningCertificate getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSigningCertificate }
     *     
     */
    public void setSigningCertificate(XmlSigningCertificate value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the trusted property.
     * 
     */
    public boolean isTrusted() {
        return trusted;
    }

    /**
     * Sets the value of the trusted property.
     * 
     */
    public void setTrusted(boolean value) {
        this.trusted = value;
    }

    /**
     * Gets the value of the selfSigned property.
     * 
     */
    public boolean isSelfSigned() {
        return selfSigned;
    }

    /**
     * Sets the value of the selfSigned property.
     * 
     */
    public void setSelfSigned(boolean value) {
        this.selfSigned = value;
    }

    /**
     * Gets the value of the qcStatements property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQcStatements }
     *     
     */
    public XmlQcStatements getQcStatements() {
        return qcStatements;
    }

    /**
     * Sets the value of the qcStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQcStatements }
     *     
     */
    public void setQcStatements(XmlQcStatements value) {
        this.qcStatements = value;
    }

    /**
     * Gets the value of the base64Encoded property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase64Encoded() {
        return base64Encoded;
    }

    /**
     * Sets the value of the base64Encoded property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase64Encoded(byte[] value) {
        this.base64Encoded = value;
    }

    /**
     * Gets the value of the digestAlgoAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public XmlDigestAlgoAndValue getDigestAlgoAndValue() {
        return digestAlgoAndValue;
    }

    /**
     * Sets the value of the digestAlgoAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDigestAlgoAndValue }
     *     
     */
    public void setDigestAlgoAndValue(XmlDigestAlgoAndValue value) {
        this.digestAlgoAndValue = value;
    }

    public List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public List<String> getAuthorityInformationAccessUrls() {
        return authorityInformationAccessUrls;
    }

    public void setAuthorityInformationAccessUrls(List<String> authorityInformationAccessUrls) {
        this.authorityInformationAccessUrls = authorityInformationAccessUrls;
    }

    public List<String> getCRLDistributionPoints() {
        return crlDistributionPoints;
    }

    public void setCRLDistributionPoints(List<String> crlDistributionPoints) {
        this.crlDistributionPoints = crlDistributionPoints;
    }

    public List<String> getOCSPAccessUrls() {
        return ocspAccessUrls;
    }

    public void setOCSPAccessUrls(List<String> ocspAccessUrls) {
        this.ocspAccessUrls = ocspAccessUrls;
    }

    public List<CertificateSourceType> getSources() {
        return sources;
    }

    public void setSources(List<CertificateSourceType> sources) {
        this.sources = sources;
    }

    public List<KeyUsageBit> getKeyUsageBits() {
        return keyUsageBits;
    }

    public void setKeyUsageBits(List<KeyUsageBit> keyUsageBits) {
        this.keyUsageBits = keyUsageBits;
    }

    public List<XmlOID> getExtendedKeyUsages() {
        return extendedKeyUsages;
    }

    public void setExtendedKeyUsages(List<XmlOID> extendedKeyUsages) {
        this.extendedKeyUsages = extendedKeyUsages;
    }

    public List<XmlChainItem> getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(List<XmlChainItem> certificateChain) {
        this.certificateChain = certificateChain;
    }

    public List<XmlCertificatePolicy> getCertificatePolicies() {
        return certificatePolicies;
    }

    public void setCertificatePolicies(List<XmlCertificatePolicy> certificatePolicies) {
        this.certificatePolicies = certificatePolicies;
    }

    public List<XmlTrustedServiceProvider> getTrustedServiceProviders() {
        return trustedServiceProviders;
    }

    public void setTrustedServiceProviders(List<XmlTrustedServiceProvider> trustedServiceProviders) {
        this.trustedServiceProviders = trustedServiceProviders;
    }

    public List<XmlCertificateRevocation> getRevocations() {
        return revocations;
    }

    public void setRevocations(List<XmlCertificateRevocation> revocations) {
        this.revocations = revocations;
    }

}
