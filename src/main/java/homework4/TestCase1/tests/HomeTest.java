package homework4.TestCase1.tests;

import homework4.TestBase;
import homework4.TestCase1.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @Test
    public void shiromiPhoto(){
        HomePage homePage=new HomePage(driver);
        homePage.clickShiromiPhoto();
        homePage.clickRigthArrow();
    }

    @Test
    public void validateTekkaMakiPhoto(){
        HomePage homePage=new HomePage(driver);
        homePage.clickShiromiPhoto();
        homePage.clickRigthArrow();
        Assert.assertEquals(homePage.gettekkaMakiMessage(driver),"Tekka maki");
    }
    @Test
    public void leftArrow() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        homePage.clickShiromiPhoto();
        homePage.clickRigthArrow();
        homePage.clickLeftArrow();
    }
    @Test
    public void validateShiromiMessage() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        homePage.clickShiromiPhoto();
        homePage.clickRigthArrow();
        homePage.clickLeftArrow();
        Assert.assertEquals(homePage.getShiromiMessage(driver),"Shiromi");
    }

    @Test
    public void validateEmptyShoppingCart() throws InterruptedException {
        HomePage homePage=new HomePage(driver);
        homePage.clickShiromiPhoto();
        homePage.clickRigthArrow();
        homePage.clickLeftArrow();
        Assert.assertEquals(homePage.shoppingCartEmpty(driver),"0");
    }
    }


