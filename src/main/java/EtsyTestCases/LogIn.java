package EtsyTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LogIn {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/signin");
        driver.manage().window().maximize();


        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("asaadi0105@gmail.com");

        Thread.sleep(2000);
        WebElement passWord= driver.findElement(By.name("password"));
        passWord.sendKeys("helloworld");

        Thread.sleep(2000);

        WebElement submitButton= driver.findElement(By.xpath("//button[@value='sign-in' and @type='submit']"));
        submitButton.click();
        Thread.sleep(2000);


        WebElement toysAndEntertainmnt= driver.findElement(By.id("catnav-primary-link-11049"));
        toysAndEntertainmnt.click();
        Thread.sleep(1000);


        WebElement toys=driver.findElement(By.xpath("//h3[.='\n" +
                "                Toys\n" +
                "            ']"));
        boolean isToys= toys.getText().trim().equalsIgnoreCase("Toys");
        if (isToys){
            System.out.println("Is toys displayed true");
        }else{
            System.out.println("Toys misdisplayed");
            throw new Exception();
        }
         toys.click();

        Thread.sleep(1000);
        driver.quit();
    }
}
