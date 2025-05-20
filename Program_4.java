import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        String inputLine = scanner.nextLine();

        // Remove brackets and spaces
        inputLine = inputLine.trim();
        if (inputLine.startsWith("[") && inputLine.endsWith("]")) {
            inputLine = inputLine.substring(1, inputLine.length() - 1);
        } else {
            System.out.println("Input should be enclosed in square brackets []");
            scanner.close();
            return;
        }

        // Split by comma
        String[] tokens = inputLine.split(",");

        int[] numbers = new int[tokens.length];
        try {
            for (int i = 0; i < tokens.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i].trim());
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in input.");
            scanner.close();
            return;
        }

        // Initialize count map for 1 to 9
        Map<Integer, Integer> multiplesCount = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (num % divisor == 0) {
                    multiplesCount.put(divisor, multiplesCount.get(divisor) + 1);
                }
            }
        }

        // Print output in requested format {1: 11, 2: 8, ...}
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + multiplesCount.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        scanner.close();
    }
}
