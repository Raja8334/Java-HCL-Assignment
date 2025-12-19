## Date : 16-12-2025

# What is advantages of TestNG over Junit ?

* TestNG have powerfull Annotation @BeforeSuite , @BeforeClass , @BeforeMethod , @Test , @AfterSuite , @AfterClass , @AfterMetod giving better control over test execution than JUnit.
* TestNG supports a @DataProvider for using same testcase with multiple data.
* TestNG have a Priority case
*TestNG supports parallel execution of tests (methods, classes, or suites) through testng.xml, which helps reduce execution time.
* TestNG allows test methods to depend on other methods or groups using dependsOnMethods and dependsOnGroups.
* TestNG supports parameter passing through testng.xml using @Parameters, which is very useful for cross-browser testing.
* TestNG generates detailed HTML reports by default, showing passed, failed, and skipped test cases.
* TestNG uses testng.xml to configure test suites, control execution order, groups, parameters, and parallelism.
* TestNG supports SoftAssert, which allows execution to continue even if an assertion fails, unlike JUnit’s hard assertions.
* TestNG can verify expected exceptions using expectedExceptions, making exception testing easier.


# What are Cookies?
Cookies are small pieces of data stored in the browser by a website.
They store information like:

* Login session

* User preferences

* Shopping cart details

* Tracking / analytics data

# Why Cookies are Used (and Why We Handle Them)?
Purpose of Cookies

* Maintain user session (stay logged in)

* Store user preferences (language, theme)

* Track user activity

* Improve user experience

# Date : 19-12-2025

## https://quickref.me/xpath.html
## Go through the below website and under the indepth knowledge on how to use Xpath and CSS Selector

* XPath and CSS Selector are two different ways to locate elements in the DOM; in Selenium you should know both and choose based on readability, stability, and page structure.​

### Core differences
* XPath can move both forward and backward in the DOM (parent, ancestor, following-sibling, etc.) and supports rich functions, logical conditions, and text-based matching.​

* CSS Selector is faster in most browsers and more concise, but cannot traverse up the DOM (no parent/ancestor axis) and has limited text-based matching

* When to prefer CSS Selector
### Use CSS Selector when:

* You select by id, class, or simple attributes.

* #login-button, .btn.primary, input[name='username'].​

* You combine tag + class + attribute cleanly.

* button.btn-primary[type='submit'].​

* You need nth-child or structural selection but not text conditions.

* ul > li:nth-child(3).​

* CSS is usually more readable and less brittle for common UI elements like buttons, inputs, and menu items.​

* When to prefer XPath
* Use XPath when you need power that CSS cannot provide:

### Text-based locators:

* Exact text: //button[text()="Submit"].​

* Contains text: //button[contains(text(),"Go")].​

* Complex logical conditions on attributes:

* Or logic: //a[@name or @href].​

* Comparisons: //product[@price > 2.50] or //item[@price > 2*@discount].​

### Traversing up or across the DOM:

* Parent: //ul/li/.. (select ul from li).​

* Closest ancestor with condition: ./ancestor-or-self::[@class="box"].​

* Following siblings: //h1/following-sibling::ul or only first: //h1/following-sibling::ul[1].​

* Using axes for advanced navigation:

* descendant-or-self::, ancestor-or-self::, following-sibling::, preceding-sibling::.​

* X Path is ideal when the element has no stable id/class, but its relative position, text, or relationship to other elements is clear.​




