
This is the official repository for project DSS : https://ec.europa.eu/digital-building-blocks/wikis/display/DIGITAL/Digital+Signature+Service+-++DSS. 

# Issue Tracker

Please, use the new JIRA for project is on https://ec.europa.eu/digital-building-blocks/tracker/projects/DSS/issues. 

# Requirements

The latest version of DSS framework has the following minimal requirements:

 * Java 11 and higher (tested up to Java 18) for the build is required. For usage Java 8 is a minimum requirement;
 * Maven 3.6 and higher;
 * Memory and Disk: see minimal requirements for the used JVM. In general the higher available is better;
 * Operating system: no specific requirements (tested on Windows and Linux).

# Maven repository

The release is published on Maven Central repository : 

https://central.sonatype.dev/namespace/eu.europa.ec.joinup.sd-dss

<pre>
&lt;!-- Add dss-bom for easy integration --&gt;
&lt;dependencyManagement&gt;
    &lt;dependencies&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;eu.europa.ec.joinup.sd-dss&lt;/groupId&gt;
            &lt;artifactId&gt;dss-bom&lt;/artifactId&gt;
            &lt;version&gt;5.12.RC1&lt;/version&gt;
            &lt;type&gt;pom&lt;/type&gt;
            &lt;scope&gt;import&lt;/scope&gt;
        &lt;/dependency&gt;
    &lt;/dependencies&gt;
&lt;/dependencyManagement&gt;

&lt;!-- Add required modules (example) --&gt;
&lt;dependencies&gt;
    &lt;dependency&gt;
        &lt;groupId&gt;eu.europa.ec.joinup.sd-dss&lt;/groupId&gt;
        &lt;artifactId&gt;dss-utils-apache-commons&lt;/artifactId&gt;
    &lt;/dependency&gt;
    &lt;dependency&gt;
        &lt;groupId&gt;eu.europa.ec.joinup.sd-dss&lt;/groupId&gt;
        &lt;artifactId&gt;dss-xades&lt;/artifactId&gt;
    &lt;/dependency&gt;
    ...
&lt;/dependencies&gt;
</pre>

# Build and usage

A simple build of the DSS Maven project can be done with the following command:

```
javax.xml.bind.* -> jakar.xml.bind.*

jackson-module-jaxb-annotations searches jaxb anotations only in javax.xml.bind package.
Current strategy is use jakarta for jaxb on android.
Because of this, namespaces differs:
javax.xml.bind vs jakar.xml.bind.

To solve this JakartaJaxbAnnotationIntrospector was created.
------------------------------

org.w3c.dom -> xerces

Xerces2 Java is a library for parsing, validating and manipulating XML documents.

Xerces 2.x introduced the Xerces Native Interface (XNI), a complete framework for building parser components and configurations that is extremely modular and easy to program. XNI is merely an internal set of interfaces. There is no need for an XML application programmer to learn XNI if they only intend to interface to the Xerces2 parser using standard interfaces like JAXP, DOM, and SAX. Xerces developers and application developers that need more power and flexibility than that provided by the standard interfaces should read and understand XNI.

The latest version released, 2.12.2, provides support for the following standards and APIs:

XML 1.0 (4th Edition)
Namespaces in XML 1.0 (2nd Edition)
XML 1.1 (2nd Edition)
Namespaces in XML 1.1 (2nd Edition)
W3C XML Schema 1.0 (2nd Edition)
W3C XML Schema 1.1
W3C XML Schema Definition Language (XSD): Component Designators (Candidate Recommendation, January 2010)
XInclude 1.0 (2nd Edition)
OASIS XML Catalogs 1.1
SAX 2.0.2
DOM Level 3 Core, Load and Save
DOM Level 2 Core, Events, Traversal and Range
Element Traversal (org.w3c.dom.ElementTraversal)
JAXP 1.4
StAX 1.0 Event API (javax.xml.stream.events)
Find out more about Apache Xerces2 Java.

-----------------------------------
Test replace:
new File\("src/test/resources/(.*?)"\)
TestUtils.getResourceAsFile("$1")

new FileDocument\("src/test/resources/(.*)"\)
new FileDocument\(TestUtils.getResourceAsFile("$1"\))

new FileInputStream\("src/test/resources/(.*?)"\)
new FileInputStream\(TestUtils.getResourceAsFile("$1"\))

new FileInputStream\("resources/(.*?)"\)
new FileInputStream\(TestUtils.getResourceAsFile("$1"\))

DSSSecurityProvider.getSecurityProviderName()
new BouncyCastleProvider()

dss-token:
Pkcs12SignatureToken\("src/test/resources/(.*?)",
Pkcs12SignatureToken(TestUtils.getResourceAsFile("$1"),

```

LDAP support made via "com.unboundid:unboundid-ldapsd" https://ldap.com/unboundid-ldap-sdk-for-java/

TODO:

2022-07-22. Jackson json library was temporary added in runtime, but it needed only for tests.
Fix this.


Android test runner does not support junit5

BC security provider implementation much slower than than "AndroidOpenSSL" security provider.
Especially hashing functions are much slower.

But AndroidOpenSSL does not support all needed algorithms and algorithm support differens between android api versions.

CryptoProvider was introduced which purpose at runtime time select which java security provider to use.
Most prefered is AndroidOpenSSL, because hardware accelerated crypto functions.
If specific function not available, then fallback bouncy caste provider is used.

