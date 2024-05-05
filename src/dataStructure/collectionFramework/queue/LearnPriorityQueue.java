package dataStructure.collectionFramework.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {


    // Top Element from Priority Queue : Peek method only peel value from Queue
    // Queue is an Interface
    // PriorityQueue is a class

    // as a developer: you need to understand which method you will use?
    // if you remove any value after calling --> you need pool method
    // if you want to keep the name in the list but you are calling one after one then you will use peek method

    public static void main(String[] args) {


        // let's do for customerName
        //
        PriorityQueue<String> customerName = new PriorityQueue<>();

        //
        customerName.add("Celia");
        customerName.add("babor");
        customerName.add("Maheen");
        customerName.add("Jamal");
        customerName.add("Monjurul");
        customerName.add("Yasar");

        //
        System.out.println(customerName);

        //
        customerName.peek();
        System.out.println(customerName.peek());
        //
        System.out.println(customerName);


        // let's do for customerID
        //
        PriorityQueue<Integer> customerID = new PriorityQueue<>();

        //
        customerID.add(12);
        customerID.add(13);
        customerID.add(14);
        customerID.add(15);
        customerID.add(16);

        // Iterate use for-each loop
        for (Integer in : customerID) {
            System.out.println("Customer Id " + in);
        }


        //===========================================================
        // objective: Peek() Retrieve but does not remove the head of the queue
        System.out.println("************ Using Pool method");

        // pool() Retrieve but does remove the head of the queue
        System.out.println(customerID.poll());
        // Iterate use for-each loop
        for (Integer in : customerID) {
            System.out.println("Customer Id " + in);
        }


    }


}
