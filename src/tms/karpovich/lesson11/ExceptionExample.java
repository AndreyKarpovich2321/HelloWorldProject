package tms.karpovich.lesson11;

public class ExceptionExample {
    public static void main(String[] args) {
        int result;
        try {
            result = 1/0;
        } catch (ArithmeticException|IndexOutOfBoundsException e){
            System.out.println("result");
            result = 0;
        } finally {
            System.out.println("end");
        }
        System.out.println(result);
    }

}
