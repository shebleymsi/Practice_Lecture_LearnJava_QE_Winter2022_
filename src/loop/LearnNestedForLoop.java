package loop;

public class LearnNestedForLoop {

    // user will give input and make a right triangle

    // output
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *


    public static void main(String[] args) {

        rightTriangle(5);
        reverseTriangle(5);

//        int age=50;
//
//       // if( age<55 ){
//       for( int k=age; k<55; k++ ){
//
//
//            for (int i=0; i<9;i++){
//                System.out.println("Hello");
//            }
//
//        }


    }


    public static void rightTriangle(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            // parent for loop
            for (int j = 1; j <= i; j++) {
                // child/ nested for loop
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }


    }


    public static void reverseTriangle(int rowNum) {
        for (int i = rowNum; i >= 1; i--) {
            for (int k = i; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }


}
