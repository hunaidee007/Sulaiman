package lab3.queue;

public class MyThread extends Thread {
    volatile static Queue q;
    String name;

    public void run() {
        for(int i = 0 ; i < 10 ; i++) {
            q.add("message " + i);
            System.out.println("Thread " + name + " added message " + i);
        }
    }
}

