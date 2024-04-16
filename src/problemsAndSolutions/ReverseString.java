package problemsAndSolutions;

public class ReverseString {


    public static void main(String[] args) {

        String name = "James";


        reverseString("We are learning reverse string");
        //  reverseString1("Tajwar");

    }


    public static void reverseString(String name) {
        String reverse = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);

    }

    public static void reverseString1(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
            // System.out.print(name.charAt(i));
        }
        System.out.println(reverse);


    }


}
