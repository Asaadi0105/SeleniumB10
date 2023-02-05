package homework4.testcase6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//strong[.='Shiromi']/../../button[@class='add-to-cart']")
    WebElement addingShiromiToCart;

    @FindBy(xpath = "//strong[.='Ebi rolls']/../../button[@class='add-to-cart']")
    WebElement addingEbiRollsToCart;

    @FindBy(xpath = "//a[@id='checkout']")
    WebElement checkOutButton;

    @FindBy(xpath = "//span[.='$17.00']")
    WebElement totalPrice;

    @FindBy(xpath = "//span[.='Ebi rolls']/../../td/..//span[@class='k-icon k-i-arrow-60-up']")
    WebElement increasingEbiRolls;

    @FindBy(xpath = "//thead/tr[1]")
    WebElement quantityMessage;

    @FindBy(xpath = "//span[.='$25.00']")
    WebElement newTotalPrice;

    @FindBy(className = "order-now")
    WebElement orderButton;

    @FindBy(xpath = "//span[.='0']")
    WebElement numberOfItems;

    public void addingItemsToCart(){
        addingShiromiToCart.click();
        addingEbiRollsToCart.click();
    }
    public void checkingOut() throws InterruptedException {

        checkOutButton.click();
    }
    public String getTotalPrice(){
        return totalPrice.getText().trim();
    }
    public void ebiRollsNumberIncreases(){
        increasingEbiRolls.click();
    }
    public String getNewTotalPrice() throws InterruptedException {
        quantityMessage.click();
        Thread.sleep(500);
        newTotalPrice.click();
        return newTotalPrice.getText().trim();
    }
    public void clickOrderButton(){
        orderButton.click();
    }
    public String shoppingCart() throws InterruptedException {
        Thread.sleep(500);
        return numberOfItems.getText().trim();
    }
}
