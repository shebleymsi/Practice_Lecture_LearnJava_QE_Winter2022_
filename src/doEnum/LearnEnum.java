package doEnum;

public class LearnEnum {

    // Enum: Enum declaration can be done outside a class or inside a class but not inside a method
    // Enum vs Class:
    // An enum can just like a class have attributes and methods
    // Enum constants are public,static,final,unchangeable, can not override
    // An enum can not be used to create objects and it can not extends other classes but it can implement interfaces

    // Use enums when you have values that you know are not going to change
    // Ex Days, Colors
    public static void main(String[] args) {
        System.out.println(Day.TUESDAY);
        System.out.println(MobileBrand.LG);
        System.out.println(Color.GREEN);
        System.out.println(LEVEL.MEDIUM);
        System.out.println(LEVEL.LOW);
        System.out.println(LEVEL.MEDIUM.name);
        System.out.println(LEVEL.LOW.name);
        System.out.println(LEVEL.name);
        System.out.println(LEVEL.levelInfo());
    }
    //******************************************************************************************************************
    /*Enum declaration can be done outside a class or inside a class but not inside a method
     JDK11 not Support “enum’ inside the method but JDK16 can support to create “enum” inside the method.*/
    public void display() {
//         enum LEVEL{
//
//        }
    }
    //******************************************************************************************************************


    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


    public enum MobileBrand {
        APPLE, LG, NOKIA, MOTOROLA

    }


}


enum Color {
    RED, GREEN, YELLOW, BLUE
}

