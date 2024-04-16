package problemsSolvingSession;

public class NestedClassPractice {

    /*Nested class has 2 parts
     * 1. Parent Class
     * 2. Child class
     */

    //The Parent Class Section:
    double tiketPrice = 800.50;
    static String flightDestination = "Washington to Dhaka";
    //public NestedClassPractice travel = new NestedClassPractice();

    // The Child Class Section:
    public static class Vacation {
        String travelDate = "April 20, 2022";
        static int numberOfPassengers = 5;


        // The main method under Child Class Section:
        public static void main(String[] args) {
            NestedClassPractice travelDetails = new NestedClassPractice();
            Vacation traveldate = new Vacation();

            System.out.println("Travel route is " + NestedClassPractice.flightDestination);
            System.out.println("Per passenger ticket price is $" + travelDetails.tiketPrice);
            System.out.println("Tentitive travel date is " + traveldate.travelDate);
            System.out.println("Number of passengers are " + Vacation.numberOfPassengers);
        }
    }


    // The main method under Parent Class Section:
    public static void main(String[] args) {
        Vacation travelTime = new Vacation();
        System.out.println("Date is " + travelTime.travelDate);
        System.out.println("Total passengers are " + Vacation.numberOfPassengers);
    }
}
