package constructor;

import basic.Mobile;

public class LearnConstructor {

    // Constructor:
    // Constructor name should be same as class name
    // Constructor has no return type ==> return type means:- not return any value or any particular execution result.
    // Constructor is used to initialize object

    // How to create constructor???
    // AccessModifier className/ConstructorName () {   }

    String name = "james";
    int age;
    String address;
    double salary;

    // Default constructor: Without any parameter : RELATED row number 86
    public LearnConstructor() { // start point
        System.out.println("hello");
        System.out.println("hello1");
        System.out.println("hello2");
    } // end point

    // Single parameterize Constructor
    public LearnConstructor(String name) { // Constructor parameterized value we will set in main method's object's constructor

        System.out.println(this.name);
    }

    // Multi Parameterize constructor
    public LearnConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is " + this.name + " " + "Age is " + this.age);
    }

    // String , int , String
    public LearnConstructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Student name is " + this.name + " " + "Age is " + this.age + " Address is " + this.address);
    }

    // Signature pattern: String , String , int
    public LearnConstructor(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
//      System.out.println(this.name);
//      System.out.println(this.address);
//      System.out.println(this.age);
    }

    //     Signature pattern: int ,String , String ,
    public LearnConstructor(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }


    public LearnConstructor(int b, String c, String d, double salary) {

    }

    public LearnConstructor(double salary, int b, String c, String d) {

    }

    public LearnConstructor(int b, double salary, String d) {

    }

    public LearnConstructor(int b, double salary, String c, String d) {

    }

    public static void main(String[] args) {

        // How to create an object?
        // className  objectName = new constructorOfClass();

        LearnConstructor obj = new LearnConstructor();
        // here,  call the previous(row_21) Default constructor : row number 20 to 25
        // because of this LearnConstructor() in the above line we can call previous(row_21) Default constructor : row number 20 to 25
        Mobile mob = new Mobile();

        int age = 45;

        System.out.println(obj.name);

        System.out.println("========================================================");

        LearnConstructor wasee = new LearnConstructor("Ahmed");  // Argument passing inside the constructor
        LearnConstructor nadia = new LearnConstructor("Irin");  // Argument passing inside the constructor

        LearnConstructor tajwar = new LearnConstructor("naina", 23);
        LearnConstructor jamal = new LearnConstructor("Shebley", 34, "FL,USA");
        System.out.println("=========================+++++===============================");

        LearnConstructor husna = new LearnConstructor("Husna", "huston,TX", 21);

        husna.address = "Florida";
        System.out.println(husna.address); // done v24 00.55.15

    }


}
