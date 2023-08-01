package lab5.excercise2;

import java.util.concurrent.Semaphore;

public class MyThreadA extends Thread {
    static Semaphore semR = new Semaphore(1);
    static Semaphore semS = new Semaphore(1);
    static Semaphore semT = new Semaphore(1);

    void delay() {
        int delay = (int) (10 * Math.random());
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
        }
    }

    public void run() {
        try {
            while (true) {
                delay();
                System.out.println("Thread A waiting R");
                semR.acquire();
                System.out.println("Thread A acquired R");
                System.out.println("Thread A waiting S");
                delay();
                semS.acquire();
                delay();
                System.out.println("Thread A acquired S");
                delay();
                semR.release();
                System.out.println("Thread A released R");
                semS.release();
                System.out.println("Thread A released S");


            }
        } catch (InterruptedException e) {
        }
    }
}