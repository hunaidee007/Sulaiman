package lab3;

public class Race {

    public static void main(String args []) throws Exception {
        MyThread.count = 0;
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
        System.out.println("MyThread.count = " + MyThread.count) ;
    }

}
