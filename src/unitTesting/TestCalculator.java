package unitTesting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestCalculator extends Hooks{


    @Test
    public void checkDoSum1() {
        int expectedResult = 68;
        int actualResult = Calculator.doSum1(24, 45);
        // Verify the result
        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void checkDoSum2() {
        int expectedResult = 69;
        int actualResult = Calculator.doSum1(24, 45);
        // Verify the result
        Assert.assertEquals("Total value does not match", expectedResult, actualResult);
    }

    // Negative testing
    @Test
    public void checkDoSum3() {
        int expectedResult = 70;
        int actualResult = Calculator.doSum1(24, 45);
        // Verify the result
        Assert.assertNotEquals("Total value match", expectedResult, actualResult);
    }

    @Test
    public void checkGetMulti1() {
        int expectedResult = 54001;
        int actualResult = Calculator.getMulti1(24, 45, 50);
        // Verify the result
        Assert.assertEquals("Total multiply value not match", expectedResult, actualResult);
    }

    @Test
    public void checkIsPizzaAvailable() {
        //  boolean expectedResult = true;
        boolean actualResult = Calculator.isPizzaAvailable("Cheese", 'L', 35);
        // Verify the result
        //   Assert.assertEquals("Pizza is not available",expectedResult,actualResult);
        Assert.assertTrue("Pizza is not available", actualResult);
    }


}
