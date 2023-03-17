//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:13:44 AM EET 
//


package eu.europa.esig.trustedlist.jaxb.tsl;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TSLSchemeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSLSchemeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TSLVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TSLSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TSLType"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeOperatorName"/&gt;
 *         &lt;element name="SchemeOperatorAddress" type="{http://uri.etsi.org/02231/v2#}AddressType"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeName"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeInformationURI"/&gt;
 *         &lt;element name="StatusDeterminationApproach" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIType"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeTypeCommunityRules" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeTerritory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}PolicyOrLegalNotice" minOccurs="0"/&gt;
 *         &lt;element name="HistoricalInformationPeriod" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}PointersToOtherTSL" minOccurs="0"/&gt;
 *         &lt;element name="ListIssueDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}NextUpdate"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}DistributionPoints" minOccurs="0"/&gt;
 *         &lt;element name="SchemeExtensions" type="{http://uri.etsi.org/02231/v2#}ExtensionsListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSLSchemeInformationType", propOrder = {
    "tslVersionIdentifier",
    "tslSequenceNumber",
    "tslType",
    "schemeOperatorName",
    "schemeOperatorAddress",
    "schemeName",
    "schemeInformationURI",
    "statusDeterminationApproach",
    "schemeTypeCommunityRules",
    "schemeTerritory",
    "policyOrLegalNotice",
    "historicalInformationPeriod",
    "pointersToOtherTSL",
    "listIssueDateTime",
    "nextUpdate",
    "distributionPoints",
    "schemeExtensions"
})
public class TSLSchemeInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TSLVersionIdentifier", required = true)
    protected BigInteger tslVersionIdentifier;
    @XmlElement(name = "TSLSequenceNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tslSequenceNumber;
    @XmlElement(name = "TSLType", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tslType;
    @XmlElement(name = "SchemeOperatorName", required = true)
    protected InternationalNamesType schemeOperatorName;
    @XmlElement(name = "SchemeOperatorAddress", required = true)
    protected AddressType schemeOperatorAddress;
    @XmlElement(name = "SchemeName", required = true)
    protected InternationalNamesType schemeName;
    @XmlElement(name = "SchemeInformationURI", required = true)
    protected NonEmptyMultiLangURIListType schemeInformationURI;
    @XmlElement(name = "StatusDeterminationApproach", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String statusDeterminationApproach;
    @XmlElement(name = "SchemeTypeCommunityRules")
    protected NonEmptyMultiLangURIListType schemeTypeCommunityRules;
    @XmlElement(name = "SchemeTerritory")
    protected String schemeTerritory;
    @XmlElement(name = "PolicyOrLegalNotice")
    protected PolicyOrLegalnoticeType policyOrLegalNotice;
    @XmlElement(name = "HistoricalInformationPeriod", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger historicalInformationPeriod;
    @XmlElement(name = "PointersToOtherTSL")
    protected OtherTSLPointersType pointersToOtherTSL;
    @XmlElement(name = "ListIssueDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listIssueDateTime;
    @XmlElement(name = "NextUpdate", required = true)
    protected NextUpdateType nextUpdate;
    @XmlElement(name = "DistributionPoints")
    protected NonEmptyURIListType distributionPoints;
    @XmlElement(name = "SchemeExtensions")
    protected ExtensionsListType schemeExtensions;

    /**
     * Gets the value of the tslVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTSLVersionIdentifier() {
        return tslVersionIdentifier;
    }

    /**
     * Sets the value of the tslVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTSLVersionIdentifier(BigInteger value) {
        this.tslVersionIdentifier = value;
    }

    /**
     * Gets the value of the tslSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTSLSequenceNumber() {
        return tslSequenceNumber;
    }

    /**
     * Sets the value of the tslSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTSLSequenceNumber(BigInteger value) {
        this.tslSequenceNumber = value;
    }

    /**
     * Gets the value of the tslType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLType() {
        return tslType;
    }

    /**
     * Sets the value of the tslType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLType(String value) {
        this.tslType = value;
    }

    /**
     * Gets the value of the schemeOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getSchemeOperatorName() {
        return schemeOperatorName;
    }

    /**
     * Sets the value of the schemeOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setSchemeOperatorName(InternationalNamesType value) {
        this.schemeOperatorName = value;
    }

    /**
     * Gets the value of the schemeOperatorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSchemeOperatorAddress() {
        return schemeOperatorAddress;
    }

    /**
     * Sets the value of the schemeOperatorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSchemeOperatorAddress(AddressType value) {
        this.schemeOperatorAddress = value;
    }

    /**
     * Gets the value of the schemeName property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalNamesType }
     *     
     */
    public InternationalNamesType getSchemeName() {
        return schemeName;
    }

    /**
     * Sets the value of the schemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalNamesType }
     *     
     */
    public void setSchemeName(InternationalNamesType value) {
        this.schemeName = value;
    }

    /**
     * Gets the value of the schemeInformationURI property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyMultiLangURIListType }
     *     
     */
    public NonEmptyMultiLangURIListType getSchemeInformationURI() {
        return schemeInformationURI;
    }

    /**
     * Sets the value of the schemeInformationURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyMultiLangURIListType }
     *     
     */
    public void setSchemeInformationURI(NonEmptyMultiLangURIListType value) {
        this.schemeInformationURI = value;
    }

    /**
     * Gets the value of the statusDeterminationApproach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDeterminationApproach() {
        return statusDeterminationApproach;
    }

    /**
     * Sets the value of the statusDeterminationApproach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDeterminationApproach(String value) {
        this.statusDeterminationApproach = value;
    }

    /**
     * Gets the value of the schemeTypeCommunityRules property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyMultiLangURIListType }
     *     
     */
    public NonEmptyMultiLangURIListType getSchemeTypeCommunityRules() {
        return schemeTypeCommunityRules;
    }

    /**
     * Sets the value of the schemeTypeCommunityRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyMultiLangURIListType }
     *     
     */
    public void setSchemeTypeCommunityRules(NonEmptyMultiLangURIListType value) {
        this.schemeTypeCommunityRules = value;
    }

    /**
     * Gets the value of the schemeTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeTerritory() {
        return schemeTerritory;
    }

    /**
     * Sets the value of the schemeTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeTerritory(String value) {
        this.schemeTerritory = value;
    }

    /**
     * Gets the value of the policyOrLegalNotice property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyOrLegalnoticeType }
     *     
     */
    public PolicyOrLegalnoticeType getPolicyOrLegalNotice() {
        return policyOrLegalNotice;
    }

    /**
     * Sets the value of the policyOrLegalNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyOrLegalnoticeType }
     *     
     */
    public void setPolicyOrLegalNotice(PolicyOrLegalnoticeType value) {
        this.policyOrLegalNotice = value;
    }

    /**
     * Gets the value of the historicalInformationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoricalInformationPeriod() {
        return historicalInformationPeriod;
    }

    /**
     * Sets the value of the historicalInformationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoricalInformationPeriod(BigInteger value) {
        this.historicalInformationPeriod = value;
    }

    /**
     * Gets the value of the pointersToOtherTSL property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTSLPointersType }
     *     
     */
    public OtherTSLPointersType getPointersToOtherTSL() {
        return pointersToOtherTSL;
    }

    /**
     * Sets the value of the pointersToOtherTSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTSLPointersType }
     *     
     */
    public void setPointersToOtherTSL(OtherTSLPointersType value) {
        this.pointersToOtherTSL = value;
    }

    /**
     * Gets the value of the listIssueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListIssueDateTime() {
        return listIssueDateTime;
    }

    /**
     * Sets the value of the listIssueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListIssueDateTime(XMLGregorianCalendar value) {
        this.listIssueDateTime = value;
    }

    /**
     * Gets the value of the nextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link NextUpdateType }
     *     
     */
    public NextUpdateType getNextUpdate() {
        return nextUpdate;
    }

    /**
     * Sets the value of the nextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextUpdateType }
     *     
     */
    public void setNextUpdate(NextUpdateType value) {
        this.nextUpdate = value;
    }

    /**
     * Gets the value of the distributionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public NonEmptyURIListType getDistributionPoints() {
        return distributionPoints;
    }

    /**
     * Sets the value of the distributionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyURIListType }
     *     
     */
    public void setDistributionPoints(NonEmptyURIListType value) {
        this.distributionPoints = value;
    }

    /**
     * Gets the value of the schemeExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsListType }
     *     
     */
    public ExtensionsListType getSchemeExtensions() {
        return schemeExtensions;
    }

    /**
     * Sets the value of the schemeExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsListType }
     *     
     */
    public void setSchemeExtensions(ExtensionsListType value) {
        this.schemeExtensions = value;
    }

}
