package controlflow;

import java.util.Scanner;

public class LearnNestedSwitchCase {

    public static void main(String[] args) {

        LearnNestedSwitchCase learnNestedSwitchCase = new LearnNestedSwitchCase();
        learnNestedSwitchCase.getCourseWithExtra();

    }

    public void getCourseWithExtra() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your course");
        String course = input.nextLine();
        String courseName;
        System.out.println("Enter your Extra course name course");
        String extraCourse = input.nextLine();


        switch (course) {
            case "Marketing":
                courseName = "Marketing 101";
                if (extraCourse.equalsIgnoreCase("Marketing 222")) {
                    System.out.println("This is Marketing course");
                } else {
                    System.out.println("This is not Marketing course");
                }
                break;
            case "CSE":
                courseName = "CSE 203";
                if (extraCourse.equalsIgnoreCase("CSE 222")) {
                    System.out.println("This is CSE course");
                } else {
                    System.out.println("This is not CSE course");
                }
                break;
            case "JAVA":
                courseName = "JAVA 301";

                switch (extraCourse) {
                    case "JAVA 333":
                        System.out.println("This is Java 333");
                        break;
                    case "JAVA 334":
                        System.out.println("This is Java 334");
                        break;
                    case "JAVA 335":
                        System.out.println("This is Java 335");
                        break;
                    default:
                        System.out.println("Not match");
                        break;
                }

                break;
            case "Accounting":
                courseName = "Accounting 200";
                break;
            default: // else
                courseName = "out of the course";
                break;
        }
        System.out.println("course Name is " + courseName);
    }

}
