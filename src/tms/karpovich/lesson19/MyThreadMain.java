package tms.karpovich.lesson19;

import java.time.LocalDateTime;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starts " + LocalDateTime.now());
        MyThread thread1 = new MyThread("first");
        MyThread thread2 = new MyThread("second");
        MyThread thread3 = new MyThread("third");
        thread3.setDaemon(true);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        System.out.println(thread1.getState());
        System.out.println(thread1.isAlive());
        thread2.start();
        thread1.join();
        thread3.start();
//        thread3.interrupt();
//        new Thread(() -> {
//            while (true){
//                System.out.println("hello world spam");
//            }
//        });
        System.out.println("ends " + LocalDateTime.now());
        System.out.println(thread1.getCount());
    }
}
