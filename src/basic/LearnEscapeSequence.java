package basic;

public class LearnEscapeSequence {

    // EscapeSequence

    public static void main(String[] args) {

        // sysout  ==> Windows and Mac: Press ctrl+space

        System.out.println("Hello");
        // "Hello"
        System.out.println("\"Hello\"");
        System.out.println("\'Hello\'");
        String name = "Wasee";
        System.out.println("\"" + "\"");
        System.out.println("\"" + name + "\"");
        System.out.println("hey,\tWasee"); // t means tab ,==>  4 space
        System.out.println("Tajwar\nHamid");
        System.out.println("Tajwar Hamidd\b");  //v20 03.43.52
        System.out.println("Tajwar Hamidd\ris a student");
        System.out.println("Tajwar Ahmed\\");

    }

}
