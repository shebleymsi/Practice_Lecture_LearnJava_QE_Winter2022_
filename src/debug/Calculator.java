package debug;

public class Calculator {

    public static int doSummation() {
        int num1 = 45;
        int num2 = 46;
        int total = num1 + num2;
        System.out.println("Total value " + total);
        return total;
    }

    public static int doDivision() {
        int num1 = 45;
        int num2 = 46;
        int div = num1 / num2;
        System.out.println("Division Result " + div);
        return div;
    }

    public static void result() {
        int num1 = doSummation();
        try {
            int num = doDivision();
            int salary = 6000;
            double total = (num1 + salary) / num;
            System.out.println("Total salary is " + total);
        } catch (Exception e) {
            System.out.println("Arithmetic exception" + e.getMessage());
        }
    }

}
