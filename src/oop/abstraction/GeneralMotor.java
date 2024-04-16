package oop.abstraction;

public class GeneralMotor extends FlyingCar implements Car, AutoPilot {
    // Concrete class
    String gmCarName = "GM2025";
    double gmCarPrice = 70000.500;
    int gmCarQuantity = 200;
    String gmCarReleaseYear = "2025";
    String gmCarMarketingCost;

    public GeneralMotor() {

    }

    public GeneralMotor(String gmCarName) {
        this.gmCarName = gmCarName;
    }

    public GeneralMotor(String gmCarName, double gmCarPrice) {
        this.gmCarName = gmCarName;
        this.gmCarPrice = gmCarPrice;
    }

    public GeneralMotor(String gmCarName, double gmCarPrice, int gmCarQuantity) {
        this.gmCarName = gmCarName;
        this.gmCarPrice = gmCarPrice;
        this.gmCarQuantity = gmCarQuantity;
    }

    public GeneralMotor(String gmCarName, double gmCarPrice, int gmCarQuantity, String gmCarReleaseYear) {
        this.gmCarName = gmCarName;
        this.gmCarPrice = gmCarPrice;
        this.gmCarQuantity = gmCarQuantity;
        this.gmCarReleaseYear = gmCarReleaseYear;
    }

    public GeneralMotor(String gmCarName, double gmCarPrice, int gmCarQuantity, String gmCarReleaseYear, String gmCarMarketingCost) {
        this.gmCarName = gmCarName;
        this.gmCarPrice = gmCarPrice;
        this.gmCarQuantity = gmCarQuantity;
        this.gmCarReleaseYear = gmCarReleaseYear;
        this.gmCarMarketingCost = gmCarMarketingCost;
    }


    public void gmCarInfo() {
        System.out.println("This is GM Car Info");
    }

    public void gmCarPricePolicy(String policy) {
        System.out.println("This is Gm Car Price " + policy);
    }

    public void largeDisplay() {
        System.out.println("GM Car has large display feature");
    }

    public void display() {
        System.out.println("This is GM Car Display");
    }

    public void carStart() {
        System.out.println("This is GM Car Start Feature");
    }

    public void carStop() {
        System.out.println("This is GM Car Stop Feature");
    }

    public void carWheel() {
        System.out.println("This is GM Car Wheel Feature");
    }

    public void carEngine() {
        System.out.println("This is GM Car Engine Feature");
    }

    public void carSteering() {
        System.out.println("This is GM Car Steering Feature");
    }

    public void carAcceleration(String info, int price) {
        System.out.println("This is GM Car Acceleration Feature");
        System.out.println("Car Model " + info + " Price: " + price);
    }


    public void gps() {
        System.out.println("This is GM Car GPS Feature");
    }

    public void camera360View() {
        System.out.println("This is GM Car camera360View Feature");
    }

    public void sunRoof() {
        System.out.println("This is GM Car sunRoof Feature");
    }

    public void autoStop() {
        System.out.println("This is GM Car autoStop Feature");
    }

    public void parkingSensor() {
        System.out.println("This is GM Car parkingSensor Feature");
    }


    public void autoPilot() {
        System.out.println("This is GM Car autoPilot Feature");
    }

    public void autoPilotAbsBreak() {
        System.out.println("This is GM Car autoPilotAbsBreak Feature");
    }

//    public int display() {
//        return 23;
//    }

    public void electricCarFeature() {
        System.out.println("This is GM Car electricCarFeature Feature");
    }


    public void boostEngine() {
        System.out.println("This is GM Car boostEngine Feature");
    }

    public void flyingFeature() {
        System.out.println("This is GM Car flyingFeature Feature");
    }

    public void airBag() {
        System.out.println("This is GM Car airBag Feature");
    }

    public void sensor() {
        System.out.println("This is GM Car sensor Feature");
    }
}
