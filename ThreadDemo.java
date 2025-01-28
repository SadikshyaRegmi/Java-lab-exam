package I;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
