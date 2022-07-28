

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

```

TODO:

2022-07-22. Jackson json library was temporary added in runtime, but it needed only for tests.
Fix this.
