package SeleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSearch {
    public static void main(String[] args) {


       // WebDriverManager.firefoxdriver().setup();// will check if we have a firefox in our computer or not
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Iphone13");
        driver.findElement(By.name("btnK")).click(); // sendKeys(Keys.ENTER
                                                     // sendKeys(Keys.ENTER

        WebElement checkResults= driver.findElement(By.tagName("nobr"));

        String result= checkResults.getText().replaceAll("[^0-9.]","");// (1.11 seconds)
        // replace a text to a number ---> Today's date is : 10/25/2020
        double sec=Double.parseDouble(result);
        if (sec<3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
