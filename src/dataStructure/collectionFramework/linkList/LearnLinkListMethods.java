package dataStructure.collectionFramework.linkList;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkListMethods {


    public static void main(String[] args) {
        List<String> foodList=new LinkedList<>();


      //  List<String> foodList1=new LinkedList<String>();

        foodList.add("Coffee");
        foodList.add("Pizza");
        foodList.add("Banana");
        foodList.add("Mango1");
        foodList.add("Orange");
        foodList.add("Apple");
        System.out.println("Food List : "+foodList);
        foodList.set(1,"Grape");
        System.out.println("Food List : "+foodList);
        System.out.println("Size is : "+foodList.size());

        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }

        System.out.println(foodList.contains("Mango"));
        System.out.println(foodList.get(3));
        foodList.clear();
        System.out.println("Food List : "+foodList);
        foodList.add("Chicken fry");
        foodList.add("Watermelon");
        System.out.println("Food List : "+foodList);
        System.out.println( foodList.isEmpty());
        //foodList.toArray();
      //  System.out.println(foodList);
        System.out.println(foodList.indexOf("Chicken fry"));
        System.out.println(foodList.indexOf("Watermelon"));








    }






















}
