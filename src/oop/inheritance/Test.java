package oop.inheritance;

public class Test {


    public static void main(String[] args) {

        Father myFather = new Father(); // single level inheritance

        myFather.gfHeight();
        myFather.gfSmoking();
        myFather.fTrustWorthy(); //05.08.32
        myFather.fWeight(); //05.08.50
        myFather.fLoveToPlay(); // 05.11.21

        //   System.out.println(myFather.gfFavouriteColor);

        //   ***Is it possible one class can Inherit from different package to another class? 04.35.26
        //      ⇒ Package does not matter if you have public properties.
        //   System.out.println(myFather.mobileName); // v30 04.35.26

        myFather.getInfoFromParent();



        myFather.setfSSN("779879879"); // v30.05.13.49 --> use for private key word properties calling by: Getter and Setter
        System.out.println(myFather.getfSSN());

        myFather.setGfSSN("999999987"); // v30.05.14.10 --> use for private key word properties calling by: Getter and Setter
        System.out.println(myFather.getGfSSN());


        Son tajwar = new Son(); // multi level inheritance 05.15.33 start, // 05.20.07
        tajwar.gfWeight(); // this is from GrandFather class
        tajwar.fHeight(); // this is from Father class
        tajwar.sonFavProgramingLanguage(); // this is from self/Son class


        System.out.println("****************************************"); // v30 05.22.50
        // Class type is allowing us to access in the property // v30 05.22.50
        Father ahmed = new Son(); // "Father" type properties only we can access
        ahmed.fTrustWorthy();
        // ahmed.sonTrustWorthy(); // its not possible because "fTrustWorthy()" is not exist in "Father" class.
        // so we need casting
        ((Son) ahmed).sonTrustWorthy();


    }


}
