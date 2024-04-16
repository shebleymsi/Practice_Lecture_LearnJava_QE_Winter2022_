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

    }


}
