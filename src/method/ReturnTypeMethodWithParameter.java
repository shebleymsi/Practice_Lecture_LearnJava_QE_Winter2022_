package method;

public class ReturnTypeMethodWithParameter {


    // Return Type Method With Parameter

    // AccessModifier DataType/Class/Object methodName( parameter     ){ return ;   }


    //    Return Type : All type of Data, void , class type and object

    // dynamic return type parametrized method
    public String getStudentInfo(String name) {
        // String name = "james";
        System.out.println("Student Name " + name);

        return name;
    }


    public double doSummation(double num1, double num2) {
        return num1 + num2;
    }

    public double doSummation1(double num1, double num2, double num3) {
        System.out.println("Summation value " + (num1 + num2 + num3));
        return num1 + num2 + num3;
    }

    public double doSummation2(double num1, double num2, double num3, double num4) {
        System.out.println("Summation value " + (num1 + num2 + num3 + num4));
        return num1 + num2 + num3 + num4;
    }

    // signature pattern

    public double doSummation2(double num1, double num2, double num3, double num4, double num5) {
        System.out.println("Summation value " + (num1 + num2 + num3 + num4 + num5));
        return num1 + num2 + num3 + num4 + num5;
    }


    public int getMulti(int num1, int num2) {
        return num1 * num2;
    }

    public int getMulti1(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }


    public boolean isPizzaAvailable(String pizzaName, char size, int price) {

        char pizzaSize = size;
        double pizzaPrice = price;

        // if large size pizza is available then say yes else say no

        // = equal sign but in java equal sign is ==

        if (pizzaSize == 'L') {
            System.out.println("yes L size " + pizzaName + " pizza is available");

        } else {
            System.out.println(pizzaSize + " size " + pizzaName + " pizza is not available");
        }

        return pizzaSize == 'L'; //here, return pizzaSize =='L' because logic compares( L == L ) the size.
    }


    public boolean isPizzaAvailable1(String pizzaName, char size, int price, boolean isAvailable) {
        System.out.println(pizzaName + " " + size + " Size pizza Price " + price + " availability " + isAvailable);
        return isAvailable;
    }


    public static void main(String[] args) {
        ReturnTypeMethodWithParameter obj = new ReturnTypeMethodWithParameter();
        obj.getStudentInfo("Bob"); // Argument passing inside method
        obj.getStudentInfo("Thomas"); // Argument passing inside method
        obj.getStudentInfo("Irin"); // Argument passing inside method
        obj.getStudentInfo("Naina"); // Argument passing inside method


        obj.doSummation(33, 77);  // Argument passing inside method

        System.out.println("Summation value " + obj.doSummation(33, 77));

        obj.doSummation1(55, 99, 444.56);
        obj.doSummation2(12, 33, 55, 77);

        obj.doSummation2(44, 77, 88, 99, 111);


        int num5 = 200;
        int num6 = num5 + obj.getMulti(10, 30);  // 200 + (10x30) = 500
        System.out.println("Num6 value is " + num6);

        int num7 = obj.getMulti(33, 22);
        System.out.println("Num7 value " + num7);

        int qty = 500;

        int soldQty = 400;
        int balanceQty = qty - soldQty;

        int num8 = obj.getMulti1(30, 55, 78);

        System.out.println("Num8 value " + num8);


        System.out.println("*****************************************************************");


        obj.isPizzaAvailable("Margarita", 'M', 20);

        obj.isPizzaAvailable1("Margarita", 'M', 25, true);


    }


}
