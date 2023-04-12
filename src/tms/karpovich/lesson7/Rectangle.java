package tms.karpovich.lesson7;

public class Rectangle extends Figure{
    int a;
    int b;
    int c;
    int d;
    public Rectangle() {}
    public Rectangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int perimeter(){
        return a + b + c + d;
    }
    public int square(){
        return a * b;
    };
}