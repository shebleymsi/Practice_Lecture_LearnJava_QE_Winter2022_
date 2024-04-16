package dataStructure.collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

        // Queue: FIFO First in first out


    public static void main(String[] args) {

        Queue<String> name= new LinkedList<>();
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


        System.out.println(name.size());
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("hemel"));

        for (String st: name) {
            System.out.println(st);
        }

        System.out.println("************* After Remove");
        name.remove("Irin");

        for (String st: name) {
            System.out.println(st);
        }


        // Poll (Peek+ Remove) : Catch and Remove
        // Peek : Only catch/ call but not remove
        System.out.println("***************** After Pool");

        name.poll();
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println("After again pool "+name);
        System.out.println("First pool "+name.poll() +" Second Pool "+name.poll());
        System.out.println("After Multiple pool "+name);
        for (String st: name) {
            System.out.println("After Pool : "+st);
        }


        System.out.println("********** After Peek");
        name.peek();
        System.out.println( name.peek());
        System.out.println( name.peek());
        System.out.println(name);
        for (String st: name) {
            System.out.println("After Peek : "+st);
        }






    }
























}
