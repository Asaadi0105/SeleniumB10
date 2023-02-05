package HomeWork.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork5 {

    @Test
            public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("dropdown"));
        userName.sendKeys("standard_user");

        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("secret_sauce");

        WebElement logInButton = driver.findElement(By.id("login-button"));
        logInButton.click();

        List<WebElement> productNames = driver.findElements(By.xpath("//a/div"));

        for (WebElement product : productNames) {
            System.out.println(product.getText());

        }


    }
}