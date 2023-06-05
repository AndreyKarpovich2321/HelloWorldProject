package tms.karpovich.lesson12Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarReaderExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("car.doc");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            while (true){
                Car myCar = (Car) objectInputStream.readObject();
                System.out.println(myCar);
            }
        } catch (IOException e) {
//            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
