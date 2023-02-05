package homework3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "authUser")
    WebElement username;

    @FindBy (name = "clearPass")
    WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement loginButton;


    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.submit();
    }



}
