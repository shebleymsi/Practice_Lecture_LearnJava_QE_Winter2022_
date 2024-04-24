package dataStructure.collectionFramework.arrayList;

import java.util.ArrayList;

public class LearnArrayList {


    // ArrayList: Dynamic Array: No need to declare array size


    // Declare an array --> 1 Dimension
    public int[] numbers = new int[6];

    // Declare an ArrayList [ as like object creation ]
    static ArrayList<String> stAddress = new ArrayList<>();

    public static void main(String[] args) {
        // stAddress.add(0,"we are missing tajwar2");
        stAddress.add("Queens,NY");
        stAddress.add("Queens1,NY");
        // stAddress.add(5,"we are missing tajwar5");
        stAddress.add("Queens2,NY");
        stAddress.add("Queens3,NY");
        stAddress.add("Jamaica,NY");
        stAddress.add(2, "we are missing tajwar");
        // stAddress.add(5,"we are missing tajwar1");


        System.out.println(stAddress.get(3));
        // System.out.println(stAddress.get(200));

        System.out.println("**** How to Retrieve all the value from ArrayList using for Each loop *****");

        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("*******************Review******************************");

        ArrayList<String> countryList = new ArrayList<>();

        // for loop
        // add() to add value in arrrayList
        // Retrieve all value


        // How to add element/value
//        countryList.add("JAPAN");
//        countryList.add("CANADA");
//        countryList.add("USA");
//        countryList.add("BANGLADESH");
//        countryList.add("CHINA");

        System.out.println("Before " + countryList);

//        for (int i = 5; i < 10; i++) {
//            countryList.add("CountryName_"+i);
//        }
        System.out.println("After " + countryList);

        for (String st : countryList) {
            System.out.println(st);
        }

        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i));
        }

        System.out.println("*************************************************");

        ArrayList<Integer> stID = new ArrayList<>();
        stID.add(101);
        stID.add(102);
        stID.add(103);
        stID.add(104);
        stID.add(103);

        System.out.println(stID.get(2));
        System.out.println(stID.get(4));

        System.out.println("Length/ Size : " + stID.size());

        for (int i = 0; i < stID.size(); i++) {

            System.out.println(stID.get(i));

        }

        System.out.println("++++ // Remove value from arraylist");
        // stID.remove(1);
        stID.remove("103");

        for (Integer st : stID) {
            System.out.println(st);
        }


        System.out.println("++++ // Remove value from arraylist using Object");
        stAddress.remove("Jamaica,NY");
        for (String st : stAddress) {
            System.out.println(st);
        }

        System.out.println("++++ // Remove value from arraylist using Remove all");
        stAddress.removeAll(stAddress);

        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("**********New ***************************************");

        String[] countries = {"USA", "CANADA", "JAPAN", "UK", "ITALY"};

        for (int i = 0; i < countries.length; i++) {

            // System.out.println(countries[1]);
            countryList.add(countries[i]);

            // countryList.add(i,countries[i]);
        }

        System.out.println(countryList);


    }


}
