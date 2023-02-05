package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class CarsSelect {
    @Test
    public void testCars() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.id("make-model-search-stocktype"));
        Select select = new Select(dropDown);

        Thread.sleep(2000);// my code will pause on this line for 2 sec
        select.selectByVisibleText("New cars");

        WebElement makes = driver.findElement(By.id("makes"));
        Select select1 = new Select(makes);

        Thread.sleep(2000);
        select1.selectByVisibleText("Porsche");

        WebElement model = driver.findElement(By.id("models"));
        Select select2 = new Select(model);

        Thread.sleep(2000);
        select2.selectByIndex(4);

        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.xpath("//div[@id='by-make-tab']//button"));
        //Select select3=new Select(searchButton);
        searchButton.click();

        BrowserUtils.selectBy(dropDown,"New cars","text");
        BrowserUtils.selectBy(makes,"porsche","value");
        BrowserUtils.selectBy(model,"4","index");



        WebElement header = driver.findElement(By.xpath("//h1"));

        String actualFirstSelected = BrowserUtils.getText(header);
        String expectedFirstSelected = "New Porsche 911 for sale";
        Assert.assertEquals(actualFirstSelected, expectedFirstSelected);

    }
}
