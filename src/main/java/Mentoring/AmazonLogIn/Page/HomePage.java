package Mentoring.AmazonLogIn.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-csa-c-content-id=nav_ya_signin]")
    WebElement HelloSignInButton;

//    @FindBy(xpath = "//button[@type='submit']")
//    WebElement loginButton;

    public void home(){
        this.HelloSignInButton.click();

    }
}
