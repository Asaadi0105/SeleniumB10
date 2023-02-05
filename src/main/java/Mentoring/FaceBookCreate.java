package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FaceBookCreate {
    /*
     Facebook Sign up:
Scenario:
Open a Chrome browser.
Navigate to "http://www.fb.com"
Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
Verify that there is a "Create an account" section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
Update the date of birth in the drop-down.
Select gender.
Click on "Create an account".
Verify that the account is not created.
     */

    // once you believe tht path is correct but it is not working

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        String url= driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.facebook.com/");

        WebElement createNewAccount=driver.findElement(By.xpath("//a[.='Create new account']"));
        createNewAccount.click();

        Thread.sleep(1000);

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Adam");

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Saadi");

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("121212121212");

//        WebElement confirmationEmail= driver.findElement(By.name("reg_email_confirmation__"));
//        confirmationEmail.sendKeys("121212121212");


        WebElement passWord= driver.findElement(By.name("reg_passwd__"));
        passWord.sendKeys("12345");

        WebElement month= driver.findElement(By.id("month"));
        month.sendKeys("Aug");

        WebElement day= driver.findElement(By.id("day"));
        day.sendKeys("13");

        WebElement year=driver.findElement(By.id("year"));
        year.sendKeys("2021");

        WebElement gender=driver.findElement(By.xpath("//label[.='Male']")); // //label[contains(text(),'Male')]
        gender.click();

        WebElement signUp = driver.findElement(By.name("websubmit"));
        signUp.click();

        driver.quit();



    }
}
