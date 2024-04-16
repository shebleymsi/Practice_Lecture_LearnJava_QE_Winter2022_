package operators;

public class LearnConditionalOperator {

    // Conditional Operator:

    // && And Conditional operator: All the condition must have to be true then it will execute if block of code
    // || OR Conditional operator: pipe | : One condition has to be true then it will execute if block of code

    // This is a java class && we are learning method

    // connect multiple condition using &&

    // if the condition is true then if block of code will execute
    // if the condition is false then if block of code will not execute
    // if the condition is false then else block of code will execute


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 90;
        int num3 = 800;

        if (num1 > num2) {
            System.out.println("Num1 is Grater than num2");
        } else {
            System.out.println("Num1 is not Grater than num2");
        }

        if (num2 < num3) {
            System.out.println("Num2 is Less than num3");

        }


        System.out.println("*********   Start   ******** && → AND Operator ********************");

        if (num1 < num2 && num2 < num3) {
            System.out.println("This is something new we are learning");

            int num5 = 8;
            int num6 = 9;
            int sum = num5 + num6;
            System.out.println("Summation value " + sum);


        } else {
            System.out.println("This is not something new");
        }

        if (num1 < num2 && num2 < num3 && num1 > num3) {
            System.out.println("This is New");

            int num5 = 8;
            int num6 = 9;
            int sum = num5 + num6;
            System.out.println("Summation value " + sum);


        } else {
            System.out.println("This is not new");
        }


        System.out.println("********   END     ********* && → AND Operator ********************");
        System.out.println("********   Start   ********* || → OR Operator ********************");

        if (num1 < num2 || num2 > num3) {
            System.out.println("This is or operator we are learning");

            int num5 = 8;
            int num6 = 9;
            int sum = num5 + num6;
            System.out.println("Summation value " + sum);


        } else {
            System.out.println("This is not or operator");
        }

        if (num1 > num2 || num2 > num3 || num1 < num3) {
            System.out.println("Yahoo we are almost done with conditional operator");
            int num5 = 8;
            int num6 = 9;
            int sum = num5 + num6;
            System.out.println("Summation value " + sum);
        } else {
            System.out.println("Yahoo we are not done with conditional operator");
        }

    }

}
