package lab3.lab3.slowrace;

public class SlowRace {
    public static void main(String args []) throws Exception {
        MyThread.count = 0;
        MyThread thread1 = new MyThread();
        thread1.name = 0;
        MyThread thread2 = new MyThread();
        thread2.name = 1;

        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
        System.out.println("MyThread.count = " + MyThread.count);
    }

}
