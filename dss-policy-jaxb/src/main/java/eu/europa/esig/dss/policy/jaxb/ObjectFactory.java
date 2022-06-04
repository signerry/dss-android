
package eu.europa.esig.dss.policy.jaxb;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.esig.dss.policy.jaxb package. 
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

    private final static QName _ConstraintsParameters_QNAME = new QName("http://dss.esig.europa.eu/validation/policy", "ConstraintsParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.esig.dss.policy.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConstraintsParameters }
     * 
     */
    public ConstraintsParameters createConstraintsParameters() {
        return new ConstraintsParameters();
    }

    /**
     * Create an instance of {@link ContainerConstraints }
     * 
     */
    public ContainerConstraints createContainerConstraints() {
        return new ContainerConstraints();
    }

    /**
     * Create an instance of {@link SignatureConstraints }
     * 
     */
    public SignatureConstraints createSignatureConstraints() {
        return new SignatureConstraints();
    }

    /**
     * Create an instance of {@link SignedAttributesConstraints }
     * 
     */
    public SignedAttributesConstraints createSignedAttributesConstraints() {
        return new SignedAttributesConstraints();
    }

    /**
     * Create an instance of {@link UnsignedAttributesConstraints }
     * 
     */
    public UnsignedAttributesConstraints createUnsignedAttributesConstraints() {
        return new UnsignedAttributesConstraints();
    }

    /**
     * Create an instance of {@link TimestampConstraints }
     * 
     */
    public TimestampConstraints createTimestampConstraints() {
        return new TimestampConstraints();
    }

    /**
     * Create an instance of {@link RevocationConstraints }
     * 
     */
    public RevocationConstraints createRevocationConstraints() {
        return new RevocationConstraints();
    }

    /**
     * Create an instance of {@link BasicSignatureConstraints }
     * 
     */
    public BasicSignatureConstraints createBasicSignatureConstraints() {
        return new BasicSignatureConstraints();
    }

    /**
     * Create an instance of {@link CertificateConstraints }
     * 
     */
    public CertificateConstraints createCertificateConstraints() {
        return new CertificateConstraints();
    }

    /**
     * Create an instance of {@link CryptographicConstraint }
     * 
     */
    public CryptographicConstraint createCryptographicConstraint() {
        return new CryptographicConstraint();
    }

    /**
     * Create an instance of {@link EIDAS }
     * 
     */
    public EIDAS createEIDAS() {
        return new EIDAS();
    }

    /**
     * Create an instance of {@link ListAlgo }
     * 
     */
    public ListAlgo createListAlgo() {
        return new ListAlgo();
    }

    /**
     * Create an instance of {@link AlgoExpirationDate }
     * 
     */
    public AlgoExpirationDate createAlgoExpirationDate() {
        return new AlgoExpirationDate();
    }

    /**
     * Create an instance of {@link Algo }
     * 
     */
    public Algo createAlgo() {
        return new Algo();
    }

    /**
     * Create an instance of {@link LevelConstraint }
     * 
     */
    public LevelConstraint createLevelConstraint() {
        return new LevelConstraint();
    }

    /**
     * Create an instance of {@link MultiValuesConstraint }
     * 
     */
    public MultiValuesConstraint createMultiValuesConstraint() {
        return new MultiValuesConstraint();
    }

    /**
     * Create an instance of {@link ValueConstraint }
     * 
     */
    public ValueConstraint createValueConstraint() {
        return new ValueConstraint();
    }

    /**
     * Create an instance of {@link IntValueConstraint }
     * 
     */
    public IntValueConstraint createIntValueConstraint() {
        return new IntValueConstraint();
    }

    /**
     * Create an instance of {@link TimeConstraint }
     * 
     */
    public TimeConstraint createTimeConstraint() {
        return new TimeConstraint();
    }

    /**
     * Create an instance of {@link ModelConstraint }
     * 
     */
    public ModelConstraint createModelConstraint() {
        return new ModelConstraint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstraintsParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstraintsParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://dss.esig.europa.eu/validation/policy", name = "ConstraintsParameters")
    public JAXBElement<ConstraintsParameters> createConstraintsParameters(ConstraintsParameters value) {
        return new JAXBElement<ConstraintsParameters>(_ConstraintsParameters_QNAME, ConstraintsParameters.class, null, value);
    }

}