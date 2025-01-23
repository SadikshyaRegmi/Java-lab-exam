package Eight;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        VaryThread thread = new VaryThread();
        thread.start(); // Start the thread
    }
}

