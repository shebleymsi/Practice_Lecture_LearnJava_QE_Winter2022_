package controlflow;

public class LearnDoWhileLoop {

    //Do While Loop

    // Do while Loop execute at least one time first then it will check condition

    // do { code and iterator     } while( condition);


    public static void main(String[] args) {
        // First it will execute one time then it will check the condition
        // if condition is true then execute do block of the loop

//        int age = 22;
//        do {
//            // Execute this block of code
//            System.out.println("Hello");
//
//            age--; // To control loop
//        } while ( age>18   );


//        do {
//            // Execute this block of code
//            System.out.println("Hello");
//
//            age--; // To control loop
//        } while ( age>32   );

        System.out.println("*************************************");
        // LearnDoWhileLoop.wishOnBirthday1(24,"Ismat");
        System.out.println("*************************************");
        // LearnDoWhileLoop.wishOnBirthday(33,"Ahmed");

        System.out.println("*************************************");
//        boolean cakeIsAvailable = true;
//        do {
//            LearnDoWhileLoop.wishOnBirthday(20, "Ahmed");
//        } while (cakeIsAvailable = false);

        System.out.println("************* String cake name ************************");
        String cakeName = "chocolat mousse";
//        do {
//            LearnDoWhileLoop.wishOnBirthday(21, "Ahmed");
//        } while (cakeName == "Vanilla");

        do {
            LearnDoWhileLoop.wishOnBirthday(21, "Ahmed");

            //  cakeName="New";
            //   break;
        } while (cakeName == "chocolat mousse");   // execute unlimited times : SHEBLEY

        do {
            LearnDoWhileLoop.wishOnBirthday(21, "Ahmed");
        } while (cakeName.equalsIgnoreCase("chocolat mousse"));
    }

    public static void wishOnBirthday(int age, String name) {
        do {
            System.out.println("Happy birthday to " + name);
            age--;
        } while (age > 18);
    }

    public static void wishOnBirthday1(int age, String name) {
        do {
            System.out.println("Happy birthday to " + name);
            age--;
        } while (age > 18 && name.equalsIgnoreCase("Ahmed"));
    }
}
