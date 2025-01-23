package Third;

public class ReversedString {
    public static void main(String[] args) {
        String original = "Java";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }
}

