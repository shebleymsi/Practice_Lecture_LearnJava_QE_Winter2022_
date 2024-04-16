package loop;

public class LearnForLoop {

    // Learn For Loop:
    // for (  entryPoint/StartPoint;   condition/ EndPoint ; increment++ / Decrement--         ){  code   }
    // if for loop condition is not true then loop will exit from execution

    public static void main(String[] args) {

        for (int i = 3; i < 9; i++) {
            System.out.println("Hello");
        }

        // if for loop condition is not true then loop will exit from execution

        for (int i = 9; i < 9; i++) {
            System.out.println("Yahoo");
        }

        System.out.println("*********************************************");
        LearnForLoop learn = new LearnForLoop();
        //  learn.display();

//        for (int i = 0; i < 6; i++) {
//          learn.display();
//          System.out.println("Number of " + i);
//        }


        System.out.println("******************* Decrement Operator **************************");

//        for (int i = 10; i > 6; i--) {
//            System.out.println("Number of " + i);
//        }
//
//        for (int max = 7; max < 12; max++) {
//            System.out.println("This is for Husna");
//        }


        System.out.println("******************* Pre Increment and Pre Decrement Operator **************************");

//
//        for (int max = 7; max < 12; ++max) {
//            System.out.println("This is for Husna");
//        }

//        for (int max = 17; max > 12; max--) {
//            System.out.println("This is for Husna");
//          max--;
//        }

//        for (int max = 17; max > 12; max=-2   ) {
//            System.out.println("This is for Husna");
//
//        }


        for (int max = 17; max > 12; max--) {  // industries highly use its
            System.out.println("This is for Husna");

        }

        for (int max = 17; max > 12; max -= 1) {
            System.out.println("This is for Husna");

        }

        for (int max = 17; max > 12; max -= 2) {
            System.out.println("This is for Husna");

        }

        for (int max = 17; max > 12; max--) {
            System.out.println("This is for Husna");
            max--;
        }

        // Unary plus: +
        // Unary minus: -

        int a = 5;
        int b = 3;
        b += 9;   // 3 + 9, b=b+9
        System.out.println(b);
        b -= 17; //  12 -17, b=b-17
        System.out.println(b);


    }


    public void display() {
        System.out.println("This is Display");
    }


}
