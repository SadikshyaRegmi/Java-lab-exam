package E;

class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b, double c) {
        return a * b * c;
    }
}

public class Stationary {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(5, 4));         // two parameters
        System.out.println(calc.multiply(2.5, 3.5, 1.5)); // three parameters
    }
}
