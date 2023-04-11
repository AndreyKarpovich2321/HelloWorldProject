package tms.karpovich.lesson7;

public class Worker implements Employee{
    String position = "Worker";
    public void showPosition(){
        Employee.super.showPosition(position);
    }
}
