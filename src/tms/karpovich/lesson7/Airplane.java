package tms.karpovich.lesson7;

public class Airplane implements Flyable, Cloneable{

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
