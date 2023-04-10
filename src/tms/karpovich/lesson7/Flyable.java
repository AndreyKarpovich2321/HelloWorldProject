package tms.karpovich.lesson7;

public interface Flyable {
    void fly();
    default void printMessage(){
        System.out.println("Message");
    }


}
