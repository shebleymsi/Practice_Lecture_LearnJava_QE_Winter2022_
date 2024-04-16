package problemsAndSolutions;

import java.util.Map;
import java.util.TreeMap;

public class FindOutFrequencyOfWordFromAString {
    //#
    //Find out the string word from a string?
    //String info="hey sharif, hope you are feeling good now and you will recover soon";
    //output:
    //hey :  1
    //sharif : 1
    //hope : 1
    //you : 2


    static void count_freq(String str) {
        Map<String, Integer> mp = new TreeMap<>();
        // convert String to Array using Regular Expression
        String[] arr = str.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "hey sharif hope you are feeling good now and you  will recover   soon";

        count_freq(str);
    }


}
