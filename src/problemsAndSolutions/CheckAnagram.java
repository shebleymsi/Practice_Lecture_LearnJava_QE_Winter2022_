package problemsAndSolutions;

import java.util.Arrays;
import java.util.Locale;

public class CheckAnagram {


    // Write a java program to check if the two strings are anagram
    // Two string are called anagram when there is same character but in different order
    // For example: "CAT" and "ACT"     and "ARMY" and "MARY"

    public static void main(String[] args) {

//        isAnagram("CAT","ACT");
//        isAnagram("CAT","ACTT");
//        isAnagram("ARMY","MARY");
        isAnagram1("ARMY", "MARYY");


    }


    public static void isAnagram(String st, String dt) {

        boolean status = true;
        if (st.length() != dt.length()) {
            status = false;
        } else {
            char[] arraySt = st.toLowerCase().toCharArray();
            char[] arrayDt = dt.toLowerCase().toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayDt);
            status = Arrays.equals(arraySt, arrayDt);
        }
        if (status == true) {
            System.out.println(st + " and " + dt + " are Anagram");
        } else {
            System.out.println(st + " and " + dt + " are not Anagram");
        }


    }

    public static boolean isAnagram1(String st, String dt) {

        boolean status = true;
        if (st.length() != dt.length()) {
            status = false;
        } else {
            char[] arraySt = st.toLowerCase().toCharArray();
            char[] arrayDt = dt.toLowerCase().toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayDt);
            status = Arrays.equals(arraySt, arrayDt);
        }
        if (status == true) {
            System.out.println(st + " and " + dt + " are Anagram");
        } else {
            System.out.println(st + " and " + dt + " are not Anagram");
        }
        System.out.println(status);
        return status;

    }


}
