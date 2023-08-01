package lab5.excercise1;

public class Deadlock2 {
    public static void main(String args []) throws Exception {
        MyThreadA thread1 = new MyThreadA();
        MyThreadB thread2 = new MyThreadB();

        thread1.start() ;
        thread2.start();

        thread2.join() ;
        thread1.join();
    }

}
