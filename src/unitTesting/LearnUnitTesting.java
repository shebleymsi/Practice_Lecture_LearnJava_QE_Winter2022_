package unitTesting;

import excelReadAndWrite.ReadFromExcel;
import org.junit.Test;

import java.io.FileNotFoundException;

public class LearnUnitTesting extends Hooks{




    // Test Method/ Test Case: Unite Test case
    // Type of Testing:
    // Positive Testing:
    // Negative Testing:


    // Positive Testing:
    @Test
    public void checkReadExcelFile(){
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data1.xlsx";
        ReadFromExcel.readExcelFile(filePath,0);
    }


    // Negative Testing:
    @Test(expected = FileNotFoundException.class)
    public void checkReadExcelFileNegativeTest(){
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data11.xlsx";
        ReadFromExcel.readExcelFile(filePath,0);
    }

    // Negative Testing:
    @Test(expected = IllegalArgumentException.class)
    public void checkReadExcelFileNegativeTest1(){
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data1.xlsx";
        ReadFromExcel.readExcelFile(filePath,3);
    }

    // file extension
    // file path using relative / absolute
    // without file extension




}
