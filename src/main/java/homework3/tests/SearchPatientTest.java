package homework3.tests;

import homework3.TestBase;
import homework3.pages.HomePage;
import homework3.pages.LoginPage;
import org.testng.annotations.Test;

public class SearchPatientTest extends TestBase {

    @Test
    public void sendInfo(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        homePage.searchPatient("Belford");
    }

    @Test
    public void searchBelfordTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pass");
        HomePage homePage = new HomePage(driver);
        homePage.searchBelford(driver);
    }



}
