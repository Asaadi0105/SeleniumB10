package homework4.testcase5.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//strong[.='Salmon Teriyaki']")
    WebElement salmonTeriyakiButton;

    @FindBy(className = "buy")
    WebElement addButton;

    @FindBy(id = "navigate-next")
    WebElement rightArrow;

    @FindBy(xpath = "//button[@class='buy']")
    WebElement addButtonGohan;

    @FindBy(xpath = "//button")
    WebElement addButtonToriKatsu;

    @FindBy(xpath = "//li[1]/a")
    WebElement xButton;

    @FindBy(xpath = "//span[.='2']")
    WebElement totalItemsInCart;

    public void clickSalmonTeriyakiPhoto(WebDriver driver){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", salmonTeriyakiButton);
        salmonTeriyakiButton.click();
    }
    public void clickAddButton(){
        addButton.click();
    }
    public void clickRightArrow(WebDriver driver){
       // rightArrow.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(addButton));
        rightArrow.click();
    }
    public void AddButton() throws InterruptedException {

        Thread.sleep(1000);
        addButtonGohan.click();
    }
    public void clickRightArrow2(WebDriver driver) throws InterruptedException {
       Thread.sleep(1000);
        rightArrow.click();
        Thread.sleep(1000);
        addButtonToriKatsu.click();
    }
    public void clickXButton(){
        xButton.click();
    }
    public String itemsInShoppingCart(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(xButton));
        return totalItemsInCart.getText().trim();
    }
}
