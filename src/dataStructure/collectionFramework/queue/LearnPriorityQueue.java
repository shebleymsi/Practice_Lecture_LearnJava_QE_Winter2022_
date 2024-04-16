package dataStructure.collectionFramework.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {


    // Top Element from Priority Queue : Peek method only peel value from Queue

    public static void main(String[] args) {


        PriorityQueue<String> customerName= new PriorityQueue<>();

        customerName.add("Celia");
        customerName.add("babor");
        customerName.add("Maheen");
        customerName.add("Jamal");
        customerName.add("Monjurul");
        customerName.add("Yasar");

        System.out.println(customerName);

        customerName.peek();
        System.out.println(customerName.peek());
        System.out.println(customerName);


        PriorityQueue<Integer> customerID= new PriorityQueue<>();

        customerID.add(12);
        customerID.add(13);
        customerID.add(14);
        customerID.add(15);
        customerID.add(16);

        for (Integer in:customerID) {
            System.out.println("Customer Id "+in);
        }


        // Peek() Retrieve but does not remove the head of the queue
        System.out.println("************ Using Pool method");
        // pool() Retrieve but does remove the head of the queue
        System.out.println(customerID.poll());
        for (Integer in:customerID) {
            System.out.println("Customer Id "+in);
        }


    }
























}
