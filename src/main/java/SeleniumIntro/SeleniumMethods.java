package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       // it is not required for this class
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000); // this method will wait 1 second and move to the next method
                                  // no matter what your code will stop on this line
                                  // it is hard coding and it is not recommended
        driver.navigate().to("https://www.techtorialacademy.com/");// faster than .get method

        driver.navigate().back(); // google
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().forward();// Techtorial
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().refresh(); // refreshing the page

        System.out.println(driver.getPageSource());// returns the url for the page


    }
}
