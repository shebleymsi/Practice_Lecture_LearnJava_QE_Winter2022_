package dataStructure.collectionFramework.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    static List<String> stateNameOfUSA =new ArrayList<>();
    static List<String> stateNameOfCanada =new ArrayList<>();
    static List<String> stateNameOfUK=new ArrayList<>();


    public static void main(String[] args) {


        getStatesNameOfUSA();
        getStatesNameOfCanada();
        getStatesNameOfUK();


        Map<String, List<String> > stMap=new HashMap<>();

        stMap.put("USA",stateNameOfUSA);
        stMap.put("CANADA",stateNameOfCanada);
        stMap.put("UK",stateNameOfUK);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(stMap);

        System.out.println("+++++++ how to Iterate all the value from a HashMap ***********");


        for ( Map.Entry <  String,   List<String>    > entry  : stMap.entrySet()   )  {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



    }


    public static void getStatesNameOfUSA(){
        LearnListHashMap.stateNameOfUSA.add("NY");
        LearnListHashMap.stateNameOfUSA.add("NJ");
        LearnListHashMap.stateNameOfUSA.add("FL");
        LearnListHashMap.stateNameOfUSA.add("TX");
        LearnListHashMap.stateNameOfUSA.add("CA");
        LearnListHashMap.stateNameOfUSA.add("MD");

        System.out.println(stateNameOfUSA);
    }
  public static void getStatesNameOfUK(){
        LearnListHashMap.stateNameOfUK.add("Scotland");
        LearnListHashMap.stateNameOfUK.add("England");
        LearnListHashMap.stateNameOfUK.add("Wales");
        LearnListHashMap.stateNameOfUK.add("Northern Ireland");
        LearnListHashMap.stateNameOfUK.add("Oxford");
        LearnListHashMap.stateNameOfUK.add("Cambridge");

        System.out.println(stateNameOfUK);
    }
  public static void getStatesNameOfCanada(){
        LearnListHashMap.stateNameOfCanada.add("Alberta");
        LearnListHashMap.stateNameOfCanada.add("British Columbia");
        LearnListHashMap.stateNameOfCanada.add("Manitoba");
        LearnListHashMap.stateNameOfCanada.add("Nova Scotia");
        LearnListHashMap.stateNameOfCanada.add("Nunavut");
        LearnListHashMap.stateNameOfCanada.add("New Brunswick");
        System.out.println(stateNameOfCanada);
    }























}
