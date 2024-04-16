package oop.inheritance;

public class Daughter extends Father { // Daughter & Son extends Father, so its Hierarchical inheritance 05.29.13


    // variable
    public String dFavouriteColor = "Pink";
    public String dFavouriteFood = "Pizza";
    public String dFavouriteSports = "Badminton";

    private String dSSN = "93534534534";
    private String dBankAccountNumber = "97567567567";

    // Method
    public void dTrustWorthy() {
        System.out.println("Daughter is TrustWorthy");
    }

    public void dFavMovie() {
        System.out.println("Daughter Fav movie Batman");
    }
    public void dFavProgramingLanguage() {
        System.out.println("Daughter Fav Programing language is java Script");
    }
    public void dHeight() {
        System.out.println("Daughter height was 5.5");
    }

    public void dWeight() {
        System.out.println("Daughter weight was 120lbs");
    }

    // constructor

    public Daughter() { // default contracture

    }

    // Getter and Setter *********************************************************
    public String getdSSN() {
        return dSSN;
    }

    public void setdSSN(String dSSN) {
        this.dSSN = dSSN;
    }

    // Getter and Setter *********************************************************

    public String getdBankAccountNumber() {
        return dBankAccountNumber;
    }

    public void setdBankAccountNumber(String dBankAccountNumber) {
        this.dBankAccountNumber = dBankAccountNumber;
    }
}
