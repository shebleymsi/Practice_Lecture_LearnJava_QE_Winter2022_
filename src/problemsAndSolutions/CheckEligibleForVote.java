package problemsAndSolutions;

import java.util.Scanner;

public class CheckEligibleForVote {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age");
        int voterAge = input.nextInt();
        System.out.println("Enter your Gender");
        String gender = input.next();

        // else if means again if condition
        if (gender.equalsIgnoreCase("female") && voterAge >= 18) {
            System.out.println("Female are Eligible to vote");
        } else if (gender.equalsIgnoreCase("male") && voterAge >= 18) {
            System.out.println("Male are Eligible to vote");
        } else {
            System.out.println("You are not Eligible to vote");
        }
    }
}
