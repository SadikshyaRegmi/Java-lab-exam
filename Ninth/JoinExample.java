package Ninth;



class VaryThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Pause the thread for 500ms
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        VaryThread thread1 = new VaryThread();
        VaryThread thread2 = new VaryThread();

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All threads have finished.");
    }
}


