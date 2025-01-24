package Ninth;



class CustomThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class MultiThread {
    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread();
        CustomThread thread2 = new CustomThread();

        thread1.start(); // Starts thread1
        thread2.start(); // Starts thread2
    }
}

