package JavaScriptExecuter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class JSPractice {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String title = (String) javascriptExecutor.executeScript("return document.title").toString(); // get title
        System.out.println(title);

        Thread.sleep(1000);


        WebElement browseCourse = driver.findElement(By.linkText("Browse Course"));
        javascriptExecutor.executeScript("arguments[0].click", browseCourse);

        Thread.sleep(1000);

        WebElement copyRights = driver.findElement(By.xpath("//p[contains(.,'Copyrights')]"));
//        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",copyRights);
        BrowserUtils.scrollToView(driver, copyRights);
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[contains(text(),'Student login')]"));

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", loginButton);


//        javaScriptExecutor js =(javaScriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

}
