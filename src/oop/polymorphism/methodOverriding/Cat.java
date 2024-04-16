package oop.polymorphism.methodOverriding;

import java.util.ArrayList;
import java.util.List;

public class Cat extends CatGroup implements Animal {

    // Annotation @Override

    @Override
    public void eating() {
        System.out.println("Cat love to eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat love to sleep early");
    }

    @Override
    public void run() {
        System.out.println("Cat love to run");
    }

    // *************************************** 2nd step create for tiger class *******************************
    public void catInfo() {
        System.out.println("Cat Info");
    }


    public void animalDetails() {
        System.out.println("Cat love to eat fish, meat and rat");
    }

    @Override
    public void catGroupInfo() {

    }

    @Override
    public void catGroupFood() {

    }

    @Override
    public void catGroupMakeNoise() {

    }

    @Override
    public void catGroupColor() {

    }

    @Override
    public void catGroupSize() {
        System.out.println("Cat size is small");
    }
}
