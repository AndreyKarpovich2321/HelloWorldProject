package tms.karpovich.lesson7;

public class Triangle extends Figure{
    int a;
    int b;
    int c;
    public Triangle() {}
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter(){
        return a + b + c;
    }
    public int square(){
        return 123;
    }
}