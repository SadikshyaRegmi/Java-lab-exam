package I;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running.");
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
