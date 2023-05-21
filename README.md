

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
3. PADES-PDFBOX. Visual textFullyTransparentTest() Low priority
4. PADES-PDFBOX. Visual multilinesWithDpiTest() Low priority
5. PADES-PDFBOX. Visual testWithCMYKImage() Low priority
6. PADES-PDFBOX. Visual rotationTest(); Low priority
7. PADES. PAdESSignatureDigestRefPresenceTest(); Stock DSS 5.12.RC1 has same issue.
8. Disabled skTLTest  
9. Disable testDoubleSignature(). Fails randomly. Time shift issue
10. 2023-05-13T09:51:59.8618644Z 05-13 12:51:58.920 20625 20642 E TestRunner: failed: init(SignatureLevel, SignaturePackaging, String, DSSDocument) - Sign XAdES 126 : XAdES-A - INTERNALLY_DETACHED - good-user - Name: sample-with-different-id.xml / MimeType: text/xml(eu.europa.esig.dss.xades.signature.XAdESSignDocumentsConsequentlyTest)
    2023-05-13T09:51:59.8619461Z 05-13 12:51:58.920 20625 20642 E TestRunner: ----- begin exception -----
    2023-05-13T09:51:59.8775017Z 05-13 12:51:58.933 20625 20642 E TestRunner: org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
    2023-05-13T09:51:59.8775688Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
    2023-05-13T09:51:59.8776684Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
    2023-05-13T09:51:59.8777470Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
    2023-05-13T09:51:59.8777998Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
    2023-05-13T09:51:59.8778516Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:31)
    2023-05-13T09:51:59.8779039Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:179)
    2023-05-13T09:51:59.8779871Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at eu.europa.esig.dss.test.AbstractPkiFactoryTestValidation.checkOrphanTokens(AbstractPkiFactoryTestValidation.java:1259)
    2023-05-13T09:51:59.8780829Z 05-13 12:51:58.933 20625 20642 E TestRunner: 	at eu.europa.esig.dss.xades.signature.XAdESSignDocumentsConsequentlyTest.checkOrphanTokens(XAdESSignDocumentsConsequentlyT
11. started: signAndVerify(eu.europa.esig.dss.xades.signature.XAdESLevelXLv2Test)
    2023-05-12T16:29:43.8871160Z 05-12 19:29:43.708 20811 20828 E TestRunner: failed: signAndVerify(eu.europa.esig.dss.xades.signature.XAdESLevelXLv2Test)
    2023-05-12T16:29:43.8871723Z 05-12 19:29:43.708 20811 20828 E TestRunner: ----- begin exception -----
    2023-05-12T16:29:43.8881890Z 05-12 19:29:43.709 20811 20828 E TestRunner: org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
    2023-05-12T16:29:43.8882610Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
    2023-05-12T16:29:43.8883466Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
    2023-05-12T16:29:43.8884552Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
    2023-05-12T16:29:43.8885318Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
    2023-05-12T16:29:43.8885870Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:31)
    2023-05-12T16:29:43.8886398Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:179)
    2023-05-12T16:29:43.8887123Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at eu.europa.esig.dss.test.AbstractPkiFactoryTestValidation.checkOrphanTokens(AbstractPkiFactoryTestValidation.java:1259)
    2023-05-12T16:29:43.8888055Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at eu.europa.esig.dss.test.AbstractPkiFactoryTestValidation.verifySourcesAndDiagnosticData(AbstractPkiFactoryTestValidation.java:410)
    2023-05-12T16:29:43.8888922Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at eu.europa.esig.dss.test.AbstractPkiFactoryTestValidation.verify(AbstractPkiFactoryTestValidation.java:234)
    2023-05-12T16:29:43.8890597Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at eu.europa.esig.dss.test.signature.AbstractPkiFactoryTestSignature.signAndVerify(AbstractPkiFactoryTestSignature.java:134)
    2023-05-12T16:29:43.8891409Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at java.lang.reflect.Method.invoke(Native Method)
    2023-05-12T16:29:43.8891989Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
    2023-05-12T16:29:43.8892853Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
    2023-05-12T16:29:43.8894677Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
    2023-05-12T16:29:43.8895435Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
    2023-05-12T16:29:43.8896455Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
    2023-05-12T16:29:43.8897428Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
    2023-05-12T16:29:43.8898202Z 05-12 19:29:43.709 20811 20828 E TestRunner: 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor$$ExternalSyntheticLambda3.apply(Unknown Source:0)
    2023-05-10T18:24:02.2618938Z 05-10 21:24:01.834 14811 14828 I TestRunner: started: testDoubleSignature - repetition 4 of 10(eu.europa.esig.dss.pades.signature.suite.PAdESDoubleSignatureTest)
    2023-05-10T18:24:10.6999541Z 05-10 21:24:10.270 14811 14828 E TestRunner: failed: testDoubleSignature - repetition 4 of 10(eu.europa.esig.dss.pades.signature.suite.PAdESDoubleSignatureTest)
    2023-05-10T18:24:10.7000366Z 05-10 21:24:10.270 14811 14828 E TestRunner: ----- begin exception -----
    2023-05-10T18:24:10.7108087Z 05-10 21:24:10.272 14811 14828 E TestRunner: org.opentest4j.AssertionFailedError: Nb revoc for cert good-user = 2 ==> expected: <1> but was: <2>
    2023-05-10T18:24:10.7109563Z 05-10 21:24:10.272 14811 14828 E TestRunner: 	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
