package E;

class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String b) {
        System.out.println("String: " + b);
    }
}

public class Parameter {
    public static void main(String[] args) {
        Display display = new Display();
        display.show(100);
        display.show("Hello");
    }
}