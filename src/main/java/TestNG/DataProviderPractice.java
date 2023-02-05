package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

    // Object object = new Object[2][3]; --> [1][1]
    @Test(dataProvider = "NameTest", dataProviderClass = Data.class)
    public void test(String name, String lastName, String expectedData) {
        String username = name;
        String lastname = lastName;

        String fullName = username + " " + lastname;

        Assert.assertEquals(fullName, expectedData);
    }
}
