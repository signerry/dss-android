
package eu.europa.esig.saml.jaxb.ecp;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.saml.jaxb.ecp package. 
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

    private final static QName _Request_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", "Request");
    private final static QName _Response_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", "Response");
    private final static QName _RelayState_QNAME = new QName("urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", "RelayState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.saml.jaxb.ecp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link RelayStateType }
     * 
     */
    public RelayStateType createRelayStateType() {
        return new RelayStateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayStateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelayStateType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:SAML:2.0:profiles:SSO:ecp", name = "RelayState")
    public JAXBElement<RelayStateType> createRelayState(RelayStateType value) {
        return new JAXBElement<RelayStateType>(_RelayState_QNAME, RelayStateType.class, null, value);
    }

}
