package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
    @Test
    public void sliderTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();

        WebElement slider = driver.findElement(By.tagName("input"));
        WebElement text = driver.findElement(By.id("range"));
        navigateToTarget(slider,text,driver,3.5);

//        Actions actions = new Actions(driver);          // we are using actions class below
//        actions.clickAndHold(slider).moveByOffset(50, 0).perform();

        Point point = slider.getLocation();
        System.out.println(point.getX());
        System.out.println(point.getY());

        // source --> fid the webelement of the target and then using Point class(getLocation) method,
        // you can provide the x and y coordination

        // create the function that takes webelement, driver, target number
        // navigateToTarget(slider, driver, 4)


    }

    public void navigateToTarget(WebElement slider, WebElement text, WebDriver driver, double targetNum) {

        Actions actions = new Actions(driver);
        if (targetNum == 2.5) {
            actions.click(slider).perform();
        } else if (targetNum > 2.5) {
            int count = 10;// if targetNum = 3.5
            while (!text.getText().equals(String.valueOf(targetNum))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count += 5;//20
            }
        } else {
            int count = -10;
            while (!text.getText().equals(String.valueOf(targetNum))) {
                actions.clickAndHold(slider).moveByOffset(count, 0).perform();
                count -= 10;

            }


        }
    }
}
