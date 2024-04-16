package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {
    public static void main(String[] args) {
        LearnIfElseIf learn = new LearnIfElseIf();
        learn.doRetirementCalculation();
        learn.getGrade();
    }

    // "if else if"
    // "else if" means again condition
    // "else if" means again if condition
    // If the "if" condition is false then only "else" can execute

    public void doRetirementCalculation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age to get the Retirement Calculation");
        int age = input.nextInt();

        if (age >= 0 && age <= 40) {
            System.out.println("Your age is more/less than 24");
        } else if (age >= 40 && age <= 50) {
            System.out.println("Your age is more than 40");
        } else if (age >= 50 && age <= 64) {
            System.out.println("Your age is more/less than 60");
        } else {
            System.out.println("Your Age is eligible to get the Retirement Calculation");
        }
    }

    public void getGrade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score to get the Grade");
        double score = input.nextDouble();

        if (score >= 90) {
            System.out.println("You got A+");
        } else if (score >= 80) {
            System.out.println("You got B+");
        } else if (score >= 70) {
            System.out.println("You got B");
        } else if (score >= 60) {
            System.out.println("You got C");
        } else if (score >= 50) {
            System.out.println("You got D");
        } else {
            System.out.println("You are fail");
        }
    }
}
