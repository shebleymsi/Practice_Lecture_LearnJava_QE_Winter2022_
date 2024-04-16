package basic;

public class LearnObject {

    // Object: An instance of a class and it will help us to call the states/variables and behavior/ Methods

    public static void main(String[] args) {

        // How to create an object?
        // className  objectName = new constructorOfClass();
        // using object we can call the states and behavior

        // Mobile
        Mobile yourMobile = new Mobile();
        yourMobile.mobileName = "LG"; // reAssign value
        System.out.println("Your Mobile " + yourMobile.mobileName);
        int lgQty = 10;
        int lgTotalPrice = yourMobile.mobilePrice * lgQty;
        System.out.println("LG Total Price " + lgTotalPrice);

        // can we create multiple object of same class?

        Mobile herMobile = new Mobile();
        herMobile.mobileName = "Nokia";
        System.out.println("Her Mobile " + herMobile.mobileName);
        int nokiaQty = 5;
        int nokiaTotalPrice = herMobile.mobilePrice * nokiaQty;
        System.out.println("Nokia Total Price " + nokiaTotalPrice);

        Mobile hisMobile = new Mobile();
        hisMobile.mobileName = "iPhone";
        System.out.println("His Mobile " + hisMobile.mobileName);
        int iPhoneQty = 7;
        int iPhoneTotalPrice = hisMobile.mobilePrice * iPhoneQty;
        System.out.println("iPhone Total Price " + iPhoneTotalPrice);

    }

}
