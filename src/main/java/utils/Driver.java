package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    // Private variable
    private static WebDriver driver;

    // Private constructor
    private Driver() {

    }

    //public method
    public static WebDriver getDriver() {

        String browser = ConfigurationReader.readProperty("browser");
        if (driver == null) {// checks if your driver is null or not
            switch (browser) {
                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }

}
