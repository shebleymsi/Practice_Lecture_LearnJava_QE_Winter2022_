package recursion;

public class LearnRecursion {

    // Recursion : Re call the method by itself
    //It's a process which is calling a method itself continuously
    // must call itself
    // must change its state and move toward the base case
    //recursion is alternative of loop
    public static void main(String[] args) {

        tvDisplay();

    }

    static int count = 0;

    public static void tvDisplay() {

        count++;
        if (count < 5) {    // here, count value is 1, because of count++; // if count <= 5, its print 5 times
            System.out.println("This is Tv Display");

            tvDisplay(); // Recursion method call : method call by inside itself
        }

    }


}
