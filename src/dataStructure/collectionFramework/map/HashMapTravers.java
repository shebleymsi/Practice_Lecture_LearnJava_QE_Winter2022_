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
    public static void main(String[] args) { // args ==> numbers
        int[] numbers = {34, 55, 66, 77, 33, 56, 66, 12, 999, 33, 56, 34, 102, 34}; // given array: length 14
        getFrequencyOfNumbers(numbers); // pass the array as a parameter


    }


    // note: we can solve frequency in different way also, but here we use HashMap
    // Frequency(পুনঃপুনঃ সংঘ্টন): How many times each and every number’s we have?
    // create a parameterized getFrequencyOfNumbers method
    public static void getFrequencyOfNumbers(int[] numbers) {

        // Create a HashMap to store the frequency of numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // To add value in map:
        // Iterate through the array and update the frequency map [for loop]
        // For each number in the array, the code checks if it already exists in the map.
        // here, map.get(numbers[i], help us to get the value.
        // If it doesn't exist (map.get(numbers[i]) returns null), it puts the number in the map with a frequency of 1.
        // If it exists, it retrieves the current count, increments it, and puts it back in the map.
        // ### Debug of Frequency(পুনঃপুনঃ সংঘ্টন) of number: v34 02.45.36 to 02.56.32
        for (int i = 0; i < numbers.length; i++) {
            Integer count = map.get(numbers[i]); // we didn't initialize anything or just created the map, so count/i will be null

            if (map.get(numbers[i]) == null) {  // every time we get the number from given array
                map.put(numbers[i], 1); // if the condition is true the count is 1
            } else {
                map.put(numbers[i], ++count); // v34 02.24.00 // count= count + 1, if count = 1, then count = 1+1 = 2
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
