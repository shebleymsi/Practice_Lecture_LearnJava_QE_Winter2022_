package singleton;

public class Pizza {
    String pizzaName;
    double pizzaPrice;

    // Default private constructor
    private Pizza() {

    }



    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }
    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }


    // Create a private Object in class level, don't need create main method in this pizza class.
    // Create a private static Object  : private static className objName=new constructorOfClass();
    private static Pizza instance = new Pizza();

    // Create a public return type of method
    public static Pizza getInstance() { // Return Type : All type of Data, void , class type and object
        return instance;                // return private object
    }

}
