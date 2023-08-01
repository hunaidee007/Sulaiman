package lab5.excercise2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA threadA = new MyThreadA();
        MyThreadB threadB = new MyThreadB();
        MyThreadC threadC = new MyThreadC();

        threadA.start();
        threadB.start();
        threadC.start();


        threadA.join();
        threadB.join();
        threadC.join();
    }
}