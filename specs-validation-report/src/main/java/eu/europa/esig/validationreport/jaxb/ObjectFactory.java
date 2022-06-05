
package eu.europa.esig.validationreport.jaxb;

import java.math.BigInteger;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.europa.esig.xades.jaxb.xades132.DigestAlgAndValueType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.validationreport.jaxb package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SignatureReference_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignatureReference");
    private final static QName _ValidationReport_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "ValidationReport");
    private final static QName _XAdESSignaturePtr_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "XAdESSignaturePtr");
    private final static QName _SignatureAttributesTypeSigningTime_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SigningTime");
    private final static QName _SignatureAttributesTypeSigningCertificate_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SigningCertificate");
    private final static QName _SignatureAttributesTypeDataObjectFormat_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "DataObjectFormat");
    private final static QName _SignatureAttributesTypeCommitmentTypeIndication_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "CommitmentTypeIndication");
    private final static QName _SignatureAttributesTypeAllDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "AllDataObjectsTimeStamp");
    private final static QName _SignatureAttributesTypeIndividualDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "IndividualDataObjectsTimeStamp");
    private final static QName _SignatureAttributesTypeSigPolicyIdentifier_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SigPolicyIdentifier");
    private final static QName _SignatureAttributesTypeSignatureProductionPlace_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignatureProductionPlace");
    private final static QName _SignatureAttributesTypeSignerRole_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignerRole");
    private final static QName _SignatureAttributesTypeCounterSignature_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "CounterSignature");
    private final static QName _SignatureAttributesTypeSignatureTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignatureTimeStamp");
    private final static QName _SignatureAttributesTypeCompleteCertificateRefs_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "CompleteCertificateRefs");
    private final static QName _SignatureAttributesTypeCompleteRevocationRefs_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "CompleteRevocationRefs");
    private final static QName _SignatureAttributesTypeAttributeCertificateRefs_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "AttributeCertificateRefs");
    private final static QName _SignatureAttributesTypeAttributeRevocationRefs_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "AttributeRevocationRefs");
    private final static QName _SignatureAttributesTypeSigAndRefsTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SigAndRefsTimeStamp");
    private final static QName _SignatureAttributesTypeRefsOnlyTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "RefsOnlyTimeStamp");
    private final static QName _SignatureAttributesTypeCertificateValues_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "CertificateValues");
    private final static QName _SignatureAttributesTypeRevocationValues_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "RevocationValues");
    private final static QName _SignatureAttributesTypeAttrAuthoritiesCertValues_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "AttrAuthoritiesCertValues");
    private final static QName _SignatureAttributesTypeAttributeRevocationValues_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "AttributeRevocationValues");
    private final static QName _SignatureAttributesTypeTimeStampValidationData_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "TimeStampValidationData");
    private final static QName _SignatureAttributesTypeArchiveTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "ArchiveTimeStamp");
    private final static QName _SignatureAttributesTypeRenewedDigests_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "RenewedDigests");
    private final static QName _SignatureAttributesTypeMessageDigest_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "MessageDigest");
    private final static QName _SignatureAttributesTypeDSS_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "DSS");
    private final static QName _SignatureAttributesTypeVRI_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "VRI");
    private final static QName _SignatureAttributesTypeDocTimeStamp_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "DocTimeStamp");
    private final static QName _SignatureAttributesTypeReason_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "Reason");
    private final static QName _SignatureAttributesTypeName_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "Name");
    private final static QName _SignatureAttributesTypeContactInfo_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "ContactInfo");
    private final static QName _SignatureAttributesTypeSubFilter_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SubFilter");
    private final static QName _SignatureAttributesTypeByteRange_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "ByteRange");
    private final static QName _SignatureAttributesTypeFilter_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "Filter");
    private final static QName _SignersDocumentTypeDigestAlgAndValue_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "DigestAlgAndValue");
    private final static QName _SignersDocumentTypeSignersDocumentRepresentation_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignersDocumentRepresentation");
    private final static QName _SignersDocumentTypeSignersDocumentRef_QNAME = new QName("http://uri.etsi.org/19102/v1.2.1#", "SignersDocumentRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.validationreport.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureReferenceType }
     * 
     */
    public SignatureReferenceType createSignatureReferenceType() {
        return new SignatureReferenceType();
    }

    /**
     * Create an instance of {@link ValidationReportType }
     * 
     */
    public ValidationReportType createValidationReportType() {
        return new ValidationReportType();
    }

    /**
     * Create an instance of {@link XAdESSignaturePtrType }
     * 
     */
    public XAdESSignaturePtrType createXAdESSignaturePtrType() {
        return new XAdESSignaturePtrType();
    }

    /**
     * Create an instance of {@link SignatureValidationReportType }
     * 
     */
    public SignatureValidationReportType createSignatureValidationReportType() {
        return new SignatureValidationReportType();
    }

    /**
     * Create an instance of {@link SignatureIdentifierType }
     * 
     */
    public SignatureIdentifierType createSignatureIdentifierType() {
        return new SignatureIdentifierType();
    }

    /**
     * Create an instance of {@link SignatureValidatorType }
     * 
     */
    public SignatureValidatorType createSignatureValidatorType() {
        return new SignatureValidatorType();
    }

    /**
     * Create an instance of {@link ValidationStatusType }
     * 
     */
    public ValidationStatusType createValidationStatusType() {
        return new ValidationStatusType();
    }

    /**
     * Create an instance of {@link ValidationConstraintsEvaluationReportType }
     * 
     */
    public ValidationConstraintsEvaluationReportType createValidationConstraintsEvaluationReportType() {
        return new ValidationConstraintsEvaluationReportType();
    }

    /**
     * Create an instance of {@link SignatureValidationPolicyType }
     * 
     */
    public SignatureValidationPolicyType createSignatureValidationPolicyType() {
        return new SignatureValidationPolicyType();
    }

    /**
     * Create an instance of {@link IndividualValidationConstraintReportType }
     * 
     */
    public IndividualValidationConstraintReportType createIndividualValidationConstraintReportType() {
        return new IndividualValidationConstraintReportType();
    }

    /**
     * Create an instance of {@link ConstraintStatusType }
     * 
     */
    public ConstraintStatusType createConstraintStatusType() {
        return new ConstraintStatusType();
    }

    /**
     * Create an instance of {@link TypedDataType }
     * 
     */
    public TypedDataType createTypedDataType() {
        return new TypedDataType();
    }

    /**
     * Create an instance of {@link ValidationTimeInfoType }
     * 
     */
    public ValidationTimeInfoType createValidationTimeInfoType() {
        return new ValidationTimeInfoType();
    }

    /**
     * Create an instance of {@link SignersDocumentType }
     * 
     */
    public SignersDocumentType createSignersDocumentType() {
        return new SignersDocumentType();
    }

    /**
     * Create an instance of {@link SignatureAttributesType }
     * 
     */
    public SignatureAttributesType createSignatureAttributesType() {
        return new SignatureAttributesType();
    }

    /**
     * Create an instance of {@link SignerInformationType }
     * 
     */
    public SignerInformationType createSignerInformationType() {
        return new SignerInformationType();
    }

    /**
     * Create an instance of {@link SignatureQualityType }
     * 
     */
    public SignatureQualityType createSignatureQualityType() {
        return new SignatureQualityType();
    }

    /**
     * Create an instance of {@link SignatureValidationProcessType }
     * 
     */
    public SignatureValidationProcessType createSignatureValidationProcessType() {
        return new SignatureValidationProcessType();
    }

    /**
     * Create an instance of {@link ValidationReportDataType }
     * 
     */
    public ValidationReportDataType createValidationReportDataType() {
        return new ValidationReportDataType();
    }

    /**
     * Create an instance of {@link CertificateChainType }
     * 
     */
    public CertificateChainType createCertificateChainType() {
        return new CertificateChainType();
    }

    /**
     * Create an instance of {@link RevocationStatusInformationType }
     * 
     */
    public RevocationStatusInformationType createRevocationStatusInformationType() {
        return new RevocationStatusInformationType();
    }

    /**
     * Create an instance of {@link CryptoInformationType }
     * 
     */
    public CryptoInformationType createCryptoInformationType() {
        return new CryptoInformationType();
    }

    /**
     * Create an instance of {@link AdditionalValidationReportDataType }
     * 
     */
    public AdditionalValidationReportDataType createAdditionalValidationReportDataType() {
        return new AdditionalValidationReportDataType();
    }

    /**
     * Create an instance of {@link ValidationObjectListType }
     * 
     */
    public ValidationObjectListType createValidationObjectListType() {
        return new ValidationObjectListType();
    }

    /**
     * Create an instance of {@link ValidationObjectType }
     * 
     */
    public ValidationObjectType createValidationObjectType() {
        return new ValidationObjectType();
    }

    /**
     * Create an instance of {@link ValidationObjectRepresentationType }
     * 
     */
    public ValidationObjectRepresentationType createValidationObjectRepresentationType() {
        return new ValidationObjectRepresentationType();
    }

    /**
     * Create an instance of {@link POEType }
     * 
     */
    public POEType createPOEType() {
        return new POEType();
    }

    /**
     * Create an instance of {@link POEProvisioningType }
     * 
     */
    public POEProvisioningType createPOEProvisioningType() {
        return new POEProvisioningType();
    }

    /**
     * Create an instance of {@link VOReferenceType }
     * 
     */
    public VOReferenceType createVOReferenceType() {
        return new VOReferenceType();
    }

    /**
     * Create an instance of {@link NsPrefixMappingType }
     * 
     */
    public NsPrefixMappingType createNsPrefixMappingType() {
        return new NsPrefixMappingType();
    }

    /**
     * Create an instance of {@link AttributeBaseType }
     * 
     */
    public AttributeBaseType createAttributeBaseType() {
        return new AttributeBaseType();
    }

    /**
     * Create an instance of {@link SASigningTimeType }
     * 
     */
    public SASigningTimeType createSASigningTimeType() {
        return new SASigningTimeType();
    }

    /**
     * Create an instance of {@link SACertIDListType }
     * 
     */
    public SACertIDListType createSACertIDListType() {
        return new SACertIDListType();
    }

    /**
     * Create an instance of {@link SACertIDType }
     * 
     */
    public SACertIDType createSACertIDType() {
        return new SACertIDType();
    }

    /**
     * Create an instance of {@link SADataObjectFormatType }
     * 
     */
    public SADataObjectFormatType createSADataObjectFormatType() {
        return new SADataObjectFormatType();
    }

    /**
     * Create an instance of {@link SACommitmentTypeIndicationType }
     * 
     */
    public SACommitmentTypeIndicationType createSACommitmentTypeIndicationType() {
        return new SACommitmentTypeIndicationType();
    }

    /**
     * Create an instance of {@link SASigPolicyIdentifierType }
     * 
     */
    public SASigPolicyIdentifierType createSASigPolicyIdentifierType() {
        return new SASigPolicyIdentifierType();
    }

    /**
     * Create an instance of {@link SASignatureProductionPlaceType }
     * 
     */
    public SASignatureProductionPlaceType createSASignatureProductionPlaceType() {
        return new SASignatureProductionPlaceType();
    }

    /**
     * Create an instance of {@link SASignerRoleType }
     * 
     */
    public SASignerRoleType createSASignerRoleType() {
        return new SASignerRoleType();
    }

    /**
     * Create an instance of {@link SAOneSignerRoleType }
     * 
     */
    public SAOneSignerRoleType createSAOneSignerRoleType() {
        return new SAOneSignerRoleType();
    }

    /**
     * Create an instance of {@link SACounterSignatureType }
     * 
     */
    public SACounterSignatureType createSACounterSignatureType() {
        return new SACounterSignatureType();
    }

    /**
     * Create an instance of {@link SARevIDListType }
     * 
     */
    public SARevIDListType createSARevIDListType() {
        return new SARevIDListType();
    }

    /**
     * Create an instance of {@link SACRLIDType }
     * 
     */
    public SACRLIDType createSACRLIDType() {
        return new SACRLIDType();
    }

    /**
     * Create an instance of {@link SAOCSPIDType }
     * 
     */
    public SAOCSPIDType createSAOCSPIDType() {
        return new SAOCSPIDType();
    }

    /**
     * Create an instance of {@link SADSSType }
     * 
     */
    public SADSSType createSADSSType() {
        return new SADSSType();
    }

    /**
     * Create an instance of {@link SAVRIType }
     * 
     */
    public SAVRIType createSAVRIType() {
        return new SAVRIType();
    }

    /**
     * Create an instance of {@link SAReasonType }
     * 
     */
    public SAReasonType createSAReasonType() {
        return new SAReasonType();
    }

    /**
     * Create an instance of {@link SANameType }
     * 
     */
    public SANameType createSANameType() {
        return new SANameType();
    }

    /**
     * Create an instance of {@link SAContactInfoType }
     * 
     */
    public SAContactInfoType createSAContactInfoType() {
        return new SAContactInfoType();
    }

    /**
     * Create an instance of {@link SASubFilterType }
     * 
     */
    public SASubFilterType createSASubFilterType() {
        return new SASubFilterType();
    }

    /**
     * Create an instance of {@link SAFilterType }
     * 
     */
    public SAFilterType createSAFilterType() {
        return new SAFilterType();
    }

    /**
     * Create an instance of {@link SATimestampType }
     * 
     */
    public SATimestampType createSATimestampType() {
        return new SATimestampType();
    }

    /**
     * Create an instance of {@link SAMessageDigestType }
     * 
     */
    public SAMessageDigestType createSAMessageDigestType() {
        return new SAMessageDigestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignatureReference")
    public JAXBElement<SignatureReferenceType> createSignatureReference(SignatureReferenceType value) {
        return new JAXBElement<SignatureReferenceType>(_SignatureReference_QNAME, SignatureReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "ValidationReport")
    public JAXBElement<ValidationReportType> createValidationReport(ValidationReportType value) {
        return new JAXBElement<ValidationReportType>(_ValidationReport_QNAME, ValidationReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESSignaturePtrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XAdESSignaturePtrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "XAdESSignaturePtr")
    public JAXBElement<XAdESSignaturePtrType> createXAdESSignaturePtr(XAdESSignaturePtrType value) {
        return new JAXBElement<XAdESSignaturePtrType>(_XAdESSignaturePtr_QNAME, XAdESSignaturePtrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SASigningTimeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SASigningTimeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SigningTime", scope = SignatureAttributesType.class)
    public JAXBElement<SASigningTimeType> createSignatureAttributesTypeSigningTime(SASigningTimeType value) {
        return new JAXBElement<SASigningTimeType>(_SignatureAttributesTypeSigningTime_QNAME, SASigningTimeType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SigningCertificate", scope = SignatureAttributesType.class)
    public JAXBElement<SACertIDListType> createSignatureAttributesTypeSigningCertificate(SACertIDListType value) {
        return new JAXBElement<SACertIDListType>(_SignatureAttributesTypeSigningCertificate_QNAME, SACertIDListType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SADataObjectFormatType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SADataObjectFormatType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "DataObjectFormat", scope = SignatureAttributesType.class)
    public JAXBElement<SADataObjectFormatType> createSignatureAttributesTypeDataObjectFormat(SADataObjectFormatType value) {
        return new JAXBElement<SADataObjectFormatType>(_SignatureAttributesTypeDataObjectFormat_QNAME, SADataObjectFormatType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SACommitmentTypeIndicationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SACommitmentTypeIndicationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "CommitmentTypeIndication", scope = SignatureAttributesType.class)
    public JAXBElement<SACommitmentTypeIndicationType> createSignatureAttributesTypeCommitmentTypeIndication(SACommitmentTypeIndicationType value) {
        return new JAXBElement<SACommitmentTypeIndicationType>(_SignatureAttributesTypeCommitmentTypeIndication_QNAME, SACommitmentTypeIndicationType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "AllDataObjectsTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeAllDataObjectsTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeAllDataObjectsTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "IndividualDataObjectsTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeIndividualDataObjectsTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeIndividualDataObjectsTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SASigPolicyIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SASigPolicyIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SigPolicyIdentifier", scope = SignatureAttributesType.class)
    public JAXBElement<SASigPolicyIdentifierType> createSignatureAttributesTypeSigPolicyIdentifier(SASigPolicyIdentifierType value) {
        return new JAXBElement<SASigPolicyIdentifierType>(_SignatureAttributesTypeSigPolicyIdentifier_QNAME, SASigPolicyIdentifierType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SASignatureProductionPlaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SASignatureProductionPlaceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignatureProductionPlace", scope = SignatureAttributesType.class)
    public JAXBElement<SASignatureProductionPlaceType> createSignatureAttributesTypeSignatureProductionPlace(SASignatureProductionPlaceType value) {
        return new JAXBElement<SASignatureProductionPlaceType>(_SignatureAttributesTypeSignatureProductionPlace_QNAME, SASignatureProductionPlaceType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SASignerRoleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SASignerRoleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignerRole", scope = SignatureAttributesType.class)
    public JAXBElement<SASignerRoleType> createSignatureAttributesTypeSignerRole(SASignerRoleType value) {
        return new JAXBElement<SASignerRoleType>(_SignatureAttributesTypeSignerRole_QNAME, SASignerRoleType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SACounterSignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SACounterSignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "CounterSignature", scope = SignatureAttributesType.class)
    public JAXBElement<SACounterSignatureType> createSignatureAttributesTypeCounterSignature(SACounterSignatureType value) {
        return new JAXBElement<SACounterSignatureType>(_SignatureAttributesTypeCounterSignature_QNAME, SACounterSignatureType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignatureTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeSignatureTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeSignatureTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "CompleteCertificateRefs", scope = SignatureAttributesType.class)
    public JAXBElement<SACertIDListType> createSignatureAttributesTypeCompleteCertificateRefs(SACertIDListType value) {
        return new JAXBElement<SACertIDListType>(_SignatureAttributesTypeCompleteCertificateRefs_QNAME, SACertIDListType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "CompleteRevocationRefs", scope = SignatureAttributesType.class)
    public JAXBElement<SARevIDListType> createSignatureAttributesTypeCompleteRevocationRefs(SARevIDListType value) {
        return new JAXBElement<SARevIDListType>(_SignatureAttributesTypeCompleteRevocationRefs_QNAME, SARevIDListType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SACertIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "AttributeCertificateRefs", scope = SignatureAttributesType.class)
    public JAXBElement<SACertIDListType> createSignatureAttributesTypeAttributeCertificateRefs(SACertIDListType value) {
        return new JAXBElement<SACertIDListType>(_SignatureAttributesTypeAttributeCertificateRefs_QNAME, SACertIDListType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SARevIDListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "AttributeRevocationRefs", scope = SignatureAttributesType.class)
    public JAXBElement<SARevIDListType> createSignatureAttributesTypeAttributeRevocationRefs(SARevIDListType value) {
        return new JAXBElement<SARevIDListType>(_SignatureAttributesTypeAttributeRevocationRefs_QNAME, SARevIDListType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SigAndRefsTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeSigAndRefsTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeSigAndRefsTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "RefsOnlyTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeRefsOnlyTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeRefsOnlyTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "CertificateValues", scope = SignatureAttributesType.class)
    public JAXBElement<AttributeBaseType> createSignatureAttributesTypeCertificateValues(AttributeBaseType value) {
        return new JAXBElement<AttributeBaseType>(_SignatureAttributesTypeCertificateValues_QNAME, AttributeBaseType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "RevocationValues", scope = SignatureAttributesType.class)
    public JAXBElement<AttributeBaseType> createSignatureAttributesTypeRevocationValues(AttributeBaseType value) {
        return new JAXBElement<AttributeBaseType>(_SignatureAttributesTypeRevocationValues_QNAME, AttributeBaseType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "AttrAuthoritiesCertValues", scope = SignatureAttributesType.class)
    public JAXBElement<AttributeBaseType> createSignatureAttributesTypeAttrAuthoritiesCertValues(AttributeBaseType value) {
        return new JAXBElement<AttributeBaseType>(_SignatureAttributesTypeAttrAuthoritiesCertValues_QNAME, AttributeBaseType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "AttributeRevocationValues", scope = SignatureAttributesType.class)
    public JAXBElement<AttributeBaseType> createSignatureAttributesTypeAttributeRevocationValues(AttributeBaseType value) {
        return new JAXBElement<AttributeBaseType>(_SignatureAttributesTypeAttributeRevocationValues_QNAME, AttributeBaseType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributeBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "TimeStampValidationData", scope = SignatureAttributesType.class)
    public JAXBElement<AttributeBaseType> createSignatureAttributesTypeTimeStampValidationData(AttributeBaseType value) {
        return new JAXBElement<AttributeBaseType>(_SignatureAttributesTypeTimeStampValidationData_QNAME, AttributeBaseType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "ArchiveTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeArchiveTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeArchiveTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "RenewedDigests", scope = SignatureAttributesType.class)
    public JAXBElement<List<BigInteger>> createSignatureAttributesTypeRenewedDigests(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_SignatureAttributesTypeRenewedDigests_QNAME, ((Class) List.class), SignatureAttributesType.class, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAMessageDigestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SAMessageDigestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "MessageDigest", scope = SignatureAttributesType.class)
    public JAXBElement<SAMessageDigestType> createSignatureAttributesTypeMessageDigest(SAMessageDigestType value) {
        return new JAXBElement<SAMessageDigestType>(_SignatureAttributesTypeMessageDigest_QNAME, SAMessageDigestType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SADSSType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SADSSType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "DSS", scope = SignatureAttributesType.class)
    public JAXBElement<SADSSType> createSignatureAttributesTypeDSS(SADSSType value) {
        return new JAXBElement<SADSSType>(_SignatureAttributesTypeDSS_QNAME, SADSSType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAVRIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SAVRIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "VRI", scope = SignatureAttributesType.class)
    public JAXBElement<SAVRIType> createSignatureAttributesTypeVRI(SAVRIType value) {
        return new JAXBElement<SAVRIType>(_SignatureAttributesTypeVRI_QNAME, SAVRIType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SATimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "DocTimeStamp", scope = SignatureAttributesType.class)
    public JAXBElement<SATimestampType> createSignatureAttributesTypeDocTimeStamp(SATimestampType value) {
        return new JAXBElement<SATimestampType>(_SignatureAttributesTypeDocTimeStamp_QNAME, SATimestampType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAReasonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SAReasonType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "Reason", scope = SignatureAttributesType.class)
    public JAXBElement<SAReasonType> createSignatureAttributesTypeReason(SAReasonType value) {
        return new JAXBElement<SAReasonType>(_SignatureAttributesTypeReason_QNAME, SAReasonType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SANameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SANameType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "Name", scope = SignatureAttributesType.class)
    public JAXBElement<SANameType> createSignatureAttributesTypeName(SANameType value) {
        return new JAXBElement<SANameType>(_SignatureAttributesTypeName_QNAME, SANameType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAContactInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SAContactInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "ContactInfo", scope = SignatureAttributesType.class)
    public JAXBElement<SAContactInfoType> createSignatureAttributesTypeContactInfo(SAContactInfoType value) {
        return new JAXBElement<SAContactInfoType>(_SignatureAttributesTypeContactInfo_QNAME, SAContactInfoType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SASubFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SASubFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SubFilter", scope = SignatureAttributesType.class)
    public JAXBElement<SASubFilterType> createSignatureAttributesTypeSubFilter(SASubFilterType value) {
        return new JAXBElement<SASubFilterType>(_SignatureAttributesTypeSubFilter_QNAME, SASubFilterType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "ByteRange", scope = SignatureAttributesType.class)
    public JAXBElement<List<BigInteger>> createSignatureAttributesTypeByteRange(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_SignatureAttributesTypeByteRange_QNAME, ((Class) List.class), SignatureAttributesType.class, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SAFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "Filter", scope = SignatureAttributesType.class)
    public JAXBElement<SAFilterType> createSignatureAttributesTypeFilter(SAFilterType value) {
        return new JAXBElement<SAFilterType>(_SignatureAttributesTypeFilter_QNAME, SAFilterType.class, SignatureAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestAlgAndValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DigestAlgAndValueType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "DigestAlgAndValue", scope = SignersDocumentType.class)
    public JAXBElement<DigestAlgAndValueType> createSignersDocumentTypeDigestAlgAndValue(DigestAlgAndValueType value) {
        return new JAXBElement<DigestAlgAndValueType>(_SignersDocumentTypeDigestAlgAndValue_QNAME, DigestAlgAndValueType.class, SignersDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignersDocumentRepresentation", scope = SignersDocumentType.class)
    public JAXBElement<VOReferenceType> createSignersDocumentTypeSignersDocumentRepresentation(VOReferenceType value) {
        return new JAXBElement<VOReferenceType>(_SignersDocumentTypeSignersDocumentRepresentation_QNAME, VOReferenceType.class, SignersDocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VOReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/19102/v1.2.1#", name = "SignersDocumentRef", scope = SignersDocumentType.class)
    public JAXBElement<VOReferenceType> createSignersDocumentTypeSignersDocumentRef(VOReferenceType value) {
        return new JAXBElement<VOReferenceType>(_SignersDocumentTypeSignersDocumentRef_QNAME, VOReferenceType.class, SignersDocumentType.class, value);
    }

}
