
package eu.europa.esig.xades.jaxb.xades132;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CommitmentTypeIndicationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CommitmentTypeIndicationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CommitmentTypeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="ObjectReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&amp;gt;
 *           &amp;lt;element name="AllSignedDataObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="CommitmentTypeQualifiers" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeQualifiersListType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentTypeIndicationType", propOrder = {
    "commitmentTypeId",
    "objectReference",
    "allSignedDataObjects",
    "commitmentTypeQualifiers"
})
public class CommitmentTypeIndicationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CommitmentTypeId", required = true)
    protected ObjectIdentifierType commitmentTypeId;
    @XmlElement(name = "ObjectReference")
    @XmlSchemaType(name = "anyURI")
    protected List<String> objectReference;
    @XmlElement(name = "AllSignedDataObjects")
    protected Object allSignedDataObjects;
    @XmlElement(name = "CommitmentTypeQualifiers")
    protected CommitmentTypeQualifiersListType commitmentTypeQualifiers;

    /**
     * Gets the value of the commitmentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentTypeId() {
        return commitmentTypeId;
    }

    /**
     * Sets the value of the commitmentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentTypeId(ObjectIdentifierType value) {
        this.commitmentTypeId = value;
    }

    /**
     * Gets the value of the objectReference property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the objectReference property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getObjectReference().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReference() {
        if (objectReference == null) {
            objectReference = new ArrayList<String>();
        }
        return this.objectReference;
    }

    /**
     * Gets the value of the allSignedDataObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllSignedDataObjects() {
        return allSignedDataObjects;
    }

    /**
     * Sets the value of the allSignedDataObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllSignedDataObjects(Object value) {
        this.allSignedDataObjects = value;
    }

    /**
     * Gets the value of the commitmentTypeQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public CommitmentTypeQualifiersListType getCommitmentTypeQualifiers() {
        return commitmentTypeQualifiers;
    }

    /**
     * Sets the value of the commitmentTypeQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public void setCommitmentTypeQualifiers(CommitmentTypeQualifiersListType value) {
        this.commitmentTypeQualifiers = value;
    }

}
