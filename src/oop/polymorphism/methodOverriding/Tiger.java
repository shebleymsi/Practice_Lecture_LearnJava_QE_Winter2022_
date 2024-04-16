package oop.polymorphism.methodOverriding;

public class Tiger extends Cat {

    @Override
    public void catInfo() {
        //  super.catInfo();
        /*  v31 02.45.41 super.catInfo(); ==> show immediate class info but our main conception is override,
          so we don't need this position. we want to see which method is reflecting. */
        System.out.println("Tiger Info");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger Love to sleep");
    }


    @Override
    public void animalDetails() {
        System.out.println("Hello");
    }


    @Override
    public void catGroupColor() {
        System.out.println("Tiger color is Brown and black mixed");
    }

    @Override
    public void catGroupSize() {
        System.out.println("Tiger size is big");
    }



}
