package TestNG;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider(name = "NameTest")
    public Object[][] getData() {

        return new Object[][]{
                {"David", "Hunt", "David Hunt"},
                {"Priyanka", "Garla", "Priyanka Garla"},
                {"Samer", "Jain", "Samer Jain"},
                {"Kushal", "Puri", "Kushal Puri"},
                {"Ajeesh", "Damo", "Ajeesh Damo"},

        };
    }
}
