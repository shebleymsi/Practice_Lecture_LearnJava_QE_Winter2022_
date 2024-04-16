package basic;

import java.util.Scanner;

public class DoingSomeMath {


    public static void main(String[] args) {

        int number1 = 40;
        int number2 = 50;
        int total = number1 + number2;
        System.out.println("Total value " + total);

        double multi = number1 * number2;
        System.out.println("Multipliyed value " + multi);


        // use Scanner [ Msi ]
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value1 : ");
        int numberValue1 = input.nextInt();

        System.out.print("Enter value2 : ");
        int numberValue2 = input.nextInt();

        int sum = numberValue1 + numberValue2;
        System.out.println("Total value " + sum);

        double multiple1 = numberValue1 * numberValue2;
        System.out.println("Multiply value " + multiple1);

    }

}
