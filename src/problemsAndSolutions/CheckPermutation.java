package problemsAndSolutions;

public class CheckPermutation {

    // Permutation of String "ABC" is "ABC","BAC","ACB","CAB","CBA","BCA"

    public static void main(String[] args) {

        checkOutPermutation("", "ABC");
        System.out.println("****************************************");
        checkOutPermutation("", "DAD");
    }


    public static void checkOutPermutation(String prefix, String st) {

        if (st.length() == 0) {
            System.out.println(prefix);
        }

        for (int i = 0; i < st.length(); i++) {
            String newWord = prefix + st.charAt(i);
            String newAlphabeticWord = st.substring(0, i) + st.substring(i + 1);
            checkOutPermutation(newWord, newAlphabeticWord);

        }


    }


}
