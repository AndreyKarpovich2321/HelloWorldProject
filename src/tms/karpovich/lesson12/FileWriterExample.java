package tms.karpovich.lesson12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("abc.doc", true);){

            fileWriter.write("This is my string\n");
            fileWriter.flush();
            fileWriter.write("This is my second string\n");
//            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
