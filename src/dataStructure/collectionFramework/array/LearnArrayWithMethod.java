package dataStructure.collectionFramework.array;

import java.util.Arrays;

public class LearnArrayWithMethod {

    public static void main(String[] args) {

       // getNumbers();
        System.out.println(getNumbers().toString());

        getNumbers().toString();

        int [] newNumber= getNumbers();
        System.out.println(newNumber[0]);

        System.out.println(getNumbers()[1]);


        for (int i = 0; i < getNumbers().length; i++) {
            System.out.print(getNumbers()[i]+" ");
        }

        System.out.println();
        System.out.println("=============New====================");
        System.out.println(Arrays.toString(getNumbers()));


        System.out.println(getNumbers().toString().toCharArray());






        System.out.println("=======+++++++==========================");
         int [] num1= {34,56,77};
         String [] num2= {"44","55","88"};

      System.out.println( getAsStringFromArray(num1));
      //  System.out.println( getAsStringFromArray(num2));


        System.out.println("++++++++++++++++++++++++++++++++++++");

        printArrayElementIndividually();
        System.out.println();
        System.out.println("++++++++++++++Minimum++++++++++++++++++++++");
        int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
        minimumValue(numbers);

        System.out.println("+++++++++++++++ Lowest Number +++++++++++");

        findOutLowestNumberFromArrayUsingSort();
        System.out.println("+++++++++++++++ Third Largest Number +++++++++++");
        findOutThirdLargestNumberFromArrayUsingSort();
        System.out.println("+++++++++++++++  Largest Number using sort +++++++++++");
        findOutLargestNumberFromArrayUsingSort();
        System.out.println("+++++++++++++++  Largest Number +++++++++++");
        findOutLargestNumberFromArrayElement();
        System.out.println("+++++++++++++++  Maximum Number +++++++++++");
        maximumValue();

    }




    public static int[] getNumbers(){
     //   int [] num= new int[]{ 34,56,77     };
        int [] numbers =new int[]{13,14,56,66,77,88,99 };
        return numbers;
    }


    public static String getAsStringFromArray(int[] arg){
        return Arrays.toString(arg);
    }



    public static int getNumber(){
        int number=30;
        return number;
    }



    public static void printArrayElementIndividually(){
        int [] numbers =new int[]{13,14,56,66,77,88,99 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(getNumbers()[i]+" ");
        }
    }



    public static void minimumValue(int [] numbers){
       // int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
        int min=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (min>numbers[i]){
                min=numbers[i];
            }
         //   System.out.println("Minimum value "+min);
        }
        System.out.println("Minimum value "+min);

    }


public static void findOutLowestNumberFromArrayUsingSort(){
    int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
    Arrays.sort(numbers);
    System.out.println("Sorted Array : "+Arrays.toString(numbers));
    System.out.println("Lowest Number : "+numbers[0]);
}

    public static void findOutThirdLargestNumberFromArrayUsingSort(){
        int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
        int size=numbers.length;
        Arrays.sort(numbers);
        System.out.println("Sorted Array : "+Arrays.toString(numbers));
        int thirdLargest=numbers[size-3];
        System.out.println("Third Largest Number : "+thirdLargest);
    }



    public static void findOutLargestNumberFromArrayUsingSort(){
        int [] numbers =new int[]{130,13,14,56,7,66,77,1,88,99,11 };
        int size=numbers.length;
        Arrays.sort(numbers);
        System.out.println("Sorted Array : "+Arrays.toString(numbers));
        int largest=numbers[size-1];
        System.out.println("Third Largest Number : "+largest);
    }


    public static void findOutLargestNumberFromArrayElement(){

        int [] numbers =new int[]{2,99,130,13,140,56,7,66,77,1,88,99,11 };
        int size=numbers.length;

        int temp=0;

        for (int i=0; i<size; i++){

            for (int j = i+1; j < size; j++) {

                if (numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;


                }
            }
          //  System.out.println("Largest Number "+temp);
        }
        System.out.println("Largest Number "+temp);


    }



    public static void maximumValue(){
        int [] numbers =new int[]{130,103,14,56,700,66,77,1,88,999,11 };
        int max=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (max<numbers[i]){
                max=numbers[i];
            }
            //   System.out.println("Minimum value "+max);
        }
        System.out.println("Maximum value "+max);

    }








}
