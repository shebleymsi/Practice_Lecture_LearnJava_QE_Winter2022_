package excelReadAndWrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadFromExcel {

    // File Location
    public static String filePath = "../LearnJava_QE_Winter2022/DataTest/Data11.xlsx";


    public static void main(String[] args) {

      //  readExcelFile(filePath, 0);
        readExcelFile(filePath, 1);
    }


    /**
     * This method will read excel file based on sheetNumber
     * @param filePath
     * @param sheetNumber
     * Author: Ahmed
     */
    public static void readExcelFile(String filePath, int sheetNumber) {
        Workbook workbook;
        FileInputStream inputStream;

        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();

                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

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
        } finally {
            System.out.println("Read Excel information is done");
        }


    }


}
