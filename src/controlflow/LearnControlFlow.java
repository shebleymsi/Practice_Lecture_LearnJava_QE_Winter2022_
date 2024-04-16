package controlflow;

import java.util.Scanner;

public class LearnControlFlow {

    // Control flow will help us to make the decision and give the direction to move forward


//    if
//
//    // Expected Result and Actual result not match
//
//          Do
//    // Create a defect
//
//
//    else
//    // Expected Result and Actual result match
//
//    do
//    // will not Create a defect


    // Control Flow using if else


    // if the condition is true then if block of code will execute
    // if the condition is false then if block of code will not execute
    // if the condition is false then else block of code will execute

    // Condition :

    static int number = 5; // Assign value
    // = is called assignment operator
    // == is called Equal operator

    //   number ==    6;
    // 5 == 6  false
    // number == 5; True

    static String name = "James";
    static int age = 45;


    // if (  condition   ) {   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();

        if (number == num) {
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");

        } else {

            System.out.println("value does not match");

        }

        System.out.println("*****************************************************************");

//        if (name == "Bob") {
//            System.out.println("This is BOB");
//        }
//
//        if (name == "James")
//            System.out.println("This is James");
//
//
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");

        System.out.println("*****************************************************************");


//        if (name == "james") {
//            System.out.println("This is james");
//
//        }
//
//
//
//        if (name.equalsIgnoreCase("james")) {
//            System.out.println("This is new james");
//
//        }


        System.out.println("*****************************************************************");


//        if (age == 35) {
//            System.out.println("Your age is 35");
//        }
//        if (age== 45){
//            System.out.println("Your age is 45");
//        }
//        if (age== 55){
//            System.out.println("Your age is 55");
//        }
//        if (age== 65){
//            System.out.println("Your age is 65");
//        }

        System.out.println("********************** Grater and Less *******************************************");


//        if (age > 35) {
//            System.out.println("Your age is grater than 35");
//        }
//        if (age <= 45) {
//            System.out.println("Your age is less equal 45");
//        }
//        if (age < 55) {
//            System.out.println("Your age is 55");
//        }
//        if (age > 65) {
//            System.out.println("Your age is 65");
//        }


        System.out.println("********************** Scanner and compare *******************************************");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name1 = input.nextLine();
//        if (name1.equalsIgnoreCase("Bob")) {
//            System.out.println("This is Bob");
//        }
//        if (name1.equalsIgnoreCase("Ahmed")){
//            System.out.println("This is Ahmed");
//        }
//        if (name1.equalsIgnoreCase("Tauseef")){
//            System.out.println("This is Tauseef");
//        }
//        if (name1.equalsIgnoreCase("Naina")){
//            System.out.println("This is Naina");
//        }
//        if (name1.equalsIgnoreCase("Tayaab")){
//            System.out.println("This is Tayaab");
//        }


        System.out.println("********************** Scanner and compare Age *******************************************");

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your Age");
//        int voterAge = input.nextInt();
//        System.out.println("Enter your Gender");
//        String gender = input.next();
//
//        // else if means again if condition
//        if (gender.equalsIgnoreCase("female") && voterAge >= 18) {
//            System.out.println("Female are Eligible to vote");
//        } else if (gender.equalsIgnoreCase("male") && voterAge >= 18) {
//            System.out.println("Male are Eligible to vote");
//        } else {
//            System.out.println("You are not Eligible to vote");
//        }


        System.out.println("********************** Scanner and compare Age *******************************************");

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your Age");
//        int voterAge = input.nextInt();
//        System.out.println("Enter your Gender");
//        String gender = input.next();
//
//        if (gender.equalsIgnoreCase("female") || voterAge >= 18) {
//            System.out.println("You are Eligible to vote");
//        } else if (gender.equalsIgnoreCase("male") || voterAge >= 18) {
//            System.out.println("You are Eligible to vote");
//        } else {
//            System.out.println("You are not Eligible to vote");
//        }


    }


}
