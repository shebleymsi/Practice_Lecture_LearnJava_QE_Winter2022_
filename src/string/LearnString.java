package string;

public class LearnString {

    // String : is a class and Data type
    // String is a sequence of character

    public static void main(String[] args) {

        String birthdayWish = "Happy Birthday to Ahmed";

        System.out.println("Length value : " + birthdayWish.length());
        // .length() --> Returns the length of a specified string
        // ==> Length value : 23

        System.out.println("Lower case : " + birthdayWish.toLowerCase());
        // .toLowerCase() --> Converts a string to lower case letters
        // ==> Lower case : happy birthday to ahmed

        System.out.println("Upper case : " + birthdayWish.toUpperCase());
        // .toUpperCase() --> Converts a string to upper case letters
        // ==> Upper case : HAPPY BIRTHDAY TO AHMED

        System.out.println("Char at : " + birthdayWish.charAt(10));
        // .charAt() --> Returns the character at the specified index (position)
        // index start from zero 0, [so 0, 1, 2, 3, ... ...]. Here, 10 means 11th character.
        // ==> Char at : h

        System.out.println("Sub String : " + birthdayWish.substring(7));
        // .substring() --> Returns a new string which is the substring of a specified string
        // beginning(7th) character is included
        // ==> Sub String : irthday to Ahmed

        System.out.println("Sub String : " + birthdayWish.substring(6, 14));
        //
        // beginning(6th) character is included but ending(14th) character not included
        // ==> Sub String : Birthday

        System.out.println("Compare : " + birthdayWish.equals("Happy Birthday to Ahmed"));
        // .equals() --> Returns true if the strings are equal, and false if not
        // Compares two strings.
        // compare with same character, [ Username, Password checking purpose use this type of method ] //v28 03.40.49
        // ==> Compare : true

        System.out.println("Compare Ignore case: " + birthdayWish.equalsIgnoreCase("Happy Birthday to ahmed"));
        // .equalsIgnoreCase() --> Compares two strings, ignoring case considerations
        // ==> Compare Ignore case: true

        System.out.println("Concatenation : " + birthdayWish.concat("Yelles"));
        System.out.println("Concatenation : " + "SID-".concat("124"));
        // .concat() --> Appends a string to the end of another string [ add without white space ]
        // ==> Concatenation : Happy Birthday to AhmedYelles
        // ==> Concatenation : SID-124


        System.out.println("**************Split, contain, and to string method ***************************************");

        String stID = "102:ahmed";
        int age = 24;
        String stId1 = "boom:and:fool";

        System.out.println(stID.toString());
        // .toString() --> Returns the value of a String object
        // ==> 102:ahmed

        // System.out.println(age.toString());
        // .toString() --> Returns the value of a String object
        // toString() returns only String type of value, Here "age" is integer


        System.out.println(stID.contains("bh"));
        System.out.println(stID.contains(":"));
        // .contains() --> Checks whether a string contains a sequence of characters
        // ==> false
        // ==> true


        System.out.println("1 =================split by method======================");

        System.out.println(stID.split(":"));
        // .split() --> Splits a string into an array of substrings
        // ==> [Ljava.lang.String;@366e2eef


        System.out.println("2 ==========Splits into an array of substrings==========");

        String str = "Student@Wasee@Ahmed@Fouzia@Abu";
//        String str1 = "Celia";
//        String str2 = "StudentWaseeAhmedFouzia";
        String[] demoArray = str.split("@");
        String[] demoArray1 = str.split("@", 5); // (limit) 5 means --> split into 5 parts
        String[] demoArray2 = str.split("@", 4); // (limit) 4 means --> split into 4 parts
        String[] demoArray3 = str.split("@", 3); // (limit) 3 means --> split into 3 parts
        // .split() --> Splits a string into an array of substrings

        // For each loop:
        for (String a : demoArray) {
            System.out.println(a);
        }
        System.out.println("-------");
        // For loop:
        for (int i = 0; i < demoArray.length; i++) {
            System.out.println(demoArray[i]);
        }


        System.out.println("3 =======================================================");


        // For each loop:
        for (String a : demoArray1) {
            System.out.println(a);
        }
        System.out.println("-------");
        // For loop:
        for (int i = 0; i < demoArray1.length; i++) {
            System.out.println(demoArray1[i]);
        }


        System.out.println("4 =======================================================");

        // For each loop:
        for (String a : demoArray2) {
            System.out.println(a);
        }
        System.out.println("-------");
        // For loop:
        for (int i = 0; i < demoArray2.length; i++) {
            System.out.println(demoArray2[i]);
        }


        System.out.println("5 =======================================================");


        // For each loop:
        for (String a : demoArray3) {
            System.out.println(a);
        }
        System.out.println("-------");
        // For loop:
        for (int i = 0; i < demoArray3.length; i++) {
            System.out.println(demoArray3[i]);
        }


        System.out.println("******************Exception Handling ********************"); // v28 04.00.30
        // Exception Handling:
        // use try catch block
        // Syntax is: try {} catch(){}

        //String fName = "James";

        try {
            //System.out.println(fName);
            // We only keep those line of code in try-catch block where will have possibility to exception in real life code

            //System.out.println("Char at : " + birthdayWish.charAt(10)); // ==> Char at : h
            System.out.println("Char at : " + birthdayWish.charAt(36));

        } catch (Exception e) {
            // e.printStackTrace(); // should see the error message in console // v28 04.10.10
            System.out.println("String Index out of bound exception");
        }


    }


}
