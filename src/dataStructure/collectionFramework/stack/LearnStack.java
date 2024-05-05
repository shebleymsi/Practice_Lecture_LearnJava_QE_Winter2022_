package dataStructure.collectionFramework.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    // Stack: LIFO last in first out


    // Pushing element on top of the stack: using the push()
    // Popping element from the top of the stack : using the pop(), which remove value
    // Looks at the object at the top of this stack without removing it from the stack: using the peek()
    // Stack is a Class in collection framework
    public static void main(String[] args) {

        // create/declare a Stack
        Stack<String> stAddress = new Stack<>();

        // add value by push() one by one
        stAddress.push("Queens,NY"); // Push method helps us to add the value
        stAddress.push("bronx,NY");
        stAddress.push("Brooklyn,NY");
        stAddress.push("Jamaica,NY");
        stAddress.push("Staten island,NY");
        stAddress.push("Deer park,NY");

        // return all the value
        System.out.println(stAddress);

        // search the particular value by object/name
        // position check from stack
        System.out.println(stAddress.search("bronx,NY"));       //5
        System.out.println(stAddress.search("Brooklyn,NY"));    //4
        System.out.println(stAddress.search("Queens,NY"));      //6
        System.out.println(stAddress.search("Queens1,NY"));     //-1, means not present

        // base on index we are not able to track value
        // only track value by: Search(), pop(), peek()
        System.out.println(stAddress.indexOf(1)); //-1, means not present


        System.out.println("****************** Before Pop ****************");
        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("****************** After Pop ****************");
        System.out.println("Value of pop " + stAddress.pop());
        for (String st : stAddress) {
            System.out.println(st);
        }


        System.out.println("****************** Using Peek ****************");
        // peek() is peeking the last value from our list
        System.out.println(stAddress.peek());

        // After peek() last value not removed, still present the list
        for (String st : stAddress) {
            System.out.println("After Peek " + st);
        }


        // ===========================================================================================================
        // ===========================================================================================================


        // add value Dynamic way:
        // How to add / push value using for loop to stack:
        Stack<String> stId = new Stack<>();
        // add/push the value inside the stack
        for (int i = 0; i < 10; i++) {
            stId.push("StId" + i);
        }
        // print stId
        System.out.println(stId);

        // How to Iterate all the value and using pop:
        // Before pop all value
        System.out.println("*************** Before pop all value " + stId);
        // Iterate one by one Before pop
        for (String st : stId) {
            System.out.println("Before pop ==> " + st);
        }


        // Iterate all the value with using pop [ with while loop ]
        Iterator it = stId.iterator();
        while (it.hasNext()) {
            System.out.println("I am poping " + stId.pop());
        }
        System.out.println("************* After Pop all value " + stId);


        // ==========================================================================================================
        // ==========================================================================================================

        System.out.println("************************* Stack with Integer Value ***********************************");


        //
        Stack<Integer> mobilePhoneNumber = new Stack<>();

        //
        mobilePhoneNumber.push(983498534);
        mobilePhoneNumber.push(983498535);
        mobilePhoneNumber.push(983498536);
        mobilePhoneNumber.push(983498537);
        mobilePhoneNumber.push(983498538);

        // check phone number position --> 2
        System.out.println(mobilePhoneNumber.search(983498537));

        // call bellow searchIntegerElementFromStack() and check mobile number:
        searchIntegerElementFromStack(mobilePhoneNumber, 983498535);
        searchIntegerElementFromStack(mobilePhoneNumber, 983458535);

    }

    // search Integer Element From Stack : v34 03.59.40
    // v34 04.05.29 --> Sharif Question:
    // If here 1st parameter is 'String', then what code we will use?
    // How can i coded in such a way that, if I want to pass String Stack /Integer Stack as I choose?
    // Ans: this code for only Integer data type Stack, for String Stack we will write different code
    // should help or search chatGPT [ Shebley ]
    public static void searchIntegerElementFromStack(Stack<Integer> number, Integer element) { // two parameter
        Integer position = number.search(element);
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
            System.out.println("Position is " + position);
        }

    }


}
