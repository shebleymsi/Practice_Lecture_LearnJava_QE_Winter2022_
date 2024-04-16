package problemsAndSolutions;

public class DesignHeartUsingNestedForLoop {  // by naina, maybe it's not important // v28 00.44.32

    public static void main(String[] args) {
        heart();
    }

    public static void heart() {
//  first part of heart
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (2 - i + 1) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
