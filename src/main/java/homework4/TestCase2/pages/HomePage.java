package homework4.TestCase2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//strong[.='Edamame']/../../button[.='Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[.='1']")
    WebElement numberOfItems;

    @FindBy(xpath = "//strong[.='Edamame']/../span[@class='price']")
    WebElement firstItemPrice;

    @FindBy(xpath = "//div[@id='shopping-cart']/a[.='empty cart']")
    WebElement emptyCartButton;

    @FindBy(xpath = "//span[.='0']")
    WebElement numberOfItemsInCart;

    public void clickAddToCartButton(){
        addToCartButton.click();
    }
    public String itemsInShoppingCart(){
        return numberOfItems.getText().trim();
    }
    public String  getItemPrice(){
        return firstItemPrice.getText().trim();
    }
    public void clickEmptyCart(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(firstItemPrice));
        emptyCartButton.click();
    }
    public String itemsInCart(){
        return numberOfItemsInCart.getText().trim();
    }
}
