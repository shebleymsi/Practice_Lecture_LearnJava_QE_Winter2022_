package oop.inheritance;

import oop.abstraction.Mobile;

public class Father extends GrandFather {


    // variable
    public String fFavouriteColor = "Blue";
    public String fFavouriteFood = "Beef";
    public String fFavouriteSports = "Soccer";

    private String fSSN = "63534534534";
    private String fBankAccountNumber = "87567567567";

    // Method
    public void fTrustWorthy() {
        System.out.println("Father is TrustWorthy");
    }

    public void fLoveToPlay() {
        System.out.println("Father love to play soccer");
    }

    public void fHeight() {
        System.out.println("Father height was 5.9");
    }

    public void fWeight() {
        System.out.println("Father weight was 180lbs");
    }

    // constructor
    public Father(String fFavouriteColor) {
        this.fFavouriteColor = fFavouriteColor;
    }


    // three use case of super keyword use inside default constructor*****************
    public Father() {
        // Calling constructor
        //  03.super constructor calling example
        super(); // super class / call the parent class constructor
        //  this line [super();] should be the 1st line inside the constructor body
        System.out.println("yahoo");
    }


    public void getInfoFromParent() {
        // calling variable
        // 01.super variable calling example
        System.out.println(super.gfFavouriteColor); //-super is used to refer immediate parent class instance variable
        // calling method
        // 02.super method calling example
        System.out.println(super.getGfSSN()); // -super is used to refer parent class method
    }

    // Getter and Setter *************** Private variable from Grandfather **********//  v30 05.11.28
    public String getfSSN() {
        return fSSN;
    }

    public void setfSSN(String fSSN) {
        this.fSSN = fSSN;
    }

    // Getter and Setter********************Private variable from Grandfather *********//  v30 05.11.50
    public String getfBankAccountNumber() {
        return fBankAccountNumber;
    }

    public void setfBankAccountNumber(String fBankAccountNumber) {
        this.fBankAccountNumber = fBankAccountNumber;
    }


    // Getter and Setter*************************************************************
    public String getfFavouriteColor() {
        return fFavouriteColor;
    }

    public void setfFavouriteColor(String fFavouriteColor) {
        this.fFavouriteColor = fFavouriteColor;
    }

    // Getter and Setter*************************************************************
    public String getfFavouriteFood() {
        return fFavouriteFood;
    }

    public void setfFavouriteFood(String fFavouriteFood) {
        this.fFavouriteFood = fFavouriteFood;
    }

    // Getter and Setter*************************************************************
    public String getfFavouriteSports() {
        return fFavouriteSports;
    }

    public void setfFavouriteSports(String fFavouriteSports) {
        this.fFavouriteSports = fFavouriteSports;
    }


}
