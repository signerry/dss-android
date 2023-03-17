//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 11:13:44 AM EET 
//


package eu.europa.esig.trustedlist.jaxb.mra;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import eu.europa.esig.xades.jaxb.xades132.ObjectIdentifierType;


/**
 * <p>Java class for QcStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QcStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QcStatementId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&gt;
 *         &lt;element name="QcStatementInfo" type="{http://ec.europa.eu/tools/lotl/mra/schema/v2#}QcStatementInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QcStatementType", propOrder = {
    "qcStatementId",
    "qcStatementInfo"
})
public class QcStatementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QcStatementId", required = true)
    protected ObjectIdentifierType qcStatementId;
    @XmlElement(name = "QcStatementInfo")
    protected QcStatementInfoType qcStatementInfo;

    /**
     * Gets the value of the qcStatementId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getQcStatementId() {
        return qcStatementId;
    }

    /**
     * Sets the value of the qcStatementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setQcStatementId(ObjectIdentifierType value) {
        this.qcStatementId = value;
    }

    /**
     * Gets the value of the qcStatementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QcStatementInfoType }
     *     
     */
    public QcStatementInfoType getQcStatementInfo() {
        return qcStatementInfo;
    }

    /**
     * Sets the value of the qcStatementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QcStatementInfoType }
     *     
     */
    public void setQcStatementInfo(QcStatementInfoType value) {
        this.qcStatementInfo = value;
    }

}
