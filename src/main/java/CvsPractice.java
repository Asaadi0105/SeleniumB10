import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CvsPractice {

    public static void main(String[] args){
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cvs.com/shop?icid=cvsheader:shop");

        WebElement link = driver.findElement(By.linkText("Personal care"));
        link.click();

        WebElement heading = driver.findElement(By.xpath("//h1[.='Personal Care']"));

        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Personal Care"));

//        WebElement health = driver.findElement(By.xpath("//a[.='Health & medicine']"));
//        health.click();
    }
}
