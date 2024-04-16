package oop.abstraction;

public interface Car {

    // Interface is a guideline for future / roadmap for future / further development
    // Interface is 100% Abstract


    // String name; // variable can not instantiate/ declare
    String name = null; // variable must have to assign value in Interface
    String seat = "2";
    int headLight = 4;
    boolean isGasTankAvailable = true;
    double price = 0;


    // Declare method with body
//    public void display(){
//        System.out.println("This is Display method");
//    }

    // Declare method without body
    public void display();
    public void carStart();
    public void carStop();
    public void carWheel();
    public void carEngine();
    public void carSteering();
    public void carAcceleration(String info, int price);

    /*
    It allows to create main method inside the interface if under one package there are multiple classes/interfaces,
    we will not create main method inside every class/interface, we create a main method inside any one class/Interface
    and then call all methods inside that's main method.
    */

//    public static void main(String[] args) {
//        System.out.println("hello");
//
//        Car myCar=new Car();
//    }

    // it's not allowed to create an object of interface
    //  Car myCar=new Car();


    //  An interface which is declared inside another interface is referred as nested interface.
    public interface DemoCar { // nested interface is allow v30 03.09.24
        public void demoCarInfo();

    }


}
