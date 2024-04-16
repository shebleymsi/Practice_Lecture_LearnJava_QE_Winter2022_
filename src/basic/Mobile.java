package basic;

public class Mobile {        // this class related with LearnObject class.

    public Mobile() {
        System.out.println("Yahoo");
    }


    // states: property
    String mobileName = "iPhone";
    int mobileRamSize = 12;
    int mobileMemorySize = 256;
    static String mobileColor = "Rose Golden";
    public int mobilePrice = 1200; // ‘public’ for use different package


    // behavior: method or function
    public void calling() {
        String mobileNumber = "9557890809";
        //	System.out.println("My Mobile Number "+mobileNumber);
//		System.out.println("Using mobile phone we can call mahmud vai/brother");
//		System.out.println("Using mobile phone we can call mahmud vai/brother1");
//		System.out.println("Using mobile phone we can call mahmud vai/brother2");
//		System.out.println("Using mobile phone we can call mahmud vai/brother3");
//		System.out.println("Using mobile phone we can call mahmud vai/brother4");

    }

    public boolean isAvailable() {
        return false;
    }


    public static void main(String[] args) {

        // How to create an object?
        // className  objectName = new constructorOfClass();
        // using object we can call the non-static states and behavior


        Mobile tajwarMobile = new Mobile();
        //tajwarMobile.mobileName;    not allowed
        System.out.println(tajwarMobile.mobileName); // allowed to call variable using object name to print the value

        tajwarMobile.mobileName = "Samsung"; // allowed to call variable using object name to reAssign the variable value

        String newMobile = tajwarMobile.mobileName; // declare the datatype for reassigning value's.
        System.out.println("New Mobile " + newMobile); // print the reassigning value.

        System.out.println("*********************************************");

        tajwarMobile.calling(); // method is called by object name

        // System.out.println(tajwarMobile.calling());  // this way method call not allowed
        System.out.println(tajwarMobile.isAvailable());

    }


}
