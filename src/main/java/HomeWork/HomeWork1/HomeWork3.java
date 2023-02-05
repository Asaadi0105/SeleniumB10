package HomeWork.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork3 {
    @Test

    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        Thread.sleep(500);

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("Java");

        Thread.sleep(500);
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("Selenium");

        Thread.sleep(500);

        WebElement logInButton = driver.findElement(By.id("login-button"));
        logInButton.click();

        WebElement wrongLogInMessage = driver.findElement(By.xpath("//h3"));
        String actualText=wrongLogInMessage.getText();
        String expectedText = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualText,expectedText);
//        if (actualText.equals(expectedText)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
    }
}
