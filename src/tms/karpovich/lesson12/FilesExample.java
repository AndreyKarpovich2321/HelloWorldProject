package tms.karpovich.lesson12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\HelloWorldProject\\out\\abc3.doc");
        System.out.println(file.exists());
        File file3 = new File("C:\\Users\\User\\IdeaProjects\\HelloWorldProject");
        System.out.println(Arrays.toString(file3.listFiles(new DocFilter())));

        try {
            System.out.println(file.createNewFile());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            //System.out.println(file.canExecute());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getUsableSpace());
            System.out.println(file.renameTo(new File("abc3.doc")));
            System.out.println(file.setReadable(true));
        }catch (IOException e){
            System.out.println("Not created" + e);
        }
    }
}
