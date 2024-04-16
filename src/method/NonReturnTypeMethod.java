package method;

public class NonReturnTypeMethod {

    // Non-Return Type Method: void type
    // Non-Return Type Method without parameter
    // AccessModifier returnType methodName(){}
    // Return type is void always

    public void tvDisplay() {
        System.out.println("This is Tv Display method");

    }

    public void doSum() { // Non-Return Type Method: void type
        int num1 = 45;
        int num2 = 46;
        int total = num1 + num2;
        System.out.println("Total value " + total);
    }

    public int doSummation() {  // return Type Method: Return Type : All type of Data, void , class type and object type
        int num1 = 45;
        int num2 = 46;
        int total = num1 + num2;
        System.out.println("Total value " + total);
        return total;
    }

    // Non-Return Type Method with parameter

    public void doSum1(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total value " + total);
    }

    public void doSum2(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        System.out.println("Total value " + total);
    }

    public void doSubtraction(double num1, double num2, double num3) {
        double sub = num1 - num2 - num3;
        System.out.println("Subtraction value " + sub);
    }

    public void doSubtraction1(double num1, double num2, double num3, double num4) {
        double sub = num1 - num2 - num3 - num4;
        System.out.println("Subtraction value " + sub);
    }

    public static void main(String[] args) {
        NonReturnTypeMethod nonReturnTypeMethod = new NonReturnTypeMethod();
        //  nonReturnTypeMethod.tvDisplay();

        nonReturnTypeMethod.doSum(); // non return type
        System.out.println("**********************************************");
        nonReturnTypeMethod.doSummation();

        //int num  =  nonReturnTypeMethod.doSum();  // its not possible because method is non-return type
        // System.out.println("Num "+num);

        int num1 = 4 * nonReturnTypeMethod.doSummation();
        System.out.println("Num1 " + num1);

        System.out.println("**********************************************");

        nonReturnTypeMethod.doSum1(88, 125); // 213
        nonReturnTypeMethod.doSum2(99, 225, 445); //769

        System.out.println("**********************************************");

        nonReturnTypeMethod.doSubtraction(999, 333, 111);
        nonReturnTypeMethod.doSubtraction1(888, 222, 55, 7);

    }

}
