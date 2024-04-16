package dataStructure.collectionFramework.array;

public class Learn2DArray {

    // 2D Array/ Multidimensional Array: simple words as array of arrays

    // Data in 2D Array are stored in tabular form ( row major order)


    // dataType[1st Dimension] [2nd Dimension]  arrayName =new datatype[length/rowSize][columnSize];
    static String[] studentAddress = new String[5];
    static String[][] studentInfo = new String[4][5];


    public static void main(String[] args) {


        // Single Dimensional Array
        String[] grapeBox = {"grape1", "grape2", "grape3", "grape4", "grape5"};

        Learn2DArray.studentInfo[0][0] = "SL";
        Learn2DArray.studentInfo[0][1] = "FirstName";
        Learn2DArray.studentInfo[0][2] = "LastName";
        Learn2DArray.studentInfo[0][3] = "Address";
        Learn2DArray.studentInfo[0][4] = "PhoneNumber";
        // Learn2DArray.studentInfo[0][5]="PhoneNumber";


        Learn2DArray.studentInfo[1][0] = "101";
        Learn2DArray.studentInfo[1][1] = "Naina";
        Learn2DArray.studentInfo[1][2] = "Islam";
        Learn2DArray.studentInfo[1][3] = "Queens,NY";
        Learn2DArray.studentInfo[1][4] = "453453443";


        Learn2DArray.studentInfo[2][0] = "102";
        Learn2DArray.studentInfo[2][1] = "Tajwar";
        Learn2DArray.studentInfo[2][2] = "Hamid";
        Learn2DArray.studentInfo[2][3] = "Bronx,NY";
        Learn2DArray.studentInfo[2][4] = "786786786";


        Learn2DArray.studentInfo[3][0] = "103";
        Learn2DArray.studentInfo[3][1] = "Israt";
        Learn2DArray.studentInfo[3][2] = "Hossain";
        Learn2DArray.studentInfo[3][3] = "Brooklyn,NYC";
        Learn2DArray.studentInfo[3][4] = "334444444";


//        Learn2DArray.studentInfo[4][0]="SL";
//        Learn2DArray.studentInfo[4][1]="FirstName";
//        Learn2DArray.studentInfo[4][2]="LastName";
//        Learn2DArray.studentInfo[4][3]="Address";
//        Learn2DArray.studentInfo[4][4]="PhoneNumber";

        //  System.out.println(Learn2DArray.studentInfo[0][5]);
        System.out.println(Learn2DArray.studentInfo[0][4]);

        System.out.println(Learn2DArray.studentInfo.length);
        //  System.out.println(Learn2DArray.studentInfo[4][4]);


        System.out.println("++++++++++++++ For Each Loop to iterate all the elements from 2D Array");

        for (String[] std : Learn2DArray.studentInfo) {
            // Convert 2D to single dimensional array
            for (String st : std) {
                System.out.print(st + "        ");
            }
            System.out.println();


        }

        System.out.println("++++++++++++++ Declare 2D array and Initialize value =================");

        String[] stDetails = {"James", "Jack", "Ahmed"};
        String[][] studentContactDetails = {
                {"sl", "Address", "phoneNumber", "email"},
                {"1", "Queens,NY", "45345345", "demo1@gmail.com"},
                {"2", "Bronx,NYC", "44455453", "demo2@gmail.com"}
        };

        System.out.println("++++++++++++++ For Each Loop to iterate all the elements from 2D Array : Declare 2D array and Initialize value ");

        System.out.println(studentContactDetails[2][1]);


        for (String[] std : studentContactDetails) {
            // Convert 2D to single dimensional array
            for (String st : std) {
                System.out.print(st + "        ");
            }
            System.out.println();


        }



    }


}
