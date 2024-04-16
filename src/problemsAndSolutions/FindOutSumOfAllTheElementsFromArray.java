package problemsAndSolutions;

public class FindOutSumOfAllTheElementsFromArray {


    public static void main(String[] args) {
        int[] array = {23, 56, 88, 99, 45, 23, 12, 5, 990};

        sumOfElements(array);


    }

    public static void sumOfElements(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);

    }


}
