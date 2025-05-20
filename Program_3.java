import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (or type 'x' to print default odd series): ");
        String input = scanner.next();

        System.out.print("Output: ");

        if (input.equalsIgnoreCase("x")) {
            // Print first 4 odd numbers followed by dots
            for (int i = 0; i < 4; i++) {
                int odd = 2 * i + 1;
                System.out.print(odd);
                if (i < 3) {
                    System.out.print(", ");
                }
            }
            System.out.print(", .......");
        } else {
            try {
                int a = Integer.parseInt(input);
                int count;

                if (a % 2 == 0) {
                    // If even input, print first (a - 1) odd numbers
                    count = a - 1;
                } else {
                    // If odd input, print first a odd numbers
                    count = a;
                }

                for (int i = 0; i < count; i++) {
                    int odd = 2 * i + 1;
                    System.out.print(odd);
                    if (i < count - 1) {
                        System.out.print(", ");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x'.");
            }
        }

        scanner.close();
    }
}
