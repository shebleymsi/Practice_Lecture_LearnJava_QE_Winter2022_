package basic;

public class LearnConcatenation {
    // Con cat e nation : + combine a variable with a String
    public static void main(String[] args) {

        int age = 24;
        String firstName = "Tajwar";
        String lastName = "Hamid";

        //System.out.println(name);
        System.out.println("Student First Name is : " + firstName); // Student First Name is : Tajwar
        System.out.println("Student Full Name is : " + firstName + " " + lastName); // Student Full Name is : Tajwar Hamid

        // first name and age
        // output
        // First Name Tajwar and age is 24
        System.out.println("First Name " + firstName + " and age is " + age); //First Name Tajwar and age is 24

// ********************************************************************************

        //System.out.println(salary);
        System.out.println(LearnVariable.salary); // here salary variable call by class name, it was s static variable

        LearnVariable learn = new LearnVariable(); // here call non-static variable by creating object from LearnVariable.java class, it was non-static variable
        System.out.println(learn.instructorName);
    }
}
