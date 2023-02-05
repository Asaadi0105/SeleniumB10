package homework3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    /*
    Navigate to "https://demo.openemr.io/a/openemr/interface/login/login.php?site=default"
Enter username "admin"
Enter password "pass"
Search the "Phil Belford" from the search box under thepatient finder
Validate Name
Validate Phone Number
Validate SSN number
Validate external ID are matching in Home page and PatientDashboard
Validate DOB is displayed
Validate age is correct according to the DOB of patient
     */


    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.openemr.io/a/openemr");
    }
}
