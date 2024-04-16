package debug;

public class LearnDebugging {

    // Debugging:
    // QA/ QE/ Software Tester
    // study 20 hours on Debugging
    // Debugging: De + Bugging ==> Bug/ Defect/ Error
    // Identify the logical error in code
    // Logical Error

    public static void main(String[] args) {

        //Error: is called syntax error
        System.out.println("hello");

        int num1 = 40;
        int num2 = 50;
        int total = num1 - num2;
        System.out.println("Summation of two value :" + total);

        Calculator.result();

        reverseTriangle(7);

    }

    // This will show in lecture_30 00.14.23
    public static void reverseTriangle(int rowNum) {
        for (int i = rowNum; i >= 1; i--) {
            for (int k = i; k >= 1; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
