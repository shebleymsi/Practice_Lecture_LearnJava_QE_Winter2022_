package unitTesting;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {

    @Test
    public void testSuiteRunner(){
        Result result= JUnitCore.runClasses(TestSuite.class);
        for (Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Result ==== "+result.wasSuccessful());

        // if all the Test case will pass then result will be "true"
        // if Single Test case is fail among all then the result will be "false"
        // in output/console intelliJIDEA mentioned how many of them are fail and who are them.
        // Fail test cases are comes all the way bottom in console and  mentioned why they are failed
        // if test case are pass intelliJIDEA mentioned them all the way top of console.


    }


}
