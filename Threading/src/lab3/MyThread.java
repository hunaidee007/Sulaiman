package lab3;

public class MyThread extends Thread {
    volatile static int count;
    public void run()
    {
        for(int i = 0 ; i < 1000 ; i++) {
            int x = count;
            count = x + 1;
            //count++;
        }
    }
}
