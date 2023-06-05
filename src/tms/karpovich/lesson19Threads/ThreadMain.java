package tms.karpovich.lesson19Threads;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().isInterrupted());
        Thread.currentThread().setName("E");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world2");
    }
}
