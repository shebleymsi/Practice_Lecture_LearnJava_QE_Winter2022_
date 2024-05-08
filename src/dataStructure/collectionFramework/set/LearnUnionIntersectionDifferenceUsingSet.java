package dataStructure.collectionFramework.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectionDifferenceUsingSet {

    // Learn Union Intersection Difference Using Set
    public static void main(String[] args) {

        // Declare two integer type of Array
        int[] number1 = {12, 34, 55, 66, 77, 88, 99, 35, 57, 99, 100, 11, 88};
        int[] number2 = {22, 44, 65, 66, 55, 27, 98, 25, 77, 44, 19, 110, 120, 12};


        // objective is: Merge bellow two Array: Array_01 & Array_02
        // objective is: To DO Intersection --> Given two array and find out the common values between two arrays
        // objective is: To Do Union Set/merge two Array --> Given two array and remove the duplicate value from two array
        // objective is: To Do Symmetric Difference

        // Set.addAll() --> which will not allow any duplicate value

        // Set<Integer> intersection/union/difference = new HashSet<>(num1);
        // intersection.retainAll(num2)
        // union.addAll(num2)
        // difference.removeAll(num2);


        // Array_01
        Set<Integer> num1 = new HashSet<>();
        // Convert Array to ArrayList to use asList() method
        num1.addAll(Arrays.asList(new Integer[]{12, 34, 55, 66, 77, 88, 99, 35, 57, 99, 100, 11, 88}));
        // print num1
        System.out.println("Numbers1 Array " + num1);


        // above Array_01 part [ row 25 to 30 ] : remove the duplicate value an Array [ shebley ]
        // just create an HashSet, then apply addAll() method inside with Array, then print


        // Array_02
        Set<Integer> num2 = new HashSet<>();
        num2.addAll(Arrays.asList(new Integer[]{22, 44, 65, 66, 55, 27, 98, 25, 77, 44, 19, 110, 120, 12}));
        System.out.println("Numbers2 Array " + num2);


        // To DO Intersection
        // Given two array and find out the common values between two arrays
        Set<Integer> intersection = new HashSet<>(num1);
        intersection.retainAll(num2);
        System.out.println("Intersection of two set " + intersection);


        // To Do Union Set --> merge two Array
        // Given two array and remove the duplicate value from two array
        Set<Integer> union = new HashSet<>(num1);
        union.addAll(num2);
        System.out.println("Union of Two Set " + union);


        // To Do Symmetric Difference
        Set<Integer> difference = new HashSet<>(num1);
        difference.removeAll(num2);
        System.out.println("Difference of Two set " + difference);


    }


}
