
package eu.europa.esig.xades.jaxb.xades122;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SignedDataObjectPropertiesType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SignedDataObjectPropertiesType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="DataObjectFormat" type="{http://uri.etsi.org/01903/v1.2.2#}DataObjectFormatType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CommitmentTypeIndication" type="{http://uri.etsi.org/01903/v1.2.2#}CommitmentTypeIndicationType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AllDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IndividualDataObjectsTimeStamp" type="{http://uri.etsi.org/01903/v1.2.2#}TimeStampType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedDataObjectPropertiesType", propOrder = {
    "dataObjectFormat",
    "commitmentTypeIndication",
    "allDataObjectsTimeStamp",
    "individualDataObjectsTimeStamp"
})
public class SignedDataObjectPropertiesType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataObjectFormat")
    protected List<DataObjectFormatType> dataObjectFormat;
    @XmlElement(name = "CommitmentTypeIndication")
    protected List<CommitmentTypeIndicationType> commitmentTypeIndication;
    @XmlElement(name = "AllDataObjectsTimeStamp")
    protected List<TimeStampType> allDataObjectsTimeStamp;
    @XmlElement(name = "IndividualDataObjectsTimeStamp")
    protected List<TimeStampType> individualDataObjectsTimeStamp;

    /**
     * Gets the value of the dataObjectFormat property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dataObjectFormat property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDataObjectFormat().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormatType }
     * 
     * 
     */
    public List<DataObjectFormatType> getDataObjectFormat() {
        if (dataObjectFormat == null) {
            dataObjectFormat = new ArrayList<DataObjectFormatType>();
        }
        return this.dataObjectFormat;
    }

    /**
     * Gets the value of the commitmentTypeIndication property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the commitmentTypeIndication property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCommitmentTypeIndication().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndicationType }
     * 
     * 
     */
    public List<CommitmentTypeIndicationType> getCommitmentTypeIndication() {
        if (commitmentTypeIndication == null) {
            commitmentTypeIndication = new ArrayList<CommitmentTypeIndicationType>();
        }
        return this.commitmentTypeIndication;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the allDataObjectsTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAllDataObjectsTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getAllDataObjectsTimeStamp() {
        if (allDataObjectsTimeStamp == null) {
            allDataObjectsTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.allDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamp property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the individualDataObjectsTimeStamp property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIndividualDataObjectsTimeStamp().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimeStampType }
     * 
     * 
     */
    public List<TimeStampType> getIndividualDataObjectsTimeStamp() {
        if (individualDataObjectsTimeStamp == null) {
            individualDataObjectsTimeStamp = new ArrayList<TimeStampType>();
        }
        return this.individualDataObjectsTimeStamp;
    }

}
