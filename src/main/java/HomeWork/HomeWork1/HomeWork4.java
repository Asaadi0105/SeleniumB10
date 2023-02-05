package HomeWork.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement passWord= driver.findElement(By.name("password"));
        passWord.sendKeys("secret_sauce");

        WebElement logInButton= driver.findElement(By.id("login-button"));
        logInButton.click();


        System.out.println(driver.getCurrentUrl());

    }
}
