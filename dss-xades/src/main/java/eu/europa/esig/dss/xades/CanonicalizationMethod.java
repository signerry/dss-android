package eu.europa.esig.dss.xades;

public interface CanonicalizationMethod  {

    /**
     * The <a href="http://www.w3.org/TR/2001/REC-xml-c14n-20010315">Canonical
     * XML (without comments)</a> canonicalization method algorithm URI.
     */
    String INCLUSIVE =
            "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";

    /**
     * The
     * <a href="http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments">
     * Canonical XML with comments</a> canonicalization method algorithm URI.
     */
    String INCLUSIVE_WITH_COMMENTS =
            "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments";

    /**
     * The <a href="http://www.w3.org/2001/10/xml-exc-c14n#">Exclusive
     * Canonical XML (without comments)</a> canonicalization method algorithm
     * URI.
     */
    String EXCLUSIVE =
            "http://www.w3.org/2001/10/xml-exc-c14n#";

    /**
     * The <a href="http://www.w3.org/2001/10/xml-exc-c14n#WithComments">
     * Exclusive Canonical XML with comments</a> canonicalization method
     * algorithm URI.
     */
    String EXCLUSIVE_WITH_COMMENTS =
            "http://www.w3.org/2001/10/xml-exc-c14n#WithComments";


}