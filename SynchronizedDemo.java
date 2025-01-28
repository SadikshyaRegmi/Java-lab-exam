package I;


class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> counter.increment());
        Thread t2 = new Thread(() -> counter.increment());
        t1.start();
        t2.start();
    }
}