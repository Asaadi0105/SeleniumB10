package windowHndle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
    // find the webElement for click here
        // find the webelemnt of new window text on the page
        // print the text

        WebElement clickHereButton= driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereButton.click();

        String mainWindow= driver.getWindowHandle();// 123
        Set<String> ids= driver.getWindowHandles();// 123 - 124
        for (String id:ids){
            System.out.println(id);
            if (!id.equals(mainWindow)){
                driver.switchTo().window(id);

            }
        }
        WebElement newWindowText= driver.findElement(By.xpath("//h3[.='New Window']"));
        String actual=newWindowText.getText();
        String expected="New Window";
        Assert.assertEquals(actual,expected,"New window validation");

        driver.quit();// close all windows
        //System.out.println(newWindowText);
    }
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement clickHereButton= driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereButton.click();

        String mainWindow= driver.getWindowHandle();// 123
        Set<String> ids= driver.getWindowHandles();// 123 - 124
    // close only second window.
        for (String id:ids){
            if (!id.equals(mainWindow)){
                driver.switchTo().window(id);
                driver.close();// close only one window
            }
        }
        driver.switchTo().window(mainWindow);
        Assert.assertEquals(driver.getTitle(),"The Internet");

    }
}
