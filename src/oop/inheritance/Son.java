package oop.inheritance;

public class Son extends Father { // Son extends Father, so its multi-level inheritance 05.20.00

    // variable
    public String sonFavouriteColor = "Red";
    public String sonFavouriteFood = "Chicken";
    public String sonFavouriteSports = "GTA";

    private String sonSSN = "93534534534";
    private String sonBankAccountNumber = "97567567567";

    // Method
    public void sonTrustWorthy() {
        System.out.println("SON is TrustWorthy");
    }

    public void sonFavMovie() {
        System.out.println("SON Fav movie Batman");
    }

    public void sonFavProgramingLanguage() {
        System.out.println("SON Fav Programing language is java");
    }

    public void sonHeight() {
        System.out.println("SON height was 5.4");
    }

    public void sonWeight() {
        System.out.println("SON weight was 140lbs");
    }

    // constructor


    public Son() { //default constructor
    }

    public Son(String sonFavouriteColor) { //single parameterized constructor
        this.sonFavouriteColor = sonFavouriteColor;
    }

    // Getter and Setter *********************************************************
    public String getSonSSN() {
        return sonSSN;
    }

    public void setSonSSN(String sonSSN) {
        this.sonSSN = sonSSN;
    }

    // Getter and Setter *********************************************************
    public String getSonBankAccountNumber() {
        return sonBankAccountNumber;
    }

    public void setSonBankAccountNumber(String sonBankAccountNumber) {
        this.sonBankAccountNumber = sonBankAccountNumber;
    }


}
