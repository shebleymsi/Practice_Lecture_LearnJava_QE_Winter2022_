package dataStructure.collectionFramework.linkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnListWithLinkListAndArrayList {

    // 4 type of sequence(below), but they are make same job for us
    // LinkedList(class) implements List(interface)
    // ArrayList implements List
    // LinkedList & ArrayList both implements List Interface
    public static List<String> foodList = new LinkedList<>(); // LinkedList good for Manipulate the data
    public static List<String> customerList = new ArrayList<>(); // ArrayList good for storing the data

    public static LinkedList<String> bookList = new LinkedList<>(); // access only LinkedList Class of data
    public static ArrayList<String> birdList = new ArrayList<>(); // access only ArrayList Class of data


    public static void main(String[] args) {

        // we saw ArrayList allow duplicate value.
        // does the LinkedList allow duplicate value? [Yes]
        foodList.add("Coffee");
        foodList.add("Coffee");
        System.out.println(foodList);


    }


}
