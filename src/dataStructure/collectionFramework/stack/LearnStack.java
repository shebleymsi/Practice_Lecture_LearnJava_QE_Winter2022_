package dataStructure.collectionFramework.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    // Stack: LIFO last in first out


    // Pushing element on top of the stack: push()
    // Popping element from the top of the stack : pop() which remove value
    // Looks at the object at the top of this stack without removing it from the stack: peek()

    public static void main(String[] args) {
        Stack<String> stAddress= new Stack<>();
        stAddress.push("Queens,NY");
        stAddress.push("bronx,NY");
        stAddress.push("Brooklyn,NY");
        stAddress.push("Jamaica,NY");
        stAddress.push("Staten island,NY");
        stAddress.push("Deer park,NY");

        System.out.println(stAddress);
        System.out.println(stAddress.search("bronx,NY"));
        System.out.println(stAddress.search("Brooklyn,NY"));
        System.out.println(stAddress.search("Queens,NY"));
        System.out.println(stAddress.search("Queens1,NY"));

        System.out.println(stAddress.indexOf(1));

        System.out.println("********** Before Pop");
        for (String st:stAddress) {
            System.out.println(st);
        }
        System.out.println("********** Before Pop");
        System.out.println("Value of pop "+stAddress.pop());
        for (String st:stAddress) {
            System.out.println(st);
        }


        System.out.println("************ Using Peek");
        System.out.println(stAddress.peek());

        for (String st:stAddress) {
            System.out.println("After Peek "+st);
        }



        // How to add / push value using for loop to stack
        Stack<String> stId= new Stack<>();
        for (int i = 0; i < 10; i++) {
            stId.push("StId"+i);
        }

        System.out.println(stId);
        // How to Iterate all the value and using pop
        System.out.println("*************** Before pop all value "+stId);
        for (String st:stId) {
            System.out.println("Before pop ==> "+st);
        }



        Iterator it =stId.iterator();
        while (it.hasNext()){
            System.out.println("I am poping "+stId.pop());
        }
        System.out.println("************* After Pop all value "+stId);


        System.out.println("**********************************************************************************************************");

        Stack<Integer> mobilePhoneNumber=new Stack<>();
        mobilePhoneNumber.push(983498534);
        mobilePhoneNumber.push(983498535);
        mobilePhoneNumber.push(983498536);
        mobilePhoneNumber.push(983498537);
        mobilePhoneNumber.push(983498538);

        System.out.println(mobilePhoneNumber.search(983498537));

        searchIntegerElementFromStack(mobilePhoneNumber,983498535);
        searchIntegerElementFromStack(mobilePhoneNumber,983458535);


    }


    public static void searchIntegerElementFromStack(Stack<Integer> number, Integer element){
        Integer position= number.search(element);
        if (position == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
            System.out.println("Position is "+position);
        }

    }
















}
