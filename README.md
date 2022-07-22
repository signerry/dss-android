

```
javax.xml.bind.* -> jakar.xml.bind.*

jackson-module-jaxb-annotations searches jaxb anotations only in javax.xml.bind package.
Current strategy is use jakarta for jaxb on android.
Because of this, namespaces differs:
javax.xml.bind vs jakar.xml.bind.

To solve this JakartaJaxbAnnotationIntrospector was created.
------------------------------

wc3.dom -> xerces

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

```

TODO:

2022-07-22. Jackson json library was temporary added in runtime, but it needed only for tests.
Fix this.
