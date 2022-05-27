
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="HashOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="DocHashOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class XmlSignerDocumentRepresentations implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "HashOnly", required = true)
    protected boolean hashOnly;
    @XmlAttribute(name = "DocHashOnly", required = true)
    protected boolean docHashOnly;

    /**
     * Gets the value of the hashOnly property.
     * 
     */
    public boolean isHashOnly() {
        return hashOnly;
    }

    /**
     * Sets the value of the hashOnly property.
     * 
     */
    public void setHashOnly(boolean value) {
        this.hashOnly = value;
    }

    /**
     * Gets the value of the docHashOnly property.
     * 
     */
    public boolean isDocHashOnly() {
        return docHashOnly;
    }

    /**
     * Sets the value of the docHashOnly property.
     * 
     */
    public void setDocHashOnly(boolean value) {
        this.docHashOnly = value;
    }

}
