package Mentoring;

public class SeleniumInterviewQuestions {

    /*
     1) What are the advantages and disadvantages of selenium?
     2) What types of testing can you automate with selenium?
      --> smoke test, regression test, functional test(positive-negative UI)
     3) What are the test types we do not automate with selenium?
      --> performance testing, manual testing( ad Hec -- Monkey testing) --> it is a randomly testing,
          Load Testing
     4) What is a locator and what are the locator types?
      --> Locator is a way of finding the webElement in the DOM(document Object Model)
      --> Types: id, xpath, tagName, classsName, linkText, partialLinkText, css, name
     5) How do you handle dynamic element?
      --> In my course, I faced many dynamic elements and i use different ways to handle it
      --> I used parent-child-siblings(xpath) to locate the elements ***********
      --> I went with different attribute to locate the element

     6) Difference between close() and quit()
       --> close(): it specifically closes the window that you are currently working on
       --> quit(): it specifically closes the whole browser. It means it closes all the open windows.

     7) Difference between navigateTo() and get()?
       --> navigateTo(): it doesn't wait webElements(pages) to be loaded
           * It has some methods: forward(), backward(), refresh()
       --> get(): It waits the web elements(pages) to be loaded
           * It doesn't have any methods

     8) What is xpath?
       --> xpath is used to find the location of the webElements on a webPage using HTML structures.
       --> There are two types of xpath: 1) Absolute xpath: it goes from parent to child
                                         2) Relative xpath: it goes directly to the element location

     9) What is the difference between Absolute and Relative xpath?
      --> 1) Absolute xpath: it goes from parent to child, SINGLE SLASH
          2) Relative xpath: it goes directly to the element location, DOUBLE SLASH

     10) How to handle static dropDown menus?
      --> I would definitely  check the tag of the location.
       * if the tag is select --> I use selct CLASS Select select=new Select(WebElement);
       * I can also use ACTION CLASS to handle the drop downs. ****

     11) What are the methodS of select?
      --> 1) .selectByVisibleText();
          2) selectByIndex();
          3) selectByValue();

     12) What kind of exceptions did you face in selenium?
      --> 1) NoSchElementException
          2) StaleElementReferenceException
          3) NoSuchWindowException
          4) NoSuchFrameException

     13) In what condition do you get StaleElementReferenceException?
      --> * Once the element is not there anymore
          * Once you Navigate to another page

          *** I CAN HANDLE WITH (refreshing the website or reinitialize the driver

     14) How do you handle System Alert?
      --> * Operation System Alert: I cannot handle it directly. I need to use ROBOT Class to handle
          * HTML Alert: I just need to find the element Click the button you want
          * JavaScript(Browser) Alert: Alert Class

     15) For the alert class, what kind of methods do you know?

      --> * Alert alert = driver.switchTo.Alert()
          * Accept --> ok
          * Dismiss --> Cancel
          * sendKeys() --> sendkey
          * getText() --> get the text

     16) What do you know about iframe(Frame)? Can you tell me the type that you used before? and How do you handle the iframe?

     Different types: Here is the scenario we have a website and i would like to get the text of price from products.
     all xpath are correct and there is a problem with attributes as well. But i cannot get it. what do you think the reasons could be?

     ** The reason could be iframe, so I basically go to the website and in the DOM I just search for the iframe.
     ?? Check the exception??

      ---> * iframe is the html inside another html
           * driver.switchTo().frame(1)
           ***** driver.switchTo().defaultContent() *****
           * driver.switchTo().frame(2)
           * if you have multiple iframes into each other. Then I should use driver.switchTo().ParentFrame()

     17) What do you know about Actions class?

      --> Actions class is really useful to handle some issues in my project since I use same actions class methods.
          Some of the important ones are:

          * Sendkeys
          * DoubleClick
          * ClickAndHold
          * DragAndDrop
          * MoveToElement
          * ContextClick(right click)
          * click

          Select select= new Select(WebElement); --> select tagName
          Actions action = new Actions(driver); --> anyTime

          * hjhdf.click().perform(); --> you must say perform at the end, otherwise it will not execute


     18) Findelement() and findelements()?

      --> findelement() --> returns a single webelement
         * once the element is not found, it throws the NoSuchElement exception

      --> * findelements() --> return the list of the elements
          * you can access the elements by using the index number
          * once the elements are not found, it doesn't throw any exception, but it returns an EMPTY LIST.

     19) Difference between isDisplayed? isEnabled? and is Selected?

        * isDisplayed: it displays the element it is VISIBLE or not
        * isEnabled: the element is enabled or not
        * isSelected: the element is selected or not

     20) What is the difference between check box and radio button?

       * Selected and check box mentality is similar, but the difference is you can only choose one radio button option
       * For the selected you can choose as many as you want.

    21) How do you switch the windows( 2 windows) from one to another?

       * I switch the window by using driver.switchTo().window(id); -->
       String mainWindow = driver.getWindowHandle(); --> it returns a String id

       Set<String> ids= driver.getWindowHandle() --> it returns the set of the ids
       *********
       for(String id:ids){ // facebook page(id 12345) and twitter page(id 1234567)
       if(!driver.getTitle.equals(ebayPage)){
       driver.switchTo().window();
       }
       }


    22) How do yuo switch the multiple windows from one to another?

      for(String id:ids){ // facebook page(id 12345) and twitter page(id 1234567) and ebay page(id 26547171)
         driver.switchTo().window(id);
       if(id.equals(mainWindow){
       break;
       }

    23) How do you scroll down the page from Web Browser?

      --> I would use JavaScript with ScrollIntoView and Point class.

    24) How do you download and upload a file in selenium?

      --> * Selenium itself CANNOT verify file downloads, can click on download link but can not go outside the browser and
           open the download file.
          * Selenium handles the upload, but does it differently compared to actual use
           - Find the element that triggers the upload window
           - Find the path of the file you want to upload
                 driver.findElement(upload button location).sendKeys(file)
                 file="C//Users//And Desktop//folder


    25) What is the difference between Assert and SoftAssert?

       --> Assert: is  a class that has some methods to validate the actual and expected data
         The methods like equal, false, true we can do validation.(like comparison actual-expected)

         ***** Once you use assertion for validation, if code fails it will RIGHT AWAY THROWS
         the exception which will stop the execution.(1000 test case example remember that)

       --> SoftAssert: is  a class that has some methods to validate the actual and expected data
         The methods like equal, false, true we can do validation.(like comparison actual-expected)

         ***** Once you use soft assertion for validation, if code fails it will not THROW
         exception RIGHT AWAY abd it will keep execution the codes. At the end you can see the failing ones to fix it.

    25) What is the difference between Validation and Verification?

       -->
           Validation: is executing the codes
           Verification: is the reading the codes NO EXECUTION.

     26) What do you know about the wait times ?

            ** Implicit Wait: is a wait which waits for a specified time while locating
            an element before throwing "NOSUCHELEMENT EXCEPTION"
            *LOGIC:As by default selenium tries to find elements immediately without any wait
           ,so it is good to use implicit wait.This wait applied to ALL ELEMENTS of the current
           driver instance

           ** Explicit wait : is a wait which applied to a particular web-element until the EXPECTED
           CONDITION specified is met.
           **** SUMMARY: implicit wait is simply, if condition is met before the timeout,
           it will continue to next step, if conditions is not met within the timeout
           throw nosuchelement exception.

           ** Explicit; element is visible, clickable, enable,

           27) CVS QUESTION:

           1) We have different customers for the specific website login.
           I would like to test our all customers' login functionality in the framework(automation)
           How would you test it ?

           --> In my project I was using data provider annotation which is really useful to apply
           different set of data for the same phenomena.(situation)

          * I implemented the data provider as an annotation for the test unit and the MULTIDIMENSIONAL
          array of the object method. It means they are connected and DATA IS COMING FROM THAT METHOD.

           28) Can you talk about your framework from any previous company?

            * Always start general information about your framework.(In my previous company i was using BDD framework with
            PAGE OBJECT MODEL WHICH IS a really cool way to organize all the structure of the project)
            * PAGE OBJECT MODEL --> give more details
            * JAVA
            * SELENIUM
            * TESTNG, JUNIT,
            * MAVEN, POM xml--> store my dependencies
            * runner class --> to execute the tests
    ============================================================================================================

    POM: (PAGE OBJECT MODEL)

    POM: is the way to organize your implementation, test scenarios, specific methods(TestBase, Pages, Test, UTILS...)
          that help to better understand structure of the products.


     */

}
