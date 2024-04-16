package basic;

public class Student { // this class create by Shebley for example of Instance variables.

    /*In Java, an instance variable is a variable that belongs to an instance (object) of a class.
     It is declared within the class but outside of any method or constructor.
      Each instance of the class has its own copy of the instance variable,
       allowing objects to have their unique states.
     */

    // Instance variables
    String name;
    int age;
    double grade;

    // Constructor to initialize instance variables
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student("Shebley", 38, 92.5);

        // Accessing and displaying instance variable values
        student1.displayInfo();
    }
}
