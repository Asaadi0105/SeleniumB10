package alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertJSPrompt {
    /*
    TASK:
1- navigate to the "https://the-internet.herokuapp.com/javascript_alerts"
2- Click JS Prompt
3- Send key 'Techtorial'
4- Validate message "You entered: Techtorial"

     */

    @Test
    public void AlertPrompt() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsConfirm= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsConfirm.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Techtorial");
        Thread.sleep(2000);
        alert.accept();

        WebElement result= driver.findElement(By.id("result"));
        String actualResult= result.getText();
        String expectedResult="You entered: Techtorial";
        Assert.assertEquals(actualResult,expectedResult);

    }


}
