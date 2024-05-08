package unitTesting;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestCalculator extends Hooks {

    // ============================================================================================================
    // testing without message for doSum1()
    @Test
    public void checkDoSum1() {
        int expectedResult = 68;
        int actualResult = Calculator.doSum1(24, 44);
        // Verify the result
        Assert.assertEquals(expectedResult, actualResult);

    }

    // Positive testing for doSum1()
    @Test
    public void checkDoSum2() {
        int expectedResult = 69;
        int actualResult = Calculator.doSum1(24, 45); // 24+45 = 69
        // Verify the result with failure message when testcase will be failed
        Assert.assertEquals("Total value does not match", expectedResult, actualResult);
    }

    // Negative testing for doSum1()
    @Test
    public void checkDoSum3() {
        int expectedResult = 70;
        int actualResult = Calculator.doSum1(24, 45); // 24+45 != 70
        // Verify the result
        Assert.assertNotEquals("Total value match", expectedResult, actualResult);
    }
    //===============================================================================================================
    //===============================================================================================================


    // Positive testing for getMulti1()
    @Test
    public void checkGetMulti1() {
        int expectedResult = 54000;
        int actualResult = Calculator.getMulti1(24, 45, 50);
        // Verify the result
        Assert.assertEquals("Total multiply value not match", expectedResult, actualResult);
    }

    // Negative testing for getMulti1()
    @Test
    public void checkGetMulti2() {  // shebley
        int expectedResult = 54001;
        int actualResult = Calculator.getMulti1(24, 45, 49);
        // Verify the result
        Assert.assertNotEquals("Total multiply value match", expectedResult, actualResult);
    }

    //===============================================================================================================
    //===============================================================================================================

    //**************************************************************************
    @Test
    public void checkIsPizzaAvailable1() {
        boolean actualResult = Calculator.isPizzaAvailable("Cheese", 'L', 35);
        // Verify the result
        Assert.assertTrue("Pizza is not available", actualResult);
    }

    @Test
    public void checkIsPizzaAvailable2() {  // shebley
        boolean actualResult = Calculator.isPizzaAvailable("Cheese", 'M', 35);
        // Verify the result
        Assert.assertFalse("Pizza is available", actualResult);
    }

    //**************************************************************************
    //**************************************************************************
    @Test
    public void checkIsPizzaAvailable3() {
        boolean expectedResult = true;
        boolean actualResult = Calculator.isPizzaAvailable("Cheese", 'L', 35);
        // Verify the result
        Assert.assertEquals("Pizza is not available", expectedResult, actualResult);

    }
    @Test
    public void checkIsPizzaAvailable4() {  // shebley
        boolean expectedResult = true;
        boolean actualResult = Calculator.isPizzaAvailable("Cheese", 'M', 35);
        // Verify the result
        Assert.assertNotEquals("Pizza is available", expectedResult, actualResult);

    }

    //**************************************************************************


}
