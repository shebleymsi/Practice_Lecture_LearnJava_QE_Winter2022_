package oop.abstraction;

public class TestGM {

    // TestGM ==> Test GeneralMotor.java class
    // objective: Test class where we will call all the action method from concrete class


    public static void main(String[] args) {

        GeneralMotor gm = new GeneralMotor();        // 1st type
        gm.gmCarInfo();
        gm.carStart();
        gm.carEngine();
        gm.carWheel();
        gm.carAcceleration("GM2025T", 75000); // v30 01.53.45
        gm.largeDisplay();
        gm.gps();
        gm.camera360View();
        gm.autoPilotAbsBreak();


        GeneralMotor gm1 = new GeneralMotor(); // Constructor call by object name
        gm1.carSteering();
        System.out.println(gm1.gmCarName);
        gm1.gmCarQuantity = 300;
        System.out.println(gm1.gmCarQuantity);


        System.out.println(gm.seat); // output is 2, coming from interface // v30 01.59.55

        gm1.boostEngine();
        gm1.flyingFeature();
        gm1.sensor();
        gm1.sunRoof();
        gm1.carSteering();


        System.out.println("***********************************************");

        // Create object
        GeneralMotor gm2 = new GeneralMotor();


        // Interface car type do not have largeDisplay()
        Car myCar = new GeneralMotor(); // 02.00.51                 // 2nd type
        myCar.carStart();  // carStart() from  GeneralMotors class
        myCar.carStop();    // just for example show for lecture time
        myCar.carSteering(); // just for example show for lecture time


        // shebely
        // largeDisplay() is custom method inside GeneralMotor class
        // Interface car type do not have largeDisplay(), so largeDisplay() is not allow
        // myCar.largeDisplay(); // --> uncomment and check this row when  i read future
        // but if we want largeDisplay() call by myCar object name we have to Casting the type

        // Casting the type
        ((GeneralMotor) myCar).largeDisplay(); // v30 02.30.14 // call all custom method from GeneralMotor class

        System.out.println("***********************************************");

        Tesla tesla = new Tesla();
        tesla.airBag();
        tesla.flyingFeature();
        tesla.autoPilot();
        tesla.flyingCarInformation(); // non-abstract method
        tesla.carStart();


        ElectricCar ec = new Tesla();
        // accessibility depends on left site of object

        ec.electricCarFeature(); // from ElectricCar
        // ec.boostEngine(); // its not inside ElectricCar, it's from “Tesla → class”, so it's not accessible


    }


}
