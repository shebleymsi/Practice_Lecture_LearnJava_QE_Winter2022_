package dataStructure.collectionFramework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LearnListHashMap {

    // Advanced use case of map:
    // Learn List of HashMap
    // objective is: using ArrayList stored as a value in Map


    // Declare three ArrayList:
    static List<String> stateNameOfUSA = new ArrayList<>();
    static List<String> stateNameOfCanada = new ArrayList<>();
    static List<String> stateNameOfUK = new ArrayList<>();
    static List<String> stateNameOfBangladesh = new ArrayList<>();


    public static void main(String[] args) {

        // static so call by class name
        getStatesNameOfUSA();
        getStatesNameOfCanada();
        getStatesNameOfUK();
        getStatesNameOfBangladesh();

        // create a map, where key type is 'string' & value type is 'List<String>'
        // objective is above ArrayList stored as a value in Map
        Map<String, List<String>> stMap = new HashMap<>();

        // add key and value(stored as ArrayList) in Map
        stMap.put("USA", stateNameOfUSA);  // (K, V)
        stMap.put("CANADA", stateNameOfCanada);
        stMap.put("UK", stateNameOfUK);
        stMap.put("BANGLADESH", stateNameOfBangladesh);

        // Print all key value from Map
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(stMap);


        System.out.println("+++++++ how to Iterate all the value from a HashMap ***********");
        // Iterate all the value from a HashMap
        for (Map.Entry<String, List<String>> entry : stMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


    // ==================================================== lecture start ============================================

    public static void getStatesNameOfUSA() {

        // add value in ArrayList of stateNameOfUSA
        LearnListHashMap.stateNameOfUSA.add("NY");
        LearnListHashMap.stateNameOfUSA.add("NJ");
        LearnListHashMap.stateNameOfUSA.add("FL");
        LearnListHashMap.stateNameOfUSA.add("TX");
        LearnListHashMap.stateNameOfUSA.add("CA");
        LearnListHashMap.stateNameOfUSA.add("MD");

        // Print ArrayList of stateNameOfUSA
        System.out.println(stateNameOfUSA);
    }


    public static void getStatesNameOfUK() {

        // add value in ArrayList of stateNameOfUK
        LearnListHashMap.stateNameOfUK.add("Scotland");
        LearnListHashMap.stateNameOfUK.add("England");
        LearnListHashMap.stateNameOfUK.add("Wales");
        LearnListHashMap.stateNameOfUK.add("Northern Ireland");
        LearnListHashMap.stateNameOfUK.add("Oxford");
        LearnListHashMap.stateNameOfUK.add("Cambridge");

        // Print ArrayList of stateNameOfUK
        System.out.println(stateNameOfUK);
    }


    public static void getStatesNameOfCanada() {

        // add value in ArrayList of stateNameOfCanada
        LearnListHashMap.stateNameOfCanada.add("Alberta");
        LearnListHashMap.stateNameOfCanada.add("British Columbia");
        LearnListHashMap.stateNameOfCanada.add("Manitoba");
        LearnListHashMap.stateNameOfCanada.add("Nova Scotia");
        LearnListHashMap.stateNameOfCanada.add("Nunavut");
        LearnListHashMap.stateNameOfCanada.add("New Brunswick");

        // Print ArrayList of stateNameOfCanada
        System.out.println(stateNameOfCanada);
    }


    public static void getStatesNameOfBangladesh() {  // Shebley

        // add value in ArrayList of stateNameOfBangladesh
        LearnListHashMap.stateNameOfBangladesh.add("");

        // Print ArrayList of stateNameOfBangladesh
        System.out.println(stateNameOfBangladesh);

    }


}
