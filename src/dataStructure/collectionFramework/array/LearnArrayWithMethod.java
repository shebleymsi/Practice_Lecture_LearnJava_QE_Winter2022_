package dataStructure.collectionFramework.array;

import java.util.Arrays;

public class LearnArrayWithMethod {

    // Advance use case of array with method

    public static void main(String[] args) {


        // part:1 method call ==========================================================================================
        // getNumbers(); // don't print anything, need sout
        System.out.println(getNumbers().toString()); // directly this way we can not print value

        getNumbers().toString();


        // print array by particular value by index number
        int[] newNumber = getNumbers();
        System.out.println(newNumber[0]);
        System.out.println(getNumbers()[1]);

        // print all the value of array use for loop,
        // In output return all value of an array
        for (int i = 0; i < getNumbers().length; i++) {
            System.out.print(getNumbers()[i] + " ");
        }

        // another way to print array: In output return as an array
        System.out.println();
        System.out.println("=============New========================================");
        System.out.println(Arrays.toString(getNumbers()));

        // row:16 & 14 directly this way we can not print value [v32 02.47.50]
        System.out.println(getNumbers().toString().toCharArray());


        System.out.println("=======+++++++==========================================");
        int[] num1 = {34, 56, 77};
        String[] num2 = {"44", "55", "88"};
        System.out.println(getAsStringFromArray(num1));
        //  System.out.println( getAsStringFromArray(num2));
        //=================, part:1 done ===============================================================================


        System.out.println("+++++++++++++++ getting array value individually+++++++");
        printArrayElementIndividually();
        System.out.println();

        System.out.println("+++++++++++++++ Minimum +++++++++++++++++++++++++++++++");
        // dynamic/reusable code purpose array declare & assign value here
        int[] numbers = new int[]{130, 13, 14, 56, 7, 66, 77, 1, 88, 99, 11};
        minimumValue(numbers);

        System.out.println("+++++++++++++++ Lowest Number +++++++++++++++++++++++++");
        findOutLowestNumberFromArrayUsingSort();

        System.out.println("+++++++++++++++ Third Largest Number ++++++++++++++++++");
        findOutThirdLargestNumberFromArrayUsingSort();

        System.out.println("++++++++++++++  Largest Number using sort +++++++++++++");
        findOutLargestNumberFromArrayUsingSort();

        System.out.println("+++++++++++++++ Largest Number ++++++++++++++++++++++++");
        findOutLargestNumberFromArrayElement();

        System.out.println("+++++++++++++++  Maximum Number +++++++++++++++++++++++");
        maximumValue();

    }


    // =================lecture start from here, part:1 ================================================================


    // return integer type of Array
    public static int[] getNumbers() {

        //   int [] num= new int[3]; // if declare the length/size. then need assign value separately

        //   int [] num= new int[]{ 34,56,77}; // declare and assign value in same line together
        /* "new" keyword we use initialize object. here we are creating reference variable of an array,
        Example: we declare it's "num", initialize the value above statement, so we use "new" keyword.
        */

        int[] numbers = new int[]{13, 14, 56, 66, 77, 88, 99}; // assign value in same line
        return numbers;
    }


    // create below type method onetime, then use lifetime, re-usable method
    // coz parameter is changeable. example: row: 38
    // reusable method, any integer type of array you convert String
    public static String getAsStringFromArray(int[] arg) { // print any array
        return Arrays.toString(arg);
    }


    // pass multiple parameter
    public static String getAsStringFromArray1(int... arg) { // print any array with multiple data-type
        return Arrays.toString(arg);
    }


    // general approach of return integer type of data
    public static int getNumber() {
        int number = 30;
        return number;
    }
    //=================, part:1 done and call method in main method ====================================================



    //=================================================group practice Here =============================================



    // Getting array value individually [v32 02.49.00]
    public static void printArrayElementIndividually() {
        int[] numbers = new int[]{13, 14, 56, 66, 77, 88, 99};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(getNumbers()[i] + " ");
        }
    }


    // minimum value from an array [ debug:03.00.00 ]
    public static void minimumValue(int[] numbers) {
        // hard-coded(not-dynamic) code purpose array declare & assign value here
        // int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            // when debug please uncomment bellow statement
            // print all value one by one
            // System.out.println("Minimum value "+min);
        }
        System.out.println("Minimum value " + min);

    }


    // find Out the Lowest-Number From Array Using Sort(value lowest to highest) [v32 03.12.00]
    public static void findOutLowestNumberFromArrayUsingSort() {
        int[] numbers = new int[]{130, 13, 14, 56, 7, 66, 77, 1, 88, 99, 11};
        Arrays.sort(numbers);
        System.out.println("Sorted Array(ascendance): " + Arrays.toString(numbers));
        // before use bellow statement we have to sorted
        // after sorted index[0] position's fill by lowest value, Example: numbers[0]
        System.out.println("Lowest Number : " + numbers[0]);
    }


    // find Out the Third-Largest Number From Array Using Sort(value lowest to highest) [v32 03.18.33]
    public static void findOutThirdLargestNumberFromArrayUsingSort() {
        int[] numbers = new int[]{130, 13, 14, 56, 7, 66, 77, 1, 88, 99, 11};
        int size = numbers.length;
        Arrays.sort(numbers);
        System.out.println("Sorted Array(ascendance): " + Arrays.toString(numbers));
        // before use bellow statement we have to sorted
        int thirdLargest = numbers[size - 3]; // 11 - 3 = 8 ==> 1
        System.out.println("Third Largest Number : " + thirdLargest);
    }


    // find Out the Largest-Number From Array Using Sort(value lowest to highest) [v32 03.26.00]
    public static void findOutLargestNumberFromArrayUsingSort() {
        int[] numbers = new int[]{130, 13, 14, 56, 7, 66, 77, 1, 88, 99, 11};
        int size = numbers.length;
        Arrays.sort(numbers);
        System.out.println("Sorted Array(ascendance): " + Arrays.toString(numbers));
        // before use bellow statement we have to sorted
        int largest = numbers[size - 1];
        System.out.println("Third Largest Number : " + largest);
    }


    // ***find Out the Largest-Number From Array Element use for-loop [ v32 03.31.00, & debug: 03.40.21]
    public static void findOutLargestNumberFromArrayElement() {
        int[] numbers = new int[]{2, 99, 130, 13, 140, 56, 7, 66, 77, 1, 88, 99, 11};
        int size = numbers.length;

        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            //  System.out.println("Largest Number "+temp); // debug time uncomment
        }
        System.out.println("Largest Number " + temp);
    }


    // ***find Out the maximum Value [v32 03.55.34]
    public static void maximumValue() {
        int[] numbers = new int[]{130, 103, 14, 56, 700, 66, 77, 1, 88, 999, 11};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            //   System.out.println("Minimum value "+max); // debug time uncomment
        }
        System.out.println("Maximum value " + max);

    }


}
