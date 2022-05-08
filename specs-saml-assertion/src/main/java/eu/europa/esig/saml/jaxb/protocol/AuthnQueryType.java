
package eu.europa.esig.saml.jaxb.protocol;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthnQueryType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AuthnQueryType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:oasis:names:tc:SAML:2.0:protocol}SubjectQueryAbstractType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{urn:oasis:names:tc:SAML:2.0:protocol}RequestedAuthnContext" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnQueryType", propOrder = {
    "requestedAuthnContext"
})
public class AuthnQueryType
    extends SubjectQueryAbstractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestedAuthnContext")
    protected RequestedAuthnContextType requestedAuthnContext;
    @XmlAttribute(name = "SessionIndex")
    protected String sessionIndex;

    /**
     * Gets the value of the requestedAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public RequestedAuthnContextType getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    /**
     * Sets the value of the requestedAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAuthnContextType }
     *     
     */
    public void setRequestedAuthnContext(RequestedAuthnContextType value) {
        this.requestedAuthnContext = value;
    }

    /**
     * Gets the value of the sessionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionIndex() {
        return sessionIndex;
    }

    /**
     * Sets the value of the sessionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionIndex(String value) {
        this.sessionIndex = value;
    }

}
