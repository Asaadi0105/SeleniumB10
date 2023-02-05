package com.test.Etsy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
//        driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver= Driver.getDriver();

        // Implicitly Wait will wait all the page element that my Driver pointing
        // it will wait 5 sec till element load is completed. After 5 sec if the element is
        // not available and it will throw noSuchElementException

        driver.get(ConfigurationReader.readProperty("etsyUrl"));

    }

    @AfterMethod
    public void tearDown(ITestResult result){ // it will tell you if the test passes or fails
        if (!result.isSuccess()){
            BrowserUtils.getScreenShot(driver,"etsyscreenshots");
        }
        Driver.tearDown();
    }
}
