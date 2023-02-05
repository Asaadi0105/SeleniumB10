package weeklyProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project1 {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/ahmed/Desktop/SDET/Sublime%20Files/HTML%20Project.html");

        WebElement contactMeLink = driver.findElement(By.xpath("//a[.='Contact Me']"));
        contactMeLink.click();

        Thread.sleep(100);


        WebElement name = driver.findElement(By.name("yourname"));
        name.sendKeys("Adam");
    }
}
