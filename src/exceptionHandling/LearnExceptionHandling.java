package exceptionHandling;

import java.sql.Driver;
import java.util.Scanner;

public class LearnExceptionHandling {

    // Exception Handling:
    // use try catch block
    // Syntax: try {  } catch(){      }
    // We only keep those line of code in try-catch block where will have possibility to exception in real life code
    // e.printStackTrace(); // should see the error message in console // v28 04.10.10

    public static void main(String[] args) {
        String message = "Welcome back after Eid Vacation";
        System.out.println(message.length());

        //  Thread.sleep(10000);

        System.out.println("Hello");


        try {
            int a = 34;
            int b = 0;
            int div = a / b;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Yahoo Arithmetic Exception : " + e.getMessage());
        }


        try {
            // try block: try to execute this block of code

            System.out.println(message.charAt(50));


        } catch (Exception exception) {
            // Throw a message inside catch block, so that you know the issue
            System.out.println("String index out of bounds exception : " + exception.getMessage());
            System.out.println("String index out of bounds exception : " + exception);
            // exception.printStackTrace();
        }


        // Class not found exception************************************************************************************
        // it's a dummy/wrong  example.  [ shebley ] // 01.57.00

//        try{
//          //  DemoMobile demoMobile= new DemoMobile();
//          //  Class.forName(Driver.class);
//            System.out.println("");
//        } catch (ClassNotFoundException e){
//            System.out.println("Class not found exception");
//        }


        //IOException***************************************************************************************************
//        try {
//            Scanner input=new Scanner(System.in);
//            System.out.println("Enter  your Age");
//            int age=input.nextInt();
//            System.out.println(age);
//        } catch (Exception e){
//            System.out.println(e);
//        }


        // null point exception*****************************************************************************************
//        try {
//            String name=null;
//            System.out.println(name.length());
//        } catch (Exception e){
//            System.out.println("Null point exception "+e);
//           // NullPointerException
//
//                    // java code 1st compile(source code) to byte code ==> compile time
//                    // then jvm interpret the byte code ==> runtime
//                    // then we see the output
//        }


        //Number format exception **************************************************************************************
        // please see the next: " LearnExceptionHandlingPractice{ } " ==> This class create by shebley

        String age = "34";
        Integer.parseInt(age);
        Integer.valueOf(age);
        System.out.println("using value of " + Integer.valueOf(age)); // age is string now

        int a = Integer.parseInt(age);
        int b = 44;
        int c = a + b;
        System.out.println(c); //
        System.out.println(Integer.parseInt(age));

        // ========================================================

        String number = " 777 ";
        int newNumber = Integer.valueOf(number.trim());

        try {
            System.out.println(newNumber);
            int myInt = Integer.valueOf(" 456 ");

            System.out.println(myInt);
        } catch (Exception e) {
            System.out.println("Number format exception " + e);
        }


        // Throws*******************************************************************************************************

        System.out.println(newNumber);
        //  int myInt= Integer.valueOf(" 888 ");
        //   System.out.println(myInt);
        // throw new NumberFormatException();

//         // Manually throw exception use throw=====//v29 02.56.46 ====================row 121 to 128
//        int age1=0;
//        if (age1==0){
//            System.out.println("Demo");
//            throw new NumberFormatException("This is Number format Exception ===>"); // "throw" you use it always last line in method
//            // we use "throw" here for throw a custom message only.
//        }

        //  throw new NumberFormatException("This is Number format Exception"); // "throw" you use it always last line in method


        System.out.println("**************************************");
        LearnExceptionHandling learn = new LearnExceptionHandling();
        //  learn.doDiv();
        learn.doDiv1();

    }

    Exception e; // use row 162


    public void doDiv() throws ArithmeticException {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception ===>");
        } finally {
            // finally block much have to execute
            System.out.println("Hello tajwar");


        }
        //   System.out.println("DDD"+this.e.getMessage()); // this approach is not work
        //   throw  new ArithmeticException("This is Arithmetic Exception :::::::::::::::"); // why not print here custom message, but print row 124
    }


    public void doDiv1() throws ArithmeticException {

        try {
            int a = 50;
            int b = 0;
            System.out.println("Adnan is tying to understand java");
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception ===> + ===>");

            int f = 30;
            int g = 66;
            int h = f + g;
            System.out.println(h);

            try {
                String name = "James";
                System.out.println(name.charAt(20));

            } catch (Exception e1) {
                System.out.println("Index out of bounds exception");

                try {

                } catch (Exception e3) {

                }

            }

        } finally {
            System.out.println("Hello Adnan");

            try { // can we create another try-catch block inside of try/catch/finally block? ==> yes
                int z = 30;
                // try to execute block of code
            } catch (Exception e4) {
                // if you find any exception in try block, catch it, and handle the exception
                // as well as execute any code // v29 03.20.42
            } finally {
                System.out.println("Hello SHEBLEY");
                // finally block much have to execute, if you put the rest of code
                // finally is a block, whatever you put , those code will execute
            }

        }

    }


}
