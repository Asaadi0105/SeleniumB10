package homework3.tests;

import homework3.TestBase;
import homework3.pages.HomePage;
import homework3.pages.LoginPage;
import homework3.pages.PhilPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhilPageTest extends TestBase {

    @Test
    public void validatePhilName(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        homePage.searchBelford(driver);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("pat");
        PhilPage philPage = new PhilPage(driver);
        System.out.println(philPage.getPhilName());
        Assert.assertEquals(philPage.getPhilName(),"Medical Record Dashboard - Phil Belford");
    }

    @Test
    public void validatePhilPhoneNumber(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getPhilPhoneNumber(driver),"333-444-2222");
    }

    @Test
    public void validatePhilExternalId(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        homePage.searchBelford(driver);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("pat");
        PhilPage philPage = new PhilPage(driver);
//        Assert.assertEquals(philPage.getPhilName(),"Medical Record Dashboard - Phil Belford");
        Assert.assertEquals(homePage.getPhilExternalId(driver),philPage.getPhilId());
    }

    @Test
    public void validatePhilSsn(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage=new HomePage(driver);
        Assert.assertEquals(homePage.getPhilSSN(driver),"333222333");
    }
    @Test
    public void validatePhilAge(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getPhilAge(driver),49);
        homePage.DOB.isDisplayed();
    }





}
