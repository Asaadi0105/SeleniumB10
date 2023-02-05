package homework3.tests;

import homework3.*;
import homework3.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void loginTestMethod (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");

    }
}
