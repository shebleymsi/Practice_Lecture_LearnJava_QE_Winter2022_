package dataStructure.collectionFramework.linkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LearnLinkList {

    // Link list:
    // Manipulation with LinkedList is faster than ArrayList
    // because it uses a doubly linked List, so no bit shifting is required in memory


    // declare an ArrayList and then ...
    // ... >> go to ArrayList Class & see: press ctrl + click cursor on ArrayList
    ArrayList<String> stList1 = new ArrayList<>();


    // declare a LinkedList and then ...
    // ... >> go to LinkedList Class: press ctrl + click cursor on LinkedList
    // if we declare static, we can call by Class_name or directly in main method
    // if we declare class level & static, we can use
    static LinkedList<String> foodList = new LinkedList<>();
    static LinkedList<Integer> priceList = new LinkedList<>();
    static LinkedList<String> customerList = new LinkedList<>();


    static String name; // if declare a static variable, we can initialize value next time

    public static void main(String[] args) {

        // Example of variable assign and print:
        name = "Sharif"; // assign value of name variable
        System.out.println(name);

        System.out.println("============== Get Food List +++++++++++++++++");
        LearnLinkList.getFoodList(); // getFoodList() is static, so call by Class name or directly

        System.out.println("============== Get Child Food List +++++++++++++++++");
        getChildFoodList(); // getFoodList() is static, so call by Class name or directly
        // getFoodList(); // uncomment and run that's time above getFoodList() have to comment.

        System.out.println("============== Get Customer Name List +++++++++++++++++");
        // getCustomerName() & getPriceList() is not static,
        // if we want to call above both method we need create an object of this class ...
        // ...>> then call above both method by object name.
        LearnLinkList learn = new LearnLinkList();
        learn.getCustomerName(); // getCustomerName() is not static, so call by object name

        System.out.println("============== Get Price List +++++++++++++++++");
        learn.getPriceList(); // getCustomerName() is not static, so call by object name

    }


    // Break: v33 04.11.10 to 04.28.30
    // ================================================ Get Food List ==============================================
    public static void getFoodList() {

        // add or get Food List same as ArrayList inside the LinkList:
        LearnLinkList.foodList.add("Juice");
        LearnLinkList.foodList.add("Salad");
        LearnLinkList.foodList.add("Yogurt");
        LearnLinkList.foodList.add("Ice Cream");
        LearnLinkList.foodList.add("Rice");
        LearnLinkList.foodList.add("Biryani");
        LearnLinkList.foodList.add("Chicken");

        // print Food List After add themselves:
        System.out.println(LearnLinkList.foodList);

        // Cross_check "Ice Cream" inside Food List contains or not:
        // contains() return us boolean value: true/false // v33 04.07.30
        System.out.println(LearnLinkList.foodList.contains("Ice Cream"));

        // Iterate by for-each loop
        for (String st : LearnLinkList.foodList) {
            System.out.println(st);
        }

    }

    // =============================================== Get Child Food List ========================================

    public static void getChildFoodList() {

        // add or Get Child Food List same as ArrayList inside the LinkList:
        LearnLinkList.foodList.add("Chocolate");
        LearnLinkList.foodList.add("Cheese");
        LearnLinkList.foodList.add("Chips");

        // print Child Food List
        // Why Child Food List is print with all value of Get Food List? [ Ans: bellow ]
        System.out.println(LearnLinkList.foodList);

        // Iterate by for-each loop.
        // after print Child Food List we see: Child Food List is print with all value of Get Food List.
        // Why Child Food List is print with all value of Get Food List?
        // Ans:
        // 1. foodList is global list type of array.
        // 2. already some values(7) is added in foodList use by getFoodList().
        // 3. again we added(2nd times) some values(3) in foodList use by getChildFoodList() ...
        // ... >> in same foodList(which is global list type of array.
        // So, total 10 values add in 'foodList' use by getFoodList() & getChildFoodList()
        // so, During the Iteration time we see total values, as like 10 values
        // but if we don't call getFoodList() in main method, that's time getChildFoodList() output will be 3 value
        for (String st : LearnLinkList.foodList) {
            System.out.println(st);
        }

    }

    // =============================================== Get Customer Name List ========================================

    public void getCustomerName() {

        // add or Get Customer Name List same as ArrayList inside the LinkList:
        LearnLinkList.customerList.add("tajwar");
        LearnLinkList.customerList.add("Ahmed");
        LearnLinkList.customerList.add("Celia");
        LearnLinkList.customerList.add("Husna");
        LearnLinkList.customerList.add("Fouzia");
        LearnLinkList.customerList.add("Saiful");

        // print Customer Name List
        System.out.println(customerList);

        // Iterate by for-each loop
        for (String st : LearnLinkList.customerList) {
            System.out.println(st);
        }

    }


    // =============================================== Get Price List ================================================

    public void getPriceList() {

        // add or Get Price List same as ArrayList inside the LinkList:
        LearnLinkList.priceList.add(244);
        LearnLinkList.priceList.add(344);
        LearnLinkList.priceList.add(444);
        LearnLinkList.priceList.add(544);
        LearnLinkList.priceList.add(644);

        // print Price List
        System.out.println(priceList);

        // Iterate by for-each loop
        for (Integer in : LearnLinkList.priceList) {
            System.out.println(in);
        }


    }


}
