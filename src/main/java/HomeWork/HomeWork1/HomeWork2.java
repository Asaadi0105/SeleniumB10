package HomeWork.HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork2 {
    //public static void main(String[] args) throws InterruptedException {

    @Test
            public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement yesButton = driver.findElement(By.xpath("//label[.='Yes']"));
        yesButton.click();

        Thread.sleep(500);
        WebElement impressiveButton = driver.findElement(By.xpath("//label[.='Impressive']"));
        impressiveButton.click();

        WebElement noButton = driver.findElement(By.xpath("//label[.='No']"));
        noButton.click();


        WebElement actualResult1 = driver.findElement(By.xpath("//p[contains(text(),'selected')]/span"));
        String expectedResult1 = "You have selected Yes";

        if (actualResult1.equals(expectedResult1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        WebElement actualResult2 =driver.findElement(By.xpath("//p[.='You have selected Impressive']")) ;
        String expectedResult2="You have selected Impressive";

        if (actualResult2.equals(expectedResult2)){
            System.out.println("True");
        }else {
            System.out.println("False");
      }

        WebElement noButtonDisable= driver.findElement(By.id("noRadio"));

        boolean actualResult=noButtonDisable.isEnabled();

        if (actualResult){
            System.out.println("Button is enabled");
        }else {
            System.out.println("Button is disabled");
        }
   }


    }

