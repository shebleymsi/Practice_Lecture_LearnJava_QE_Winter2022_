package operators;

public class LearnAssignmentOperator {

    // Assignment operator: =
    String name = "Celia";

    public static void main(String[] args) {
        LearnAssignmentOperator obj = new LearnAssignmentOperator();
        System.out.println(obj.name);

        System.out.println("**************************************");
        obj.name = "Alzubair"; // ReAssign variable value

        System.out.println(obj.name);
        System.out.println("**************************************");

        obj.name = "Ahmed"; // ReAssign variable value

        System.out.println(obj.name);

    }

}
