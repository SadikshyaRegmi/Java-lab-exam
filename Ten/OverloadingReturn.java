package Ten;

class Printer {
    // Method to print an integer
    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Method to print a string
    void print(String str) {
        System.out.println("Printing string: " + str);
    }
}

public class OverloadingReturn {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(123);           // Calls integer version
        printer.print("Java Programming");  // Calls string version
    }
}

