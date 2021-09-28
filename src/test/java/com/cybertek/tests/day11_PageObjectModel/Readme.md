# Page Object Model (POM)
## Introduction

* With the __Page Object Model__, page elements are initialized in a different page then used in the code normally.
* _Selenium_ provides a class & annotations to do this.
  * `@FindBy` & `FindBys` annotations will replace the `driver.findElement(By.*())` methods.
  * They can be used by all Select methods including _xpath_ & _cssselector_.
* Using _POM_ you can remove unnecessary code from the test files and utilize methods/functions instead.

## Reference
* You can reference this page for more: [Page Object Model Reference](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)