package Third;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}

