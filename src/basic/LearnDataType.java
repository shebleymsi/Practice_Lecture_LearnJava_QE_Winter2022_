package basic;

public class LearnDataType {

    // Data Type : Primitive Data type & Non-Primitive Data type
    // Primitive Data type
    // boolean
    // char
    // byte
    // short
    // int
    // long
    // float
    // double
    boolean pizzaIsAvailable = false; // 1bits
    char pizzaSize = 'L'; // single character, 16bits
    byte number = -128; // 8bits
    short salary = 32000; // 16bits
    int totalSale = 2000000000; // 32bits
    long annualSale = 3333435345345343L; // 64 bits
    float pizzaPrice = 3.123456f; // 32bits
    double totalOrderNumber = 3.123456789012345d; // 64bits

    // Non-Primitive Data type: String, array, defineClass
    String name = "Ahmed";
    // Array
    public static void main(String[] args) {

        int num = 33;
        String firstName = "Tajwar";
        String lastName = "Hamid";
        System.out.println(num); // calling a variable
        System.out.println(firstName); // calling a variable
        System.out.println(lastName); // calling a variable
        System.out.println("tajwar");

        int number1 = 40;
        int number2 = 60;
        int totalNumber = number1 + number2;
        System.out.println(totalNumber); // calling a variable

        System.out.println("************************Invoice***********************************");
        System.out.print("Accounts Details of ");
        System.out.print(firstName + " "); // calling a variable
        System.out.println(lastName); // calling a variable
        System.out.print("Salary : ");
        double salary = 12000.500;
        System.out.println(salary);
        double annualGrossSalary = salary * 12;
        double annualNetSalary = annualGrossSalary - (annualGrossSalary * .3);
        //System.out.println(salary  *   12);
        System.out.print("Annual Gross Salary : ");
        System.out.println(annualGrossSalary);
        System.out.print("Annual Net Salary : ");
        System.out.println(annualNetSalary);
        System.out.println("***********************************************************");

    }


}
