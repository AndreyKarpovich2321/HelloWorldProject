package tms.karpovich.lesson12Files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner("aaa");
        System.out.println(scanner1.next());
        try (FileReader reader = new FileReader("abc.doc");
             Scanner scanner2 = new Scanner(reader)){

            while (scanner2.hasNextInt()){
                System.out.println(scanner2.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
