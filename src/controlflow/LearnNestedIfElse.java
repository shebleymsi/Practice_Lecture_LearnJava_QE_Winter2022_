package controlflow;

public class LearnNestedIfElse {


    public static void main(String[] args) {

        int age = 46;
        if (age > 18) {
            System.out.println("you are adult");

            if (age > 23 && age < 34) {
                System.out.println("get the licence");
            } else if (age > 35 && age < 44) {
                System.out.println("update your licence");
            } else if (age > 45) {
                System.out.println("you are still young");

                if (age > 55) {
                    System.out.println("Take care of your heart");
                    if (age > 60) {
                        System.out.println("still you are eligible to presidential election");
                    }
                } else {
                    System.out.println("Enjoy your life");
                }

            } else {
                System.out.println("you are out the range");
            }


        } else {
            System.out.println("you are not adult");
        }


    }


}
