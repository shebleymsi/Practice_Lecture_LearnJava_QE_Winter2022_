package dataStructure.collectionFramework.linkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LearnLinkList {

    // Link list
    // >> Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked List, so no bit shifting is required in memory
    ArrayList<String> stList1 = new ArrayList<>();

    static LinkedList<String> foodList = new LinkedList<>();
    static LinkedList<Integer> priceList = new LinkedList<>();
    static LinkedList<String> customerList = new LinkedList<>();

    static String name;

    public static void main(String[] args) {
        name = "Sharif";
        System.out.println(name);

        System.out.println("============== Get Food List +++++++++++++++++");
        getFoodList();
        System.out.println("============== Get Child Food List +++++++++++++++++");

        getChildFoodList();
        //getFoodList();
        System.out.println("============== Get Customer Name List +++++++++++++++++");
        LearnLinkList learn=new LearnLinkList();
        learn.getCustomerName();
        System.out.println("============== Get Price List +++++++++++++++++");
        learn.getPriceList();


    }


    public static void getFoodList() {
        LearnLinkList.foodList.add("Juice");
        LearnLinkList.foodList.add("Salad");
        LearnLinkList.foodList.add("Yogurt");
        LearnLinkList.foodList.add("Ice Cream");
        LearnLinkList.foodList.add("Rice");
        LearnLinkList.foodList.add("Biryani");
        LearnLinkList.foodList.add("Chicken");

        System.out.println(LearnLinkList.foodList);
        System.out.println(LearnLinkList.foodList.contains("Ice Cream"));
        for (String st : LearnLinkList.foodList) {
            System.out.println(st);
        }

    }
    public static void getChildFoodList() {
        LearnLinkList.foodList.add("Chocolate");
        LearnLinkList.foodList.add("Cheese");
        LearnLinkList.foodList.add("Chips");
        System.out.println(LearnLinkList.foodList);
        for (String st : LearnLinkList.foodList) {
            System.out.println(st);
        }

    }


    public void getCustomerName(){
        LearnLinkList.customerList.add("tajwar");
        LearnLinkList.customerList.add("Ahmed");
        LearnLinkList.customerList.add("Celia");
        LearnLinkList.customerList.add("Husna");
        LearnLinkList.customerList.add("Fouzia");
        LearnLinkList.customerList.add("Saiful");
        System.out.println(customerList);
        for (String st : LearnLinkList.customerList) {
            System.out.println(st);
        }


    }


 public void getPriceList(){
        LearnLinkList.priceList.add(244);
        LearnLinkList.priceList.add(344);
        LearnLinkList.priceList.add(444);
        LearnLinkList.priceList.add(544);
        LearnLinkList.priceList.add(644);

        System.out.println(priceList);
        for (Integer in : LearnLinkList.priceList) {
            System.out.println(in);
        }


    }



}
