

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

2023-04-14 
1.XAdESLevelBEnvelopingManifestReferenceCanonicalizationTest not passing. Reason unknown.
2. XAdESLevelBReSignOJManifestTest
3. DSS2058QCLTATest, DSS1443Test - The test has been disabled because it failed even when using the standard "dss" library.


Android test runner does not support junit5

BC security provider implementation much slower than than "AndroidOpenSSL" security provider.
Especially hashing functions are much slower.

But AndroidOpenSSL does not support all needed algorithms and algorithm support differens between android api versions.

CryptoProvider was introduced which purpose at runtime time select which java security provider to use.
Most prefered is AndroidOpenSSL, because hardware accelerated crypto functions.
If specific function not available, then fallback bouncy caste provider is used.

