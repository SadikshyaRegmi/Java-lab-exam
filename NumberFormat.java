package G;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
