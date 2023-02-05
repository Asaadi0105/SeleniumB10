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

public class TestCase4 {
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

        select.selectByVisibleText("Price (high to low)");
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

//        for (WebElement name : names) {
//            System.out.println(name.getText());
//        }
//        for (WebElement price : prices) {
//            System.out.println(price.getText());
//        }
        WebElement highestPriceButton = driver.findElement(By.xpath("//a[@id='item_5_title_link']/../../div[@class='pricebar']/button"));
        highestPriceButton.click();
        WebElement secondHighestButton = driver.findElement(By.xpath("//a[@id='item_4_title_link']/../../div[@class='pricebar']/button"));
        secondHighestButton.click();

        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();

        WebElement actualHighestPrice =driver.findElement(By.xpath("//a[@id='item_5_title_link']/../div[@class='item_pricebar']/div"));
        WebElement actualSecondHighestPrice =driver.findElement(By.xpath("//a[@id='item_4_title_link']/../div[@class='item_pricebar']/div"));

        System.out.println(actualHighestPrice.getText());
        System.out.println(actualSecondHighestPrice.getText());
        Assert.assertEquals(actualHighestPrice.getText(),"$49.99");
        Assert.assertEquals(actualSecondHighestPrice.getText(),"$29.99");

        WebElement checkOutButton=driver.findElement(By.id("checkout"));
        checkOutButton.click();

        WebElement firstName= driver.findElement(By.id("first-name"));
        firstName.sendKeys("Adam");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Saadi");

        WebElement zipCode= driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("111123");

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

//        WebElement totalPrice= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
//        String actual=totalPrice.getText();
//        String expected= ""+actualHighestPrice+actualSecondHighestPrice;
//        Assert.assertEquals(actual,expected);




        String url = driver.getCurrentUrl();
        boolean containsProducts = url.contains("checkout");
        Assert.assertTrue(containsProducts);
        System.out.println(driver.getCurrentUrl());

        WebElement finishButton= driver.findElement(By.id("finish"));
        finishButton.click();

        WebElement thankYouText= driver.findElement(By.tagName("h2"));
//        thankYouText.isDisplayed();
        String actualText= thankYouText.getText();
        String expectedText="THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(actualText,expectedText);
        System.out.println(thankYouText.getText());    }
}
