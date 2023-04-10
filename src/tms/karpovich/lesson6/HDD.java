package tms.karpovich.lesson6;

public class HDD {
    String name;
    int memoryCapacity;
    String type;
    public HDD(){
        name = "Crucial";
        memoryCapacity = 1024;
        type = "Internal";
    }
    public HDD(String name, int memory, String type){
        this.name = name;
        memoryCapacity = memory;
        this.type = type;
    }
    public String toString(){
        return "HDD " + name + " " + memoryCapacity + " GB Type " + type;
    }
}
