package debug;

import java.util.Scanner;

public class CalculatorPractice {

    // Dedicated to Sharif [cc:Sharif]. [ shebley ]
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double val1 = 0;
        double val2 = 0;
        System.out.println("Calc online. :   ");
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            String[] values = input.split("\\s+");
            val1 = Double.valueOf(values[0]);
            val2 = Double.valueOf(values[2]);
            String operator = values[1];

            // Input Example as user: 5 + 5, 8 - 8, 3 * 3, 10 / 10.

            switch (operator) {
                case "+":
                    System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
                    break;
                case "-":
                    System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
                    break;
                case "*":
                    System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
                    break;
                case "/":
                    try {
                        System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        if (val2 == 0) {
                            System.out.println("You can't divide integer by 0, Please try again.");
                        }
                    }
                    break;
                default:
                    System.out.println("Input a valid operator");

            }

        }

    }

}
