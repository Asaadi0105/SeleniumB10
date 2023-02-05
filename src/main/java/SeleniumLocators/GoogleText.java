package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search= driver.findElement(By.name("btnK")); // sendKeys(Keys.ENTER
        // sendKeys(Keys.ENTER);


        String actualResult= search.getAttribute("value");
        String expectedResult="Google Search";
        if (actualResult.equals(expectedResult)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
