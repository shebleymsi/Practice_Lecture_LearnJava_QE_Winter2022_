package dataStructure.collectionFramework.sort;

public class LearnInsertionSort {
    // Sort: filter data
    // Insertion sort
    // bubble sort
    // Heap sort
    // Quick sort
    // Merge sort
    // Bucket sort
    // Selection sort





    public static void main(String[] args) {

        // int [] numbers={12,34,56,78,99,800,33,450,98,700,23,0,7,9,4};
        int[] numbers = {56,    12,    34,      66};
       // System.out.println(numbers[0]);
        // Output: 0 4 7 9 12 23 33 34 56 78 98 99 450 700 800

        for (int i = 0; i < numbers.length; i++) {

            int j = i - 1;
            int point = numbers[i];

            //   System.out.println(numbers[-1]);

            while (j >= 0 && numbers[j] > point) {

                numbers[j + 1] = numbers[j];
                j = j - 1;

            }

            numbers[j + 1] = point;

        }

        // To Iterate all the value from array
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }


    }


}
