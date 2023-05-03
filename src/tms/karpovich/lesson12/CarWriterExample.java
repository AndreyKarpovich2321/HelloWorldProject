package tms.karpovich.lesson12;

import java.io.*;

public class CarWriterExample {
    public static void main(String[] args) {
        File file = new File("car.doc");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        FileOutputStream outputStream = null;
        try (FileOutputStream outputStream = new FileOutputStream("car.doc");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){

            objectOutputStream.writeObject(new Car(100,"Lada"));
            objectOutputStream.writeObject(new Car(1000,"BMW"));
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
