package dataStructure.collectionFramework.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTravers {

    // key Points:
    // For Operations Like Add, remove, containsKey, containsValue, time complexity is O(logN) where, N is number of elements present in TreeMap
    // TreeMap always keeps the elements in a sorted (Increasing order) while the elements in a HashMap no order
    // TreeMap also provides some cool methods like first,last,floor and ceiling of keys


    // Final objective: Find out the Frequency(পুনঃপুনঃ সংঘ্টন) of number in a given array
    // Let's given array is: int [] numbers={34,55,66,77,33,56,66,12,999,33,56,34,102};
    // [ How many times each and every number’s we have? ]


    // create a main method 1st but don't write any code in body now
    public static void main(String[] args) {
        int[] numbers = {34, 55, 66, 77, 33, 56, 66, 12, 999, 33, 56, 34, 102, 34}; // 14 // declare an array with assigning value
        getFrequencyOfNumbers(numbers); // call the getFrequencyOfNumbers method by class name


    }


    // note: we can solve frequency in different way also, but here we use HashMap
    // Frequency(পুনঃপুনঃ সংঘ্টন): How many times each and every number’s we have?
    // create a parameterized getFrequencyOfNumbers method
    public static void getFrequencyOfNumbers(int[] numbers) {

        // Create a HashMap to store the frequency of numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array and update the frequency map [for loop]
        for (int i = 0; i < numbers.length; i++) {
            Integer count = map.get(numbers[i]);
            if (map.get(numbers[i]) == null) {
                map.put(numbers[i], 1);
            } else {
                map.put(numbers[i], ++count); // put(k, V)
            }
        }

        /*
        // Iterate through the array and update the frequency map [for-each loop]
        for (int number : numbers) {
            // If the number is already in the map, increment its frequency
            // Otherwise, add it to the map with a frequency of 1
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
         */


        // To Iterate the value or Print the frequency of each number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Frequency of " + entry.getKey() + " : " + entry.getValue());
            //System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }


    }


}
