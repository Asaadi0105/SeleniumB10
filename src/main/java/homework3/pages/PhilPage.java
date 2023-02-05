package homework3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhilPage {

    public PhilPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//h2[contains(text(),'Phil')]")
    WebElement philName;

    @FindBy(xpath = "//td[@id='text_pubpid']")
    public WebElement PatientDashboard;


    public String getPhilName(){
        return philName.getText().trim();
    }

    public String getPhilId(){

        return PatientDashboard.getText().trim();
    }

}
