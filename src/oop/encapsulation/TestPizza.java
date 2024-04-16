package oop.encapsulation;

public class TestPizza {


    public static void main(String[] args) {

        Pizza myPizza = new Pizza();
        myPizza.pizzaSize = 'L';
        System.out.println(myPizza.pizzaSize);

        // myPizza.pizzaPrice // --> its not possible because of private " private double pizzaPrice; "

        myPizza.setPizzaName("Cheese Pizza"); // Assigning value
        System.out.println(myPizza.getPizzaName());


        myPizza.setPizzaTopping("Hot Sauce");
        System.out.println(myPizza.getPizzaTopping());


        // shebley
        myPizza.setPizzaPrice(19.99);
        myPizza.setPizzaPrice(30.99); //re-assign value
        double value = myPizza.getPizzaPrice();
        System.out.println("price is " + value);




    }
}
