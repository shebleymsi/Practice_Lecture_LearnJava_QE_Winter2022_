package dataStructure.collectionFramework.randomNumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {

        // declare two array:
        double[] priceList = new double[10];

        int[] stId = new int[18];
        // Assign value in Array
        stId[0] = 200;
        stId[1] = 204;
        stId[2] = 205;

        // create a reference_variable/Object of Random Class
        // press ctrl + click cursor on 'Random'. then find 'seed' definition.
        // base on seed(changeable number) it will generate diff set of numbers

        Random random = new Random(1); // seed: random number Generated from seed(changeable).

        for (int i = 0; i < stId.length; i++) {
            stId[i] = random.nextInt(100); // bound: random number Generated up to bound.
            System.out.println(stId[i]);
        }


        System.out.println("*********** Using Math.random()******************* ");

        System.out.println(Math.random()); // print only random number
        System.out.println("SID101" + Math.random()); // print with concatenation String.


        System.out.println("********** Generate Random Email Address [demo@gmail.com]) ***********");
        // [Generate Random Email Address] by [Random Number Generate]
        // demo@gmail.com ==> "demo"+ + "@gmail.com"
        System.out.println("demo" + randomNumberGenerate() + "@gmail.com");
        System.out.println("646-789-1" + randomNumberGenerate());

    }


    // for Automation test purpose we need to generate unique email address.
    // Random Number Generate
    public static int randomNumberGenerate() {
        //  Random ran=new Random();
        // Random random=new Random( ran.nextInt(10));
        Random random = new Random();
        return random.nextInt(1000);
    }


}
