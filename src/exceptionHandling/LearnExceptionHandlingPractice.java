package exceptionHandling;

public class LearnExceptionHandlingPractice {  // This class create by shebley


    // NumberFormatException:
    public static void main(String[] args) {

        String age = "34";
        int a = Integer.parseInt(age); // Here, this "Integer.parseInt(age)" help us to convert the "age" String to int
        int b = 44;
        int c = a + b;
        System.out.println(c); // check c for if converting int or not

        // ==================================================================

        Integer.parseInt(age); // Integer from wrapper class
        System.out.println("using parse Int " + Integer.parseInt(age));

        Integer.valueOf(age);
        System.out.println("using value of " + Integer.valueOf(age));

        //  raiseNumberFormatException(), useValueOfTrim(), useValueOf() or useParseOf(), method calling

        LearnExceptionHandlingPractice.useValueOf();
        LearnExceptionHandlingPractice.useValueOfTrim();
        LearnExceptionHandlingPractice.useParseOf();
        //  LearnExceptionHandlingPractice.raiseNumberFormatException(); // if I put this method before the other method, why not execute others?


    }

    // NumberFormatException:
    public static void raiseNumberFormatException() {
        String number = " 777 ";
        int newNumber = Integer.valueOf(number);
        System.out.println(newNumber);

    }

    // in this situation two-way we can handle NumberFormatException:
    // 1. use trim() ==> if before and after have space remove by this
    // 2. use try-catch
    // 3. Use throws, but best practice is use try-catch


    // 1. use trim() to handle NumberFormatException
    public static void useValueOfTrim() {
        String number1 = " 777 ";
        int newNumber1 = Integer.valueOf(number1.trim());
        System.out.println(newNumber1);

    }

    // 2. use try-catch to handle NumberFormatException use ValueOf()
    public static void useValueOf() {
        String number2 = " 777 "; // Input string with leading/trailing whitespaces
        try {
            int newNumber2 = Integer.valueOf(number2);
            System.out.println(newNumber2);
        } catch (Exception e) {
            System.out.println("Number format exception: " + e.getMessage());
        }

    }

    // or, 2. use try-catch to handle NumberFormatException use ParseOf()
    public static void useParseOf() {
        String age1 = " 40 ";
        try {
            int newAge1 = Integer.parseInt(age1);
            System.out.println(newAge1);
        } catch (Exception e) {
            System.out.println("Number format exception: " + e.getMessage());
        }

    }
}


