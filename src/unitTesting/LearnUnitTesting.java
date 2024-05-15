package unitTesting;

import excelReadAndWrite.ReadFromExcel;
import org.junit.Test;

import java.io.FileNotFoundException;

public class LearnUnitTesting extends Hooks {

    // Test Method/ Test Case: Unite Test case
    // Type of Testing:-
    // 1. Positive Testing:
    // 2. Negative Testing:
    // lecture_37 00.52.01

    // here, test the "ReadFromExcel --> Class" under the package of "excelReadAndWrite --> package"

    //================================ Positive Testing: Scenario:1 ==============================================
    @Test
    public void checkReadExcelFile() {
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data1.xlsx";
        ReadFromExcel.readExcelFile(filePath, 0);
    }


    // =============================== Negative Testing: Scenario:2 =============================================
    @Test(expected = FileNotFoundException.class)
    public void checkReadExcelFileNegativeTest() {
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data11.xlsx";
        ReadFromExcel.readExcelFile(filePath, 0);
    }

    // =============================== Negative Testing: Scenario:3 =============================================
    @Test(expected = IllegalArgumentException.class)
    public void checkReadExcelFileNegativeTest1() {
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Data1.xlsx";
        ReadFromExcel.readExcelFile(filePath, 3);
    }


    // What is a Test Scenario? ⇒ All the possible ways to Test
    // So more Test Scenario of "ReadExcelFile": // v37 01.09.52
    // 1. file extension
    // 2. file path using relative / absolute
    // 3. without file extension


}
