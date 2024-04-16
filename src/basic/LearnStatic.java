package basic;

public class LearnStatic {

    // static is a keyword
    // if we use static keyword then you can call variable , method by its class name
    static String name = "Husna";   // 1 static variable, call in main method by class_name
    String address = "huston,TX";   // 1 non-static variable, call in main method by object

    public static void main(String[] args) {

        System.out.println("Student name is " + LearnStatic.name);

        // Create Object
        LearnStatic learn = new LearnStatic();
        System.out.println(learn.address);

        LearnStatic.display(); // call by class name because of static method
        learn.tvDisplay(); // call by object name because of non-static method
    }

    public static void display() {   // 1 static method, call in main method by class_name
        System.out.println("This is a display method");
    }

    public void tvDisplay() {    // 1 non-static method, call in main method by object
        System.out.println("This is a TV display method");
    }

}
