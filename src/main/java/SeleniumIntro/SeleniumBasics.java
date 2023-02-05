package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.sql.Driver;

public class SeleniumBasics {

    public static void main(String[] args) {
        // we are defining the chrome driver into the project as property
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // Windows
        //         System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // for Mac
        //         System.setProperty("webdriver.chrome.driver","chromedriver");


        WebDriver driver = new ChromeDriver();

        // get method navigates to the given url.
        driver.get("https://www.techtorialacademy.com/");
        // providing the Url of the website, it will take you to the website

        // getTitle() method gets the title fro the page and returns String

        String title = driver.getTitle();
        // Home Page - Techtorial
        if (title.equals("Home Page - Techtorial"))
        System.out.println(true);
        else
            System.out.println(false);

        System.out.println(driver.getCurrentUrl());


    }
}
