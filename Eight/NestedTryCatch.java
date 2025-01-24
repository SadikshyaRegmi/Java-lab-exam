package Eight;



public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid index.");
            }
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero.");
        }
    }
}

