package Ten;

class Display {
    // Method to display integer
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    // Method to display string
    void show(String s) {
        System.out.println("String: " + s);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Display display = new Display();
        display.show(10);          // Calls integer version
        display.show("Hello Java");  // Calls string version
    }
}

