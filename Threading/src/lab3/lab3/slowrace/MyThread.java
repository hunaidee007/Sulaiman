package lab3.lab3.slowrace;

public class MyThread extends Thread {
    volatile static int count;

    // whose turn is it to enter the CS
    static int turn;

    // who is ready to enter
    static boolean []flag = {false,false};

    int name;

    public void run() {
        for(int i = 0 ; i < 10 ; i++) {
            delay();
            int otherThreadName = 1 - name;
            flag[name] = true;
            turn = otherThreadName;
            while(turn == otherThreadName && flag[otherThreadName] ) Thread.yield();

            // Critical Section starts
            int x = count;
            System.out.println("Thread " + name + " read " + x);
            delay();
            count = x + 1;
            System.out.println("Thread " + name + " wrote " + (x+1));

            // Critical Section Ends

            flag[name] = false;
        }
    }

    void delay() {
        int delay = (int) (1000 * Math.random());
        try {
            Thread.sleep(delay);
        }
        catch(Exception e) {
        }
    }
}
