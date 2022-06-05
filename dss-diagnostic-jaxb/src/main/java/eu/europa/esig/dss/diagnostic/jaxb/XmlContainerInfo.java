
package eu.europa.esig.dss.diagnostic.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.dss.enumerations.ASiCContainerType;


/**
 * &lt;p&gt;Java class for ContainerInfo complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ContainerInfo"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ContainerType" type="{http://dss.esig.europa.eu/validation/diagnostic}ContainerType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ZipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MimeTypeFilePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MimeTypeContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ManifestFiles" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ManifestFile" type="{http://dss.esig.europa.eu/validation/diagnostic}ManifestFile" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ContentFiles" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ContentFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerInfo", propOrder = {
    "containerType",
    "zipComment",
    "mimeTypeFilePresent",
    "mimeTypeContent",
    "manifestFiles",
    "contentFiles"
})
public class XmlContainerInfo implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ContainerType", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected ASiCContainerType containerType;
    @XmlElement(name = "ZipComment")
    protected String zipComment;
    @XmlElement(name = "MimeTypeFilePresent")
    protected Boolean mimeTypeFilePresent;
    @XmlElement(name = "MimeTypeContent")
    protected String mimeTypeContent;
    @XmlElementWrapper(name = "ManifestFiles")
    @XmlElement(name = "ManifestFile", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<XmlManifestFile> manifestFiles = new ArrayList<XmlManifestFile>();
    @XmlElementWrapper(name = "ContentFiles")
    @XmlElement(name = "ContentFile", namespace = "http://dss.esig.europa.eu/validation/diagnostic")
    protected List<String> contentFiles = new ArrayList<String>();

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ASiCContainerType getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(ASiCContainerType value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the zipComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipComment() {
        return zipComment;
    }

    /**
     * Sets the value of the zipComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipComment(String value) {
        this.zipComment = value;
    }

    /**
     * Gets the value of the mimeTypeFilePresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMimeTypeFilePresent() {
        return mimeTypeFilePresent;
    }

    /**
     * Sets the value of the mimeTypeFilePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMimeTypeFilePresent(Boolean value) {
        this.mimeTypeFilePresent = value;
    }

    /**
     * Gets the value of the mimeTypeContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeContent() {
        return mimeTypeContent;
    }

    /**
     * Sets the value of the mimeTypeContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeContent(String value) {
        this.mimeTypeContent = value;
    }

    public List<XmlManifestFile> getManifestFiles() {
        return manifestFiles;
    }

    public void setManifestFiles(List<XmlManifestFile> manifestFiles) {
        this.manifestFiles = manifestFiles;
    }

    public List<String> getContentFiles() {
        return contentFiles;
    }

    public void setContentFiles(List<String> contentFiles) {
        this.contentFiles = contentFiles;
    }

}
