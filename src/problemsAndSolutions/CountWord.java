package problemsAndSolutions;

import java.util.Scanner;

public class CountWord {


    public static void main(String[] args) {

        getCountOfTheWords();
        // getCountOfTheWordsWithScanner();
        getCountSentence();


    }


    public static void getCountOfTheWords() {
        // Scanner input = new Scanner(System.in);
        String str = "Eid Mubarak to Every one";
        //   System.out.println("Enter your String");
        //  String str = input.nextLine();

        String name = " ";

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            // && (str.charAt(i + 1) != ' ')
            // E == ' '
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in String: " + count);

    }


    public static void getCountOfTheWordsWithScanner() { // Shebley
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = input.nextLine();

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words in String: " + count);

    }

    public static void getCountSentence() { // Shebley
        String str = "Eid Mubarak to Every one";
        System.out.println(str.length());
        System.out.println(str.length() - 1);
        System.out.println(str.charAt(0));
    }


}
