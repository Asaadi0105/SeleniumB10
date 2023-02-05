package HomeWork.HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestCase2 {
    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("secret_sauce");

        WebElement logInButton = driver.findElement(By.id("login-button"));
        logInButton.click();

        WebElement dropDown = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dropDown);
        Thread.sleep(500);

        select.selectByVisibleText("Price (low to high)");

        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
        System.out.println(prices.size());

//        List <String> actual = new ArrayList<>();
//        for (WebElement price:prices){
//            actual.add(price.getText());
//            System.out.println(price.getText());
//
//        }
//        Set<String> ascendingSet = new TreeSet<>(actual);
//        List<String> ascendingList = new ArrayList<>(ascendingSet);
//        Set<String> descending = new LinkedHashSet<>();
//        for (int i = ascendingList.size()-1; i >=0 ; i--) {
//            descending.add(ascendingList.get(i));
//        }
//
//        Assert.assertEquals(actual,descending);

    }
}