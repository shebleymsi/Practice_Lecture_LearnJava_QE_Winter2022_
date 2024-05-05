package dataStructure.collectionFramework.linkList;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkListMethods {


    public static void main(String[] args) {

        List <String> foodList = new LinkedList<>(); // Modern/update code
        // Traditional old code(jdk7), but doing same job as like above
        // List<String> foodList1=new LinkedList<String>();

        foodList.add("Coffee");
        foodList.add("Pizza");
        foodList.add("Banana");
        foodList.add("Mango1");
        foodList.add("Orange");
        foodList.add("Apple");

        // print all the value of foodList
        System.out.println("Food List : " + foodList);

        // set/add/re-assign by index with data type value
        foodList.set(1, "Grape");  // research by chatGPT please: shebley************************************
        // print value after set
        System.out.println("Food List : " + foodList);

        // want to get size
        System.out.println("Size is : " + foodList.size()); // 6

        // Iterate use by for loop
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }


        // Cross_check "Mango" inside Food List contains or not:
        System.out.println(foodList.contains("Mango"));

        // get the value base on index number
        System.out.println(foodList.get(3));

        // we create a list type of array then set some values ...
        // ...>> and then we clear all value from that's(foodList) array.
        foodList.clear();
        // print foodList for cross-check is it clear?
        System.out.println("Food List : " + foodList);

        // again add value inside the foodList
        foodList.add("Chicken fry");
        foodList.add("Watermelon");
        // print foodList for cross-check is it add or not?
        System.out.println("Food List : " + foodList);
        // foodList is empty or not
        System.out.println(foodList.isEmpty()); // false // row 52 & 53 when comment: then isEmpty() is true


        //Any list of array if we need to convert into array type
        //foodList.toArray();
        //System.out.println(foodList);

        System.out.println(foodList.indexOf("Chicken fry")); 
        System.out.println(foodList.indexOf("Watermelon"));


    }


}
