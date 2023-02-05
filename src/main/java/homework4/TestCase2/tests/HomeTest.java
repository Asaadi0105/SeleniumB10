package homework4.TestCase2.tests;

import homework4.TestBase;
import homework4.TestCase2.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @Test
    public void addingItemToCart(){
        HomePage homePage=new HomePage(driver);
        homePage.clickAddToCartButton();
    }
    @Test
    public void validateItemsInShoppingCart(){
        HomePage homePage=new HomePage(driver);
        homePage.clickAddToCartButton();
        Assert.assertEquals(homePage.itemsInShoppingCart(),"1");
    }
    @Test
    public void validateFirstItemPrice(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAddToCartButton();
        Assert.assertEquals(homePage.getItemPrice(),"$4");
        System.out.println(homePage.getItemPrice());
    }
    @Test
    public void validateEmptyCart(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAddToCartButton();
        homePage.clickEmptyCart(driver);
        Assert.assertEquals(homePage.itemsInCart(),"0");
        System.out.println(homePage.itemsInCart());
    }
}
