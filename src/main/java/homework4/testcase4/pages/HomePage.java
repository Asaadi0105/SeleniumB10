package homework4.testcase4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='price']")
    List<WebElement> itemPrices;


    public List<String> geItemPrices() {
        List<String> prices = new ArrayList<>();
        for (WebElement itemPrice : itemPrices) {
           // if (itemPrice.getText() < 25) {
                prices.add(itemPrice.getText().trim());
            }
            return prices;
        }
    }
