package dataStructure.collectionFramework.sort;

public class LearnInsertionSort {   // important for interview

    // Sort: filter data

    // Sort a lot of type: but as a QA we need bellow
    // 1. Insertion sort
    // 2. bubble sort
    // 3. Heap sort
    // 4. Quick sort
    // 5. Merge sort
    // 6. Bucket sort
    // 7. Selection sort
    // 8. No need for Interview 1 to 7 [ But if you are hungry to learn you can check them ]

    // Interview important
    // Arrays.sort it is a collection method we use, without that solve ...
    // ### here is a given Array, HOw to Sort it?
    // int [] numbers={12,34,56,78,99,800,33,450,98,700,23,0,7,9,4};


    public static void main(String[] args) {

        // int [] numbers={12,34,56,78,99,800,33,450,98,700,23,0,7,9,4};
        int[] numbers = {50, 20, 10}; // use for debug: v34 04.51.12
        // System.out.println(numbers[0]);
        // Output: 0 4 7 9 12 23 33 34 56 78 98 99 450 700 800

        for (int i = 0; i < numbers.length; i++) {

            int j = i - 1;
            int point = numbers[i];

            //   System.out.println(numbers[-1]); // -1 means index out of bound

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
