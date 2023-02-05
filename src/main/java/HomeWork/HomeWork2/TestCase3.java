package HomeWork.HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase3 {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com");

        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement passWord= driver.findElement(By.name("password"));
        passWord.sendKeys("secret_sauce");

        WebElement logInButton= driver.findElement(By.id("login-button"));
        logInButton.click();

        WebElement dropDown = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dropDown);
        Thread.sleep(500);

        select.selectByVisibleText("Price (low to high)");

        List<WebElement> prices = driver.findElements(By.xpath("//a/div"));

        WebElement lowestPriceButton = driver.findElement(By.xpath("//a[@id='item_2_title_link']/../../div[@class='pricebar']/button"));
        lowestPriceButton.click();
        WebElement secondLowestButton = driver.findElement(By.xpath("//a[@id='item_0_title_link']/../../div[@class='pricebar']/button"));
        secondLowestButton.click();

        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();

        WebElement actualLowestPrice =driver.findElement(By.xpath("//a[@id='item_2_title_link']/../div[@class='item_pricebar']/div"));
        WebElement actualSecondLowestPrice =driver.findElement(By.xpath("//a[@id='item_0_title_link']/../div[@class='item_pricebar']/div"));

        System.out.println(actualLowestPrice.getText());;
        System.out.println(actualSecondLowestPrice.getText());
        Assert.assertEquals(actualLowestPrice.getText(),"$7.99");
        Assert.assertEquals(actualSecondLowestPrice.getText(),"$9.99");



    }
}
