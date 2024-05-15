package unitTesting;

public class Calculator {


    // Objective: in this class total 18 methods, we want to unit test all of these methods
    // so lets we create a brand-new class "TestCalculator.java" to test the "Calculator.java" Class


    public static int doSum1(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total value " + total);
        return total;
    }

    public void doSum2(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println("Total value " + total);
    }


    public void doSubtraction(double num1, double num2, double num3) {
        double sub = num1 - num2 - num3;
        System.out.println("Subtraction value " + sub);
    }

    public void doSubtraction1(double num1, double num2, double num3, double num4) {
        double sub = num1 - num2 - num3 - num4;
        System.out.println("Subtraction value " + sub);
    }


    public int doSummation() {
        System.out.println("This is Do summation Method");
        int number1 = 20;
        int number2 = 30;
        int total = number1 + number2;
        System.out.println("Total value is " + total);
        return total;
    }

    public int doSummation1() {
        System.out.println("This is Do summation Method");
        int number1 = 20;
        int number2 = 30;
        System.out.println("Total value is " + number1 + number2);
        return number1 + number2;
    }

    public double doMultiplication() {
        double num1 = 56;
        int num2 = 44;
        double multi = num1 * num2;
        // System.out.println("Multiplication value "+multi);
        System.out.println("Multiplication value " + num1 * num2);
        return num1 * num2;
    }

    public String getStudentInformation() {
        String fName = "James";
        String lName = "William";

        String fullName = fName + " " + lName;
        System.out.println("Full Name " + fullName);
        return fullName;
    }

    public static boolean isPizzaAvailable() {
        boolean isAvailable = true;

        System.out.println("Pizza availability " + isAvailable);
        return isAvailable;
    }

    public String getStudentInfo(String name) {
        // String name = "james";
        System.out.println("Student Name " + name);

        return name;
    }


    public double doSummation(double num1, double num2) {
        return num1 + num2;
    }

    public double doSummation1(double num1, double num2, double num3) {
        System.out.println("Summation value " + (num1 + num2 + num3));
        return num1 + num2 + num3;
    }

    public double doSummation2(double num1, double num2, double num3, double num4) {
        System.out.println("Summation value " + (num1 + num2 + num3 + num4));
        return num1 + num2 + num3 + num4;
    }

    // signature pattern

    public double doSummation2(double num1, double num2, double num3, double num4, double num5) {
        System.out.println("Summation value " + (num1 + num2 + num3 + num4 + num5));
        return num1 + num2 + num3 + num4 + num5;
    }


    public int getMulti(int num1, int num2) {
        return num1 * num2;
    }

    public static int getMulti1(int num1, int num2, int num3) {
        int total = num1 * num2 * num3;
        System.out.println("Total : " + total);
        return total;
    }


    public static boolean isPizzaAvailable(String pizzaName, char size, int price) {

        char pizzaSize = size;
        double pizzaPrice = price;

        // if large size pizza is available then say yes else say no

        // Note: In math equal sign is " = " but in java equal sign is " == " / equality operator
        // Note: In java mathematics_equal sign is " = " called assignment operator

        if (pizzaSize == 'L') {
            System.out.println("yes L size " + pizzaName + " pizza is available");

        } else {
            System.out.println(pizzaSize + " size " + pizzaName + " pizza is not available");
        }

        return pizzaSize == 'L';
    }


    public boolean isPizzaAvailable1(String pizzaName, char size, int price, boolean isAvailable) {
        System.out.println(pizzaName + " " + size + " Size pizza Price " + price + " availability " + isAvailable);
        return isAvailable;
    }


}
