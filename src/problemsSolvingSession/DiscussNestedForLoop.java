package problemsSolvingSession;

public class DiscussNestedForLoop {

    public static void main(String[] args) {
        getWeekDays();
        getWeekDays1();
        getWeekDaysBreak();
        getWeekDays2();

    }


    public static void getWeekDays() {
        int weeks = 3;
        int days = 7;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= days; j++) {
                System.out.println(" Days: " + j);
            }
        }
    }


    public static void getWeekDays1() {
        int weeks = 3;
        int days = 7;
        int i = 1;
        while (i <= weeks) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= days; j++) {
                System.out.println(" Days: " + j);
            }
            i++;
        }
    }


    public static void getWeekDaysBreak() {
        int weeks = 3;
        int days = 7;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= days; j++) {
                if (i == 3) {
                    break;
                }
                System.out.println(" Days: " + j);
            }
        }
    }


    public static void getWeekDays2() {
        int weeks = 3;
        int days = 7;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= days; j++) {
                if (j % 2 != 0) {
                    continue;
                }
                System.out.println(" Days: " + j);
            }
        }
    }


}
