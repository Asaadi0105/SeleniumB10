package com.test.orangehrm.data;

import org.testng.annotations.DataProvider;

public class UserRoles {
    @DataProvider(name = "role")
    public Object[][] getRoles(){
        return new Object[][]{
                {"Admin"},
                {"ESS"}
        };
    }
}
