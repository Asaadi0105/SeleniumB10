package homework4.testcase6.tests;

import homework4.TestBase;
import homework4.testcase6.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @Test
    public void sendShiromiToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.addingItemsToCart();
        homePage.checkingOut();
    }

    @Test
    public void validateTotalPrice() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.addingItemsToCart();
        homePage.checkingOut();
        Assert.assertEquals(homePage.getTotalPrice(), "$17.00");
        System.out.println(homePage.getTotalPrice());
    }

    @Test
    public void validateNewTotal() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.addingItemsToCart();
        homePage.checkingOut();
        homePage.ebiRollsNumberIncreases();
        Assert.assertEquals(homePage.getNewTotalPrice(), "$25.00");
        System.out.println(homePage.getNewTotalPrice());
    }

    @Test
    public void confirmTheOrder() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.addingItemsToCart();
        homePage.checkingOut();
        homePage.ebiRollsNumberIncreases();
        homePage.clickOrderButton();
    }
    @Test
    public void validateEmptyCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.addingItemsToCart();
        homePage.checkingOut();
        homePage.ebiRollsNumberIncreases();
        homePage.clickOrderButton();
        Assert.assertEquals(homePage.shoppingCart(),"0");
        System.out.println(homePage.shoppingCart());
    }
}
