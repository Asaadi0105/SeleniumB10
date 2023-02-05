package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/ahmed/Desktop/SDET/Slenium/Techtorial.html");

        // Locator = by id
        WebElement header = driver.findElement(By.id("techtorial1"));// never try to write it by yourself

       // System.out.println(header.getText());
        String hdr = header.getText();
        String expected = "Techtorial Academy";
        if (hdr.equals(expected)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        // Locator = className
        WebElement checkBoxTitle = driver.findElement(By.className("group_checkbox"));

        String actTitle = checkBoxTitle.getText();
        String expectedTitle="All Tools";

        if (actTitle.equals(expectedTitle)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        WebElement fName = driver.findElement(By.name("firstName"));
        WebElement lName = driver.findElement(By.name("lastName"));
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement email = driver.findElement(By.name("userName"));

        fName.sendKeys("David");
        lName.sendKeys("Turan");
        phone.sendKeys("2345673345");
        email.sendKeys("dturan@gmai@.com");


        // store webelement for check boxes --> java, selenium, TestNG and Cucumber

        WebElement java = driver.findElement(By.id("cond1"));
        WebElement selenium = driver.findElement(By.id("cond2"));
        WebElement TestNG = driver.findElement(By.id("cond3"));
        WebElement Cucumber = driver.findElement(By.id("cond4"));

        java.click();
        System.out.println(java.isSelected());// returns true
        TestNG.click(); //it will check the TestNG box and return true
        System.out.println(TestNG.isSelected());// returns false bc it is not selected
        System.out.println(Cucumber.isDisplayed());// it will return true since cucumber
                                                   // element is displayed on the page
        driver.close();

    }
}
