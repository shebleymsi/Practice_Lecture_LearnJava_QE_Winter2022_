package dataStructure.collectionFramework.array;

public class Learn3DArray {

    // 3D means 2D+1D
    // 3D Array: : Three Dimension
    // Declare 3D Array with Length:
    // DataType [] [] [] arrayName = new DataType [size] [NumberOfRow] [NumberOfColumn];


    public static void main(String[] args) {

        String[][] mobileInfo1 = new String[5][6];
        System.out.println("MobileInfo1 Length " + mobileInfo1.length);


        String[][][] mobileInfo = new String[2][3][6];

        System.out.println("MobileInfo Length " + mobileInfo.length);


        mobileInfo[0][0][0] = "SL";
        mobileInfo[0][0][1] = "Mobile Type";
        mobileInfo[0][0][2] = "Price";
        mobileInfo[0][0][3] = "Qty";
        mobileInfo[0][0][4] = "Model";
        mobileInfo[0][0][5] = "Amount";


        mobileInfo[0][1][0] = "1";
        mobileInfo[0][1][1] = "Android";
        mobileInfo[0][1][2] = "1200";
        mobileInfo[0][1][3] = "10";
        mobileInfo[0][1][4] = "S20";
        mobileInfo[0][1][5] = "12000";


        mobileInfo[0][2][0] = "2";
        mobileInfo[0][2][1] = "Android";
        mobileInfo[0][2][2] = "1100";
        mobileInfo[0][2][3] = "5";
        mobileInfo[0][2][4] = "S30";
        mobileInfo[0][2][5] = "5500";


        // 2nd Times
        mobileInfo[1][0][0] = "SL";
        mobileInfo[1][0][1] = "Computer Type";
        mobileInfo[1][0][2] = "Price";
        mobileInfo[1][0][3] = "Qty";
        mobileInfo[1][0][4] = "Model";
        mobileInfo[1][0][5] = "Amount";


        mobileInfo[1][1][0] = "101";
        mobileInfo[1][1][1] = "Mac";
        mobileInfo[1][1][2] = "2200";
        mobileInfo[1][1][3] = "3";
        mobileInfo[1][1][4] = "Mac2022";
        mobileInfo[1][1][5] = "6600";


        mobileInfo[1][2][0] = "102";
        mobileInfo[1][2][1] = "Windows";
        mobileInfo[1][2][2] = "1100";
        mobileInfo[1][2][3] = "7";
        mobileInfo[1][2][4] = "Win2022";
        mobileInfo[1][2][5] = "7700";


        //  mobileInfo[3]   [2][5]="7700";
        //    mobileInfo[1]   [5][5]="7700";
        //  mobileInfo[1][2][7] = "7700";


        //  System.out.println(mobileInfo[3]   [2][5]);
        //   System.out.println(mobileInfo[1]   [5][5]);
        //   System.out.println(mobileInfo[1]   [2][7]);


        System.out.println(mobileInfo[1][1][3]);

        System.out.println("*********** For Each loop to iterate all the elements from 3D Array");
        // Convert 3D to 2D
        // Convert 2D to 1D
        // Iterate elements

        for (String[][] mobile : mobileInfo) {
            // Convert 3D to 2D
            for (String[] mob : mobile) {
                // Convert 2D to 1D
                for (String mo : mob) {
                    System.out.print(mo + " ");
                }
                System.out.println();
            }
            System.out.println();

        }


        System.out.println("*********** Declare and Initialize value in 3D Array");


        //  String [][][] weatherInfo=new String[3][3][6];
        String[][][] weatherInfo = {
                {
                        // 1st time
                        {
                                // 1st rows
                                "Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"

                        },
                        {
                                // 2nd rows
                                "1", "Queens,NYC", "Jamaica", "18", "10", "Cel"

                        }, {
                        // 3rd rows
                        "2", "bronx,NYC", "bronx", "17", "11", "Cel"

                }


                },
                {

                        // 2nd time
                        {
                                // 1st rows
                                "Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"

                        },
                        {
                                // 2nd rows
                                "101", "Dallas,TX", "Dallas", "28", "18", "Cel"

                        }, {
                        // 3rd rows
                        "102", "Huston,TX", "Huston", "27", "17", "Cel"

                }






                },
                {

                        // 3rd time
                        {
                                // 1st rows
                                "Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"

                        },
                        {
                                // 2nd rows
                                "201", "Dhaka,BD", "Dhaka", "34", "24", "Cel"

                        }, {
                        // 3rd rows
                        "202", "Chittagong", "Chittagong", "35", "25", "Cel"

                }


                }


        };



        String[][][] weatherInfo1 = {
                {
                        // 1st time
                        {"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"},
                        {"1", "Queens,NYC", "Jamaica", "18", "10", "Cel"},
                        {"2", "bronx,NYC", "bronx", "17", "11", "Cel"}
                },
                {
                        // 2nd time
                        {"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"},
                        {"101", "Dallas,TX", "Dallas", "28", "18", "Cel"},
                        {"102", "Huston,TX", "Huston", "27", "17", "Cel"
                }
                },
                {
                        // 3rd time
                        {"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"},
                        {"201", "Dhaka,BD", "Dhaka", "34", "24", "Cel"},
                        {"202", "Chittagong", "Chittagong", "35", "25", "Cel"}

                }


        };

        String[][][] weatherInfo2 = {
                {{"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"}, {"1", "Queens,NYC", "Jamaica", "18", "10", "Cel"}, {"2", "bronx,NYC", "bronx", "17", "11", "Cel"}}, {{"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"}, {"101", "Dallas,TX", "Dallas", "28", "18", "Cel"}, {"102", "Huston,TX", "Huston", "27", "17", "Cel"}}, {{"Sl", "Weather Area", "GEO Location", "MaX Temperature", "Min Temperature", "Temperature Type"}, {"201", "Dhaka,BD", "Dhaka", "34", "24", "Cel"}, {"202", "Chittagong", "Chittagong", "35", "25", "Cel"}
                }
        };




        System.out.println("====> *********** For Each loop to iterate all the elements from 3D Array");
        // Convert 3D to 2D
        // Convert 2D to 1D
        // Iterate elements

        for (String[][] weather : weatherInfo) {
            // Convert 3D to 2D
            for (String[] wea : weather) {
                // Convert 2D to 1D
                for (String we : wea) {
                    System.out.print(we + " ");
                }
                System.out.println();
            }
            System.out.println();

        }



    }


}
