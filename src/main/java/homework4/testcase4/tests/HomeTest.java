package homework4.testcase4.tests;

import homework4.TestBase;
import homework4.testcase4.pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @Test
    public void validateItemPricesLessThan25(){
        HomePage homePage = new HomePage(driver);
        homePage.geItemPrices();
        System.out.println(homePage.geItemPrices());
    }
}
