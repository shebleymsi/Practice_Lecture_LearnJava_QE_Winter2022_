package method;

public class LearnMethod {
    // To format code in a class:  Windows: ctrl+Alt+L  Mac: Command+Option+L
    // Method: A block of code which have name and return something/ value
    // Method is a block of code with a name with will execute that block of code if called
    // What is block?:- multiple line of code
    // how to create a method?
    // Method syntax:- AccessModifier returnType methodName(){   }
    // Method Type: 1. Return Type, 2. Non-Return Type
    // Return Type Method:- 1. Return Type without parameter, 2. Return Type with parameter
    // Non-Return Type Method:- 1. Non-Return Type without parameter, 2. Non-Return Type with parameter
    public void hello() {
        System.out.println("hello irin");
        System.out.println("hello irin");
    }

    public static void main(String[] args) {
        //  how to call an instance variable/ method?
        LearnMethod learn = new LearnMethod();
        learn.hello(); // call method by object name
        learn.hello(); // call method by object name
        //  System.out.println("hello irin");
        //  System.out.println("hello irin");
    }
}
