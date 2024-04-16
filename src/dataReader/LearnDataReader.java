package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnDataReader {  // fileReader

    // Our main goal is we read the “Sample.txt” file from "DataTest" directory using the Java code: v29 04.08.34

    // Path/Location:
    // 1. Absolute path: Full path: Absolute Path
    // 2. relative path: Partial path: Path From Content Root
    // we always use relative path for data-reader, because absolute path changeable its depends on different computer
    public static void main(String[] args) {

        // String filePath="C:\\Users\\mhsha\\IdeaProjects\\LearnJava_QE_Winter2022\\DataTest\\Sample.txt";

        //String filePath = "DataTest/Sample.txt"; // if its not work, follow row20, write by manually
        String filePath = "../LearnJava_QE_Winter2022/DataTest/Sample.txt";
        // String filePath = "C:\\Users\\mhsha\\Desktop\\Newfolder2/Demo.txt";


        // FileReader is a Class, and fileReader is a reference variable of FileReader.
        // FileReader is a class that Reads text from character files using a default buffer size.
        // BufferedReader is also a class, its extends Reader, Reader is abstract class Reader

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println("File not found Exception");
        } finally {

            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e1) {
                System.out.println("\n" + "File Already closed");
            }

        }


    }


}
