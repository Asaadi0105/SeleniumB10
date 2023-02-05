package HomeWork.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Adam Carl");

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("ahalal@gmail.com");

        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("1234");

        WebElement permAddress = driver.findElement(By.id("permanentAddress"));
        permAddress.sendKeys("54321");

        Thread.sleep(1000);
        WebElement submitButton= driver.findElement(By.id("submit"));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", submitButton);
        submitButton.click();

        WebElement result =driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")) ;
        String actualResult = result.getText();
        String expectedResult="Name:Adam Saadi\n" +
                        "\n" +
                        "Email:asaadi0105@gmail.com\n" +
                        "\n" +
                        "Current Address :1234\n" +
                        "\n" +
                        "Permananet Address :54321";

                if (actualResult.equals(expectedResult)){
                    System.out.println("Passed");
                }else {
                    System.out.println("Failed");
                }
    }
}
