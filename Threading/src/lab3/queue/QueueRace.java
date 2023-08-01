package lab3.queue;

public class QueueRace {
    public static void main(String args []) throws Exception {
        MyThread.q = new Queue();
        MyThread thread1 = new MyThread();
        thread1.name = "A";

        MyThread thread2 = new MyThread();
        thread2.name = "B";
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
    }
}

