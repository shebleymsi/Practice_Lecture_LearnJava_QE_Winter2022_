package dataStructure.collectionFramework.array;

public class Learn2DArray {

    // 2D Array/ Multidimensional Array: simple words as array of arrays
    // Data in 2D Array are stored in tabular form ( row major order)

    static String[] studentAddress = new String[5];   // Global single dimension Array
    static String[][] studentInfo = new String[4][5];  // Global two dimension Array
    // Syntax: dataType[1st Dimension] [2nd Dimension]  arrayName =new datatype[length/rowSize][columnSize];


    public static void main(String[] args) {

        // Single Dimensional Array
        String[] grapeBox = {"grape1", "grape2", "grape3", "grape4", "grape5"};


        // declare two Dimensional Array's value with assign
        // array is static so it's call by class name.
        Learn2DArray.studentInfo[0][0] = "SL";          // r0 x c1 ==> row x column
        Learn2DArray.studentInfo[0][1] = "FirstName";
        Learn2DArray.studentInfo[0][2] = "LastName";
        Learn2DArray.studentInfo[0][3] = "Address";
        Learn2DArray.studentInfo[0][4] = "PhoneNumber";
        // Learn2DArray.studentInfo[0][5]="PhoneNumber";
        // if run above statement it's throw: index out of bound exception


        Learn2DArray.studentInfo[1][0] = "101";
        Learn2DArray.studentInfo[1][1] = "Naina";
        Learn2DArray.studentInfo[1][2] = "Islam";
        Learn2DArray.studentInfo[1][3] = "Queens,NY";
        Learn2DArray.studentInfo[1][4] = "453453443";


        Learn2DArray.studentInfo[2][0] = "102";  // 3rd row, 1st column
        Learn2DArray.studentInfo[2][1] = "Tajwar";
        Learn2DArray.studentInfo[2][2] = "Hamid";
        Learn2DArray.studentInfo[2][3] = "Bronx,NY";
        Learn2DArray.studentInfo[2][4] = "786786786";


        Learn2DArray.studentInfo[3][0] = "103";
        Learn2DArray.studentInfo[3][1] = "Israt";
        Learn2DArray.studentInfo[3][2] = "Hossain";
        Learn2DArray.studentInfo[3][3] = "Brooklyn,NYC";
        Learn2DArray.studentInfo[3][4] = "334444444";


//      Learn2DArray.studentInfo[4][0]="SL";
//      Learn2DArray.studentInfo[4][1]="FirstName";
//      Learn2DArray.studentInfo[4][2]="LastName";
//      Learn2DArray.studentInfo[4][3]="Address";
//      Learn2DArray.studentInfo[4][4]="PhoneNumber";


        // System.out.println(Learn2DArray.studentInfo[0][5]);
        // if run above statement it's throw: index out of bound exception
        System.out.println(Learn2DArray.studentInfo[0][4]); // Output: PhoneNumber

        System.out.println(Learn2DArray.studentInfo.length); // Output: 4
        // System.out.println(Learn2DArray.studentInfo[4][4]);
        // if run above statement it's throw: index out of bound exception


        System.out.println("++++++ For Each Loop to iterate all the elements from 2D Array [studentInfo] ++++++++++");
        // For Each Loop to iterate all the elements from 2D Array [ studentInfo ]
        // retrieve all elements/data of studentInfo [v32 05.06.15]
        for (String[] std : Learn2DArray.studentInfo) {
            // Convert 2D to 1D : Convert 2D(studentInfo) to single dimensional array
            for (String st : std) {
                System.out.print(st + "        ");
            }
            System.out.println();

        }

//======================================================================================================================
        System.out.println();
        System.out.println("========================================================================================");
        System.out.println();
//======================================================================================================================

        System.out.println("++++++++++++++ Declare 2D array and Initialize value [with java initializer]++++++++++++");
        // 1D: declare with assign value
        String[] stDetails = {"James", "Jack", "Ahmed"}; // [v32 05.12.49]

        // 2D: declare with assign value
        String[][] studentContactDetails = {
                {"sl", "Address", "phoneNumber", "email"},
                {"1", "Queens,NY", "45345345", "demo1@gmail.com"},
                {"2", "Bronx,NYC", "44455453", "demo2@gmail.com"}
        };


        System.out.println("For-Each Loop iterate all elements from 2D Array: Declare 2D array and Initialize value");
        // example: print particular one value by index number
        System.out.println(studentContactDetails[2][1]);
        // retrieve all elements/data of studentContactDetails
        for (String[] std : studentContactDetails) {
            // Convert 2D to 1D : Convert 2D(studentContactDetails) to single dimensional array
            // nested for-each loop
            for (String st : std) {
                System.out.print(st + "        ");
            }
            System.out.println();
        }


    }


}
