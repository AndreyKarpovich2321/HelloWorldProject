package tms.karpovich.lesson19Threads;

import java.util.Random;

public class MyThread extends Thread{
    private int count;
    public MyThread(String name) {
        super(name);
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        System.out.println("Start custom thread " + getName());
        count = new Random().nextInt();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End custom thread " + getName());
    }
}
