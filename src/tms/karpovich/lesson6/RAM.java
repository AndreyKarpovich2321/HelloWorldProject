package tms.karpovich.lesson6;

public class RAM {
    private String name;
    private int memoryCapacity;
    public RAM(){
        name = "Kingston";
        memoryCapacity = 8;
    }
    public RAM(String name, int memory){
        this.name = name;
        memoryCapacity = memory;
    }
    public String toString(){
        return "RAM " + name + " " + memoryCapacity + " GB ";
    }
}
