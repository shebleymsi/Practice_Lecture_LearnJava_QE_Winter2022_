package unitTesting;


import org.junit.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo extends Hooks {


//    public static void main(String[] args) {
//        System.out.println("Hello");
//    }


    // if you use @Test annotation on top of any method then it will consider as a Test Method/ Test case method/ Test case

    @Test
    @Ignore
    public void display() {
        System.out.println("This is Display");
    }


    @Test
    public void display1() {
        System.out.println("This is Display1");
    }

    @Test(timeout = 500L)  //@Order()  // here, L = millisecond
    public void display4() {
        System.out.println("This is Display1");
    }

    @Test(expected = FileNotFoundException.class)
    public void display5() {
        System.out.println("This is Display1");
    }


    /**
     * This method is for displaying information
     * Author: Mahmud
     */
    public void display3() {
        System.out.println("This is Display1");
    }


    /**
     * This method is for display purpose
     *
     * @param st Author: Mahmud
     */
    public void display3(String st) {
        System.out.println("This is Display1");
    }


    @Test
    public void doSum() {
        int a = 5;
        int b = 6;
        int c = a - b;
        System.out.println("Total " + c);
//        if (c  ==  11){
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test fail");
//        }

        // Verification
        Assert.assertEquals("Test Fail", 11, c);
        // Assert.assertEquals("","","");


    }


}
