package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionMethods {
    @Test
    public void test(){

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        WebElement searchBox= driver.findElement(By.name("q"));

        Actions actions=new Actions(driver);
        actions.moveToElement(searchBox)
                .click()
                .keyDown(Keys.SHIFT) // hold down shift button
                .sendKeys("s")
                .keyUp(Keys.SHIFT) // stop holding shift button
                .sendKeys("elenium")
                .doubleClick()
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.ENTER)
                .perform();

    }
}
