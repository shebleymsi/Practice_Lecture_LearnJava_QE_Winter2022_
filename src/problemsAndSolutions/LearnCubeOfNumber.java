package problemsAndSolutions;

public class LearnCubeOfNumber {


    public static void main(String[] args) {

        String number = "3 2 1";

        for (int i = 0; i < number.length(); i++) {
            int num = Character.getNumericValue(number.charAt(i));
            System.out.println(num * num * num);
        }


    }


}
