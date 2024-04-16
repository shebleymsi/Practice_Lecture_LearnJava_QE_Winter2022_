package oop.inheritance;

public class GrandFather {

    // variable
    public String gfFavouriteColor = "White";
    public String gfFavouriteFood = "Fish";
    public String gfFavouriteSports = "Cricket";

    private String gfSSN = "23534534534";
    private String gfBankAccountNumber = "67567567567";


    // Method
    public void gfUnconditionalLove() {
        System.out.println("Grand Father had unconditional Love");
    }

    public void gfSmoking() {
        System.out.println("Grand Father love to smoke");
    }

    public void gfHeight() {
        System.out.println("Grand Father height was 5.8");
    }

    public void gfWeight() {
        System.out.println("Grand Father weight was 170lbs");
    }


    // constructor
    public GrandFather() {

        System.out.println(" GF class default constructor");

    }

    public GrandFather(String gfFavouriteColor) {
        this.gfFavouriteColor = gfFavouriteColor;
    }

    public GrandFather(String gfFavouriteColor, String gfFavouriteFood) {
        this.gfFavouriteColor = gfFavouriteColor;
        this.gfFavouriteFood = gfFavouriteFood;
    }

    public GrandFather(String gfFavouriteColor, String gfFavouriteFood, String gfFavouriteSports) {
        this.gfFavouriteColor = gfFavouriteColor;
        this.gfFavouriteFood = gfFavouriteFood;
        this.gfFavouriteSports = gfFavouriteSports;
    }

    public GrandFather(String gfFavouriteColor, String gfFavouriteFood, String gfFavouriteSports, String gfSSN, String gfBankAccountNumber) {
        this.gfFavouriteColor = gfFavouriteColor;
        this.gfFavouriteFood = gfFavouriteFood;
        this.gfFavouriteSports = gfFavouriteSports;
        this.gfSSN = gfSSN;
        this.gfBankAccountNumber = gfBankAccountNumber;
    }


    // Getter and Setter*************************************************************
    public String getGfSSN() {
        return gfSSN;
    }

    public void setGfSSN(String gfSSN) {
        this.gfSSN = gfSSN;
    }


    // Getter and Setter*************************************************************
    public String getGfBankAccountNumber() {
        return gfBankAccountNumber;
    }

    public void setGfBankAccountNumber(String gfBankAccountNumber) {
        this.gfBankAccountNumber = gfBankAccountNumber;
    }


}
