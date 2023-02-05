package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        WebElement homeCheck= driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        homeCheck.click();
        WebElement arrow=driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        arrow.click();
        WebElement arrowDesktop= driver.findElement(By.xpath("//li[.='Desktop']//button"));
        arrowDesktop.click();

        // TASK: click to the download arrow

        WebElement arrowDownLoad= driver.findElement(By.xpath("//li[.='Downloads']//span//button"));
        arrowDownLoad.click();

        WebElement arrowDucoment= driver.findElement(By.xpath("//li[.='Documents']//span//button"));
        arrowDucoment.click();

        WebElement officeText= driver.findElement(By.xpath("//span[.='Office']"));
        System.out.println(officeText.getText());

        driver.close();
    }
}
