package HomeWork.HomeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestCase5 {
    @Test
    public void test() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        WebElement selectValueOptions = driver.findElement(By.xpath("//div[contains(text(),'Select Option')]"));
        selectValueOptions.click();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", selectValueOptions);

        WebElement option2 = driver.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]"));
        option2.click();

        WebElement titleOption = driver.findElement(By.xpath("//div[contains(text(),'Select Title')]"));
        titleOption.click();

        Thread.sleep(1000);
        WebElement profOption = driver.findElement(By.xpath("//div[contains(text(),'Prof.')]"));
        JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", profOption);
        profOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)", "");

        option2 = driver.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]"));
        String actualOption1= option2.getText();
        String expectedOption1="Group 2, option 1";
        Assert.assertEquals(actualOption1,expectedOption1);

        profOption = driver.findElement(By.xpath("//div[contains(text(),'Prof.')]"));
        String actualOption2= profOption.getText();
        String expectedOption2="Prof.";
        Assert.assertEquals(actualOption2,expectedOption2);


    }

}
