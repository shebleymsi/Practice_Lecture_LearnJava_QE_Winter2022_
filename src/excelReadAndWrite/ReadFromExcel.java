
// Package Declaration and Imports:
package excelReadAndWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


// Class and Field Declaration:
public class ReadFromExcel {

    // File Location:
    // we went to read Data
    public static String filePath = "../LearnJava_QE_Winter2022/DataTest/Data1.xlsx";
   //public static String filePath1 = "../Practice_Lecture_LearnJava_QE_Winter2022_/DataTest/Data1.xlsx";


    // Main Method:
    public static void main(String[] args) {
        //  readExcelFile(filePath, 0);
        readExcelFile(filePath, 1); // want to read second spreadsheet is 1
    }




    /**
     * This method will read excel file based on sheetNumber
     *
     * @param filePath
     * @param sheetNumber Author: Ahmed
     */

    // readExcelFile Method:
    public static void readExcelFile(String filePath, int sheetNumber) {

        Workbook workbook; //ref variable of Workbook and it's an interface
        FileInputStream inputStream; // FileInputStream it's a Class,

        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream); // XSSFWorkbook is a Class
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber); // Sheet is an interface and getSheetAt() looking for parameter base on index number

            // Iterate row
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();

                // Iterate cell : move one cell to another cell
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    // check current cell data type: is it STRING, NUMERIC, BOOLEAN or not?
                    // Here, STRING, NUMERIC, BOOLEAN are ENUM
                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "    ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "    ");
                    } else if (currentCell.getCellType() == CellType.BOOLEAN) {
                        System.out.print(currentCell.getBooleanCellValue() + "    ");
                    }

                }
                System.out.println();

            }
            workbook.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not found exception " + e.getMessage());
            //   throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Reading Done" + e.getMessage());
            //  throw new RuntimeException(e);
        } finally { // finally block if we want we can Ignore
            System.out.println("Read Excel information is done");
        }


    }


}
