package tms.karpovich.lesson11;

public class MyBestException extends Exception{
    private int age;

    public MyBestException(String message, int age) {
        super(message);
        this.age = age;
    }
}
