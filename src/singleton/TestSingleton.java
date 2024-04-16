package singleton;

public class TestSingleton {

    public static void main(String[] args) {

        LearnSingleton learnSingleton = new LearnSingleton();                // from LearnSingleton.java class

        Pizza myPizza = new Pizza("FourSeason");                    // from Pizza.java class row 11 to 14
        Pizza hisPizza = new Pizza("FourSeason", 25.50);    // from Pizza.java class row 15 to 18



        // ClassName referenceVariable/objectName = ClassName.publicReturnTypeMethod();
        Pizza herPizza = Pizza.getInstance();
        herPizza.pizzaPrice = 40.60;

        System.out.println("Pizza Price " + herPizza.pizzaPrice);

        // myPizza.pizzaName="Mergarita";

    }
}
