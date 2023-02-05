package windowHndle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.Set;

public class NewWindow {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
       String mainTitle=driver.getTitle();
        WebElement clickHereButton = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereButton.click();
        // 123, 124,125,126,127
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");


        // switch to window until it is equals to about-us
//        String mainWindow= driver.getWindowHandle();// 123
//        Set<String> ids = driver.getWindowHandles();
//        for (String id : ids) {
//            driver.switchTo().window(id);
//            if (driver.getTitle().contains("About Us")) {
//                break;
//            }
//
////        Assert.assertEquals(driver.getTitle(),"about-us");
//
//        }
        BrowserUtils.switchTitle(driver,"About Us");
        System.out.println(driver.getTitle());

        // CLOSE ALL THE WINDOWS EXCEPT THE MAIN WINDOW
//        for (String id:ids){
//            if (!id.equals(mainWindow)){
//                driver.switchTo().window(id);
//                driver.close();
//            }
//        }
        BrowserUtils.closeWindowsByTitle(driver, mainTitle);
    }

}
