package oop.polymorphism.methodOverriding;

public abstract class CatGroup {
    String catGroupName;
    double catGroupFoodPrice=222.56;


    public abstract void catGroupInfo();
    public abstract void catGroupFood();
    public abstract void catGroupMakeNoise();
    public abstract void catGroupColor();

    public void catGroupPrice(){
        System.out.println("Cat Group price is expensive");
    }


    public void catGroupSize(){
        System.out.println("Cat group size");
    }



}
