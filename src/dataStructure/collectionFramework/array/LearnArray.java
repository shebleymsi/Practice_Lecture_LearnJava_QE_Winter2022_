package dataStructure.collectionFramework.array;

public class LearnArray {

    public static String[] grapeBox = {"grape1", "grape2", "grape3", "grape4", "grape5"}; // v32 04.35.13
    public String[] grapeBox1 = {"grape1", "grape2", "grape3", "grape4", "grape5"}; // v32 04.35.13

    public int[] numbers = new int[6]; // v32 04.35.13


    public static void main(String[] args) {

        // Variable Declare and Assigned value
        String name = "James";

        // Now I want to create a variable where we want to put multiple value of same data type

        // Declare an Array
        String[] appleBox; // create for multiple value

        String orangeBox; // single value
        orangeBox = "orange1";

        // Declare and Assign value in an Array
        String[] grapeBox = {"grape1", "grape2", "grape3", "grape4", "grape5"};

        // Declare an Array with the length use try-catch [ try-catch : it will show error because out of length ]
        try {
            // Declare an Array with the length
            String[] bananaBox = new String[6];
            // Assign value or, add value in Array
            bananaBox[0] = "banana1";
            bananaBox[1] = "banana2";
            bananaBox[2] = "banana3";
            bananaBox[3] = "banana4";
            bananaBox[4] = "banana5";
            bananaBox[5] = "banana6";
            //   bananaBox[6] = "banana7"; // it will show error because out of length, so we need try-catch

            System.out.println(bananaBox[3]);
        } catch (Exception e) {
            System.out.println("Array Index out of Bound Exception " + e.getMessage());
        }


        System.out.println("=======================+++++++++===========================+++++++++++++++++++++++++++++");

        System.out.println("Array Length : " + grapeBox.length);
        // ArrayName [indexNumber]
        // Index= Length-1
        // Length= Index+1


        System.out.println(grapeBox[3]); // To Retrieve the grapeBox value one by one

        String stName = "Tajwar";
        System.out.println(stName);

        System.out.println("==============To Retrieve the grapeBox value one by one ================================");

         System.out.println(grapeBox[2]);
        System.out.println(grapeBox[3]);
        System.out.println(grapeBox[4]);

        // or,
        System.out.println(grapeBox[2] + " " + grapeBox[3] + " " + grapeBox[4]);
        System.out.println(grapeBox[2] + " \n" + grapeBox[3] + " \n" + grapeBox[4]);
        System.out.println(grapeBox[2] + "," + grapeBox[3] + "," + grapeBox[4]);
        // output is: grape3 grape4 grape5
        System.out.println("=========== To Retrieve all the value from an Array using For loop =====================");

        for (int i = 0; i < grapeBox.length; i++) {
            System.out.println(grapeBox[i]);
        }

        System.out.println("=========== To Retrieve all the value from an Array using For Each Loop ============================");


        // Syntax: for( DataType variable_name : arrayName){sout(variable)  }

        for (String st : grapeBox) {
            System.out.println(st);
        }

        // regular example of For Each Loop
        int[] numbers = {1, 3, 5, 7};

        for (int st : numbers) { // variable name: you can give any name, hrere --> st
            System.out.println(st);
        }
        System.out.println("===============Array discussion done========================"); //v32 02.00.07




        System.out.println("===============Global Array ========================"); // v32 04.35.13
        // Single Dimensional Array
        // String[] grapeBox = {"grape1", "grape2", "grape3", "grape4", "grape5"};

        System.out.println(LearnArray.grapeBox[1]);

        LearnArray learn = new LearnArray();
        System.out.println(learn.grapeBox1[2]);

        learn.numbers[0] = 22;
        learn.numbers[1] = 32;
        learn.numbers[2] = 42;
        learn.numbers[3] = 52;
        learn.numbers[4] = 62;
        learn.numbers[5] = 72;

        System.out.println(learn.numbers[3]);
        System.out.println("+++++++++++++++++");
        for (int in : learn.numbers) {
            System.out.println(in);
        }

        System.out.println("***************************+++++++++++++++++"); // v32 04.35.13

        for (String st : grapeBox) {
            if (st.equalsIgnoreCase("grape3")) {
                System.out.println("yahoo here is grape3");
            }
            System.out.println(st);
        }
        System.out.println(grapeBox[2]);
    }


}
