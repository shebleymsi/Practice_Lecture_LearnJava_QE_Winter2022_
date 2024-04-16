package dataStructure.collectionFramework.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifferenceUsingSet {


    public static void main(String[] args) {
        int [] number1={12,34,55,66,77,88,99,35,57,99,100,11,88};
        int [] number2={22,44,65,66,55,27,98,25,77,44,19,110,120,12};


        Set<Integer> num1=new HashSet<>();
        num1.addAll(Arrays.asList( new Integer[]{12,34,55,66,77,88,99,35,57,99,100,11,88}    )  );
        System.out.println("Numbers1 Array "+num1);

        Set<Integer> num2=new HashSet<>();
        num2.addAll(Arrays.asList(new Integer[]{22,44,65,66,55,27,98,25,77,44,19,110,120,12}));
        System.out.println("Numbers2 Array "+num2);


        // To DO Intersection
        // Given two array and find out the common values between two arrays

        Set<Integer> intersection=new HashSet<>(num1);
        intersection.retainAll(num2);
        System.out.println("Intersection of two set "+intersection);


        // To Do Union Set
        // Given two array and remove the duplicate value from two array
        Set<Integer> union=new HashSet<>(num1);
        union.addAll(num2);
        System.out.println("Union of Two Set "+union);


        // To Do Symmetric Difference
        Set<Integer> difference=new HashSet<>(num1);
        difference.removeAll(num2);
        System.out.println("Difference of Two set "+difference);


    }
























}
