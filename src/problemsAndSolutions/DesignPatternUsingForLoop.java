package problemsAndSolutions;

public class DesignPatternUsingForLoop {


    public static void main(String[] args) {


        designTriangle(5);


    }


    public static void designTriangle(int row) {
        for (int i = 0; i < row; i++) {

            // Inner loop for space
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            // for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.println();

        }


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
