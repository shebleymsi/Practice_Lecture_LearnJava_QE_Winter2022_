package oop.abstraction;

public abstract class ModernCar {

    // Abstract class : is not fully abstract

    // Variable same as Regular class [ both type ] : 1.Declare variable; 2.Assigning variable;
    String modernCarName;
    double modernCarPrice=80000.500;


    // Regular method/ non-abstract method
    public void autoDrive(){
        System.out.println("Modern Car has Auto Driving feature");
    }


    // Abstract method:
    public abstract void gps();
    public abstract void camera360View();
    public abstract void sunRoof();
    public abstract void autoStop();
    public abstract void parkingSensor();


    public static void main(String[] args) { //v30 02.41.20

        // Abstract can not instantiate, can not allow creating the object of abstract class
        // ModernCar modernCar=new ModernCar(); //v30 02.41.50

    }


}
