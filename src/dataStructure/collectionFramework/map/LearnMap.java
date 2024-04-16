package dataStructure.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // Map <K,V>

    // Map <Key , Value>

    // Map is based on key value pair

    static String name = "James";

    // Map<String,Integer> address=new HashMap<>();
    static Map<String, String> address = new HashMap<>();

    // stId=123
    public static void main(String[] args) {
        System.out.println(name);

        System.out.println(address);

        Map<String, String> foodListMap = new HashMap<>();
        Map<String, Integer> prices = new HashMap<>();
        Map<Integer, String> productCode = new HashMap<>();


        foodListMap.put("CO", "Coffee");
        foodListMap.put("BA", "Banana");
        foodListMap.put("MA", "Mango");
        foodListMap.put("MA", "Mango1");
        foodListMap.put("MA", "Mango2");



        System.out.println(foodListMap.get("BA"));
        System.out.println(foodListMap.get("MA"));


        prices.put("coPrice", 5);
        prices.put("baPrice", 12);
        prices.put("maPrice", 15);
        prices.put("ckPrice", 50);

        System.out.println(prices.get("maPrice"));


        productCode.put(1, "Coffee");
        productCode.put(2, "Banana");
        productCode.put(3, "Mango");
        productCode.put(4, "Chicken Fry");

        System.out.println(productCode.get(4));


        System.out.println("***** Using for each to Iterate all the value ++++++++++");

        for (Integer pc : productCode.keySet()) {

            System.out.println(productCode.get(pc));

        }

        System.out.println("***** How to Retrieve all the value using for each loop and EntrySet ++++++++++");


        for (Map.Entry<String, String> entry : foodListMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            //  System.out.println(entry.getValue());
            //  System.out.println(entry.getKey());

        }


        System.out.println("*************** Remove and Replace ");

        System.out.println(foodListMap);
        foodListMap.remove("CO");
        System.out.println(foodListMap);
        foodListMap.replace("BA","Chicken");
        System.out.println(foodListMap);
        foodListMap.replace("MA","Mango2","Mango");
        System.out.println(foodListMap);
        System.out.println(foodListMap.containsKey("MA"));
        System.out.println(foodListMap.containsValue("Chicken1"));
    }


}
