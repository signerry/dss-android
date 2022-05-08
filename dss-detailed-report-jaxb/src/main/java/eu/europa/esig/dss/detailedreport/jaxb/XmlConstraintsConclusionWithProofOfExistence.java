
package eu.europa.esig.dss.detailedreport.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConstraintsConclusionWithProofOfExistence complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ConstraintsConclusionWithProofOfExistence"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ProofOfExistence" type="{http://dss.esig.europa.eu/validation/detailed-report}ProofOfExistence" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintsConclusionWithProofOfExistence", propOrder = {
    "proofOfExistence"
})
@XmlSeeAlso({
    XmlValidationProcessBasicSignature.class,
    XmlValidationProcessLongTermData.class,
    XmlValidationProcessArchivalData.class
})
public class XmlConstraintsConclusionWithProofOfExistence
    extends XmlConstraintsConclusion
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProofOfExistence")
    protected XmlProofOfExistence proofOfExistence;

    /**
     * Gets the value of the proofOfExistence property.
     * 
     * @return
     *     possible object is
     *     {@link XmlProofOfExistence }
     *     
     */
    public XmlProofOfExistence getProofOfExistence() {
        return proofOfExistence;
    }

    /**
     * Sets the value of the proofOfExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlProofOfExistence }
     *     
     */
    public void setProofOfExistence(XmlProofOfExistence value) {
        this.proofOfExistence = value;
    }

}
