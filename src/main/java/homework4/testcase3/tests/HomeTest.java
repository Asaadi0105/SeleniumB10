package homework4.testcase3.tests;

import homework4.TestBase;
import homework4.testcase3.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @Test
    public void salmonTeriyakiPhoto() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
    }

    @Test
    public void addSalmonTeriyakiToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
    }

    @Test
    public void validateTotalPrice() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
        homePage.totalPriceInShoppingCart();
        Assert.assertEquals(homePage.totalPriceInShoppingCart(), "$26.00");
        System.out.println(homePage.totalPriceInShoppingCart());
    }

    @Test
    public void validateItemsInShoppingCart() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
        homePage.totalPriceInShoppingCart();
        Assert.assertEquals(homePage.itemsInCart(driver), "1");
        System.out.println(homePage.itemsInCart(driver));

    }

    @Test
    public void rightArrowClick() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickRightArrow();
    }

    @Test
    public void addToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
        homePage.clickRightArrow();
        homePage.AddButton(driver);
    }

    @Test
    public void validateTotalPriceAfterAddingGohan() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
        homePage.clickRightArrow();
        homePage.AddButton(driver);
        homePage.getTotalPrice();
        Assert.assertEquals(homePage.getTotalPrice(), "$29.00");
        System.out.println(homePage.getTotalPrice());
    }

    @Test
    public void validateTotalItemsAfterAddingGohan() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSalmonTeriyakiPhoto(driver);
        homePage.clickAddButton(driver);
        homePage.clickRightArrow();
        homePage.AddButton(driver);
        homePage.getTotalPrice();
        homePage.itemsInShoppingCart(driver);
        Assert.assertEquals(homePage.itemsInShoppingCart(driver), "2");
    }
}