

```
jaxb impl: jakarta
stock android wc3.dom -> ?

Test replace:
new File\("src/test/resources/(.*?)"\)
TestUtils.getResourceAsFile("$1")

new FileDocument\("src/test/resources/(.*)"\)
new FileDocument\(TestUtils.getResourceAsFile("$1"\))

new FileInputStream\("src/test/resources/(.*?)"\)
new FileInputStream\(TestUtils.getResourceAsFile("$1"\))


```
