package basic;

public class LearnVariable {

    // Variable: is a container which can hold value
    // vary able: value will change based on its need
    // What is variable?
    // Create a variable
    // DataType varaibleName = varaibleValue; // --> syntax
    // Variable name should be meaningfully
    String instructorName = "Mahmud";
    public String address = "Queens,NY";

    // String is a Data type
    // instructorName is a variable name
    // = is Assignment operator
    // "Mahmud" is a string value which is a string type of data

    // Declare a variable --> without assigning value is called Declare a variable
    String name;
    // Declare a variable and Assign value
    String studentName = "Tajwar";

    int age = 24; // global instance variable
    static int salary = 5000; // global static variable

    // left side  variableName = right side value
    // a = 5;
    // class level variable have multiple name: Global variable/ global scope/ class variable / instance variable
    // Any variable you created inside of a class but outside of a method is called class level variable
    // Any variable you created inside of a method is called local variable

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        int c = b;
        int d = b - c;
        int e = b * c;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(salary);

        // static global variable is called by class name
        System.out.println(LearnVariable.salary);
        System.out.println(salary); // static global variable called by class name, but here its same clas, so its work.its not obey the rule.

        // non static variable we can not call directly or using class name.
        // create object:
        // className objectName = new constructorOfClass(); // syntax of object
        LearnVariable obj = new LearnVariable();
        System.out.println(obj.age);

        LearnVariable le = new LearnVariable();
        LearnVariable.salary = 6666; // ReAssign value
        le.age = 34;

        LearnVariable.salary = 7777;
        le.salary = 7777; // though it is work but its not a good process by creating object // v20 00.28.21 //00.31.02
        salary = 9999; // without class name and object name , because of same class thats why its work, but not good way
        LearnVariable.salary = 7777; // static variable we called by class name , its professional  good way.

        System.out.println(LearnVariable.salary);
        System.out.println(le.age);

        // mobile phone: battery,camera,ram,microphone,speaker

        // class {   variable, methods                             }
        // obj is an instance of class

        Tauseef ta = new Tauseef();
        ta.length = 100; // ReAssign value
        System.out.println(ta.length);

        ta.name = "Ahmed";
        ta.name = "Husna";
        ta.name = "Shebley";
        ta.name = "Husna";
        ta.name = "Shebley";
        System.out.println("Student Name : " + ta.name);

        ta.address = "bronx,NY";
        System.out.println("Address : " + ta.address);

    }

}
