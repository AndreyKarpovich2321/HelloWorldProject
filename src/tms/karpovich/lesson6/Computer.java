package tms.karpovich.lesson6;

public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(){}
    public Computer(int price, String model){
        this.price = price;
        this.model = model;
    }
    public Computer(int price, String model, RAM ram, HDD hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public String toString(){
        return "Price $" + price + " " + model + " " + ram.toString() + hdd.toString();
    }
}
