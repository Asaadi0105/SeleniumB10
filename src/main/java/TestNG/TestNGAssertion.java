package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
    // create one method that takes two parameters as Integer and returns the multiplication of thee two method
    public int multiplication(int a, int b) {
        int multi = a * b;
        return multi;
    }

    @Test
    public void validateMulti() {

        int result = multiplication(-2, 4);
        int expected = -8;
        Assert.assertEquals(result, expected, "it is for -2 and 4");

    }

    @Test
    public void validateZero() {
        int result = multiplication(3, 0);
        int expected = 0;
        Assert.assertEquals(result, expected, "it is for 3 and 0");
    }

    @Test
    public void validatePositiveTesting() {
        int result = multiplication(2, 3);
        Assert.assertTrue(result == 6);
    }

    @Test
    public void validateNigative() {
        int result = multiplication(-2, -3);
        int expected = 5;
        Assert.assertEquals(result, expected);
        // when assert fails the next line will not be executed
        // This is called hard assert --> it will throw an exception right away
        System.out.println("Negative test");

    }

}
