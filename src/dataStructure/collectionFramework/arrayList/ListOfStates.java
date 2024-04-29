package dataStructure.collectionFramework.arrayList;

import oop.abstraction.Car;
import oop.abstraction.GeneralMotor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfStates { // ArrayList Deeper concept

    public static void main(String[] args) {

        // we declare a list type of Array
        List<String> stateNameList = new ArrayList<>();

        // Here, List is interface and ArrayList is Class
        // Example: here Car is interface and GeneralMotor is Class
        // Car myCar=new GeneralMotor();

        // How to add all the value into the list type of Array:
        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("FL");
        stateNameList.add("TX");
        stateNameList.add(null); // null means no value, its consider like String v33 03.51.34
        stateNameList.add("KY");
        stateNameList.add("CA");
        stateNameList.add("");
        stateNameList.add("PA");
        stateNameList.add(" ");
        stateNameList.add("De");

        // How to print all the value from list type of Array : Iterate/ Retrieve
        for (String st : stateNameList) {
            System.out.println(st);
        }

        System.out.println("++++++++++++++++++++++++ Remove value & print use for loop  +++++++++++++++++++++++++++++");

        System.out.println("Type_01: Remove value & print use for loop");
        stateNameList.remove(3);
        // print/Retrieve all the value use for loop
        for (String st : stateNameList) {
            System.out.println(st);
        }

        System.out.println("Type_02:Remove value & print Iterator with while loop");
        //Alternative way: Using while loop with Iterator to print/Retrieve all the value // v33 03.43.52,
        //we create a reference variable, example: 'it'
        Iterator it = stateNameList.iterator(); // iterator() print all the value one after one
        while (it.hasNext()) { // hasNext() is a boolean return type of method
            System.out.println("After Remove state : " + it.next()); // Next() helps to move one value to another value
        }


    }


}
