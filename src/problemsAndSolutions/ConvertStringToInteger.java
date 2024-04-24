package problemsAndSolutions;

public class ConvertStringToInteger {

    public static void main(String[] args) {

        // Convert String to int
        String st = "12345";
        int num = Integer.parseInt(st);
        System.out.println(num);

        //System.out.println(num*2); // try to proof that output is number


        // Convert Int to String
        int age = 34;
        String age1 = String.valueOf(age);
        System.out.println(age1);

        //System.out.println("age1" + 34); // try to proof that output is String

        // valueOf() ==> Returns the string representation of the specified value
        // toString() ==> Returns the value of an object(such as: Array, String) as a String

        /* int alphabet = 'a'; // How to print ascii value of a character:
        System.out.println(alphabet);*/

    }


}
