package SeleniumLocators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/ahmed/Desktop/SDET/Slenium/Techtorial.html");

        // LinkText, PartialLinkText, TagName

        WebElement java = driver.findElement(By.linkText("Java"));
        java.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        WebElement selenium = driver.findElement(By.linkText("Selenium"));
        selenium.click();

        driver.navigate().back();
        java=driver.findElement(By.linkText("Java"));// need t0 re-instantiate the web-element onr more tim
        java.click();

        driver.navigate().back();

        WebElement rest = driver.findElement(By.partialLinkText("Rest"));
        rest.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();

        WebElement versionText = driver.findElement(By.tagName("u"));
        System.out.println(versionText.getText());


        Thread.sleep(6000); // delay the close for 6 seconds
        driver.quit();// close the browser
    }
}
