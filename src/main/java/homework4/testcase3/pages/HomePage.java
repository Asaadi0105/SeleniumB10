package homework4.testcase3.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//strong[.='Salmon Teriyaki']")
    WebElement salmonTeriyakiButton;

    @FindBy(className = "buy")
    WebElement addButton;

    @FindBy(xpath = "//p[.='$26.00']")
    WebElement totalPrice;

    @FindBy(xpath = "//span[.='1']")
    WebElement numberOfItems;

    @FindBy(id = "navigate-next")
    WebElement rightArrow;

    @FindBy(className = "buy")
    WebElement addButtonGohan;

    @FindBy(xpath = "//p[.='$29.00']")
    WebElement totalPriceWithGohan;

    @FindBy(xpath = "//span[.='2']")
    WebElement totalItemsInCart;

    public void clickSalmonTeriyakiPhoto(WebDriver driver){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", salmonTeriyakiButton);
        salmonTeriyakiButton.click();
    }
    public void clickAddButton(WebDriver driver){
        addButton.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(addButton));
        addButton.click();
    }
    public String totalPriceInShoppingCart(){
        return totalPrice.getText().trim();
    }
    public String itemsInCart(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(totalPrice));
        return numberOfItems.getText().trim();
    }
    public void clickRightArrow(){
        rightArrow.click();
    }
    public void AddButton(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(rightArrow));
        addButtonGohan.click();
    }
    public String getTotalPrice(){
        return totalPriceWithGohan.getText().trim();
    }
    public String itemsInShoppingCart(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(totalPriceWithGohan));
        return totalItemsInCart.getText().trim();
    }
}
