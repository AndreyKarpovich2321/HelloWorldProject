package tms.karpovich.lesson8;

public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone() {}
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public void showParameters(){
        System.out.println("Phone number: " + number + ", model: " + model + ", weight: " + weight);
    }
    public String getNumber() {
        return number;
    }
    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }
    public void receiveCall(String name, String number){
        System.out.println(name + number + " is calling");
    }
    public void sendMessage(String ...numbers){
        for (String i: numbers){
            System.out.println(i);
        }
    }
}
