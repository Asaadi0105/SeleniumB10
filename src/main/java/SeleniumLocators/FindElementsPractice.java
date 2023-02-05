package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // findElement(); --> finding only one element --> returns webelement
        // findElements(); -- > finding all the matching elements from the locator --> returns List<WebElement>
driver.get("https://the-internet.herokuapp.com/");
List<WebElement> links = driver.findElements(By.xpath("//li/a"));

// print all the text from the list which  has less than 12 characters

        int count=0;
        for (WebElement element:links) {
            if (element.getText().length()<12){
                System.out.println(element.getText());
                System.out.println(element.getAttribute("href"));
                count++;

            }

        }
        System.out.println(count);
        //

    }
}
