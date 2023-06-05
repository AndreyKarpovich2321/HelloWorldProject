package tms.karpovich.lesson12Files;

import java.io.Serializable;

public class Car implements Serializable {
//    private static final long
    private int price;
    private  String name;
    private transient int unneededValue;

    public int getUnneededValue() {
        return unneededValue;
    }

    public void setUnneededValue(int unneededValue) {
        this.unneededValue = unneededValue;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' + unneededValue +
                '}';
    }
}
