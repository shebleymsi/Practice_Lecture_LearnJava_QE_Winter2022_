package excelReadAndWrite;

// what are the classes and interfaces you need to import to write an Excel-spreadsheet by JAVA?

import org.apache.poi.ss.usermodel.Cell;            //import serial: 04 must
import org.apache.poi.ss.usermodel.Row;             //import serial: 03 must
import org.apache.poi.xssf.usermodel.XSSFSheet;     //import serial: 02 must
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  //import serial: 01 must

import java.io.FileNotFoundException;               //import serial: 06 (if)
import java.io.FileOutputStream;                    //import serial: 05 must
import java.io.IOException;                         //import serial: 07 (if)

import static dataStructure.collectionFramework.randomNumber.LearnRandomNumber.*;


public class WriteToExcel {

    // Path: The location where the Excel file will be created

    // Absolute path: full path
    // String filePath = "C:\\Users\\mhsha\\IdeaProjects\\LearnJava_QE_Winter2022\\DataTest\\TestData.xlsx";
    // String filePath = "D:\\WINDOWS (C)_2024\\IdeaProjects_2024\\Practice_Lecture_LearnJava_QE_Winter2022_\\DataTest\\TestData.xlsx";

    // note: Always better to use "/" forward-slash not back-slash
    // "\" backward slash work only local mechain or my(shebley) computer but its  not work mac/windows or other computer

    // Relative path:
    // public static String filePath = "../LearnJava_QE_Winter2022/DataTest/TestData.xlsx";


    // straight forward approach to create a .docx
    // public static String filePath = "../LearnJava_QE_Winter2022/DataTest/TestData.docx";
    // if we take .docx file, it will not open because its don't match code format, so it was corrupted file // 01.07.14
    // base on our extenuation it generates file

    // my file path: Shebley
    public static String filePath = "../Practice_Lecture_LearnJava_QE_Winter2022_/DataTest/TestData.xlsx";


    // Crete random automated ".xlsx" file, if we use this it will everytime generated a new .xlsx file
    // public static String filePath = "../LearnJava_QE_Winter2022/DataTest/TestData_" + randomNumberGenerate() + ".xlsx";
    // v35 05.27.13

    // lecture_35 done here

    /*
        --> .xlsx is an extension of an Excel file. Example: TestData.xlsx
        --> To write an Excel file:
            ==> Need to create an Excel file
            ==> Need to create a spreadsheet
            ==> Code will Automatically write the data inside the  spreadsheet
     */


    public static void main(String[] args) {

        // Create a 2D Array
        Object[][] studentInfo = {
                {"SL", "firstName", "lastName", "Address", "PhoneNumber"},
                {"101", "Ismat", "Kabir", "Queens,NY", "8988080343"},
                {"102", "Naina", "Islam", "Woodhaven,NY", "98098080"},
                {"101", "Ismat", "Kabir", "Queens,NY", "8988080343"},
                {"102", "Naina", "Islam", "Woodhaven,NY", "98098080"},
                {"101", "Ismat", "Kabir", "Queens,NY", "8988080343"},
                {"102", "Naina", "Islam", "Woodhaven,NY", "98098080"},
                {"101", "Ismat", "Kabir", "Queens,NY", "8988080343"},
                {"102", "Naina", "Islam", "Woodhaven,NY", "98098080"}

        };
        // calling method inside the main method
        writeToExcelFile(filePath, studentInfo, "infoSheet");
    }


    // =======================================================================================================
    // This lecture Start over here, create writeToExcelFile() 1st then call it inside main method ...
    // =======================================================================================================


    public static void writeToExcelFile(String filePath, Object[][] input, String sheetName) {


        // create a reference of XSSFWorkbook-->Class
        XSSFWorkbook workbook = new XSSFWorkbook();         // create an object of XSSFWorkbook
        XSSFSheet sheet = workbook.createSheet(sheetName);  // create workbook & spreadSheet


        int rowNumber = 0;
        //  object is a parent of all class
        // here use ==> converting 2D array to 1D Array : Object[] data : input 1.00.00
        for (Object[] data : input) {  // Ctrl + hooving on “Object”
            // create a reference of Row-->interface
            Row row = sheet.createRow(rowNumber++); // Ctrl + hooving mouse on “Row”


            int columnNumber = 0;
            for (Object field : data) {
                // create a reference of Cell-->interface
                Cell cell = row.createCell(columnNumber++); // Ctrl + hooving mouse on “Row”


                // check the data type
                if (field instanceof String) {         // value could be String type
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) { // value could be Integer type
                    cell.setCellValue((Integer) field);
                } else if (field instanceof Double) {   // value could be Double type
                    cell.setCellValue((Double) field);
                } else if (field instanceof Boolean) {  // value could be Boolean type
                    cell.setCellValue((Boolean) field); // setCellValue assign the value on particular cell
                }
            }
        }


        try {
            // we want to save our file
            // Create a file and then we save the file in the location in filePath
            // Ctrl + hooving mouse on “FileOutputStream-->Class
            // FileOutputStream use for write
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);  // write in workbook
            System.out.println("Excel file is Created");
            workbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception" + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not closed and Done");
            //throw new RuntimeException(e);
        }


    }


}
