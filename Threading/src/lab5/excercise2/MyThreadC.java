package lab5.excercise2;

public class MyThreadC extends MyThreadB {


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
                System.out.println("Thread C waiting T");
                semS.acquire();
                delay();
                System.out.println("Thread C acquired T");


            }
        } catch (InterruptedException e) {
        }
    }
}