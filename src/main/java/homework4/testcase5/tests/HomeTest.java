package homework4.testcase5.tests;

import homework4.TestBase;
import homework4.testcase5.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    @Test
    public void addSalmonTeriyakiToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton();
        homePage.clickRightArrow(driver);
        homePage.AddButton();
        homePage.clickRightArrow2(driver);
        homePage.clickXButton();
        Assert.assertEquals(homePage.itemsInShoppingCart(driver), "2");
        System.out.println(homePage.itemsInShoppingCart(driver));
    }

}
