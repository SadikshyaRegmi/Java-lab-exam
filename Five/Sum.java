package Five;



class Calculator {
    // Method for addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method for addition of three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Sum {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));
    }
}


