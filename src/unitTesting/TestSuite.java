package unitTesting;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(

        {
                Demo.class,
                TestCalculator.class,
                LearnUnitTesting.class

        }

)
public class TestSuite {

    // Test Suite means: group of multiple test case

//        @Before
//        public void welcome() {
//                System.out.println("Welcome to Test Automation");
//        }
//
//
//        @After
//        public void goodBye() {
//                System.out.println("Good Bye from Test Automation");
//        }
//
//        @BeforeClass
//        public static void kickStartTestProcess() {
//                System.out.println("********************* Test Process star ******************");
//        }
//
//        @AfterClass
//        public static void endTestProcess() {
//                System.out.println("********************* Test Process End ******************");
//        }


}
