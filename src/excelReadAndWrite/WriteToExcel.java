package excelReadAndWrite;


import dataStructure.collectionFramework.randomNumber.LearnRandomNumber;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static dataStructure.collectionFramework.randomNumber.LearnRandomNumber.*;


public class WriteToExcel {

    // Path: The location where the excel file will be created

    // Absolute path: full path
    // String filePath="C:\\Users\\mhsha\\IdeaProjects\\LearnJava_QE_Winter2022\\DataTest\\TestData.xlsx";
    // Relative path:
    //  public static String filePath = "../LearnJava_QE_Winter2022/DataTest/TestData.xlsx";
    public static String filePath = "../LearnJava_QE_Winter2022/DataTest/TestData.docx";
    //  public static String filePath="../LearnJava_QE_Winter2022/DataTest/TestData_"+ randomNumberGenerate()+".xlsx";


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


        writeToExcelFile(filePath, studentInfo, "infoSheet");


    }


    public static void writeToExcelFile(String filePath, Object[][] input, String sheetName) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNumber = 0;
        for (Object[] data : input) {

            Row row = sheet.createRow(rowNumber++);
            int columnNumber = 0;
            for (Object field : data) {
                Cell cell = row.createCell(columnNumber++);

                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                } else if (field instanceof Boolean) {
                    cell.setCellValue((Boolean) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            System.out.println("Excel file is Created");
            workbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception" + e.getMessage());
        } catch (IOException e) {
            System.out.println("File not closed and Done");
            // throw new RuntimeException(e);
        }


    }


}
