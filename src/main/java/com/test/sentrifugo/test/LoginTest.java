package com.test.sentrifugo.test;

import com.test.sentrifugo.TestBase;
import com.test.sentrifugo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateSuperAdmin() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("EMO1","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");

    }

    @Test
    public void validateManagement(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("EMO2","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");

    }

    @Test
    public void validateManager(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("EMO3","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");

    }
}
