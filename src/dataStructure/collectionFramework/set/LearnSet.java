package dataStructure.collectionFramework.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is interface which extends Collection . It is an unorder collection of objects in which duplicate value can not be stored

    // Set is implemented by HashSet, linkedHashSet or TreeSet

    public static void main(String[] args) {

        // declare with initialize Set
        Set<String> mobileBrand = new HashSet<>();

        // add value onr by one into the Set
        mobileBrand.add("Samsung");
        mobileBrand.add("Nokia");
        mobileBrand.add("LG");
        mobileBrand.add("iPhone");

        // print the mobileBrand Set value
        System.out.println(mobileBrand);

        // remove particular value from Set by object name
        mobileBrand.remove("LG");
        // After remove print
        System.out.println(mobileBrand);

        // check the "Nokia" exist or not?
        System.out.println(mobileBrand.contains("Nokia"));

        // Iterate Set using for-each loop
        for (String st : mobileBrand) {
            System.out.println(st);
        }


    }


}
