package dataStructure.collectionFramework.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {


    public static void main(String[] args) {
        TreeSet<String> mobileBrand = new TreeSet<>();
        mobileBrand.add("Samsung");
        mobileBrand.add("Nokia");
        mobileBrand.add("LG");
        mobileBrand.add("iPhone");
        mobileBrand.add("Huwai");


        System.out.println(mobileBrand);
        mobileBrand.remove("LG");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("Nokia"));

        for (String st : mobileBrand) {
            System.out.println(st);
        }

        System.out.println("************************************************************************************");
        // pollFirst() : first value will remove
        mobileBrand.pollFirst(); // 1st time pool/remove --> Nokia
        System.out.println(mobileBrand.pollFirst()); // 2nd time pool/remove --> Samsung
        System.out.println(mobileBrand);


        System.out.println("************************************************************************************");
        // pollLast() : last value will remove
        mobileBrand.pollLast();
        System.out.println(mobileBrand);


    }


}
