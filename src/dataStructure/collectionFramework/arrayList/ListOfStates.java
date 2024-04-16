package dataStructure.collectionFramework.arrayList;

import oop.abstraction.Car;
import oop.abstraction.GeneralMotor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfStates {


    public static void main(String[] args) {
        List<String> stateNameList = new ArrayList<>();

        //Car myCar=new GeneralMotor();

        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("FL");
        stateNameList.add("TX");
        stateNameList.add(null);
        stateNameList.add("KY");
        stateNameList.add("CA");
        stateNameList.add("");
        stateNameList.add("PA");

        System.out.println("How to print all the value from list type of Array : Iterate/ Retrieve");

        for (String st:stateNameList) {
            System.out.println(st);
        }

        System.out.println("+++++++++++ Remove value");
        stateNameList.remove(2);

//        for (String st:stateNameList) {
//            System.out.println(st);
//        }

        // Alternative way: Using while loop with Iterator to print / Retrieve all the value
        Iterator it =stateNameList.iterator();
        while (it.hasNext()){
            System.out.println("After Remove state : "+it.next());
        }





    }


}
