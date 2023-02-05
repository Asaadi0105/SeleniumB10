package homework3.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HomePage {


    public HomePage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "anySearchBox")
    WebElement searchBox;

    @FindBy (xpath = "//div[contains(text(),'Patient/Client')]")
    WebElement patientClient;

    @FindBy (xpath = "//ul[@name='menuEntries']/li/div[contains(text(),'Patients')]")
    WebElement patientTab;

    @FindBy (xpath = "//td[contains(text(),'333222333')]")
    WebElement philName;

    @FindBy (xpath = "//tr[@id='pid_1']/td[.='333-444-2222']")
    WebElement phoneNumber;

    @FindBy(xpath = "//tr[@id='pid_1']/td[.='1']")
    WebElement HomePageExternalId;

    @FindBy(xpath = "//tr[@id='pid_1']/td[.='333222333']")
    WebElement SSN;

    @FindBy (xpath = "//tr[@id='pid_1']/td[.='1972-02-09']")
    public WebElement DOB;




    public void searchPatient(String name){

        searchBox.sendKeys(name, Keys.ENTER);
    }

    public void searchBelford(WebDriver driver){
        patientClient.click();
        patientTab.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("fin");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(philName));
        philName.click();
    }

    public String getPhilPhoneNumber(WebDriver driver){
        patientClient.click();
        patientTab.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("fin");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(philName));
        return phoneNumber.getText().trim();
    }

    public String getPhilExternalId(WebDriver driver) {
        patientClient.click();
        patientTab.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("fin");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(HomePageExternalId));
        return HomePageExternalId.getText().trim();
    }

    public String getPhilSSN(WebDriver driver){
        patientClient.click();
        patientTab.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("fin");
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(SSN));
        return SSN.getText().trim();
    }

    public int getPhilAge(WebDriver driver){
        patientClient.click();
        patientTab.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("fin");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(DOB));
        return 2021-Integer.parseInt(DOB.getText().substring(0,4));
    }





}
