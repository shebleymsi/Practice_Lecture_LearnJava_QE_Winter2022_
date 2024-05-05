package dataStructure.collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    // Queue: FIFO ==> First in first out
    // Queue in ==> সারিবদ্ধ [ First in first out --> as like serial ]

    public static void main(String[] args) {

        // Queue with LinkedList
        Queue<String> name = new LinkedList<>();

        // add value as like linked list
        name.add("James");
        name.add("Tajwar");
        name.add("Naina");
        name.add("Nadia");
        name.add("Irin");
        name.add("Alam");
        name.add("Ahmed");
        name.add("Ismat");
        name.add("Israt");
        name.add("Husna");

        // check the size
        System.out.println(name.size());

        // retrive/print name
        System.out.println(name); // return as array

        // isEmpty or not
        System.out.println(name.isEmpty()); // return boolean: false

        // check "hemel" is in the list or not
        System.out.println(name.contains("hemel"));

        //Iterate student name using for-each loop
        for (String st : name) {
            System.out.println(st);
        }

        System.out.println("************* After Remove 'Irin' ***************");

        // remove "Irin" from list
        name.remove("Irin");

        // Iterate student name using for-each loop
        for (String st : name) {
            System.out.println(st);
        }


        // ========================================= New Concept [ Pool & Peek ] =====================================
        // Poll (Peek+ Remove) : Catch and Remove
        // Peek : Only catch/ call but not remove


        System.out.println("***************** After Pool *************");
        name.poll(); // 1st time pool --> James name is pool // remove always 1st number sequentially,
        System.out.println(name); // 'James' is no more now inside the output

        System.out.println(name.poll());
        System.out.println("After again pool " + name);

        System.out.println("First pool " + name.poll() + " Second Pool " + name.poll());

        System.out.println("After Multiple pool " + name);

        for (String st : name) {
            System.out.println("After Pool : " + st);
        }


        System.out.println("****************** After Peek ************");
        name.peek();
        System.out.println(name.peek()); // 1st time
        System.out.println(name.peek()); // 2nd time

        System.out.println(name);

        for (String st : name) {
            System.out.println("After Peek : " + st);
        }


    }


}
