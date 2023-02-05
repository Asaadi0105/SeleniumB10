package windowHndle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LatenViewPage {
    //Navigate to the https://www.naukri.com/
    //click the LatentView Analytics Pvt Ltd.
    //Print all the titles

    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");

        WebElement latenViewOption= driver.findElement(By.xpath("//a[.=' LatentView Analytics Pvt Ltd.']"));
        latenViewOption.click();

    }
}
