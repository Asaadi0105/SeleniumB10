package com.test.sentrifugo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        // it will initialize the elements that we stored inside this class
    }
    @FindBy(id="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@id='loginsubmit']")
    WebElement loginButton;

    @FindBy(name = "anySearchBox")
    WebElement patientName;

    @FindBy(id = "search_globals")
    WebElement searchButton;


    public void login(String username, String password) {

        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public void nameSearch(String name){

        this.patientName.sendKeys(name);
        this.searchButton.click();
    }
    // no more of --> driver.findElement(By.id("");
}
