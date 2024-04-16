package problemsAndSolutions;

import java.util.*;

public class FrequencyOfWordsFromList {


    public static void getFrequencyOfWords(List<String> strings) {
        HashMap<String, Integer> map = new HashMap<>();
        // To Add value in map
        for (int i = 0; i < strings.size(); i++) {
            Integer count = map.get(strings.get(i));
            if (map.get(strings.get(i)) == null) {
                map.put(strings.get(i), 1);
            } else {
                map.put(strings.get(i), ++count);
            }
        }
        // To Iterate the value
        for (Map.Entry mp : map.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
        }


    }


    public static void getFrequencyOfWords1(List<String> strings) {
        TreeMap<String, Integer> map = new TreeMap<>();
        // To Add value in map
        for (int i = 0; i < strings.size(); i++) {
            Integer count = map.get(strings.get(i));
            if (map.get(strings.get(i)) == null) {
                map.put(strings.get(i), 1);
            } else {
                map.put(strings.get(i), ++count);
            }
        }
        // To Iterate the value
        for (Map.Entry mp : map.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
        }


    }

}
