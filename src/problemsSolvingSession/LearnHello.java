package problemsSolvingSession;

import basic.LearnAccessModifier;
import basic.LearnNestedClass.Computer;
import basic.LearnVariable;
import basic.Mobile;


public class LearnHello {


    public static void main(String[] args) {
        // main method is called driver method or executable method

        // display();
        System.out.println("hello Saiful");

        // calling a method inside main method
        display();
        tvDisplay();

        LearnVariable learn = new LearnVariable();
        //System.out.println(learn.instructorName);
        System.out.println(learn.address);

        // object
        LearnAccessModifier lm = new LearnAccessModifier();
        System.out.println(lm.name);
        //System.out.println(lm.address);
        //System.out.println(lm.bankAccountNumber);
        //System.out.println(LearnAccessModifier.price);

        System.out.println("********* Default");
        //System.out.println(lm.address);

        //lm.display();

        // [ variable use from different package, we have to declare that's variable public ]
        Computer tauseefComputer = new Computer();
        System.out.println(tauseefComputer.computerName);
        System.out.println(Computer.ram); // msi

        /*
        Example:‘Mobile.java’ class from ‘basic’ package.
        Another ‘LearnHello.java’ class from ‘probleSolvingSession’ package.
        Now we want to create an object of ‘Mobile.java’ class inside the different ‘LearnHello.java’ class
        which ‘probleSolvingSession’ package
        */
        Mobile jamalMobile = new Mobile();
        System.out.println(jamalMobile.mobilePrice);

    }

    public static void display() {              // call in main method
        System.out.println("Hello Irin");
    }

    public static void tvDisplay() {                   // call in main method
        System.out.println("This is TV Display");
    }


}
