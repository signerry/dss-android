
package eu.europa.esig.validationreport.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SACommitmentTypeIndicationType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SACommitmentTypeIndicationType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://uri.etsi.org/19102/v1.2.1#}AttributeBaseType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CommitmentTypeIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SACommitmentTypeIndicationType", propOrder = {
    "commitmentTypeIdentifier"
})
public class SACommitmentTypeIndicationType
    extends AttributeBaseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CommitmentTypeIdentifier", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String commitmentTypeIdentifier;

    /**
     * Gets the value of the commitmentTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentTypeIdentifier() {
        return commitmentTypeIdentifier;
    }

    /**
     * Sets the value of the commitmentTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentTypeIdentifier(String value) {
        this.commitmentTypeIdentifier = value;
    }

}
