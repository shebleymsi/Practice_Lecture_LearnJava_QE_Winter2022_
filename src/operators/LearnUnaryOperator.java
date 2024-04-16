package operators;

public class LearnUnaryOperator {

    // Unary Operator:

    // Increment Operator: ++ : Increasing / Adding 1

    // Pre Increment Operator: Before : Adding 1 before with the variable value : 1+20
    // Post Increment Operator: After : Adding 1 not with the present value but for the future value
    // or,
    // Post Increment Operator: After : Adding 1 with the future value, not with the present value

    // Decrement Operator : --   : Decreasing / Subtracting by 1

    // Pre Decrement Operator: Before : Decrease 1 before with the variable value : -1+20
    // Post Decrement Operator: After : Decrease 1 not with the present value but for the future value

    public static void main(String[] args) {

        int number = 30;
        ++number; // Pre Increment : 1+30 = 31
        ++number;
        ++number;
        number++; // 33
        number++;
        ++number;
        ++number;
        number++;
        ++number;
        ++number;
        --number;
        --number;
        number--;
        number--;
        ++number;
        ++number;
        --number;
        number--;
        number--;
        number++;
        ++number;
        ++number;
        number++;
        ++number;
        ++number;
        --number;
        --number;

        System.out.println(--number); // 33 +1

        // Unary Plus operator  +
        // Unary minus operator -

        int a = 5;
        int b = 3;
        b += 9;   // 3 + 9
        b -= 17; //  12 -17
        System.out.println(b);

    }

}
