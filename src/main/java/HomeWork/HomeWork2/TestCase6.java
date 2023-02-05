package HomeWork.HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 {
    @Test
    public void test() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demoqa.com/droppable");
        driver.manage().window().maximize();

        WebElement dragMe= driver.findElement(By.id("draggable"));
        WebElement dropHereBox= driver.findElement(By.id("droppable"));

        Thread.sleep(1000);

        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragMe,dropHereBox).perform();

        String cssValue= dropHereBox.getCssValue("background-color");
        System.out.println(cssValue);
        Assert.assertEquals(cssValue,"rgba(70, 130, 180, 1)");

        dropHereBox= driver.findElement(By.id("droppable"));
        String actualText= dropHereBox.getText();
        String expectedText="Dropped!";
        Assert.assertEquals(actualText,expectedText);
    }
}
