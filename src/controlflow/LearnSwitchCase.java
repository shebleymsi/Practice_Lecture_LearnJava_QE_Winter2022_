package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {


    public static void main(String[] args) {


        // LearnSwitchCase.getFoodMenu();
//        LearnSwitchCase.getWeekDays();
//        LearnSwitchCase.getCourseName();
        LearnSwitchCase.getCourseWithExtra();


    }

    public static void getFoodMenu() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Favourite food serial");
        int foodSerial = input.nextInt();
        String foodName;

        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "pasta";
                break;
            case 3:
                foodName = "momo";
                break;
            case 4:
                foodName = "French fries";
                break;
            case 5:
                foodName = "couscous";
                break;
            case 6:
                foodName = "halim";
                break;
            case 7:
                foodName = "Fuska";
                break;
            case 8:
                foodName = "Jilapi";
                break;
            default: // else
                foodName = "Invalid Food Item";
                break;
        }
        System.out.println("My Favourite food is " + foodName);
    }

    public static void getWeekDays() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day serial of the week");
        int day = input.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // else
                dayName = "out of the day";
                break;
        }
        System.out.println("Day name " + dayName);
    }

    public static void getCourseName() {
        // Switch case: Alternative of if else if
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your course");
        String course = input.nextLine();
        String courseName;

        switch (course) {
            case "Marketing":
                courseName = "Marketing 101";
                break;
            case "CSE":
                courseName = "CSE 203";
                break;
            case "JAVA":
                courseName = "JAVA 301";
                break;
            case "Accounting":
                courseName = "Accounting 200";
                break;
            default: // else
                courseName = "out of the day";
                break;
        }
        System.out.println("course Name is " + courseName);
    }

    public static void getCourseWithExtra() {
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
