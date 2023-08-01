package lab5.excercise1;

public class MyThreadB extends MyThreadA {

    public void run() {
        try {
            while (true) {
                delay();

                System.out.println("Thread B waiting for S");
                semS.acquire();
                System.out.println("Thread B acquired S");
                delay();
                System.out.println("Thread B waiting for R");
                semR.acquire();
                System.out.println("Thread B acquired R");
                delay();
                semR.release();
                System.out.println("Thread B released R");

                semS.release();
                System.out.println("Thread B released S");
            }
        } catch (Exception e) {
        }
    }

}

