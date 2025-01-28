package I;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> System.out.println("Thread 1"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2"));

        t1.start();
        t1.join(); // Waits for t1 to finish before starting t2
        t2.start();
    }
}
