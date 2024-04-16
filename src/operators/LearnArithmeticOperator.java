package operators;

public class LearnArithmeticOperator {

    // Arithmetic Operator:

    // + Additive operator
    // - Subtraction operator
    // * Multiplication Operator
    // / Division operator
    // % Remainder Operator

    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 60;

        int sum = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int division = num1 / num2;
        int remain = num1 % num2;

        // 10 /3    Result 3 and remainder is 1

        System.out.println("Summation value is " + sum);
        System.out.println("Subtraction value is " + sub);
        System.out.println("Multiplication value is " + multi);
        System.out.println("Division value is " + division);
        System.out.println("Remainder value is " + remain);
    }

    public static void logics() {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }

}
