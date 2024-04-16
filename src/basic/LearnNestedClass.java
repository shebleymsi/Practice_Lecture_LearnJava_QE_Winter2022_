package basic;

public class LearnNestedClass {

    // nested class means: child class
    // a nested class is a class that is defined within another class.  [msi]


    // class name : LearnNestedClass

    // Parent class : LearnNestedClass

    int age = 44;
    static String firstName = "James";


    public static class Computer {
        // If a variable in the child class is static, then the child class itself must also be static.
        // child class : Computer

        public String computerName = "Mac"; // [ variable use from different package, we have to declare that's variable public ]
        public static int ram = 16;

        public static void main(String[] args) {
            System.out.println("Child class");

            // Create an object
            Computer myComputer = new Computer();
            System.out.println(myComputer.computerName);

            System.out.println(Computer.ram);
            myComputer.computerDisplay();

            /*
             If we have a non-static variable(int age=44;) in parent class level,
             can we create object of parent class object inside the child class?
             */
            LearnNestedClass learn = new LearnNestedClass();
            System.out.println(learn.age);

        }

        public void computerDisplay() {
            System.out.println("This is computer display");
        }

    }


    public static void main(String[] args) {

        System.out.println("Parent class");

        Computer myCom = new Computer();
        System.out.println(myCom.computerName);
        System.out.println(Computer.ram);

    }


}
