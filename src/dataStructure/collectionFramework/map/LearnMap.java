package dataStructure.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    // Map <K,V>
    // Map <Key , Value>
    // Map is based on key : value pair
    // Map basic syntax is based on key-value's data_type pair


    // Let's declare and assign regular variable:
    static String name = "James";


    // Basic Syntax of map:
    // Map<K, V> address = new HashMap<>();
    // Map<String,Integer> address = new HashMap<>();
    // stId = 123; K-V


    // Declare a Map
    static Map<String, String> address = new HashMap<>();
    // stName = "Obama" ; K-V


    public static void main(String[] args) {

        //Call & print name variable
        System.out.println(name);

        //Call & print address
        System.out.println(address); // output: {}


        // DeDeclare three Map:
        Map<String, String> foodListMap = new HashMap<>();  // Map:01 --> foodListMap
        Map<String, Integer> prices = new HashMap<>();      // Map:02 --> prices
        Map<Integer, String> productCode = new HashMap<>(); // Map:03 --> productCode

        //============================================== Map:01 (foodListMap) ========================================

        // add value in Map:
        // put(): help us to add value in Map. add(): help us to add value in ArrayList
        // put() method allow us to add/put two value as a parameter in map
        // ("Key", "Value")
        foodListMap.put("CO", "Coffee");
        foodListMap.put("BA", "Banana");
        // In Map key is always unique, not duplicate, if duplicate it will be re-assign
        // if we add duplicate key, map recognize key is reassign and then its print update value
        // in map at a time duplicate key is not allow, its only consider the latest one
        foodListMap.put("MA", "Mango");
        foodListMap.put("MA", "Mango1");
        foodListMap.put("MA", "Mango2");

        // Print value:--> by get() with key_name:
        // get() method allow us to print in map
        System.out.println(foodListMap.get("BA"));
        System.out.println(foodListMap.get("MA")); //output is: Mango2 (here, reassigning the latest value)


        //=============================================== Map:02 (prices) ============================================

        // add value in Map:
        prices.put("coPrice", 5);
        prices.put("baPrice", 12);
        prices.put("maPrice", 15);
        prices.put("ckPrice", 50);

        // Print value:--> by get() with key_name
        System.out.println(prices.get("maPrice"));


        //=============================================== Map:03 (productCode) =======================================

        // add value in Map:
        productCode.put(1, "Coffee");
        productCode.put(2, "Banana");
        productCode.put(3, "Mango");
        productCode.put(4, "Chicken Fry");

        // Print value:--> by get() with key_name
        System.out.println(productCode.get(4));


        System.out.println("***************** Using for-each to Iterate all the key of Map +++++++++++++++++++++++++");

        // Using for-each to Iterate/print all the key at a time // v34 01.28.00
        // here, print only key
        for (Integer pc : productCode.keySet()) {
            System.out.println(productCode.get(pc));
        }


        System.out.println("********** How to Retrieve all the key_value using for each loop and EntrySet ++++++++++");

        // Retrieve all the key with value using for each_loop & use EntrySet
        for (Map.Entry<String, String> entry : foodListMap.entrySet()) {    // see: 'Entry' is an interface
            System.out.println(entry.getKey() + " : " + entry.getValue());  // 01. ==> print key with value
            // System.out.println(entry.getValue());                           // 02. ==> print only value
            // System.out.println(entry.getKey());                             // 03. ==> print only value

        }


        //========================================= Map basic concept is done =======================================
        // v34 01.35.26 Map basic concept is done
        //========================================= Map advanced concept ============================================
        System.out.println("*************** Remove and Replace ");

        System.out.println(foodListMap);
        foodListMap.remove("CO");
        System.out.println(foodListMap);
        foodListMap.replace("BA", "Chicken");
        System.out.println(foodListMap);
        foodListMap.replace("MA", "Mango2", "Mango");
        System.out.println(foodListMap);
        System.out.println(foodListMap.containsKey("MA"));
        System.out.println(foodListMap.containsValue("Chicken1"));

    }


}
