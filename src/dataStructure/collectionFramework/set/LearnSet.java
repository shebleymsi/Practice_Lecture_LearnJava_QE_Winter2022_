package dataStructure.collectionFramework.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is interface which extends Collection . It is an unorder collection of objects in which duplicate value can not be stored

    // Set is implemented by HashSet, linkedHashSet or TreeSet

    public static void main(String[] args) {
        Set<String> mobileBrand = new HashSet<>();
        mobileBrand.add("Samsung");
        mobileBrand.add("Nokia");
        mobileBrand.add("LG");
        mobileBrand.add("iPhone");


        System.out.println(mobileBrand);
        mobileBrand.remove("LG");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("Nokia"));

        for (String st : mobileBrand) {
            System.out.println(st);
        }


    }


}
