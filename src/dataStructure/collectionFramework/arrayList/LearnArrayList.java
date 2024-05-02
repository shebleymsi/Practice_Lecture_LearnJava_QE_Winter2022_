package dataStructure.collectionFramework.arrayList;

import java.util.ArrayList;

public class LearnArrayList {

    // ArrayList: Dynamic Array: No need to declare array size/ [array --> length or string express --> length()]

    // Declare an array --> 1 Dimension
    public int[] numbers = new int[6];

    // Declare an ArrayList [ as like object creation ]
    static ArrayList<String> stAddress = new ArrayList<>();

    //Assign value of ArrayList
    public static void main(String[] args) {
        // stAddress.add(0,"we are missing tajwar2");
        stAddress.add("Queens,NY");
        stAddress.add("Queens1,NY");
        // ArrayList always maintain insertion order of the elements v33 02.48.13
        // stAddress.add(5,"we are missing tajwar5"); // re-assign value but not found coz already pass index 0 , 1
        stAddress.add("Queens2,NY");
        stAddress.add("Queens3,NY");
        stAddress.add("Jamaica,NY");

        // value re-add/re-assign and then by default print the update value
        stAddress.add(2, "we are missing tajwar");
        // stAddress.add(5,"we are missing tajwar1");


        // for printing value add() have two-type: v3. 02.43.56
        // 1. directly pass the value 2. set index then pass the value
        // In ArrayList: value print by use get() with particular index number
        System.out.println(stAddress.get(3));

        // lecture break v33 01.54.29 to 02.31.00

        // Index out of bounds exception --> get(200), so we need try-catch block
        // System.out.println(stAddress.get(200));


        // How to Retrieve all the value from ArrayList using for Each loop
        System.out.println("**** How to Retrieve all the value from ArrayList using for Each loop *****");

        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("************************ Review: Explain v34 00.12.18 to 00.35.48 *****************************");

        // objective: create an Arraylist, add value , retrieve value
        // use for loop
        // we know add() to add value in arrrayList
        // Retrieve all value


        //create an Arraylist
        ArrayList<String> countryList = new ArrayList<>();

//        // How to add element/value one by one
//        countryList.add("JAPAN_1");
//        countryList.add("JAPAN_2");
//        countryList.add("JAPAN_3");
//        countryList.add("JAPAN_4");
//        countryList.add("JAPAN_5");

        System.out.println("Before" + countryList); // if we comment above code, now output: Before []

        // add all values of above code use by for loop [ smartly write less code ]
        for (int i = 5; i < 10; i++) {  // v 33 03.12.36 if i < 100000000 it will be Stack and Heap Memory
            countryList.add("CountryName_" + i); // here, 'i' makes 0,1,2,3,4,5,...
        }

        // print all elements use for loop
        System.out.println("After" + countryList);
        // now output: After [CountryName_0, CountryName_1, CountryName_2, CountryName_3, CountryName_4]


//        // just for practice purpose: print all elements use for each loop
//        for (String st : countryList) {
//            System.out.println(st);
//        }

        System.out.println("===================== New ===========================");

        String[] countries= {"USA", "CANADA", "JAPAN", "UK", "ITALY"};

        for (int i = 0; i< countries.length; i++){
                countryList.add(countries[i]);
                // countryList.add(i, countries[i]);
        }
        System.out.println(countryList);

        // ================================= Review: Explain v34 00.35.48 End =======================================


        System.out.println("//or,===================== [ Shebley ] ===============");

        //create an Arraylist
        ArrayList<String> countryFinalList = new ArrayList<>();

        // How to add element/value one by one
        countryFinalList.add("JAPAN");
        countryFinalList.add("CANADA");
        countryFinalList.add("USA");
        countryFinalList.add("BANGLADESH");
        countryFinalList.add("CHINA");

        // print all elements
        System.out.println("My country name is : " + countryFinalList);

        // print all elements
        for (int i = 0; i < countryFinalList.size(); i++) { // for Arraylist length means -->  size()
            System.out.println(countryFinalList.get(i));
        }

        // print all elements
        for (String st : countryFinalList) {
            System.out.println(st);
        }


        System.out.println("*****************************************************************************************");

        /* Need of Wrapper Classes: Data structures in the Collection framework, such as ArrayList and Vector,
        store only objects (reference types) and not primitive types.*/

        //create an Arraylist
        // 'Integer' is a wrapper class v33 03.18.14
        ArrayList<Integer> stID = new ArrayList<>();

        // How to add element/value one by one
        stID.add(101);
        stID.add(102);
        stID.add(103);
        stID.add(104);
        stID.add(103); // v 33 03.23.34 ArrayList allow us to use duplicate value

        // print the value by index
        System.out.println(stID.get(2));
        System.out.println(stID.get(4));

        // print all the value
        System.out.println("Length/ Size : " + stID.size()); // for Arraylist length means -->  size()

        // print all the value use for loop // v33 03.27.55
        for (int i = 0; i < stID.size(); i++) {
            System.out.println(stID.get(i));
        }

        // print all the value use for each loop
        for (Integer st : stID) {
            System.out.println(st);
        }

        System.out.println("++++++++++++++++++++++++++++ // Remove value from arraylist++++++*+++++++++++++++++++++++");

        // remove by index number
        stID.remove(1);

        // remove by member/object
        stID.remove("103"); // remove

        // print for check if remove or not
        for (Integer st : stID) { // print
            System.out.println(st);
        }


        System.out.println("++++++++++++++++++++++++++++ // Remove value from arraylist using Object+++++++++++++++++");

        // remove by member/object
        stAddress.remove("Jamaica,NY");

        // print for check if remove or not
        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("+++++++++++++++++++++++++ // Remove value from arraylist using Remove all +++++++++++++");

        // remove all
        stAddress.removeAll(stAddress);

        // print after remove
        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("**************** ArrayList discussion is done V33 03.36.02 ******************************");


        System.out.println("********* objective: convert an array to arraylist **************************************");

        // objective: convert an array to arraylist
        // declare and assign an array use java initializer
        String[] countriesName = {"USA", "CANADA", "JAPAN", "UK", "ITALY"};

        // declare an arrayList
        ArrayList<String> newCountryList = new ArrayList<>();

        // convert array to arrayList
        for (int i = 0; i < countriesName.length; i++) {
            newCountryList.add(countriesName[i]);

        }
        System.out.println(newCountryList);
    }


}
