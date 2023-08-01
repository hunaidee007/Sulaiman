package lab5.excercise2;

public class MyThreadB extends MyThreadA {


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
                System.out.println("Thread B waiting for S");
                semS.acquire();
                System.out.println("Thread B acquired S");
                System.out.println("Thread B waiting T");
                semT.acquire();
                System.out.println("Thread B acquired T");
                delay();
                semS.release();
                System.out.println("Thread B released S");
                delay();
                semT.release();
                System.out.println("Thread B released T");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}