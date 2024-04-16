package loop;

public class LearnLoop {
    // Loop: Loop is allowing us to execute a statement or group of statements multiple times
    // Type of Loop
    // For Loop
    // While Loop
    // Do..While Loop
    // For Each Loop
    public static void main(String[] args) {

        // For Loop:
        // for (  entryPoint/StartPoint;   condition/ EndPoint ; increment++ / Decrement-- ){  code   }
        // De bugging: Finding problem or something
        // Bug: Error/ Defect
        // 2+2 = 4 but output 5
        // break Point: point where you want to stop or pause
        // if for loop condition is not true then loop will exit from execution

        for (int i = 2; i < 5; i++) {
            System.out.println("hello, Israt");
        }

        System.out.println("gello");
        System.out.println("hello, Israt");
        System.out.println("hello, Israt");
        System.out.println("hello, Israt");
        System.out.println("hello, Israt");
        System.out.println("hello, Israt");

        for (int a = 0; a < 4; a++) {
            LearnLoop.doSum();
        }
    }

    public static void doSum() {
        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("Summation value: " + sum);
    }
}
