package unitTesting;


import org.junit.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo extends Hooks {

    //==================================== main() =========================================
    // we know that without main method java can not execute the code
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    //==================================== @Test/ main() =================================

    // if you use @Test annotation on top of any method then it will consider as a Test Method/ Test case method/ Test case
    // Test-case
    @Test
    public void display() {
        System.out.println("This is Display");
    }

    //================================== @Ignore =========================================
    @Test
    @Ignore // @Ignore for JUnit 4.13 and @Disabled for JUnit 5
    public void display1() {
        System.out.println("This is Display1");
    }

    //================================== (timeout = 500L) ===============================

    @Test(timeout = 500L)  //@Order()  // here, L = millisecond
    public void display4() {
        System.out.println("This is Display1");
    }

    // ================================ Exception handheld by JUnit =====================
    @Test(expected = FileNotFoundException.class)
    public void display5() {
        System.out.println("This is Display1");
    }
    // should watch:
    // https://youtu.be/3N7-pwSx-HA?si=eeCNwvVksTM-vm3a

    // ================================ commenting ======================================
    /**
     * This method is for displaying information
     * Author: Shebley
     */
    public void display3() {
        System.out.println("This is Display1");
    }

    // ================================ commenting =====================================
    /**
     * This method is for display purpose
     *
     * @param st Author: Shebley
     */

    public void display3(String st)  {
        System.out.println("This is Display1");
    }


    // ================================ Verification: =================================
    @Test
    public void doSum() {  // v36 05.21.00
        int a = 5;
        int b = 6;
        int c = a - b;
        System.out.println("Total " + c);
//        if (c  ==  11){
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test fail");
//        }
//      // c is actual result and 11 is expected result


        // instead of our if-else we can use "Verification"
        // without Verification a Test-case is called incomplete Test-case
        // Verification:
        Assert.assertEquals("Test fail", 11, c);
        // Assert.assertEquals("","","");
        // smart way to check (message, expected, actual)

    }


}
