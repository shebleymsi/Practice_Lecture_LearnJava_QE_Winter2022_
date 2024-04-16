package dataStructure.collectionFramework.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTravers {

    // key Points
    // For Operations Like Add,remove, containsKey, containsValue, time complexity is O log n where n is number rof elements present in TreeMap
    // TreeMap always keeps the elements in a sorted (Increasing order) while the elements in a HashMap no order
    // TreeMap also provides some cool methods like first,last,floor and ceiling of keys


    // Find out the Frequency of number in a given array
    // int [] numbers={34,55,66,77,33,56,66,12,999,33,56,34,102};

    public static void main(String[] args) {
        int[] numbers = {34, 55, 66, 77, 33, 56, 66, 12, 999, 33, 56, 34, 102, 34};

        getFrequencyOfNumbers(numbers);


    }


    public static void getFrequencyOfNumbers(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();


        // To Add value in map
        for (int i = 0; i < numbers.length; i++) {
            Integer count = map.get(numbers[i]);
            if (map.get(numbers[i]) == null) {
                map.put(numbers[i], 1);
            } else {
                map.put(numbers[i], ++count);
            }
        }
        // To Iterate the value
        for (Map.Entry mp : map.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
        }


    }




}
