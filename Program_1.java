import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return add(a, b);
            case "subtraction":
                return subtract(a, b);
            case "multiplication":
                return multiply(a, b);
            case "division":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation type.");
        }
    }
}

public class Program_1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number (a): ");
    double a = scanner.nextDouble();
    System.out.print("Enter second number (b): ");
    double b = scanner.nextDouble();
    System.out.print("Enter operation type (addition, subtraction, multiplication, division): ");
    String operation = scanner.next();

    Calculator calculator = new Calculator();
    try {
        double result = calculator.calculate(a, b, operation);
        System.out.println("Result: " + result);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
