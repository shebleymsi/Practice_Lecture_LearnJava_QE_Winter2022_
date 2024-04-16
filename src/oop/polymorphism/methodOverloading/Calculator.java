package oop.polymorphism.methodOverloading;

import java.util.Scanner;

public class Calculator {

    // Method Over Loading : happen Compile time
    // Method name should be same : Pattern/ signature type is making difference


    // *************************************** Integer and return type of method ***************************************

    // add two number
    public static int doSum(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total " + total);
        return total;
    }

    // add two number, same method name as previous method but different signature.
    public static int doSum(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println("Total " + total);
        return total;
    }

    // add four number, same method name as previous all method but different signature.
    public static int doSum(int num1, int num2, int num3, int num4) {
        int total = num1 + num2 + num3 + num4;
        System.out.println("Total " + total);
        return total;
    }


    // ******************************* String and void/ non-return type of method***************************************

    public static void studentInfo(String firstName, String lastName) {
        System.out.println("Student First Name : " + firstName + " Last Name " + lastName);
    }

    public static void studentInfo(String firstName, String lastName, String address) {
        System.out.println("Student First Name : " + firstName + " Last Name " + lastName + " Address : " + address);
    }

    public static void studentInfo(String firstName, String lastName, String address, int age) {
        System.out.println("Student First Name : " + firstName + " Last Name " + lastName + " Address : " + address + " Age : " + age);
    }


    public static void main(String[] args) {

        doSum(22, 33);            // call by class name, same class don't need write class name
        doSum(44, 55, 66);
        doSum(144, 155, 166, 177);


        studentInfo("Tajwar", "Hamid");
        studentInfo("Nadia", "Eti", "Queens,NY");
        studentInfo("Rajib", "Deb", "Jamaica,NY", 25);


    }


}
