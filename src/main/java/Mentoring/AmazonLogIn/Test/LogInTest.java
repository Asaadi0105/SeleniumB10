package Mentoring.AmazonLogIn.Test;

import Mentoring.AmazonLogIn.Page.HomePage;
import Mentoring.AmazonLogIn.TestBase;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    @Test
    public void sendInfo() {
        HomePage homePage=new HomePage(driver);
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("admin", "pass");
//        Assert.assertEquals(driver.getTitle(), "OpenEMR");
    }
}
