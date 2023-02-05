package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
        System.out.println("You can use to set up your chrome browser properties(delete cookies," +
                " remote driver, screensize");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before TEST");
        System.out.println("Launch the browser");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
        System.out.println("Navigate to your website");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
        System.out.println("Login to your class");
    }

    @Test
    public void test1(){
        System.out.println("Test-1");
    }

    @Test
    public void test2(){
        System.out.println("Test-2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        System.out.println("Take a screenshot for failed test annotation");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
