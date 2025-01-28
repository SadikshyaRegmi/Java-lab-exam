package I;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
