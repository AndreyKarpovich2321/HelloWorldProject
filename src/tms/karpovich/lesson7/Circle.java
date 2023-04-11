package tms.karpovich.lesson7;

public class Circle extends Figure{
    int radius;
    double p = 3.14;
    public Circle(){}
    public Circle(int radius){
        this.radius = radius;
    }
    public int perimeter(){
        return (int)(2 * p * radius);
    }
    public int square(){
        return (int)(p * radius * radius);
    };
}