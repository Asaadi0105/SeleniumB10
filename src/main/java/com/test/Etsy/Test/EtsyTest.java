package com.test.Etsy.Test;

import com.test.Etsy.Pages.EtsyHomePage;
import com.test.Etsy.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EtsyTest extends TestBase {

    @Parameters("item")
    @Test
    public void etsySearchTest(String item){
        EtsyHomePage homePage= new EtsyHomePage(driver);
        homePage.searchItem(item);
        Assert.assertTrue(homePage.validateTitle());

    }

    // homework: change validateTitle method implementation that will work with all the search values.
    // now it is working only with "java programming mug"

    @Test
    public void test() {
        EtsyHomePage homePage = new EtsyHomePage(driver);
        homePage.searchItem("winter clothes");
        Assert.assertTrue(homePage.validateTitle());
    }
}
