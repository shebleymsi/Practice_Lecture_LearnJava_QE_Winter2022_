package problemsAndSolutions;

import java.util.Locale;

public class CheckPalindromeWords {


    // If a string is reversed and it remains unchanged, that is called palindrome
    // for Example MOM,DAD,MADAM are palindrome
    // So write java code to check if a given String is Palindrome or not

    public static void main(String[] args) {
        checkPalindrome("DAD");
        checkPalindrome("MADAM");
        checkPalindrome("MOM");
        checkPalindrome("HAPPY");
        checkPalindrome("NEW");


    }


    public static void checkPalindrome(String st) {
        boolean status = true;
        char[] word = st.toLowerCase().toCharArray();
        int statingIndex = 0;
        int endingIndex = word.length - 1;

        while (endingIndex > statingIndex) {
            if (word[statingIndex] != word[endingIndex]) {
                status = false;
            }
            ++statingIndex;
            --endingIndex;

        }
        System.out.println(st + " is a palindrome word " + status);
    }


}
