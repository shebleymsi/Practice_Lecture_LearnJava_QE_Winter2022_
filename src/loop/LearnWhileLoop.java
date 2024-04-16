package loop;

public class LearnWhileLoop {

    // startPoint  condition    iterator/Increment and Decrement Operator
    // 3    i<12   i++

    // 30    i>20   i--

    // While Loop : Pre condition check
    // While Loop is used in a situation where we do not know how many times loop needs to be executed beforehand

    // For Loop is used where we already know about the number of times loop needs to be executed.

    // While loop syntax
    // while ( condition  ){ increment ++ or Decrement -- operator    and code         }

    public static void main(String[] args) {

        // Decrement Operator
        int number=17;
        while ( number>10     ){  // Start with higher value, compare with lower value, so need Decrement
            System.out.println("We are learning while loop");
            number--;
        }

        // Increment Operator
        int number1 = 7;
        while (number1 < 10) {  // Start with lower value, compare with higher value, so need increment
            System.out.println("We are learning while loop");
            number1++;
        }

    }

}
