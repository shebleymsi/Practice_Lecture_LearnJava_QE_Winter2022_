package problemsAndSolutions;

import java.util.Scanner;

public class DetermineIncreaseDecreaseOrder {

    // write a program that accept three numbers from the user and prints "Increasing" if the numbers are in increasing order
    // prints "Decreasing" if the numbers are in decreasing order
    // prints "nether Increasing or Decrease order" if it's not match with increase or decrease order
    // Test Data:
    // Input First number : 2345
    // Input Second number : 7888
    // Input third number : 234

    // 23,45,66 Increasing order
    // 77,55,33 Decreasing order

    public static void main(String[] args) {
        findOutIncreaseDecreaseOrder();


    }

    public static void findOutIncreaseDecreaseOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing Order");
        } else {
            System.out.println("nether Increasing or Decrease order");
        }
    }


}
