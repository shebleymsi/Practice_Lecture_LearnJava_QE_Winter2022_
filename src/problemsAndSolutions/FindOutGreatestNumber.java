package problemsAndSolutions;

public class FindOutGreatestNumber {

    // Given Three numbers are 35,78,87
    // Find Out Greatest Number


    public static void main(String[] args) {

        int num1 = 35, num2 = 78, num3 = 87;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number");
        }
        if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2 + " is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }


    }


}
