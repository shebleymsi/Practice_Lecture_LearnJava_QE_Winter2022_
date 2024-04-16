package oop.polymorphism.methodOverriding;

import java.io.OutputStream;
import java.io.PrintStream;

public class Test1 extends PrintStream {


    public Test1(OutputStream out) { // v31 03.18.31
        super(out);
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eating(); // “eating()” is coming from “Cat --> Class”
        cat.catInfo(); //02.38.20

        System.out.println("**********************************");

        Animal animal = new Cat();
        animal.eating();
        // animal.catGroupFood(); // not possible, because catGroupFood() is not "Animal-->interface" property

        System.out.println("**********************************");


        Tiger tiger = new Tiger();
        tiger.catInfo(); // cat.catInfo(); //02.38.20
        tiger.run();
        tiger.sleep();
        tiger.animalDetails();
        tiger.catGroupColor();
        tiger.catGroupPrice();
        tiger.catGroupSize();

        System.out.println("**********************************");

        Cat myCat = new Tiger();
        myCat.catInfo();

        System.out.println("**********************************");

//         Tiger myTiger = new Cat();  // not possible, so need casting, see the next line
//         Tiger myTiger = (Tiger) new Cat();   // ClassCastException [ see in console ] 02.42.52
//         myTiger.catInfo();

        /* “Even though the method is defined in the parent class,
         if the child class overrides it's using the @Override annotation,
         whenever we call the parent class method,
         it is actually executed by the child class’s overriding method.” */

        System.out.println("**********===********************");

        Test1 test1 = new Test1(System.out);

        test1.println();

    }

    // Override method from JDK System.out.println()  PrintStream class
    @Override
    public void println() {
        System.out.println("We are learning method overriding");
    }

}
