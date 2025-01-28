package B;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean isEqual = (a == b);
        boolean isGreater = (a > b);

        System.out.println("Is " + a + " equal to " + b + "? " + isEqual + ". Is " + a + " greater than " + b + "? " + isGreater + ".");
    }
}