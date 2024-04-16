package method;

public class ReturnTypeMethodWithoutParameter {

    // Return Type Method Without Parameter
    // AccessModifier DataType/Class/Object methodName(){ return ;   }
    // Return Type : All type of Data, void , class type and object type
    // Method Naming: verb+Noun/ Adjective
    // method name should start with lower case
    // void is a keyword which indicate non-return type method

    public void getDisplay() { // non-return type method
        System.out.println("This is our Display method");
    }

    // AccessModifier DataType/Class/Object methodName(){ return ;   }
    public int doSummation() {  // Return Type Method Without Parameter
        System.out.println("This is Do summation Method");
        int number1 = 20;
        int number2 = 30;
        int total = number1 + number2;
        System.out.println("Total value is " + total);
        return total;
    }

    public int doSummation1() {
        System.out.println("This is Do summation1 Method");
        int number1 = 20;
        int number2 = 30;
        System.out.println("Total value is " + number1 + number2);
        return number1 + number2;
    }

    public double doMultiplication() {
        double num1 = 56;
        int num2 = 44;
        double multi = num1 * num2;
        // System.out.println("Multiplication value "+multi);
        System.out.println("Multiplication value " + num1 * num2);
        return num1 * num2;
    }

    public String getStudentInformation() {
        String fName = "James";
        String lName = "William";

        String fullName = fName + " " + lName;
        System.out.println("Full Name " + fullName);
        return fullName;
    }

    public boolean isPizzaAvailable() {
        boolean isAvailable = true;

        System.out.println("Pizza availability " + isAvailable);
        return isAvailable;
    }

    public static void main(String[] args) {

        // non-static method call by object name

        ReturnTypeMethodWithoutParameter obj = new ReturnTypeMethodWithoutParameter();

        //    obj.getDisplay();
        obj.doSummation(); // call by object name
        obj.doMultiplication();
        obj.getStudentInformation();
        obj.isPizzaAvailable();

    }

}
