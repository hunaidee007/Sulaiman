package lab3.queue;

public class Queue {
    volatile Node front, back;

    public void add(String data) {
        if (front != null) {
            back.next = new Node(data) ;
            back = back.next;
        }
        else {
            front = new Node(data);
            back = front;
        }
    }

    public String rem() {

// returns null if queue empty
        String result = null;

        if (front != null) { result = front.data ; front	= front.next;
        }
        return result;
    }
}
