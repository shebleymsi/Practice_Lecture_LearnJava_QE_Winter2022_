package dataStructure.collectionFramework.arrayList;

import java.util.ArrayList;

public class LearnArrayList {

    // ArrayList: Dynamic Array: No need to declare array size/length

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

        // value re-add/re-assign and then print the update one
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


        System.out.println("************************************ Review *********************************************");

        //objective: create an Arraylist, add value , retrieve value
        // use for loop
        // we know add() to add value in arrrayList
        // Retrieve all value


        //create an Arraylist
        ArrayList<String> countryList = new ArrayList<>();


        // add all values
        for (int i = 0; i < 10; i++) {  // v 33 03.12.36 if i < 100000000 it will be Stack and Heap Memory
            countryList.add("CountryName_" + i); // here, 'i' makes 0,1,2,3,4,5,...
        }

        // print all elements
        System.out.println("before" + countryList);

        // print all elements
        for (String st : countryList) {
            System.out.println(st);
        }


        System.out.println("//or,=========== Shebley ===============");


        //create an Arraylist
        ArrayList<String> countryList1 = new ArrayList<>();

        // How to add element/value one by one
        countryList1.add("JAPAN");
        countryList1.add("CANADA");
        countryList1.add("USA");
        countryList1.add("BANGLADESH");
        countryList1.add("CHINA");

        // print all elements
        System.out.println("After " + countryList1);

        // print all elements
        for (int i = 0; i < countryList1.size(); i++) { // for Arraylist length means -->  size()
            System.out.println(countryList1.get(i));
        }

        // print all elements
        for (String st : countryList1) {
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

        System.out.println(stID.get(2));
        System.out.println(stID.get(4));

        // print all the value
        System.out.println("Length/ Size : " + stID.size()); // for Arraylist length means -->  size()

        // print all the value v 33 03.27.55
        for (int i = 0; i < stID.size(); i++) {
            System.out.println(stID.get(i));
        }

        // print all the value
        for (Integer st : stID) {
            System.out.println(st);
        }

        System.out.println("++++++++++++++++++++++++++++ // Remove value from arraylist++++++*+++++++++++++++++++++++");

        // stID.remove(1); // remove by index number

        stID.remove("103"); // remove

        for (Integer st : stID) { // print
            System.out.println(st);
        }


        System.out.println("++++++++++++++++++++++++++++ // Remove value from arraylist using Object+++++++++++++++++");


        stAddress.remove("Jamaica,NY");
        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("++++++++++++++++++++++++++++ // Remove value from arraylist using Remove all+++++++++++++");


        stAddress.removeAll(stAddress);

        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("**************** ArrayList discussion is done V33 03.36.02 ******************************");

        System.out.println("*************************** (New) More practice **********************************************");

        String[] countries = {"USA", "CANADA", "JAPAN", "UK", "ITALY"};

        for (int i = 0; i < countries.length; i++) {

            // System.out.println(countries[1]);
            countryList.add(countries[i]);

            // countryList.add(i,countries[i]);
        }

        System.out.println(countryList);


    }


}
