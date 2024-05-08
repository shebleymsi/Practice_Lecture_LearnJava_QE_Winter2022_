package unitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Hooks {


    @BeforeClass
    public static void kickStartTestProcess() {
        System.out.println("********************* Test Process start ******************");
    }
    @Before
    public void welcome() {
        System.out.println("Welcome to Test Automation");
    }


    @After
    public void goodBye() {
        System.out.println("Good Bye from Test Automation");
    }


    @AfterClass
    public static void endTestProcess() {
        System.out.println("********************* Test Process End ******************");
    }

}
