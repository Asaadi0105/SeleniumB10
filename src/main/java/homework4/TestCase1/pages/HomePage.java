package homework4.TestCase1.pages;

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

    @FindBy(xpath = "//strong[.='Shiromi']")
    WebElement shiromiButton;

    @FindBy(id = "navigate-next")
    WebElement rightArrow;

    @FindBy(xpath = "//h1[.='Tekka maki']")
    WebElement tekkaMakiMessage;

    @FindBy(xpath = "//a[@id='navigate-prev']")
    WebElement leftArrow;

    @FindBy(xpath = "//h1[.='Shiromi']")
    WebElement shiromiMessage;

    @FindBy(xpath = "//span[.='0']")
    WebElement emptyShoppingCart;


    public void clickShiromiPhoto(){
        shiromiButton.click();
    }

    public void clickRigthArrow(){
        rightArrow.click();
    }
    public String gettekkaMakiMessage(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(rightArrow));
        return tekkaMakiMessage.getText().trim();
    }
    public void clickLeftArrow() throws InterruptedException {
       Thread.sleep(500);
        leftArrow.click();
    }
    public String getShiromiMessage(WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(leftArrow));
        return shiromiMessage.getText().trim();
    }
    public String shoppingCartEmpty(WebDriver driver){
        return emptyShoppingCart.getText().trim();
    }
}
