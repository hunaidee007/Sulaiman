package lab5.excercise1;

import java.util.concurrent.Semaphore;

public class MyThreadA extends Thread {

    static Semaphore semR = new Semaphore(1);
    static Semaphore semS = new Semaphore(1);

    void delay() {
        int delay = (int) (10000 * Math.random());
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
        }
    }

    public void run() {
        try {
            while (true) {
                delay();

                System.out.println("Thread A waiting for R");
                semR.acquire();
                System.out.println("Thread A acquired R");
                delay();
                System.out.println("Thread A waiting for S");
                semS.acquire();
                System.out.println("Thread A acquired S");
                delay();
                semS.release();
                System.out.println("Thread A released S");

                semR.release();
                System.out.println("Thread A released R");
            }
        } catch (Exception e) {
        }
    }

}
